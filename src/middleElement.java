class middleElement 
{
	public static void main(String[] args) 
	{
		int a[] ={1,2,3,4,5};
		int n = a.length;
		if(n%2 == 1){
			System.out.println(a[n/2]);
		}
		else{
			System.out.println(a[n/2-1]+" "+ a[n/2]);
		}

	}
}
