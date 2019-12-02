package test;

public class Constructor {

	int a, b, result;
	
	
	
	
	
	
	public Constructor(int a, int b) 
	{
	
		this.a=a;
		this.b=b;
			
	}
	
	public void add()
	{
		result = a+b;
		System.out.println("Addition of A & B is : " + result);
	}
	
	public void sub ()
	{
	result = a-b;
	System.out.println("Sub of A & B is : " + result);
	
	}
	
	
	public static void main(String[] args) 
	{
		Constructor o1 = new Constructor (10,20);
		o1.add();
		o1.sub();
		
		
		

	}

}
