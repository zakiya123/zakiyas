package laylademo;

public class JukeBox {
		public static void main(String[] args) {
		Box paint =new Box();
		System.out.println("colour of paint is...:"+paint.getColour());//blue
	    paint.setColour("red");
	    System.out.println("colour of paint is....:"+paint.getColour());//red
		}
  }
class Box{
	String colour="blue";//instance variable
	public void setColour(String colour) {//local variable in parameter
		this.colour=colour;//instance to local;
		
	}
	public String getColour() {//returanable method returning string variable;
		return colour;
	}
}