package myproject;

public class ClassDemo1 {
		
			int age=40;
			String name="knight";
			int arr[]=new int[5];
			double weight=getWeight("pi");
			double getWeight(String value) {
			if(value.equals("pi")) {
				return 3.16;
			}
			else {
				return 100;
				}
			}
			void business() {
				System.out.println(age+":"+name+":"+weight);
				
				
			}
			public static void main(String[] args) {
				ClassDemo1 obj=new ClassDemo1();
				obj.business();}
		}

