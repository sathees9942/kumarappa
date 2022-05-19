package icici;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class BojoExample {
	
	public static void main(String[] args) {
		
		BojoMethod b = new BojoMethod();
		
		b.setid(12);
		b.setName("sathees");
		b.setSal(50);
		b.setAddress("chennai");
		
		
		
BojoMethod c = new BojoMethod();
		
		c.setid(13);
		c.setName("mugesh");
		c.setSal(50);
		c.setAddress("covai");
		

		
		
		Map<Integer,BojoMethod> m = new HashMap<Integer,BojoMethod>();
		m.put(1 ,b);
		m.put(2 ,c);
		
		Set<Entry<Integer, BojoMethod>> entrySet = m.entrySet();
		for (Entry<Integer, BojoMethod> l : entrySet) {
			
			System.out.println(l.getValue().getid());
			System.out.println(l.getValue().getName());
			System.out.println(l.getValue().getSal());
			System.out.println(l.getValue().getAddress());
			
		}
		
		
		
	}
}


