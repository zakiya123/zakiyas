package myproject;

public class MethodWParameter {
		public static void main(String[] args) {
			MethodWParameter mwp=new MethodWParameter();
			mwp.met(2, 1.3f);
			mwp.met();
		}void met(){
			System.out.println("empty met called");
		}
		void met(int i,float f) {
			System.out.println(i+":"+f);
			System.out.println("met overloded with parameter");
		}
}
