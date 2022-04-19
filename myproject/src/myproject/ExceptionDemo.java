package myproject;

public class ExceptionDemo {
			public static void main(String[] args) {
				System.out.println("before exception...");
				try {//condition
			    int i=1/Integer.parseInt(args[0]);
					
				}catch
				(ArithmeticException ae){//catch the condition
				System.out.println("handle arithmetic......"+ae);	
				}catch(NumberFormatException ne) {
					System.out.println("handle number format exception...."+ne);
				}
				finally {
					System.out.println("finally block called....");}
				                                                    
				System.out.println("after exception....");}}