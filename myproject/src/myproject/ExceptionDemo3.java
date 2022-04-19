package myproject;

public class ExceptionDemo3 {
			public static void main(String[] args) {
			System.out.println("befor exception....");
			LLRDriver llr=new  LLRDriver();
			try {llr.drive("humpy");
				
			}catch(Exception e) {
				System.out.println(e);	
			}
			System.out.println("after exception....");
			}
}
class LLRDriver{
	public void drive(String road)throws Exception{
	
		if(road.equals("humpy")) {
			throw new Exception();
		}
	}
}