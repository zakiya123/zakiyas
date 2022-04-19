package myproject;

public class InterFaceDemo {
		public static void main(String[] args) {
			Human hh=new Human();//1987
			AlopathayMedicalCollage amc=new AlopathayMedicalCollage();//1967
			UnaniMedicalCollage umc =new UnaniMedicalCollage();//1986
			if(hh instanceof Doctor) {
				System.out.println("Shoiab is dr");
			}else {
				System.out.println("no dr ");
			}
			
		}		
     }
interface Doctor{
	public void docure();
}
interface Nurse{
	public void doCare();
}
class Human1{
	
}
class AlopathayMedicalCollage implements Doctor,Nurse{
	@Override
	public void docure() {
		System.out.println("do cure by alopthy medicine......");
		
	}
	@Override
	public void doCare() {
		System.out.println("patient is cared by nurse.....");
		
	}
}
class UnaniMedicalCollage implements Doctor{
	@Override
	public void docure() {
		System.out.println("cure by unani medecine....");
		
	}
}
