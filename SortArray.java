import java.util.Scanner;
import java.util.Arrays;
class SortArray 
{
	public static void main(String[] args) 
	{
		int b;
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		int a[] = new int[b];
		for(int i =0;i<b;i++){
			a[i] = sc.nextInt();
	}
	for(int i =0;i<b;i++){
		for(int j = i+1;j<b;j++){
			if(a[i]>a[j]){
				int temp = a[j];
				a[j]= a[i];
				a[i] = temp;
			}
		}
}
System.out.println(Arrays.toString(a));
	}
}
