package jdbc3.entity;

public class Product {
    private String pNum;
    private String pName;
    private int pStock;
    private int pPrice;
    private String produceName;

    public String getpNum() {
        return pNum;
    }

    public String getpName() {
        return pName;
    }

    public int getpStock() {
        return pStock;
    }

    public int getpPrice() {
        return pPrice;
    }

    public String getProduceName() {
        return produceName;
    }

    public void setpNum(String pNum) {
        this.pNum = pNum;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setpStock(int pStock) {
        this.pStock = pStock;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }
}