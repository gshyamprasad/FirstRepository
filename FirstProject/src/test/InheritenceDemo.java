package test;

class Calculator     {    				//Super

	public int add(int i, int j) 
	
	{
		return i+j;
	}
	
	}

class CalcAdv extends Calculator		//Sub
{

	public int sub (int i,int j)
	{
		return i-j;	
	}
	
		
	}

class CalcVeryAdv extends CalcAdv
{
	public int mutli(int i, int j)
	{
		return i*j;
	}


}
public class InheritenceDemo 
{

	public static void main(String[] args)
	{
	
		CalcVeryAdv c1 = new CalcVeryAdv();
		int result1 = c1.add(5, 4);
		int result2 = c1.sub(6, 3);
		int result3 = c1.mutli(6, 3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}


