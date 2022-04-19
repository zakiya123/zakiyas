package myproject;

public class AnjumResultDemo {//result of anjum
		public static void main(String[] args) {
			
				double total=0;
				double average=0;
				double[][] result=new double[4][1];
				System.err.println("_________Result__________");
				for(int i=0;i<result.length;i++) {//declare 100
					for(int j=0;j<result[i].length;j++) {
						result[i][j]=100;
					}
				}
				for(int i=0;i<result.length;i++) {//print 100
					System.out.print("Student" +(i+1) + ": ");
					for(int j=0;j<result[i].length;j++) {
					System.out.print(result[i][j]+" ");
					}
					System.out.println();	
				}
				result[0][0]=90;
				result[1][0]=60;
				result[3][0]=70;
				result[2][0]=80;
				for(int i=0;i<result.length;i++) {
					System.out.print("Student" +(i+1) + ": ");
					for(int j=0;j<result[i].length;j++) {
						System.out.print(result[i][j]+" ");
					}
					System.out.println();
				}
				for(int i=0;i<result.length;i++) {
					for(int j=0;j<result[i].length;j++) {
						total +=result[i][j];
			}
		    }
				average=total/16;
				System.out.println("The total score is" + total +"\nThe average score is"+average);
			}
		}	