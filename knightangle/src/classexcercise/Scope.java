package classexcercise;

public class Scope {
		private static int i;
		public static void main(String[] args) {
			Scope s=new Scope();
			s.amethod();
		}
		public static void amethod() {
			System.out.println(i);
		}
}
