package getterandSetterMethods;

public class Student {

	//step: Declare private variables
	private int stdId;
	private int stdRollNo;
	private String stdName;
	
	//step2: Apply getter method
	
	public int getStdId(){
		return stdId;		
	}
	public int getstdRollNo() {
		return stdRollNo;
	}
	public String getstdName() {
		return stdName;
	}
	
	//step3: Apply setter method
	
	public void setstdId(int id) {
		stdId = id;
	}
	public void setstdRollNo(int RollNo) {
		stdRollNo=RollNo;
	}
	public void setstdName(String Name) {
		stdName=Name;
	}
	
}
