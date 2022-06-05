package selfDemoCodes;

public class ArrayAll {
	public static void main(String[] args) {
		ArrayAll AA=new ArrayAll();
		Ladduu l=new Ladduu();
		System.out.println("Before passing--"+l.size);
		AA.pbv(l.size);
		System.out.println("After passing--"+l.size);
		
		System.out.println("Refrence Before passing--"+l.size);
		AA.pbr(l);
		System.out.println("Refrence After passing--"+l.size);
	}
	void pbv(int size){
		size =5;
	}
	void pbr(Ladduu lad) {
		   lad.size-=2;
	}
}
class Ladduu{
	int size=7;
	
}