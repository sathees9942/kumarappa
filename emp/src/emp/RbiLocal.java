package emp;

public class RbiLocal implements RBI,SBI {

	@Override
	public void sbiAcc() {
		// TODO Auto-generated method stub
		System.out.println("kjhfkdjhfkj");
		
	}

	@Override
	public void sbiNum() {
		// TODO Auto-generated method stub
		System.out.println("874938648967");
		
	}

	@Override
	public void accSav() {
		// TODO Auto-generated method stub
		System.out.println("kjhfkdjhfkj");
		
	}

	@Override
	public void accCur() {
		// TODO Auto-generated method stub
		System.out.println("8658658");
		
	}
	
	public static void main(String[] args) {
		
		RbiLocal r = new RbiLocal();
		r.accCur();
		r.sbiAcc();
		r.accSav();
		r.sbiNum();
		
	}

}
