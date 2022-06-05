package laylademo;

public class LaylaTempDemp {
			public static void main(String[] args) {
			Temp temp=new Temp();
			temp.setS("salz"
					+ "");
			String f=temp.getS();
			System.out.println(f);
			System.out.println(temp.getS());
			}
}
class Temp{
	String s;
	public void setS(String s) {
		this.s=s;
		
	}
	public String getS() {
		return s;
	}
}