class LinearSearch 
{
	public static void main(String[] args) 
	{
		int[] a = {2,5,8,9,7,5,9};
		int x = 5;
		
		int index = linearSearch(a,x);

		if(index==-1){
			System.out.println("index not found" );		
		}else{
			System.out.println("index  found:" + index );		
		}


	}

	static int linearSearch(int a[],int x){
	
	int n = a.length;

	for(int i=0 ; i<=n ; i++){
			if(a[i] == x){
				return i;
			}				
		}
		return -1;
	}
}
