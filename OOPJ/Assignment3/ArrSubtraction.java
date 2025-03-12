class ArrSubtraction{
	public static void main(String args[]){
	
	int[][] arr1 ={{20,15},{19,16}};
	int[][] arr2 ={{12,36},{11,10}};
	
	int[][] arr3 = new int[2][2];
	
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			arr3[i][j] = arr1[i][j] - arr2[i][j];
		}
	}
	
	for(int ar[]: arr3){
		for(int x: ar){
			System.out.print("   "+x);
		}
		System.out.println();
	}
	System.out.print("yes");
	}
	
	}