public class Order {

    public static void main(String [] args)
    {
Product p1=new Product();
p1.setPr_id(111);
p1.setPrd_desc("This is sample product");
p1.setPrice(500.67);

System.out.println(p1.getPr_id() + p1.getPrd_desc() + p1.getPrice());

System.out.println(p1);
    System.out.println(p1.getPr_id());
    System.out.println(p1);
}
    
}
