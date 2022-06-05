package laylademo;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		System.out.println("before exception.....");
		try{
			int n=1/Integer.parseInt(args[0]);
		}catch(ArithmeticException a) {
			System.out.println("enter a number other than zero......");
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Please enter a comand line argument.....");}
		catch(NumberFormatException ne) {
			System.out.println("please enter a value other than a character");
		}catch(Exception e) {
			System.out.println("unknown Exception.......");
		}
		System.out.println("after exception.....");
		 
	}
}
