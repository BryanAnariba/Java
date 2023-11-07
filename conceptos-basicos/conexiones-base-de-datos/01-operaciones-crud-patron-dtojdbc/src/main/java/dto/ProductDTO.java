package dto;

public class ProductDTO extends CategoryDTO {
    private int productId;
    private int categoryId;
    private String productName;
    private String productDescription;
    private double price;
    private int inStock;

    public ProductDTO(int productId, int categoryId, String productName, String productDescription, double price, int inStock, String categoryName, boolean categoryStatus) {
        super( categoryId, categoryName, categoryStatus );
        this.productId = productId;
        this.categoryId = categoryId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.inStock = inStock;
    }

    public ProductDTO(int productId) {
        this.productId = productId;
    }

    public ProductDTO(int categoryId, String productName, String productDescription, double price, int inStock) {
        this.categoryId = categoryId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.inStock = inStock;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return (
                "Product {" + 
                "productId=" + productId + 
                ", categoryId=" + categoryId + 
                ", productName=" + productName + 
                ", productDescription=" + productDescription + 
                ", price=" + price + 
                ", inStock=" + inStock + 
                ", categoryName=" + this.getCategoryName() + 
                ", categoryStatus=" + this.isCategoryStatus() + '}'
        );
    }

}
