package Array;

import java.util.*;
class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		int a[] ={1,2,2,3,4,5,5};
		/*HashSet<Integer> set = new HashSet<>();
		for(int num: a){
			set.add(num);
		}
		System.out.println(set);
		*/
		Arrays.sort(a);
		int rd= 0;
		for(int i =0;i<a.length;i++){
			if(a[i]!=a[rd]){
				rd++;
				a[rd] = a[i];
			}
		}for(int i =0;i<=rd;i++){
		System.out.print(a[i]+ " " );
		
		}
}
}