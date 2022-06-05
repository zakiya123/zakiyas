package laylademo;

public class SevaCounterDemo {
	public static void main(String[] args) {
		SevaCounter seva=new SevaCounter();
		String Sevacounters[]=new String[5];//what is the use?????????
		Sevacounters[0]="mariageregistration";
		Sevacounters[1]="birthregistration";
		Sevacounters[2]="deadthregistration";
		Sevacounters[3]="landregistration";
		Sevacounters[4]="vaccineregistration";
		
		seva.setcounter(Sevacounters);//sevacounter array ko
		//counter wale array me daldiya
		System.out.println(seva.getcounter(2));
		//array k coloumn ko call kiya
}}
class SevaCounter{
	String counters[]=new String[5];//instance array
	public void setcounter(String counters[]) {//local array
		this.counters=counters;//equal instance to local
	}
	public String getcounter(int i){//returnable method
		return counters[i];//instance array+local value of retunable method
		//column call karne k liye local variable ko array ki bracket me store kiye
	}
}