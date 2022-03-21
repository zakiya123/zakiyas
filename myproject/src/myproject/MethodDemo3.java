package myproject;

public class MethodDemo3 {
			public static void main(String[] args) {
				Hall shabanaHills = new Hall();
				shabanaHills.feast();
				MarriageHall Mubarak = new MarriageHall();
				EngagementHall baug = new EngagementHall();
				Mubarak.feast();
				baug.feast();				                   
			}		       			
            }
class Hall{					
	public void feast() {
		System.out.println("Welcome drink");      
	}		
    }
class MarriageHall extends Hall {			
	public void feast() {
		System.out.println();
		super.feast();
		System.out.println("Royal feast.....");
	}      
    }              
class EngagementHall extends Hall {
	public void feast() {
		System.out.println();
		super.feast();
		System.out.println("Kashmiri Tea");
	}			
    }