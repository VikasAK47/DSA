class LeadingZeroRemove{

	public static void main(String[] args){
		
		int j =0;
		String str = "0000120001";
		for(int i=0 ; i<str.length() ; i++){
			char ch =str.charAt(i); 
			if(ch!='0'){
				j=i;
				break;
			}
			
		}
		String nStr =  str.substring(j,str.length());
		System.out.println(nStr);
		
	}


}