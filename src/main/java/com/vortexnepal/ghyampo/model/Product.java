package com.vortexnepal.ghyampo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;
/*
 * Product.Class
 * -- Parent Entity to ProductImage class
 * -- Foreign Key is mapped through productId
 */
@Entity
@Table(name="products")
public class Product implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="product_id")
	private Long productId;
	@Column(name="product_name")
	@NotEmpty()
	private String productName;
	@Column(name="product_category")
	private String productCategory;
	@Column(name="product_sub_category")
	private String productSubCategory;
	@Column(name="product_type")
	private String productType;
	@Column(name="product_description",columnDefinition = "TEXT")
	private String productDescription;
	@Column(name="product_gender")
	@NotEmpty()
	private String productGender;
	@Column(name="product_price")
	@Min(value=1)
	@NotNull()
	private Double productPrice;
	@Column(name="product_status")
	private boolean productStatus;
	@Column(name="product_in_stock")
	@Min(value=0)
	private int productInStock;
	@Column(name="product_manufacturer")
	private String productManufacturer;
	@Column(name="product_discount_percentage")
	private int productDiscountPercentage;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "added_date", nullable = false, updatable=false)
    private Date addedDate;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified_date")
    private Date modifiedDate;

//	@Transient
//	@JsonIgnore
//	private MultipartFile productImageOne;
//	@Transient
//	@JsonIgnore
//	private MultipartFile productImageTwo;
//	@Transient
//	@JsonIgnore
//	private MultipartFile productImageThree;
//	@Transient
//	@JsonIgnore
//	private MultipartFile productImageFour;
//	@Transient
//	@JsonIgnore
//	private MultipartFile productImageFive;
	
//	@OneToMany(mappedBy = "product", cascade= CascadeType.ALL, fetch = FetchType.EAGER)
//	private List<ProductImage> productImageList;
	
//	@OneToMany(mappedBy = "product", cascade= CascadeType.ALL)
//	private ProductImage productImage;
	
	public Product(){}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductSubCategory() {
		return productSubCategory;
	}

	public void setProductSubCategory(String productSubCategory) {
		this.productSubCategory = productSubCategory;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductGender() {
		return productGender;
	}

	public void setProductGender(String productGender) {
		this.productGender = productGender;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public boolean isProductStatus() {
		return productStatus;
	}

	public void setProductStatus(boolean productStatus) {
		this.productStatus = productStatus;
	}

	public int getProductInStock() {
		return productInStock;
	}

	public void setProductInStock(int productInStock) {
		this.productInStock = productInStock;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	public int getProductDiscountPercentage() {
		return productDiscountPercentage;
	}

	public void setProductDiscountPercentage(int productDiscountPercentage) {
		this.productDiscountPercentage = productDiscountPercentage;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

//	public ProductImage getProductImage() {
//		return productImage;
//	}
//
//	public void setProductImage(ProductImage productImage) {
//		this.productImage = productImage;
//	}

//	public MultipartFile getProductImageOne() {
//		return productImageOne;
//	}
//
//	public void setProductImageOne(MultipartFile productImageOne) {
//		this.productImageOne = productImageOne;
//	}
//
//	public MultipartFile getProductImageTwo() {
//		return productImageTwo;
//	}
//
//	public void setProductImageTwo(MultipartFile productImageTwo) {
//		this.productImageTwo = productImageTwo;
//	}
//
//	public MultipartFile getProductImageThree() {
//		return productImageThree;
//	}
//
//	public void setProductImageThree(MultipartFile productImageThree) {
//		this.productImageThree = productImageThree;
//	}
//
//	public MultipartFile getProductImageFour() {
//		return productImageFour;
//	}
//
//	public void setProductImageFour(MultipartFile productImageFour) {
//		this.productImageFour = productImageFour;
//	}
//
//	public MultipartFile getProductImageFive() {
//		return productImageFive;
//	}
//
//	public void setProductImageFive(MultipartFile productImageFive) {
//		this.productImageFive = productImageFive;
//	}
	
	
	
}
