package selfDemoCodes;
                                                                                            
public class ClassVariableDemo {
		public static void main(String[] args) {
		Auditorium collage_ad=new Auditorium();
		
		//collage_ad.reliance=new Projector();//another way of creating obj
		Auditorium auditorium=new Auditorium();
		 // auditorium.reliance=new Projector();//anotherway ofcreating obj;
		  //in this way you have to creat two obj for 
		  //" " "  " " " " " " "  "
		                                   Auditorium.water=new Water();
		System.out.println(collage_ad.reliance+":::::::"+Auditorium.water);
		System.out.println(auditorium.reliance+":::::::"+Auditorium.water);
		collage_ad.learn(new NotePad());//each time new copy will be created.
		collage_ad.learn(new NotePad());//all diff hashcode will be printed
		collage_ad.learn(new NotePad());
		auditorium.learn(new NotePad());
		auditorium.learn(new NotePad());
		auditorium.learn(new NotePad());
		}
}
class Auditorium{
	 Projector reliance =new Projector();
	
	 //complex variable,instance //crating obj of subclass 
	 static Water water=new Water();//class variable+obj creation
	 void learn(NotePad n) {System.out.println(n);}
}
class Projector{
	
}
class Water{
	
}
class NotePad{}