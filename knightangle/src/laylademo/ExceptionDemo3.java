package laylademo;

public class ExceptionDemo3 {
		public static void main(String[] args) throws Exception {
			myclasses mc=new  myclasses();
			mc.emt();
		System.out.println("Before exception......");	
		try{
			int i=1/0;
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("finally blocked called.....");
		}
		System.out.println("after exception....");
		}
}
class myclasses{
	public void emt() throws Exception {
		try{
			wait();
		}catch(Exception e) {};
	System.out.println("emt method called..for wait....");
	}
}
