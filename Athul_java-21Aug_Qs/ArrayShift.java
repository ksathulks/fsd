import java.util.Scanner;
class ArrayShift{
	public static void main(String[] args) {
		


		int temp=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of array");
		int a = scan.nextInt();
		int []arr=new int[a];
		System.out.println("enter array");
		for (int i=0;i<a ;i++ ) {
			arr[i]=scan.nextInt();
		}

		System.out.println("*************");

		int last=arr[arr.length-1];
		for (int i=a-1;i>0 ;i-- ) {
			arr[i]=arr[i-1];			
		}
		arr[0]=last;
		
		for (int i=0;i<a ;i++ ) {
			System.out.println(arr[i]);
		}

		
	}
		
}