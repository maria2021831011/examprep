package exam1;

public class product {
    private int productId;
    private float productPrice;
    private String productType;
    public product(int productId, float productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
    }
    public void addProduct() {
        System.out.println("Product added: " + productId);
    }
    public void modifyProduct() {

        System.out.println("Product updated: " + productId);
    }

    public void selectProduct(int productID) {
        System.out.println("Product selected: " + productId);
    }

    public int getProductId() {
        return productId;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}


