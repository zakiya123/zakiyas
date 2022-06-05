package selfDemoCodes;

public class RevisionOne {
			public static void main(String[] args) {
			Byte boxB=13;//complextype
			
			System.out.println(boxB);
			
			Short shS=24;
			System.out.println(shS);
			
			Float fadF=13.4f;
			System.out.println(fadF);
			
			Double mycarD=435634.5;
			System.out.println(mycarD);
			
			System.out.println("*****************************************");
			int arr[]= {12,43,54,65,56};
			int[]arr2= {32,4,5,67,89};
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}System.out.println("______________________________");
			for(int i=0;i<arr2.length;i++) {
				System.out.println(arr2[i]);
			}
			System.out.println("#########################################");
			for(int s:arr) {
				System.out.print(s+"\t");
			}
			for(int v:arr2) {
				System.out.print(v+"\t");
			}
			System.out.println();
			String ss[]=new String[5];
//			ss[0]="hi";
//			ss[1]="hello";
			for(int i=0;i<ss.length;i++) {
				ss[i]="hello"+i;
				System.out.println(ss[i]);
			}
//			for(String v:ss) {
//				System.out.println(v);
				
		//	}
			}
}
