package laylademo;

public class ExceptionDemo2 {
		public static void main(String[] args) {
			if(args.length>0) {
				String a=args[0];
				if(Character.isDigit(a.charAt(0))) {
					int n=Integer.parseInt(a);
					if(n>0) {
					int i=1/n;
					} else {
		   System.out.println("Please enter a value other than zero....");
					}
				} else {
			System.out.println("please enter a valid number.....");
				}
				}
				else {
			System.out.println("please enter a command line argument....");
				}
			System.out.println("NO Exception.....");
			}
		}