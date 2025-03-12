class ArrMultiplication{
	public static void main(String args[]){
		int[][] arr1={{12,11},{13,15}};
		int[][] arr2={{23,22},{31,16}};
		
		int[][] arr3= new int[2][2];
		int sum = 0;
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				for(int k=0;k<2;k++){
					sum = sum + arr1[i][k] * arr2[k][j];
				}
				System.out.println(sum);
				arr3[i][j] = sum;
				sum = 0;
				
			}
		}
		
		
		for( int ar[]: arr3){
			for(int x: ar){
				System.out.print("\t"+x);
			}
			System.out.println();
		}
		
	}
}