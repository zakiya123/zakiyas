package selfDemoCodes;

public class CopyArrayDemo {
		public static void main(String[] args) {
			int arr[]= {37,68,97,87};
			CopyArrayDemo cad=new CopyArrayDemo();
			//System.out.println("before passing...:"+arr[2]);
		//	cad.pbrArray(arr);
		//	System.out.println("before passing...:"+arr[2]);
			
			cad.pbrArray(new int[] {34,54,76,98});
			int copyarr[]=new int[4];
			System.arraycopy(arr, 0, copyarr, 0, 4);
			System.out.println(" copy array ...:"+copyarr[1]);
			System.out.println("before passing...:"+arr[1]);
			cad.pbrArray(copyarr);
			System.out.println("After passing...:"+arr[1]);
			System.out.println("copy array"+copyarr[1]);
		}
		void pbrArray(int a[]) {
			a[1]=5864;
		}
}
