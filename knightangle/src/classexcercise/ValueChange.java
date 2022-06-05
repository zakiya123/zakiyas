package classexcercise;

public class ValueChange {
		static int a=55;
		static int change() {
			int a=20;
			return a;
		}
	public static void main(String[] args) {
		int changeValue=ValueChange.change();
		System.out.println(changeValue);
	}
}
