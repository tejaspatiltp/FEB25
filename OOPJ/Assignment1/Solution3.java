class Solution3{
	public static void main(String args[]){
	/*
	double a = 232.1233111111d;
	int b = a; // error: incompatible types: possible lossy conversion from double to int int b = a;
	System.out.println(a);
	System.out.println(b);
	*/
	double a = 232.1233111111d;
	int b = (int) a; 
	System.out.println(a);
	System.out.println(b);
}
}