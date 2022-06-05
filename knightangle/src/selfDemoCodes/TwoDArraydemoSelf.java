package selfDemoCodes;

public class TwoDArraydemoSelf {
		public static void main(String[] args) {
		int Array[]= {4,5,6,7,8};
		System.out.println("Array length is-"+Array.length+"..................");
		for(int i=0;i<Array.length;i++)//i am printing all coloumn of arrays
		System.out.println(Array[i]);
		System.out.println("*********************************");
		System.out.println(Array[0]);//printing single coloumn of arrays
		System.out.println(Array[1]);//
		System.out.println(Array[2]);//
		Array[2]=856;//reinitialise array
		System.out.println(Array[2]);//printing re-ini array.
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
		int ar[]=new int[5];//creating empty array
		ar[1]=987;//later initialising array
		ar[2]=349;
		System.out.println(ar);//printing hash code.
		
			} }						