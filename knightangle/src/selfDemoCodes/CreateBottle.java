package selfDemoCodes;

public class CreateBottle {
		public static void main(String[] args) {				
		 Color1 mat=new Color1();
		 Botle1 bb=new Botle1();			
		 Size1 sz = new Size1(new Size1("size"));
		 Shape_Pattern1 sp = new Shape_Pattern1(new Shape_Pattern1("Rectangle"));
		 bb.b();
		 System.out.println("bottle created.....");
		 mat.b();
		 System.out.println("bottle colour is red...."+mat); 
		// sz.Size();
		 
		System.out.println("size of the bottle created..");
		 }
}
class Botle1{
	Color1 colour;
	Size1 size;
	
	public Botle1() {
	this.colour=colour;
	this.size=size;
	
	}
	public void b() {	
	}                     
}
class Color1{
	
	String colour;
	public Color1() {
	this.colour = colour;	
	}
	public void b() {
		
		
	}
}
class Size1{
	Size1 Size;
	public Size1(Size1 size2) {
	this.Size=size2;
	}
	public void Size(int i) {
		i=10;
		
	}
	public Size1(String string) {
		
	}
	
	}

class Shape_Pattern1{
	Shape_Pattern1 Shape_Pattern;
	public Shape_Pattern1(Shape_Pattern1 shape_Pattern2) {
	this.Shape_Pattern=shape_Pattern2;	
	}
	public Shape_Pattern1(String string) {
		
	}
	
}