class Sum_arr_element
{

	public static int sum_arr(int[] arr){
	
		int result = 0;
		
	    for(int i : arr)
	    {
	       result= result + i ;
	    }
	    return result;
	}
	
   public static void main(String[] aa)
   {
   	int [] arr = {10,23,45,99};
   	
        System.out.println("The Sum of all the element in the given array is = " + sum_arr(arr));
   }
   
}

