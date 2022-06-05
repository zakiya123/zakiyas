package laylademo;

public class ExceptionDemo6 {
		public static void main(String[] args) {
			try {
				met("hello");
				//met("Dog");     
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		public static void met(String value)throws Exception{
			if(value.equals("Dog")) {
				throw new Exception();
			}
			System.out.println("no ...Exception");
		}
}
