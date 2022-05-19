package emp;

public class Constructor extends DerConstructor {
	
	public Constructor()
	{
		this(234);
		System.out.println(" the default constructor");
	}

	public Constructor(int i)
	{
		this("karthi");
		System.out.println(" the argument constructor"+i);
	}
	public Constructor(String name)
	{
		
		this("karthi@gmail",2344);
		System.out.println(" the argument string constructor super key"+name);
	}
	public Constructor(String mail,int id)
	{
		super(2);
		System.out.println(" the argument string constructor"+mail + " " +id);
	}
	public static void main(String[] args) {
		Constructor c = new Constructor();
		
		
	}
}
