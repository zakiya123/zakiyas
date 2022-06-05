package selfDemoCodes;

public class AnanomusA {
		public static void main(String[] args) {
		AnanomusA aa=new AnanomusA();
		aa.met(new int[] {4,5,67,35,6});
		System.out.println(aa+"::::::::::::");
		
		aa.var(5,67,123,3,4567,86,567,234);
		}
		void met(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}System.out.println();
		for(int p:a) {
			System.out.print(p+"\t");
		}System.out.println();
		}
		void var(int...z) {
			for(int p:z) {
				System.out.print(p+"\t");
			}System.out.println();
		}
}
