import java.util.Arrays;
class ArrayMerge{
	public static void main(String args[]){
		int[] arr1 = {1,9,3,10,8,6};
		int[] arr2 = {5,2,4};
		
		int p = arr1.length;
		int q = arr2.length;
		
		int r = p + q;
		System.out.println(r);
		
		int[] arr3 = new int[r];
		
		int index = 0;
        for (int num : arr1) {
            arr3[index++] = num;
        }
        for (int num : arr2) {
            arr3[index++] = num;
        }
        Arrays.sort(arr3);
      /*  for (int num : arr3) {
            System.out.print(num + " ");
        }
	 */
		
		
		for(int i=0; i<p; i++){
			System.out.print("  "+arr3[i]);
		}
		System.out.println("\n"+"*********");
		for(int i=p; i<r; i++){
			System.out.print("  "+arr3[i]);
		}
		
	
	
	
	
	}
}