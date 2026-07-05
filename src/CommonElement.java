import java.util.*;
class CommonElement 
{
	public static void main(String[] args) 
	{
		int a[] ={1,3,4,5,1,6};
		int b[] = {1,9,0,6,1};
		int c[] =new int[a.length];
		int count =0;
		for(int i = 0;i<a.length;i++){
			for(int j = 0;j<b.length;j++){
				if(a[i]==b[j]){ c[count] = a[i]; count++;
				}
			}
		}
		int d[] = new int[count];
		for(int i =0;i<count;i++){d[i] = c[i]; }
		System.out.println(Arrays.toString(d));
	}
}
