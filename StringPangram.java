class StringPangram{

	public static void allLetter(String str){
		
		boolean exist =  true;
		
		str =  str.toLowerCase();
		
		for(char ch='a';ch<='z';ch++){
			
			if(!str.contains(String.valueOf(ch))){
				exist=false;
				break;
			}
			
		}
		
		if(exist){
			System.out.println("All letters exist");
		}else{
			System.out.println("All don't letters exist");
		}
		
		
	}


	public static void main(String[] args){
	
		String str = "Abcdefghijklmnopqrstuvwxyz12";
		allLetter(str);
		
	
	}

}