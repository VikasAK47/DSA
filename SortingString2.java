import java.util.*;

class SortingString2{


	public static char[] sortingString(String str){
			
		char arr[] = str.toCharArray();
		
		 Arrays.sort(arr);
		
		return arr;
		
	}

	public static void main(String[] args){
	
		String str = "geeksforgeeks";
		
		
		char arr[] = sortingString(str);
				
		System.out.println(arr);
	
	}
}