package laylademo;

public class LaylaLadduDemo {
		public static void main(String[] args) {
			LaylaLadduDemo laddu =new LaylaLadduDemo();
			Ladduu ladu=new Ladduu();
			System.out.println("before passing size..."+ladu.size);
		    laddu.pbv(2);
		    System.out.println("After passing size......"+ladu.size);
		    System.out.println("before passing size..."+ladu.size);
		    laddu.pbr(ladu);
		    System.out.println("After passing size......"+ladu.size);
		}
		public void pbv(int size) {
			size=4;
		}
		public void pbr(Ladduu lad) {
			 lad.size=2;
		}
}
class Ladduu{
	int size=5;
}