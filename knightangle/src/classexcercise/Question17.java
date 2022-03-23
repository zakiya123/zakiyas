package classexcercise;

public class Question17 {
		public static void main(String argv[]) {
		int i;
		int j;
		outer:
			for(i=1;i<3;i++)
				inner:
					for(j=1;j<3;j++) {
						if(j==2)
							continue outer;
						System.out.println("Value for i="+i+"Value for j="+j);
					}
		}
}
//class sub extends Question17{}
//class sub2 extends Question17{}
//public class CEx{
//	public static void main(String argv[]) {
//		Base b=new Base();
//		sub s (sub)b;
//	}
//}