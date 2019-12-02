package test;


//Constructor
public class Student {

	int SNo;
	String SName;
	
	
	public Student(int SNo, String SName) {
		this.SNo = SNo;
		this.SName =SName;
	}

  public void studentDetails()
  {
	  System.out.println(SNo);
	  System.out.println(SName);
  }
  
  
  
	public static void main(String[] args) {
	Student s1 = new Student(100,"ShyamGangadharabatla");
	s1.studentDetails();
	

	}

}
