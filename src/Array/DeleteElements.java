package Array;

class DeleteElements
{
	public static void main(String[] args) 
	{
		int arr[] ={10,20,30,40};
		int pos = 2;
		int n = arr.length;
		for(int i = pos;i<n-1;i++){
			arr[i] = arr[i+1];
		}
		for(int i =0;i<n-1;i++){
			System.out.print(arr[i] +" ");
		}
	}
}
