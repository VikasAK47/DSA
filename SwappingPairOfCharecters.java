import java.util.*;

class SwappingPairOfCharecters{


	public static char[] swappingChars(String str){
			
		char arr[] = str.toCharArray();
		
		 for(int i = 0 ; i<arr.length ; i= i+2){
			char temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		 }
		
		return arr;
		
	}

	public static void main(String[] args){
	
		String str = "geeksforgeek";
		
		
		char arr[] = swappingChars(str);
				
		System.out.println(arr);
	
	}
}