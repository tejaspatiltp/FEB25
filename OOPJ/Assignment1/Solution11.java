class Solution11{
	public static void main(String args[]){
	int a = 42;
	if (a > 0 && a%2==0){
		System.out.println("Number is positive and even.");
	}else{
		System.out.println("Number is Not Positive and Not Even.");
	}

	int b = 86;
	if (b < 0 || b%2!=0){
		System.out.println("Number is neither positive nor even.");
	}else{
		System.out.println("Number is not positive.");
	}
}
}