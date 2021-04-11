package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		//Deger atama 2. yol
		
		int arr[][]= {{1,2},{3},{4,5,6,11}};
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println(arr[0][1]+arr[1][0]+arr[2][2]);
		
		
		
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				sum=sum+arr[i][j];
			}
		}System.out.println(sum);

	}

}
