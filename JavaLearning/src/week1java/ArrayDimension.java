package week1java;

public class ArrayDimension {

	public static void main(Practice args[]){
		//declaring and initializing 2D array
		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
		//printing 2D array
		for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		}
		
		
		for (int[] i:arr) {
			for(int[] j :arr) {
				System.out.print(i);
				System.out.print(j);
			}
			
			System.out.println();
		}

}
}
