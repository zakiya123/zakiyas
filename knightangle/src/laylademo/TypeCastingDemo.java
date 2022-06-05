package laylademo;

public class TypeCastingDemo {
	public static void accept(Engineer e) {//parent class name in param.
		Engineer eng=(Engineer)e;//casting engineer .
		eng.doPlan();}
		public void accept(Cleark clr) {
		Cleark cl=(Cleark)clr;
		cl.doAccount();}
	public static  void get(Object o) {
		Engineer eng=(Engineer )o;//casting engineer .
		eng.doPlan();
	}
	
		public static void main(String[] args) {
			Employee e1=new Engineer();
			Employee e2=new Cleark();
//			accept(e1);
//			accept(e2);
			get(e1);
}}
class Employee{
	
}
class Engineer extends Employee{
	public void doPlan() {
	System.out.println("engineer.....");	
	}
}
class Cleark extends Employee{
	public void doAccount() {
	System.out.println("employee.......");	
	}
}