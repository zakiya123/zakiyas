package myproject;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflactionDemo2 {
			public static void main(String[] args) throws Exception {
			Thief thief=new Thief();
			Class c=thief.getClass();
			Field f=c.getDeclaredField("gold");
			f.setAccessible(true);
			System.out.println(f.get(thief));
			Method m=c.getDeclaredMethod("howtoSteal");
			m.setAccessible(true);
			m.invoke(thief);//argument is passed
			}
}
class Thief {
	private String gold="under the tree";//string variable
	private void howtoSteal() {
		System.out.println("steal when people are fooled.....");
	}
}
                 