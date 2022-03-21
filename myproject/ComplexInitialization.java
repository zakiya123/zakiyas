package classexcercise;

public class ComplexInitialization {
			public static void main(String[] args) {
				
			
			Integer i=100;//complex initialization
			System.out.println(i);
			Integer ii=new Integer (200);//old way of initialization
			Integer iii=Integer.valueOf(345);
			
			System.out.println(Integer.MIN_VALUE);
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.sum( ii,iii));//take the above values or you can give new values
			System.out.println(Integer.sum( 34,67));//new values are given...
			
			System.out.println(Integer.min(2 ,9));
			System.out.println(Integer.max(67 ,45));
			
			String str="How are you";//this will behave like primitive type and more prefered;
			//string do not have primitive types...;but it behave like primitive type..
			System.out.println(str);
			
			String s="100";
			System.out.println(s);
			String ss=new String("HelloWorld");
			ss=String.valueOf("HelloWorld");
			
			System.out.println(ss.charAt(0));
			System.out.println(ss.indexOf('H'));
			
			System.out.println(ss.substring(2));
			System.out.println(ss.substring(2,5));
			
			String num1 ="100";
			String num2 ="200";
			
			System.out.println(num1+num2);//the + will contatinate two string
			System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
}}
