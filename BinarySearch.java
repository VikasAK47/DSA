class BinarySearch {

	public static void main(String[] args){
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int r = arr.length;
		int l =0 ;
		int x = 5;
		
		int i = binarysearch(arr,l,r-1,x);
		
		if(i==-1){
			System.out.println("NOt found");
		}else{
			System.out.println("found on index :" + i);
		}
	
	}
	
	static int binarysearch(int arr[],int l,int r,int x){
	
	
		while(l<=r){
		
			int mid = (l+r)/2;
			
			if(arr[mid]==x){
				return mid;
			}else if(arr[mid]<r){
				r = mid-1;
			}else{
				l = mid+1;
			}
		}
		return -1;
	
	}


}