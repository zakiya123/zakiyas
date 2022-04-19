package myproject;

public class InherDemo {
		public static void main(String[] args) {
		 BadBrush bb=new BadBrush();
		 bb.paint(1);
		 
		 GoodBrush1 gb= new GoodBrush1();
		 gb.paint(new RedPaint());
		 gb.paint(new BluePaint());
		 
		 GoodBrushTrue gbt=new GoodBrushTrue();
		 gbt.paint(new RedPaint());
		 gbt.paint(new BluePaint());
		 gbt.paint(new GreenPaint());
		}
	
	}
class BadBrush{
	public void paint(int i) {
		if(i==1) {
			System.out.println("red clour...");
		}
		else if(i==2) {
			System.out.println("green clour....");
		}
	}
}
class GoodBrush1{//bad brush 2
	public void paint(RedPaint rp) {
	System.out.println(rp);	
	}
	public void paint(BluePaint bp) {
		System.out.println(bp);
	}}
class Paint{
	
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}
class GreenPaint extends Paint{
	
}
class GoodBrushTrue{
	public void paint(Paint rp) {
		System.out.println(rp);
	}
}


