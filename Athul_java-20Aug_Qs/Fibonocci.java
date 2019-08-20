class Fibinocci{
	public static void main(String[] args) {
		int n=89;
		int a=0,b=1,c=0;
		while(c<=89){
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
	}
}