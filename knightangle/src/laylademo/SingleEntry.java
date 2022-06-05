package laylademo;

public class SingleEntry implements  Accountant {
	
	@Override
	public void debit() {
		System.out.println("debit operation as per single entry....");
	}
	@Override
	public void credit() {
		System.out.println("credit operation as per single entry......");	
	}

}
