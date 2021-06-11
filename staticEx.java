public class staticEx {
    staticEx e1;
    int val1=5;
    static int val2=5;
public staticEx()
{
    System.out.println(val1++);//5
    System.out.println(val2++);//5

}

public void access()
{
    staticEx ex1=new staticEx();
    System.out.println(val2);
    System.out.println(ex1.val1);
}
public static void main(String[] args) {
    staticEx st1=new staticEx();
   staticEx st2=new staticEx();
   staticEx st3=new staticEx();
}


}
