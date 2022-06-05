package laylademo;

public class LaylaFanDemo {
		public static void main(String[] args) {
		Fan orient=new Fan();
		State onState=new State();
		onState.changeFanState(orient, "onstate");
		System.out.println(orient.getState());
		}
}
class Fan{
	String state;
	public String getState() {
		return state;
	}
}
class State{
	public void changeFanState(Fan f,String s) {
		f.state=s;
	}
}