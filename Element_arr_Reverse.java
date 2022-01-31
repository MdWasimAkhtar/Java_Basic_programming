class Element_arr_Reverse
{
    public static void main(String[] aa){
  	int arr[] = {56,32,45,11,90,66,1,132,-100};
//        arr_Reverse(arr);
	
        System.out.println(arr);
    }
    
    public static void arr_Reverse(int arr[]){
    	
    	for ( int i = arr.length-1 ; i >= 0  ; i--)
    		 System.out.print(arr[i]+" ");
    		 
    		 System.out.println();
    		 System.out.println("Find Min Element in Array");
    	int min = 0 ;
    	for ( int i = 1; i <arr.length ; i++){
    	
    		if(arr[min] > arr[i]){
    			min = i;
    			System.out.println(arr[i]);
    		}		
    	}
    	System.out.println("min : "+arr[min]);
    
    	System.out.println("Find Min Element in Array");
    	
    	int max = 0 ;
    	
    	for( int i = 1 ; i < arr.length ; i++){
    	
    		if( arr[max] < arr[i])
    			max = i;
    	}
    		System.out.println("MAX Element in the Arr[] : "+arr[max]);
    }
}
