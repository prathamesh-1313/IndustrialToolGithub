package array;

public class Array {

	public static void main(String[] args) {
	   
		int arr[]= {43,67,23,78,90};
		
		int max=Integer.MIN_VALUE;; int secMax=Integer.MIN_VALUE;
		
		for(int i=0;i<5;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			
		}
		
		System.out.println(max);
		for(int i=0;i<5;i++) {
			if(secMax<max && secMax>arr[i]) {
				secMax=arr[i];
			}
		}
		
		System.out.println("Second maximum number is  : " + secMax);
		
		
		}
		
	
	}


