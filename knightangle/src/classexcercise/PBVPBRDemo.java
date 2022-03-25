package classexcercise;

public class PBVPBRDemo {
			public static void main(String[] args) {
			PBV_ChineseWisper pbv=new PBV_ChineseWisper();
			String myword ="Knightangle";								
			System.out.println("MyWord before passing" + myword);
			pbv.accept(myword);
			System.out.println("Myword is aftre passing...:"+myword);
			Laddu laddu=new Laddu(10);
			
			PBR_IndianLaddu pbr=new PBR_IndianLaddu();
			System.out.println("My Laddu size before passing...: "+laddu.size);
			pbr.accept(laddu);
			System.out.println("My Laddu size after passing...: "+laddu.size);
			}
			}
class PBV_ChineseWisper{
	public void accept(String myword) {
	 myword = "alexendra";
	}
    }
class PBR_IndianLaddu{
	public void accept(Laddu laddu){
	laddu.size=laddu.size-8;	
	}
	
    }
class Laddu{
	public Laddu(int size) {
		this.size=size;
	}
	int size;
   }