 package laylademo;

 import malik.MoleculeFramework;
                                                                                         
 public class ClassesAndObject17 {
	public static void main(String[] args) {
		Object zakiya = new Human_layla(); 
		AlopthyMedicalCollage amc = new AlopthyMedicalCollage();
		AyurvedicMedicalCollage am = new AyurvedicMedicalCollage();
		JetAcademy ja = new JetAcademy();
		GoldenTouchProgramming gtp = new GoldenTouchProgramming();
		//SUBJECTION.........
		MoleculeFramework.setInterface(Doctor.class);
		zakiya=MoleculeFramework.getObject(new Object[] {zakiya,am});
		
		Doctor doctorzakiya = (Doctor)zakiya;
		doctorzakiya.docure();
		
		MoleculeFramework.setInterface(Pilot.class);
		zakiya=MoleculeFramework.getObject(new Object[] {zakiya,ja});
		 
		Pilot Pilotzakiya = (Pilot)zakiya;
		Pilotzakiya.doFly();
		
		MoleculeFramework.setInterface(JvaDeveloper.class);
		zakiya=MoleculeFramework.getObject(new Object[] {zakiya,gtp});
		 
		JvaDeveloper Coderzakiya = (JvaDeveloper)zakiya;
		Coderzakiya.doprogramming();
	}
}
