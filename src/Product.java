

public class Product implements Comparable<Product> {
    private String nameProduct;
    private int price;
    private String temperature;

    public Product(String nameProduct, int price, String temperature) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.temperature = temperature;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public int compareTo(Product o) {
        return  o.price - this.price;
    }

}
