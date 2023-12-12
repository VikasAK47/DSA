class charAtSearch {

	public static void main(String[] args){
		
		String word = "GeeksForGeeks";
		int index = 20;
		
		char letter = getCharAtIndex(word,index);
		
		System.out.println("index "+ index + " is at " + letter );
	
	}
	
	static char getCharAtIndex(String word,int index){
		
		char i = word.charAt(index);
		return i;
	}


}