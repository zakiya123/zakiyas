package myproject;

public class Box {
			
			double width;
			double height;
			double depth;
			//Notice this constructor .it takes an object of type Box.
			Box (Box ob){
				//pass object to constructor
			width=ob.width;
			height=ob.height;
			depth=ob.depth;
			}
			//constructor used when all demensions specified
			Box(double w,double h,double d) {
				width = w;
				height = h;
				depth = d;	
			}
			
			//constructor used when no demension specified
			Box(){
				width=-1;//use -1 to indicate an uninitialized box
				height=-1;
				depth=-1;
			}
			double volume() {
				return width*height*depth;
			}
			//constructor used when cube is created
			Box(double len){
				width=height=depth=len;
			}

			
			//compute and return volume
			double volume() {
			//return width*height*depth;
				return volume();
			}
			}
			class OverloadCons{
				public static void main(String[] args) {
				//create boxex using the various constructors
				Box mybox1 =new Box(10,20,15);
				Box mybox2 =new Box();
				Box mycube =new Box(7);
				//get volume of first box
					double vol = mybox1.volume();
					System.out.println("Volume of mybox1 is"+vol);
					//get volume of second box
					Box mybox2;
					vol=mybox2.volume();
					System.out.println("Volume of mybox2 is"+vol);
					//get volume of cube
					Box mycube;
					vol=mycube.volume();
					System.out.println("Volume of mycube is"+vol);
				get volume of clone
							vol=myclone.volume();
					System.out.println("Volume of clone is"+vol);
				}
			}

