class ArrAddition{
	public static void main(String args[]){
	int[][] arr1 = {{1,2},{3,4}};
	int[][] arr2 = {{5,6},{7,8}};
	
	int[][] arr3 = new int[2][2];
	
	for (int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			arr3[i][j] = arr1[i][j]+arr2[i][j];
			//System.out.println(arr3[i][j]);
		}
	}
	
	for ( int ar[]: arr3){
		for ( int x: ar){
		System.out.print("  "+x);
		}
		System.out.println();
	}
	
}
}