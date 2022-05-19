package icici;

public class StrBuffer {
	
	public static void main(String[] args) {
		
	


	StringBuffer k = new StringBuffer("karthi");
	
	StringBuffer k1 =new StringBuffer("rajan");
			
	System.out.println(System.identityHashCode(k));
	System.out.println(System.identityHashCode(k1));
	
	
	StringBuffer m =k.append(k1);
	
	System.out.println(m);
	
	System.out.println(System.identityHashCode(m));
	
}
}
