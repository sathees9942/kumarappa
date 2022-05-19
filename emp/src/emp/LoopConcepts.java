package emp;

public class LoopConcepts {
	
	
	public static void main(String[] args) {
		
		for(int i = 1;i <=100 ;i++)
		{
			if( i%2 == 0)
				
			{
				System.out.println(" the even numbers are"+i);
				
			}
			
			else {
				System.out.println(" the odd numbers are"+i);
				
			}
			if(i == 10) {
			System.exit(0);
			}
			System.out.println(" Loop completed");
		}
	}

}
