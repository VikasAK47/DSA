class SubString1{

	public static void main(String[] args){
		
		String input = "Geeks Gor Geeks";
		int index = 6;
		char ch = 'F';
		
		System.out.println("origial String: "+ input );
		
		input = input.substring(0,index)+ ch + input.substring(index+1);
		System.out.println(input);
		
	}


}