
package myproject;

import java.util.Stack;

public class StackClasses {
			public static void main(String[] args) {
			Stack mystack = new Stack();	
			Stack mystack2 =new Stack();
			
			for(int i=0;i<10;i++)mystack.push(i);
			for(int i=10;i<20;i++)mystack2.push(i);
			
			System.out.println("mystack1:");
			for(int i=0;i<10;i++)
				System.out.println(mystack.pop());
			System.out.println("Stack in  mystack2:");
			for(int i=0;i<10;i++)
				System.out.println(mystack2.pop());
			
			}
}
