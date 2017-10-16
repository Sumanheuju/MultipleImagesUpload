package com.vortexnepal.ghyampo.controller.admin;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.vortexnepal.ghyampo.model.Product;
import com.vortexnepal.ghyampo.model.ProductImage;
import com.vortexnepal.ghyampo.repository.ProductImageRepository;
import com.vortexnepal.ghyampo.repository.ProductRepository;

@Controller
@RequestMapping(value="/admin")
public class ProductController {
	public static final String uploadingdir = System.getProperty("user.dir") + "/uploadingdir/";
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private ProductImageRepository productImageRepo;
	
	@GetMapping("/products")
	public String productView(Model model) {
		model.addAttribute("products", productRepo.findAll());
		return "admin/product/productView";
	}
	
	@GetMapping("/addproducts")
	public String addProduct(Model model) {
		File file = new File(uploadingdir);
        model.addAttribute("files", file.listFiles());
        
		return "admin/product/addProductPage";
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public String addproduct(Product product, @RequestParam("uploadingFiles") MultipartFile[] uploadingFiles) throws IOException {
		Product save = productRepo.save(product);
		
		if(save !=null) {
			for(MultipartFile uploadedFile : uploadingFiles) {
	            File file = new File(uploadingdir + uploadedFile.getOriginalFilename());
	            
	            System.out.println(uploadedFile);
	            
	            ProductImage pi = new ProductImage();
	            pi.setProduct(product);
	            pi.setName(uploadedFile.getOriginalFilename());
	            
	            productImageRepo.save(pi);
	            
	            uploadedFile.transferTo(file);
	        }
			
			
			return "redirect:/admin/products";
		}
		return "Not Saved";
	}
	
	@RequestMapping(value="/editproducts", method = RequestMethod.GET)
	public String editproduct(@RequestParam long productId, Model model) {
		
		model.addAttribute("product", productRepo.findOne(productId));
		
		return "admin/product/addProductPage";
	}
	
	@RequestMapping(value="/deleteproducts", method = RequestMethod.GET)
	public String deleteproduct(@RequestParam long productId) {
		
		productRepo.delete(productId);
		return "redirect:/admin/products";
	}
	
	
}
