class Binary{
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int temp=n;
		String rev="";
		while(temp>0){
			
			rev=temp%2 + rev;
			temp=temp/2;
		}
		System.out.println(rev);
		
	}
}