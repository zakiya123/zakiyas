package laylademo;

public class LaylaPaintDemo {
		public static void main(String[] args) {
		PaintBrush brush=new PaintBrush();
		brush.paint=new GreenPaint1();
		brush.doPaint();
		}
}
class PaintBrush{
	Paint1 paint;
	public void doPaint() {
		System.out.println(paint);
	}
}
abstract class Paint1{
	
}
class RedPaint1 extends Paint1{
	
}
class BluePaint1 extends Paint1{
	
}
class GreenPaint1 extends Paint1{
	
}