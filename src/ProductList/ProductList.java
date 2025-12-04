package ProductList;

public class ProductList {
    Product[] products;
    Product[] temp;

    public ProductList(){
        products = new Product[0];
    }

    public String toString(){
        String result = "";
        for (Product p : products){
            result+=(p.toString()+"\n");
        }
        return result;
    }

    public void addProduct(String name, double price, boolean inStock){
        temp = new Product[products.length+1];
        if (products.length!=0) {
            for (int i = 0; i < products.length; i++) {
                temp[i] = products[i];
            }
        }
        Product newprod = new Product(name, price, inStock);
        temp[temp.length-1] = newprod;
        products=temp;
    }

    public int findByName(String name){
        int index = 0;
        for (Product p : products){
            if (p.getName().equals(name)){
                return index;
            }
            index++;
        }
        return -1;
    }

    public ProductList findbyPrice(double price){
        ProductList list = new ProductList();
        for (Product p : products){
            if(p.getPrice() <= price){
                list.addProduct(p.getName(), p.getPrice(), p.getInStock());
            }
        }
        return list;
    }

    public boolean removeOutOfStockItems(){
        int instock = 0;

        for (Product p : products){
            if (p.getInStock()){
                instock++;
            }
        }
        if (instock == products.length){
            return false;
        }

        Product[] list = new Product[instock];
        int index = 0;

        for (Product p : products){
            if (p.getInStock()){
                list[index] = p;
                index++;
            }
        }

        products = list;
        return true;
    }
}