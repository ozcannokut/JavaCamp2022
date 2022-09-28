public class main {
    public static void main(String[] args){
        Product product=new Product();
        product.setName("laptop");
        product.setDescription("Asus Laptop");
        product.setId(1);
        product.setPrice(500.50);
        product.setStockAmount(3);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        //System.out.println(product.name);

    }
}
