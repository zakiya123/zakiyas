package classexcercise;

public class NewBottle {
		public static void main(String[] args) {
		Botl rbotl=	new Botl(new Plastic_colour(new Size(new Shape_Pattern("rectangle"))));
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
	this.Size=size;	
	}
}
class Size{
	
	Shape_Pattern Shape_Pattern;
	public Size(Shape_Pattern shape_pattern) {
	
		this.Shape_Pattern=shape_pattern;	
	}
}
class Shape_Pattern{
	String rectangle;
	public Shape_Pattern(String rectangle ) {
	this.rectangle=rectangle;	
	}
}