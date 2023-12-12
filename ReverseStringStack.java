import java.util.*;

class ReverseStringStack{

	public static void main(String[] args){
	
		String str = "Geeks For Geeks";
		Stack<Character> stack =  new Stack<>();
		
		for(char ch : str.toCharArray()){
			stack.push(ch);
		}
		String temp = "";
		while(!stack.isEmpty()){
			temp+=stack.pop();
		}
		
		System.out.println(temp);
	
	}
}