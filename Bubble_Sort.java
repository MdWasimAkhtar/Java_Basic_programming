import java.util.*;


class Bubble_Sort
{
	public static void main(String[] aa){
//		b_Sort();
		int[] arr = {23,65,1,7,90,-90,34,12,11,17,99,11,-90};
		find_min(arr);
	}
	//bubble sort
	public static void b_Sort(){
		
		int[] arr = {23,65,1,7,90,34,12,11,17,99};
		int temp = 0 ;
		for(int i = 0 ; i < arr.length ;i++)
		{
			for(int j = i+1 ; j < arr.length ; j++){
				if ( arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	for(int i = 0 ; i< arr.length ; i++)
		System.out.println(arr[i]);
	}
	//insertion sort 
	
	public static void insertion_Sort(int[] arr){
		int key ;
		int j; 
		for(int i = 0 ; i < arr.length ; i++)
		{	key=arr[i];
			j = i;
			while(j> 0 && arr[j-1]>key){
				arr[j] = arr[j-1];
				j = j-1;
			}
			arr[j] = key;
		}
		for(int i = 0 ; i< arr.length ; i++)
			System.out.println(arr[i]);
	}
	//selection sort 
	
	public static void Selection_Sort(int[] arr){
		int min ;
		int temp ;
		for(int i = 0 ;i < arr.length ; i++){
			min = i ;
			for(int j = i+1 ; j< arr.length ; j++){
				if(arr[min]>arr[j])
					min = j;
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp ;
			}
		}
		for(int i = 0 ; i<arr.length ;i++)
			System.out.println(arr[i]);	
	}
	
	// min element in the array
	public static void find_min(int[] arr){
		int min = arr[0];
		List<Integer> arr2 = new ArrayList<Integer>();
		for(int i = 1 ; i<arr.length ;i++){
			if(min>arr[i]){
				min = arr[i];
				arr2.add(arr[i]);
			}
		}
		System.out.println(min);
		
		Iterator itr = arr2.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	
	}
}
