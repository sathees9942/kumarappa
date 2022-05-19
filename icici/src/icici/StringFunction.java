package icici;

public class StringFunction {
	
	public static void main(String[] args) {
		
		String s ="welcome to java session";
		
		
		int	i =	s.length();
		System.out.println(i);
		
		String b = s.toUpperCase();
		System.out.println(b);
		
		String c = s.toLowerCase();
		System.out.println(c);
		
		boolean d =  s.startsWith("w");
		System.out.println(d);
		
		boolean e =  s.endsWith("n");
		System.out.println(e);
		
		int f = s.indexOf('l');
		System.out.println(f);
		
		int g = s.lastIndexOf('e');
		System.out.println(g);
		
		boolean h =  s.contains("java");
		System.out.println(h);
		
		boolean j =  s.equals(c);
		System.out.println(j);
		
		boolean k =  s.equalsIgnoreCase(c);
		System.out.println(k);
		
		String l = s.replace('e','a');
		System.out.println(l);
		
		String s1 ="    hiiiii";
		String m = s1.trim();
		System.out.println(m);
		
		char ch =s.charAt(14);
		System.out.println(ch);
		
		String[] w = s.split(" ");
		System.out.println(w[2]);
		
	}

}
