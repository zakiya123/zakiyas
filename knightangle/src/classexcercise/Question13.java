package classexcercise;

public class Question13 {//14
		public static void main(String[] args) {
		Question13 obj=new Question13();
		obj.met();		
		obj.met(12);		
		obj.met(98654678788L);
		obj.met((long)9887654);
		obj.met("knights",100);
		obj.met(200,"knights.....");
		int arr[]= {34,66,87,90};
		obj.call(arr);//bad practice
		System.out.println("\n.....................\n");
		obj.call(new int[] {56,87,90,45});//good practice
		System.out.println("\n***************\n");
		obj.varmet(25,45,567,6768,78,98765,8689,23864);
		}
		void met() {
			System.out.println("met called......");
		}
		void met(int i) {
			System.out.println(i);
		}
		void met(long l) {
			System.out.println("long.............");
		}
		void met(String s,int n) {
			System.out.println(s+":"+n);
		}
		void met(int n,String s) {
			System.out.println(n+":"+s);
		}
		void call(int a[]) {
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+"\t");
				
			}
			System.out.println();
			for(int n:a) {
				System.out.print(n+"\t");
			}
		}
		void varmet(int...a) { //VARARGS
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		for(int n:a){
			System.out.print(n+"\t");
		}
		}
}
