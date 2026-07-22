package Array;

class InsertElement
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4};
		int n = arr.length;
		int[] b = new int[n+1];
		int pos = 3;
		int ele = 50;
		for(int i =0;i<pos-1;i++){
			b[i] = arr[i];
		}
		b[pos-1]=ele;
		for(int i =pos;i<=n;i++){
			b[i] = arr[i-1];
		}
		for(int x : b){
			System.out.print(x + " ");
		} 
	}
}
