package selfDemoCodes;

public class ArrayAsParameter {
		public static void main(String[] args) {
			ArrayAsParameter obj=new ArrayAsParameter();
			obj.met(new int[] {65,76,78,86});//anynomus array
			obj.varmt(54,678,990,99,123,546,67);
		}
		void met(int a[]) {
			System.out.println("Parameter array is called...");
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+"\t");
			}
			System.out.println("\n"+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~`"+"\n");
			for(int j:a) {
				System.out.print(j+"\t");
			}
		}
		void varmt(int...z) {
			//its an array but didnt have[]bracket.we can give as many values we want
			for(int x=0;x<z.length;x++) {
				System.out.print(z[x]+"\t");
			}System.out.println("\n"+"****************"+"\n");
			
			for(int p:z) {
				System.out.print(p+"\t");
			}
			System.out.println("\n"+"$$$$$$$$$$$$$$$"+"\n");	
		}
}
