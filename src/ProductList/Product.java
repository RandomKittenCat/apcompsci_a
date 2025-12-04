package ProductList;

public class Product {
    private String name;
    private double price;
    private boolean inStock;

    public Product(String name, double price, boolean inStock){
        this.name=name;
        this.price=price;
        this.inStock=inStock;
    }

    public String toString(){
        return "Name: " + name + "\nPrice: " + price + "\nIn Stock: " + inStock;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public boolean getInStock(){
        return inStock;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setInStock(boolean inStock){
        this.inStock=inStock;
    }
}