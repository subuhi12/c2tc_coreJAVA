
import java.util.Scanner;
public class scanner

{

public static void main(String[] args)

{

Scanner sc = new Scanner(System.in);
int sum= 0, count = 0;
while (sc.hasNextInt())
{

// Read an int value int num= sc.nextInt();
	int num = sc.nextInt();
	sum += num;
	count++;
}
int mean = sum / count;
System.out.println("Mean:" + mean);
}
}
