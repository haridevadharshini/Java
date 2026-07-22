package numberbased;

import java.util.Scanner;
class Nthprime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int pcount = 0;
		int n = 1;
		while(pcount<a) {
			n++;
			boolean isPrime = true;
			if(n<=1) isPrime = false;
			else if(n<=3) isPrime = true;
			else if(n%2 ==0|| n%3==0) isPrime = false;
			else{
				for(int i = 5; i*i<=n;i+=6){
				if(n%i==0||n%(i+2)==0) isPrime = false; break;
				}
			}
			if(isPrime) pcount++;
		}
System.out.println(n);
}
	} 
