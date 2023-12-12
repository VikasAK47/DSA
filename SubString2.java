class SubString2{

	public static void main(String[] args){
		
		String input = "Geeks Gor Geeks";
		int index = 6;
		char ch = 'F';
		
		System.out.println("origial String: "+ input );


		StringBuilder str = new StringBuilder(input);
		str.setCharAt(6,ch);
		System.out.println(str);
		
	}


}