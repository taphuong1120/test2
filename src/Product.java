public class SanPham {
    private String id;
    protected String name;
    private double price;
    private int amount;
    public String describe;

    public SanPham() {
    }

    public SanPham(String id, String name, double price, int amount, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.describe = describe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", describe='" + describe + '\'' +
                '}';
    }
}
