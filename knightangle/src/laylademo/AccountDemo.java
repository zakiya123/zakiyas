package laylademo;

import malik.MoleculeFramework;

public class AccountDemo {
public static void main(String[] args) {
	Object ramu=new Object();
	SingleEntry se=new SingleEntry();
	DoubleEntry de=new DoubleEntry();//
	//Static way of object reading.....
	MoleculeFramework.setInterface(Accountant.class);
	ramu=MoleculeFramework.getObject(new Object[] {ramu,se});
	Accountant account=(Accountant)ramu;
	account.credit();
	account.debit();
}
}
