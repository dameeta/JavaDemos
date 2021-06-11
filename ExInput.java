import java.util.Scanner;

public class ExInput {
    

    public static void main(String []args)

    {
        System.out.println("Enter your name");
        Scanner sc=new Scanner(System.in);
        String myname = sc.next();
        System.out.println("My Name is " + myname);
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println("The addition of two nos is:" + (x+y));


    }

}
