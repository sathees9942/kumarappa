package icici;

public class StringReverse {
	public static void main(String[] args) {
		
		String s ="selinium";
		
		String s1 = s.replace("sel", "les");
		System.out.println(s1);
		
		
		String k = new String("karthi");
		
		String k1 =new String("rajan");
				
		System.out.println(System.identityHashCode(k));
		System.out.println(System.identityHashCode(k1));
		
		
		String m =k.concat(k1);
		
		System.out.println(m);
		
		System.out.println(System.identityHashCode(m));
		
		
	}

}
