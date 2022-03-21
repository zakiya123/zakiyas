package myproject;

public class PbvPbr {
		public static void main(String[] args) {
			
		PBV_ChineseWisper pbv=new PBV_ChineseWisper();
		
		String myword="knightangle";
		
		System.out.println("Myword is before passing...."+myword);
		
		pbv.accept(myword);
		
		System.out.println("Myword is aftre passing....."+myword);
		
		Laddu1 laddu=new Laddu1(10);
		
		PBR_IndianLaddu pbr=new PBR_IndianLaddu();
		
		System.out.println("My Laddu size before passing..."+laddu.size);
		
		pbr.accept(laddu);
		
		System.out.println("My Laddu size after passing...."+laddu.size);
		}
}
class PBV_ChineseWisper{
	public void accept(String myword) {
		myword="alexendra";
	}
}
class PBR_IndianLaddu{
	public void accept(Laddu1 laddu) {
		laddu.size=laddu.size-8;
	}
}
class Laddu1{
	public Laddu1(int size) {
		this.size=size;
	}
	int size;
}