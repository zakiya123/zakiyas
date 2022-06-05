package laylademo;

public class PBVPBRDemo1 {
			public static void main(String[] args) {
			PBVPBRDemo1 pbv=new PBVPBRDemo1();
			Samosa samosa=new Samosa();
			System.out.println("Before passing crispySamosa size"+samosa.size);
			pbv.pbv(samosa.size);
			System.out.println("After passing crispySamosa size"+samosa.size);
			
			System.out.println("Refrence Before passing motu ka Samosa size"+samosa.size);
			pbv.pbr(samosa);
			System.out.println("Refrence After passing motu ka Samosa size"+samosa.size);
			}
	void pbv(int size) {
		size=4;	
	}
	void pbr(Samosa samosa) {
		samosa.size=4;
	}
}
class Samosa{
	 int size=10;
}