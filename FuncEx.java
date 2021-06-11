import java.util.Scanner;

public class FuncEx {
    
    public static int CalculateArea(int x,int y)
    {

        System.out.print("The area is :");
        return x*y;
    }

    public static void main(String[] args)
    {
   System.out.println("hii");
   Scanner sc=new Scanner(System.in);
        int val1=sc.nextInt();
        int val2=sc.nextInt();
   System.out.print(CalculateArea(val1, val2));

    }
}
