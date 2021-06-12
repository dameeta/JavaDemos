interface Mother{
	
	public void motherName();
	
}
interface Father{
	
	public void fatherName();
}

class Son implements Mother,Father{

	String name="David";
	@Override
	public void fatherName() {
		// TODO Auto-generated method stub
		System.out.print("\tJohn ");
	}

	@Override
	public void motherName() {
		// TODO Auto-generated method stub
		
		System.out.print("\tStally");
	}
	}
public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Son s1=new Son();

System.out.print("The name of Son is\t"+ s1.name); 
	s1.fatherName();
		
		s1.motherName();
	}

}