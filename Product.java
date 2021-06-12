public class Product {
    
    private int pr_id;
    private String prd_desc;
    private  double price;

    public Product()
    {
        super();
    }

    public int getPr_id() {
        return pr_id;
    }
    public void setPr_id(int pr_id) {
        this.pr_id = pr_id;
    }
    public String getPrd_desc() {
        return prd_desc;
    }
    public void setPrd_desc(String prd_desc) {
        this.prd_desc = prd_desc;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
   public String toString()
    {
        return "[The product is :"+ this.pr_id + this.prd_desc + this.price +"]";
    }
  
}

