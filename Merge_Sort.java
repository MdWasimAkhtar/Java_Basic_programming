class Merge_Sort
{
	public static void divide(int[] arr, int s , int e){
	
		if(s>=e){
		    return ;
		 }
		int m ;    
		m = s+(e-s)/2;
		divide(arr,s,m);
		divide(arr,m+1,e);
		
		conquer(arr,s,m,e);
	}
	
	public static void conquer(int[] arr, int s ,int m , int e){
		
		int merged[] =new int[e-s+1];
		
		int indx1 = s;
		int indx2 = m+1;
		int x = 0 ;
		
		while(indx1 <=m && indx2 <= e){
			if(arr[indx1] <= arr[indx2])
				merged[x++] = arr[indx1++];
			else
				merged[x++] = arr[indx2++];
		}
		while(indx1 <= m){
		merged[x++] = arr[indx1++];
		}
		while(indx2 <= e){
		merged[x++] = arr[indx2++];
		}
		for(int i = 0, j=s ; i<merged.length ; i++,j++)
			arr[j] = merged[i];
	}
	public static void main(String[]  aa){
		int[]  arr= {48,36,13,52,19,94,21};
		
		int n = arr.length;
		
		divide(arr, 0 ,n-1);
		
		for(int i = 0 ; i < n ; i++)
			System.out.println(arr[i]+" ");
	}
}
