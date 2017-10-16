<%@ include file="../../includes/header.jsp" %>
<h1>Add New Product</h1>

<button><a href="/admin/products">Products Page</a></button>

<form name="uploadingForm" enctype="multipart/form-data" action="/admin/products" method="POST">  
<input type="hidden" name="productId" value="${product.productId}"/><br/>
Product-Name: <input type="text" name="productName" value="${product.productName}"/><br/>  
Product-Category: <input type="text" name="productCategory" value="${product.productCategory}"/><br/>  
Product-Sub-Category: <input type="text" name="productSubCategory" value="${product.productSubCategory}"/><br/>  
Product-Description: <input type="text" name="productDescription" value="${product.productDescription}"/><br/> 
Product-Price: <input type="text" name="productPrice" value="${product.productPrice}"/><br/> 
Product-Type: <input type="text" name="productType" value="${product.productType}"/><br/> 
Product-Discount-Percentage: <input type="text" name="productDiscountPercentage" value="${product.productDiscountPercentage}"/><br/> 
Product-Status: <input type="text" name="productStatus" value="${product.productStatus}"/><br/> 
Product-In-Stock: <input type="text" name="productInStock" value="${product.productInStock}"/><br/> 
Product-Gender: <input type="text" name="productGender" value="${product.productGender}"/><br/> 


<p>
                <input id="fileInput" type="file" name="uploadingFiles" onchange="updateSize();" multiple>
                selected files: <span id="fileNum">0</span>;
                total size: <span id="fileSize">0</span>
            </p>
            <p>
                <input type="submit" value="Submit"/>
            </p>
</form>  

        <div>
            <div>Uploaded files:</div>
            <#list files as file>
            <div>
            ${file.getName()}
            </div>
            </#list>
        </div>
        
        <script>
            function updateSize() {
                var nBytes = 0,
                        oFiles = document.getElementById("fileInput").files,
                        nFiles = oFiles.length;
                for (var nFileId = 0; nFileId < nFiles; nFileId++) {
                    nBytes += oFiles[nFileId].size;
                }

                var sOutput = nBytes + " bytes";
                // optional code for multiples approximation
                for (var aMultiples = ["KiB", "MiB", "GiB", "TiB", "PiB", "EiB", "ZiB", "YiB"], nMultiple = 0, nApprox = nBytes / 1024; nApprox > 1; nApprox /= 1024, nMultiple++) {
                    sOutput = nApprox.toFixed(3) + " " + aMultiples[nMultiple] + " (" + nBytes + " bytes)";
                }
                // end of optional code

                document.getElementById("fileNum").innerHTML = nFiles;
                document.getElementById("fileSize").innerHTML = sOutput;
            }
        </script>
        
        

<%@ include file="../../includes/footer.jsp" %>