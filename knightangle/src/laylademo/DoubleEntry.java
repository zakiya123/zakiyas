package laylademo;

public class DoubleEntry implements Accountant {

	@Override
	public void debit() {
		System.out.println("debit operation  done as per double entry.....");
		
	}

	@Override
	public void credit() {
		System.out.println("credit operation  done as per double entry.....");
		
	}

}
