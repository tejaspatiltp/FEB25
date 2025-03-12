class ArrTranspose{
	public static void main(String args[]){
	int[][] arr1 = {{1,2},{3,4}};
	//int[][] arr2 = {{6,7},{8,9}};
	System.out.println("Before Transpose");
		for(int ar[]: arr1){
		for(int x: ar){
			System.out.print("\t"+x);
		}
		System.out.println();
	}
	System.out.println("After Transpose");
	
	int[][] arr3 = new int[2][2];
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			//arr3[i][j] = arr1[j][i];
			arr3[i][j] = arr1[j][i];
		}
	}
	
	for(int ar[]: arr3){
		for(int x: ar){
			System.out.print("\t"+x);
		}
		System.out.println();
	}
	
	
	}
}