class A{
	

	public A(){
		System.out.println("inside super class constructor...");
	}
	public void AMethod()
	{
		System.out.println("A Class method...");
	}
}
class B extends A{
	public B(){
     //super();
	 System.out.println("inside sub class constructor...");
	}
	public void BMethod()
	{
		AMethod();
		System.out.println("B Class method...");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	B b1=new B();
	b1.BMethod();
		
	}

}