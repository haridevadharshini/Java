class DigitCount 
{
	public static void main(String[] args) 
	{
		int a = 12345;
		if(a == 0) System.out.println("Digit is zero");
		int count = 0;
		while(a>0){
			a = a/10;
			count++;
		}
		System.out.println(count);
	}
}
