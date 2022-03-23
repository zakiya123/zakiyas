package classexcercise;

public class Lin {
		public static void main(String[] args) {
		Lin l=new Lin();	
			l.amethod();
		}
		public void amethod() {
			int ia[]=new int[4];
			//start for loop
			
			//	for(int i=0;i<ia.length-1;i++) {
				for(int i =0;i<ia.length;i++) {	
			//	for (int i=1;i<4;i++){
			//	for(int i=0;i<ia.length;i++) {	
			ia[i]=i;
			System.out.println(ia[i]);
		}}
}
