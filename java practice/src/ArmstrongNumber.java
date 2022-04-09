
public class ArmstrongNumber {

	static boolean isArmstrong(int num) {
		int temp,digits=0,last=0;
		double sum=0;
		temp=num;
		
		while(temp>0) {
			temp=temp/10; //153/10=15;15/10=1;1/10=0
			digits++;
		}
		
		temp=num;//153
		while(temp>0) {
			last=temp%10; //153%10=3;15%10=5;1%10=1
			sum=sum+Math.pow(last, digits);
		temp=temp/10; //153/10=15;15/10=1;1/10=0
		}
		if(num==sum) {
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
	
		int num=1456;
		if(isArmstrong(num)) {
			System.out.println("i am an armstrong number");
		}
		else 
			System.out.println("i am not an armstrong number");
	}

}
