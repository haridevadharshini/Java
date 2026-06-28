import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean isPrime = true;
		if(a<=1) isPrime = false;
		else {
			for(int i =2;i*i<=a;i++){
				if(a%i==0) isPrime = false; break;
				}
		}
		String result = isPrime? "Prime" : "Not Prime";
		System.out.println(result);
	}
}
// other methods count variable
// skip 2 and 3 using if statement and start the loop from 5 