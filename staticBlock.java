public class staticBlock {
    
static int x;
int y;

static{

    x=20;
    System.out.println("inside statc block....");
}

public staticBlock(int y)
{
   // this.y=y;
    System.out.println("inside constructor..."+ y);
}
public static void main(String [] args)
{

    System.out.println(staticBlock.x);
    staticBlock sb1=new staticBlock(30);
    System.out.println(sb1.y);
}

}
