package laylademo;

public class ExceptionDemo5Atm {
		public static void main(String[] args) {
		ATM bobAtm=new ATM();
		try {
		int amt=bobAtm.withDrawMoney(1000);//syntax to called return method.	
			System.out.println(amt);
			amt=bobAtm.withDrawMoney(1000);
			System.out.println(amt);
			amt=bobAtm.withDrawMoney(9000);
			System.out.println(amt);
		}
		catch(NoCashException ne) { //catch exception
		System.out.println(ne);//print exception
		}
}}
class NoCashException extends Exception{
	String msg;
	public NoCashException(String msg) {
		this.msg=msg;
	}@Override
	public String toString() {
		
		return "Exception is...."+msg;
	}
}
class ATM{
	int atmBalance=10000;
	public int withDrawMoney(int amt)throws NoCashException {
		if(amt>atmBalance) {
			throw new 
NoCashException("ATM cash balance is lower than your amount,please enter a leser amount");
			//CONSTRUCTOR OF NOCASH CLASS IS CALLED
		}
		else {
			atmBalance=atmBalance-amt;
		}return amt;
	}
}