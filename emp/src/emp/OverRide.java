package emp;

public class OverRide extends OverLoad {
	
	@Override
	public void empD(int i) {
		// TODO Auto-generated method stub
		super.empD(i);
		System.out.println("but attitude guy"+i);
	}
	
	public static void main(String[] args) {
		OverRide o = new OverRide();
		o.empD(122);
	}

}
