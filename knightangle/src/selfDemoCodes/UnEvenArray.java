package selfDemoCodes;

public class UnEvenArray {
			public static void main(String[] args) {
//			int arr[][]= {{12,34,54,76},{76,78,98}//initialised uneven array
//			             ,{3},{532,6}};	
//			for(int s[]:arr) {
//				for(int v:s) {
//					System.out.print(v+"\t");
//				}
//				System.out.println();
//			}
			int un[][]=new int[4][];//uneven empty array
			un[0] =new int[5];//initialising value later
			//un[0]->row index.,new->keyword. int[5]->coloumn size;
			un[0][0]=23;
			un[0][1]=3;
			un[0][2]=331;
			un[0][3]=311;
			//value for last column is not given so it will print zero.
//			for(int i=0;i<un.length;i++) {
//			for(int p=0;p<un[i].length;p++) {	
//			System.out.print(un[i][p]+"\t");}System.out.println();}
			un[1]=new int[3];
			un[1][0]=12;
			un[1][1]=112;
			un[1][2]=122;
			
			un[2]=new int[5];
			un[2][0]=12;
			un[2][1]=312;
			un[2][2]=41;
			un[2][3]=32;
			un[2][4]=72;
			
			un[3]=new int[1];
			un[3][0]=132;
			
			for(int i=0;i<un.length;i++) {
				for(int p=0;p<un[i].length;p++) {	
				System.out.print(un[i][p]+"\t");}System.out.println();}
			for(int matrix[]:un) {
				for(int result:matrix) {
				System.out.print(result+"\t");}
			System.out.println();}
			}
}
