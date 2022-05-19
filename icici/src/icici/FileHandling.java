package icici;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class FileHandling {
	public static void main(String[] args) throws IOException {
	
	   
		File f = new File("C:\\Users\\Susi\\Desktop\\filehandling\\demo.txt");
		boolean logo = f.createNewFile();
		System.out.println(logo);
		
		FileWriter f1 = new FileWriter(f);
		f1.write("welcome everyone");;
		f1.close();
		 
		FileReader f2 =new FileReader(f);
		
		char [] ch = new char[100];
		f2.read(ch);
		for (char c : ch) {
			
			System.out.print(c);
			
		}
		
		
	//	boolean folder = f.mkdir();
	//	System.out.println(folder);
		
		
	//	String[] filelist = f.list();	
	//	for (String x : filelist) {
			
	//		System.out.println(x);
			
	//	}
		
		
		}

}
