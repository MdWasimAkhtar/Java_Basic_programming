import java.util.Arrays;

class Array01
{
    public static void main(String[] aa)
    {
    	int arr[] = {12,45,33,99,90,12,101,5,4}; 
  	Array01.min_arr_element(arr);   
    }
    
    public static void arr(){
    int nums[]  = new int[6];
  	
  	nums[0] = 12 ;
  	nums[1] = 67;
  	nums[2] = 33;
  	nums[3] = 90;
  	nums[4] = 900;
  	nums[5] = 786;
  	
  	for ( int i = 0 ; i < nums.length ; i++)
	  	System.out.println(nums[i]);  
	 
	 System.out.println(nums.length);
	 
	 System.out.println(Arrays.toString(nums));
	 
	 for(int j : nums)
	  System.out.println(j);
	  
     }
     public static void arr_2D(){
     	
     	int[][] myNums = {{10,20,30,40},{4,3,2,1},{199,299,399}} ;
     	
//     	System.out.println(Arrays.toString(myNums));

	for (int i = 0 ; i < myNums.length ; i++){
		for ( int j = 0 ; j< myNums[i].length ;j++){
			System.out.print("  "+myNums[i][j]);
		
		}
		System.out.println();
	}
     
     }
     
     public static void arr_3D(){
     	
     	int[] [] [] arr = new int[5][10][10];
     	
     	for ( int i = 0 ; i < arr.length ; i++){
     		for( int j = 0 ; j < arr[i].length ; j++){
     			for( int k = 0 ; k < arr[i].length ;k++){
     				System.out.print(" "+arr[i][j][k]);
     			}
     			System.out.println();
     		}
     		System.out.println();
     	}    
     }
     
     public static void min_arr_element(int arr[]){
     	
     	int min = arr[0];
     	
     	for (int i = 1 ; i< arr.length ; i++){
     		System.out.println("min : "+min);
     		if (min >= arr[i]){
     			System.out.println(min+" > "+arr[i] );
     			min = arr[i] ;
     		    }
     		}
     	System.out.println("min value : "+min);
     }
     
    public String toString(){
    
    	return "";
    }
 }
 
 /*
 To insert values to it, we can use an array literal - place the values in a comma-separated list, inside curly braces
 
 😵️Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous memory location. It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.

Array in Java is index-based, the 🤗️ first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.

Unlike C/C++, we can get the length of the array using the length member. In C/C++, we need to use the sizeof operator.

In Java, array is an object of a dynamically generated class. Java array inherits the Object class, and implements the Serializable as well as Cloneable interfaces. We can store primitive values or objects in an array in Java. Like C/C++, we can also create single dimentional or multidimentional arrays in Java.

Moreover, Java provides the feature of anonymous arrays which is not available in C/C++.

Java array

Advantages
Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
Random access: We can get any data located at an index position.

Disadvantages
Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime. To solve this problem, collection framework is used in Java which grows automatically.
 */
 
 
 
 
 
 
 
 
 
