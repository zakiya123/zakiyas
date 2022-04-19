package classexcercise;

public class NewBottle {
		public static void main(String[] args) {
		Botl rbotl=	new Botl(new Plastic_colour(new Size(new Shape_Pattern("rectangle"))));
		System.out.println(rbotl);
		}
}
class Botl{
	Plastic_colour plastic_colour;
	public Botl(Plastic_colour plastic_colour) {
		this.plastic_colour=plastic_colour;
	}
}
class Plastic_colour{
	
	Size Size;
	public Plastic_colour(Size size) {
	String Plastic_colour;
	Plastic_colour="red";
	System.out.println("My bottle colour is:"+Plastic_colour);
	this.Size=size;	
	}
}
class Size{
	
	Shape_Pattern Shape_Pattern;
	public Size(Shape_Pattern shape_pattern) {
	int size=10;
	System.out.println("My bottle size is:"+size);
		this.Shape_Pattern=shape_pattern;	
	}
}
class Shape_Pattern{
	String rectangle;
	public Shape_Pattern(String rectangle )
	{System.out.println("My bottle shape is:"+rectangle);
	this.rectangle=rectangle;	
	}
}