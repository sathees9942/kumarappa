package emp;

public class StudentDetails extends EmpDetails{

	@Override
	public void empnName() {
		// TODO Auto-generated method stub
		System.out.println(" karthick");
	}

	@Override
	public void empMail() {
		// TODO Auto-generated method stub
		System.out.println(" karthick@gmail.com");
		
	}
public static void main(String[] args)

{
	StudentDetails s = new StudentDetails();
	s.empId();
	s.empMail();
	s.empnName();
}

	
}
