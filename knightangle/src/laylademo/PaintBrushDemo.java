package laylademo;

public class PaintBrushDemo {
	public static void main(String[] args) {
	Paint paintbrush=new  Paint();
	paintbrush.doPaint(new RedPaint());
	paintbrush.doPaints(new BluePaint());
	
}}
class Paint{
	public void doPaint(RedPaint rp) {
		System.out.println("redPaint is ready"+rp);
	}
	void doPaints(BluePaint bp) {
		System.out.println("blue Paint is ready"+bp);
	}
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}