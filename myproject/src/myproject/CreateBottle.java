package myproject;

public class CreateBottle {
		public static void main(String[] args) {
		 Color1 mat=new Color1();
		 Botle1 bb=new Botle1();
		 Size sz=new Size(new Size("size"));
		 Shape_Pattern sp=new Shape_Pattern(new Shape_Pattern("Rectangle"));
		 bb.b();
		 System.out.println("bottle created.....");
		 mat.b();
		 System.out.println("bottle colour is red...."+mat);
		 
		}
}
class Botle1{
	Color1 colour;
	Size size;
	
	public Botle1() {
	this.colour=colour;
	this.size=size;
	
	}

	public void b() {
		// TODO Auto-generated method stub
		
	}
	                       
}
class Color1{
	
	String colour;
	public Color1() {
	this.colour=colour;	
	}
	public void b() {
		// TODO Auto-generated method stub
		
	}
}
class Size{
	Size Size;
	public Size(Size size2) {
	this.Size=size2;
	}
	public Size(String string) {
		// TODO Auto-generated constructor stub
	}
	
	}

class Shape_Pattern{
	Shape_Pattern Shape_Pattern;
	public Shape_Pattern(Shape_Pattern shape_Pattern2) {
	this.Shape_Pattern=shape_Pattern2;	
	}
	public Shape_Pattern(String string) {
		// TODO Auto-generated constructor stub
	}
	
}