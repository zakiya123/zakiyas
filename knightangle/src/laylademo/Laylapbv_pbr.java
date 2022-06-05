package laylademo;

public class Laylapbv_pbr {
			public static void main(String[] args) {
			laddu Laddu=new laddu();
			PBV pbv=new PBV();
			System.out.println("before passing size......"+Laddu.size);
			pbv.accept(Laddu.size);
			System.out.println("After passing size......"+Laddu.size);
			PBR pbr=new PBR();
			System.out.println("before passing size......"+Laddu.size);
			pbr.accept(Laddu);
			System.out.println("After passing size......"+Laddu.size);
			}
}
class laddu{
	int size= 10;
}
class PBV{
	public void accept(int size) {
	size=size+10;
}}
class PBR{
	public void accept(laddu Laddu) {
		Laddu.size=Laddu.size+10;
	}
}