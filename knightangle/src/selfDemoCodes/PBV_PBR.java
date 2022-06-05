package selfDemoCodes;

public class PBV_PBR {
			public static void main(String[] args) {
			PBV_PBR pbv= new PBV_PBR();
			Laddu laddu=new Laddu();
			System.out.println("before passing value"+laddu.Size);
			pbv.pbv(laddu.Size);
			//main class refrence name+(dot)method+
			//subclass obj refrence name(dot)+instance variable of that class
			System.out.println("after passing value"+laddu.Size);
			
			System.out.println("REFRENCE before passing value"+laddu.Size);
			pbv.pbr(laddu);//only class refrence name is enouf
			System.out.println("REFRENCE after passing value"+laddu.Size);
			}
			void pbv(int size) {
			size=10;
			}
			void pbr(Laddu lad) {
				lad.Size=2;
			}
}
class Laddu{
	int Size=5;
}									