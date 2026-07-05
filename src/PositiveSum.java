class PositiveSum 
{
	public static void main(String[] args) 
	{
		int a[] = {-1,-2,-3,-4}; int s =0;
		for(int i =0;i<a.length;i++){
			s += a[i] * a[i];
		}
		System.out.println(s);	}
}
