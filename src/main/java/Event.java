import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.UUID;

public class Event {
    private String product;
    private String price;
    private String date;
    private String category;
    private String ip;

    public Event() {
        Random r = new Random();
        this.product = UUID.randomUUID().toString().replace("-", "");
               // RandomStringUtils.randomAlphabetic(7);
        this.price =String.valueOf(( new BigDecimal(10 + (2000 - 10) * r.nextDouble()).setScale(2, RoundingMode.UP)));
        this.date = dates[r.nextInt(6)];
        this.category = categorys[r.nextInt(6)];
        this.ip = r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256);;
    }

    static String[] dates = new String[]{"2019-09-07","2019-09-06","2019-09-05","2019-09-04","2019-09-03","2019-09-02","2019-09-01"};
    static String[] categorys = new String[]{"electronics","toys","books","gifts","computers","clothes","shoes"};


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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(product)
                .append("\t")
                .append(price)
                .append("\t")
                .append(date)
                .append("\t")
                .append(category)
                .append("\t")
                .append(ip)
                .append("");
        return stringBuilder.toString();
    }
}
