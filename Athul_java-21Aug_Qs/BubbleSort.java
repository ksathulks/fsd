import java.util.Scanner;
class Bubble{
	public void bubbleSort(){ 
		int temp=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of array");
		int a = scan.nextInt();
		int []arr=new int[a];

		System.out.println("enter array");
		for (int i=0;i<a ;i++ ) {
			arr[i]=scan.nextInt();
		} 
        for (int i = 0; i<arr.length; i++)  
        {  
             
            for (int j =0; j<arr.length-i-1; j++){  
                if (arr[j] > arr[j+1]){  
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }  
            }  
              
        }
        System.out.println("*************");
        	
        for (int i=0;i<a ;i++ ) {
			System.out.println(arr[i]);			 	 
		}  
    }
}
class BubbleSort{
	public static void main(String[] args) {
		Bubble s=new Bubble();
		s.bubbleSort();
	}
}