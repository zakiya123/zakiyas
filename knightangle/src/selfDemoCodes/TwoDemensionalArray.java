package selfDemoCodes;

public class TwoDemensionalArray {
	public static void main(String[] args) {
		int arr[][]= {{23,45,65,63},
				      {76,34,76,87},
				      {12,34,76,94}};
		System.out.println("........I am simple for loop.....................");
		for(int i=0;i<arr.length;i++) { //no of rows
			for(int j=0;j<arr[i].length;j++) { //no of coloumn
			System.out.print(arr[i][j]+"\t");
	
			}System.out.println();
			
		}System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int enhance[]= {34,56,63};
		System.out.println("i am enhance for loop more handy,,, and latest");
		for(int e:enhance) {
			System.out.println(e);
			
		}
			
		int TwoD[][]= {{23,45,67,87},{12,34,65,76},{23,65}};
		System.out.println("**I am TwoD enhance.**");
		for(int i[]:TwoD) {
			for (int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}	
	}
}