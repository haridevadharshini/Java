import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a =0;
		int b =1;
		int c=0;
		//System.out.println(a);
		//System.out.println(b);
		for(int i =3;i<=n;i++){
			c = a+b;
			//System.out.println(c);
			a=b;
			b=c;
		}
		System.out.println(c);
	}
}
//This is nth fibonacci
// for fibonacci up to n terms un comment the 3 print statements and comment the last print statement
