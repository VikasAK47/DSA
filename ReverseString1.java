class ReverseString1{

	public static void main(String[] args){
		
		String input = "Geeks Gor Geeks";
		String nstr = "";
		char ch;
		System.out.println("origial String: "+ input );


		for(int i = 0 ; i<input.length() ; i++){
			
			ch = input.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println("Output after reversing:" + nstr);
		
	}


}