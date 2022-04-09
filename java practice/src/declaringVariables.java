
public class declaringVariables {

	public static void main(String[] args) {
		//Example-01
		String Name="John";
		System.out.println(Name);
		
		//Example-02
		int myNum=15;
		System.out.println(myNum);

		//Example-03
		
		//Example-04
		String name="John";
		System.out.println("Hello " +name);
		
		//EXAMPLE WIDENING CASTE
		int myInt=9;
		double myDouble=myInt;
		System.out.println(myDouble);
		System.out.println(myInt);
		
		//EXAMPLE NARROWING CASTE
		double myyDouble=9.78;
		int myyInt=(int)myyDouble;
		System.out.println(myyDouble);
		System.out.println(myyInt);
	}

}
