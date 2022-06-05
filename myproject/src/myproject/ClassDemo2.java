package myproject;

public class ClassDemo2 {
			int age=20;
			String name="knights";
			MyType obj;
			void met() {
				MyType obj=null;
				System.out.println(obj);
				System.out.println(age+":"+name);
				obj=new MyType();
				System.out.println(obj.height+":"+obj.weight+":"+obj.name);
			}
			public static void main(String[] args) {
				ClassDemo2 obj=new ClassDemo2();
				obj.met();
			}
}
class MyType{
int height=4545;
int weight=3434;
String name="shabana";
}