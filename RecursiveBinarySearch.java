class RecursiveBinarySearch {

	public static void main(String[] args){
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int r = arr.length;
		int l =0 ;
		int x = 9;
		
		int i = binarysearch(arr,l,r-1,x);
		
		if(i==-1){
			System.out.println("NOt found");
		}else{
			System.out.println("found on index :" + i);
		}
	
	}
	
	static int binarysearch(int arr[],int l,int r,int x){
	
	
		if(r>=l){
			
			int mid = l + (r-l)/2;
			
			if(arr[mid]==x){return mid; }
			
			if(arr[mid]>x){
				return binarysearch(arr,l,mid-1,x);
			}
			if(arr[mid]<x){
				return binarysearch(arr,mid+1,r,x);
			}
			
			
		}
		return -1;
	
	}


}