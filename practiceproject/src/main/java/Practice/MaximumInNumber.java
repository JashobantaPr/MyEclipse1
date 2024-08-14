package Practice;

public class MaximumInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {2,5,6,12,45,90,23,4,};
     int max=arr[2];
     for(int i=0;i<arr.length;i++) {
    	 if(arr[i]>max)  //for min (arr[i]<min)
    	 {
    		 max=arr[i];
    	 }
     }
     System.out.println("maximum number in the above is:" +max);
     
	}

}
