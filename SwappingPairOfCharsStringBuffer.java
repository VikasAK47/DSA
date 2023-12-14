import java.util.*;

class SwappingPairOfCharsStringBuffer{


	public static StringBuffer swappingChars(String word){
			
		StringBuffer str = new StringBuffer(word.length());
		
		for(int i=0 ; i<word.length()-1 ; i+=2){
			str.append(word.charAt(i+1));
			str.append(word.charAt(i));
		}
		
		if(word.length() % 2 != 0){
			str.append(word.charAt(word.length()-1));
		}
		
		return str;
		
	}

	public static void main(String[] args){
	
		String str = "geeksforgeek";
				
		System.out.println(swappingChars(str));
	
	}
}