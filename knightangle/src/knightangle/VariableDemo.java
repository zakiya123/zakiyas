package knightangle;

public class VariableDemo {
		/*
		 * 1.instance variable
		 * 2.local variable
		 */
	int i=4;//instance variable
	public static void main(String[] args) {
	
	VariableDemo obj=new VariableDemo();//created to call local variable
	 obj.met();   //print local variable
	obj.i=595959; //changed value of instance variable
	obj.met();    //printed changed instance value
	
      VariableDemo obj2=new VariableDemo();
       obj2.met();     //NEW obj is created an old instance value is printed

      obj.met();      //local value + instance changed value is printed... 
      }
		public void met() {
			int i=0; //local variable       //int j=50;
			System.out.println("Local Variable"+i);
			System.out.println("Instance Variable"+ this.i);
		}
}