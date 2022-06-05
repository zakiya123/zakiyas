package myproject;

import java.lang.reflect.Field;

 public class AnnoDemo {//composition object creation
			public static void main(String[] args) throws Exception{
			Knife knife=OEM.createKnife();
			knife.useknife();//null point exception because handle is not there.
		
			}
 }
 class OEM {
	public static Knife createKnife()throws Exception {
		Knife knife =new Knife();
	//	Handle handle=new WoodenHandle();
		Class c=knife.getClass();
		Field f = c.getDeclaredField("handle");
		in In = f.getAnnotation(in.class);
		if(In!=null) {
			String className=In.className();
			Handle handle=(Handle)Class.forName(className).newInstance();
			//dependency injection
			knife.setHandle(handle);
		}
		//knife.setHandle(handle);
		return knife;
		
	}
}
class Knife{
	@in(className="myproject.SilverHandle")//meta data or customer requrment
	private Handle handle;
	public Handle getHandle() {
		return handle;
	}
	public void setHandle(Handle handle) {
		this.handle = handle;
	}
	public void useknife() {
		handle.useHandle();
	}
}
abstract class Handle{
	public abstract void useHandle(); 
}
class WoodenHandle extends Handle{
	@Override
	public void useHandle() {
		System.out.println("WoodenHandle used.....");	
	}
}
class SilverHandle extends Handle{
	@Override
	public void useHandle() {
		System.out.println("Silver Handle used......");
	}
}