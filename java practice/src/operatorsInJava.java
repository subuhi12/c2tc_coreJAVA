
public class operatorsInJava {

	public static void main(String[] args) {
		
		//pre and post increment
		int a=5;
		int b=2;
		int c;
		int d;
		c= ++b;
		d= a++;
		c++;
		System.out.println("a=" + a + "b=" + b + "c=" + c + "d=" + d );
		
		//&& and & operator
		int aa=10;
		int bb=5;
		int cc=20;
		System.out.println(aa<bb && aa<cc);
		System.out.println(aa<bb & aa<cc);
		System.out.println(aa<bb && aa++<cc);
		System.out.println(aa);
		System.out.println(aa<bb & aa++<cc);
		System.out.println(aa);

		
		//|| and | operator
		int r=10;//a
		int s=5;//b
		int t=20;//c
		System.out.println(r>s || r<t);
		System.out.println(r>s |  r<t);
		System.out.println(r>s || r++<t);
		System.out.println(r);
		System.out.println(r>s |  r++<t);
		System.out.println(r);
		
		//
	}

}
