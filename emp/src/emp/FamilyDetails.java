package emp;

public class FamilyDetails {

	
	public void empName(String name)
	{
		// TODO Auto-generated method stub
		System.out.println("enter the name:"+name);
		

	}
	public void empName(int id) {
		// TODO Auto-generated method stub
		System.out.println("enter the id:"+id);

	}
	
	public void empName(float sal) {
		// TODO Auto-generated method stub
		System.out.println("enter the salary:"+sal);

	}
	
	public void empName(String mail , int fd) 
	{
		// TODO Auto-generated method stub
		System.out.println("enter the mail:"+mail);

	}
	
	public static void main(String[] args) {
		FamilyDetails f = new FamilyDetails();
		f.empName("jack");
		f.empName("jackie@gmail.com");
		f.empName(225);
		f.empName(20000);
	
	}
	
}
