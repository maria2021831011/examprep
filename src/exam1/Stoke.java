package exam1;

public class Stoke {
    private int shopNo;
    private int productId;
    private int quantity;
    public product k;
    public Stoke(int shopNo, int productId, int quantity, product k) {
        this.shopNo = shopNo;
        this.productId = productId;
        this.quantity = quantity;
        this.k = k;
    }
    public void addStock(int quantity) {
        this.quantity += quantity;
        System.out.println("Stock added for: " + productId + " .New:" + this.quantity);
    }
    public void modifyStock(int productId) {
        this.productId = productId;
        System.out.println("Stock updated" + productId + ". New: " + this.productId);
    }
    public void selectStockItem(int productId) {
        System.out.println(productId);
    }

    public int getShopNo() {
        return shopNo;
    }

    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}