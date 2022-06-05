package selfDemoCodes;

import java.util.Scanner;

public class ALLException {
			public static void main(String[] args) {
			ICICIATM icatm=new ICICIATM();
			Scanner scan=new Scanner(System.in);
			System.out.println
  ("PLEASE ENTER A NUMBER"+"\n"+"PRESS ONE 1 FOR ENGLISH"+"\n"+"PRESS 2 FOR HINDI");
			int n=scan.nextInt();
			
			if(n==1) {
				System.out.println("welcome to icici atm..");
				
				System.out.println("please enter your secret number....");
				String SecretNum=scan.next();
			    
				System.out.println("please enter the amount...");
				int amt=scan.nextInt();
			try{int amount=	icatm.debitamount(22000);
			System.out.println(amount);}catch(Nocash ne) {
				System.out.println(ne);}
			finally {
				System.out.println("please collect your card");
			}
				System.out.println("please take your cash...");
				System.out.println("thankyou for choosing icici ATM");
			}
			if(n==2) {
				System.out.println("आईसीआईसीआई एटीएम में आपका स्वागत है");
				System.out.println("कृपया अपना गुप्त नंबर दर्ज करें");
				String sn=scan.next();
				System.out.println("कृपया राशि दर्ज करें");
				int cash=scan.nextInt();
			try{int amount=	icatm.debitamount(200);
				System.out.println(amount);}catch(Nocash ne)
			{System.out.println(ne);}
			finally {
				System.out.println("कृपया अपना कार्ड जमा करें");
			}
				System.out.println("कृपया अपना कैश लें");
				System.out.println("आईसीआईसीआई एटीएम चुनने के लिए धन्यवाद");
			}
			
			}
}
class Nocash extends Exception{
	String msg;
	public Nocash(String msg) {
	this.msg=msg;
	
	}@Override
	public String toString() {
		
		return msg;
	}
}
class ICICIATM{
  int atmbalance=20000;
	public int debitamount(int amt) throws Nocash {
	
	if(amt>atmbalance) {
		throw new Nocash("please enter a lesser amount...") ;
	}else {
		atmbalance=atmbalance-amt;
		return amt;
		
	}
	}
}