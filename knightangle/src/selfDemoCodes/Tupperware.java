package selfDemoCodes;



public class Tupperware {
		public static void main(String[] args) {
		   Glass MyGlassSize = new Glass(new GlassSize());
		 GlassSize GS=new GlassSize();
		 GS.Gs();
		 System.out.println("my bottle created....");
			
		}
}
class Glass{
	GlassSize GlassSize;
	 public Glass(GlassSize GlassSize) {
		 this.GlassSize=GlassSize;
		System.out.println("Glass class constructor called......");
	}
		
		
	}

 class GlassSize {
	 
	   void Gs() {
	 for(int GlassSize=0;GlassSize<=100;GlassSize++) {
		 if(  GlassSize==30) {
		 System.out.println("300 ml bottel is ready...:"+GlassSize);}
		 if(GlassSize==50) {
			 System.out.println("500 ml bottle is ready....."+GlassSize);
		 }
		 if(GlassSize==100) {
			 System.out.println("1 liter bottle is ready...."+GlassSize);
		 }
		 
	 
	 }}}
 
 