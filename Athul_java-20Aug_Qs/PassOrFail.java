class PassOrFail{
	public static void main(String[] args) {
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int n3=Integer.parseInt(args[2]);
		int n4=n1+n2+n3;
		int x;
		
		boolean flag=true;
		for(int i=0;i<3;i++){
			x=Integer.parseInt(args[i]);
			if(x-40<0){
				flag=false;
				break;
			}
			if(n4-125<0){
				flag=false;
				break;

			}

		}
		if(flag==true){
			System.out.println("PASSING");
		}
		if(flag==false) System.out.println("FAILED");
		
	}
}