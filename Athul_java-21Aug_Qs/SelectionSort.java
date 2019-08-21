import java.util.Scanner;
class Selection{
	public void selectionSort(){ 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of array");
		int a = scan.nextInt();
		int []arr=new int[a];

		System.out.println("enter array");
		for (int i=0;i<a ;i++ ) {
			arr[i]=scan.nextInt();
		}

        for (int i = 0; i<arr.length-1; i++)  
        {  
            int minIndex = i; 

            for (int j = i+1; j<arr.length; j++){  
               
                if (arr[j] < arr[minIndex]){  
                    minIndex = j;
                }  
            } 

            int temp = arr[minIndex];   
            arr[minIndex] = arr[i];  
            arr[i] = temp;  
        }
        
        System.out.println("*************");
        	
        for (int i=0;i<a ;i++ ) {
			System.out.println(arr[i]);
			 	 
		}  
    }
}
class SelectionSort{
	public static void main(String[] args) {
		Selection s=new Selection();
		s.selectionSort();
	}
}