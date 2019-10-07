

public class Event {
    private String product;
    private String price;
    private String date;
    private String category;
    private String ip;

    public Event(String product, String price, String date, String category, String ip) {
        this.product = product;
        this.price = price;
        this.date = date;
        this.category = category;
        this.ip = ip;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Event{" +
                "product='" + product + '\'' +
                ", price='" + price + '\'' +
                ", date='" + date + '\'' +
                ", category='" + category + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
