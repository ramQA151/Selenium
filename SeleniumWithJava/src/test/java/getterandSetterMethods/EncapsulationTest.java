package getterandSetterMethods;

public class EncapsulationTest {

	public static void main(String[] args) {
		
		//Step4: Create the object
		
		 Student s= new Student();
		 
		 //Step5: Set values of variables
		 s.setstdId(777);
		 s.setstdRollNo(51);
		 s.setstdName("Ram");
		 
		 //Step6: call the getter method
		 
		 System.out.println("Student id: " +s.getStdId());
		 System.out.println("Student Roll No: "+s.getstdRollNo());
		 System.out.println("Student Name: "+s.getstdName());
		 
	}
}
