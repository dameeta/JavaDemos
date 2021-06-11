class Shape
{

    int x, y ;double r ;
    public Shape()
    {
        System.out.println("The default constructor...");

    }

    public Shape(int side)
    {

        this.x=side;
        System.out.println("The area of square is :" + (side * side));

    }
    public Shape(int l,int h)
    {
        this.x=l;
        this.y=h;
        System.out.println("The area of triangle is :" + (0.5* (l * h)));

    }
    public Shape(double rad)
    {

        this.r=rad;
        System.out.println("The area of circle is :" + (3.14 * rad * rad));

    }
}

public class constructor {

    public static void main(String [] args)
    {
Shape s1=new Shape();
Shape s2=new Shape(4);
Shape s3=new Shape(3,4);
Shape s4=new Shape(1.2);


    }


}
