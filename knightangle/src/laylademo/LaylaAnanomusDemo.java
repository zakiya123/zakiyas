package laylademo;
//printing three types of array with one method and one loop....
public class LaylaAnanomusDemo {
		public static void main(String[] args) {
		ClassRoom myclass=new ClassRoom();
		myclass.acceptStudent(new String[]{"zak","shabu","san","aaasu"});//Anonymous
		
		String names[]=new String[] {"fan","sam","sal"};//single dimension
		myclass.acceptStudent(names);
		
		String names2[]=new String[5] ;//empty single dimension,initializing later
		names2[0]="yusu";
		names2[1]="abdu";
		names2[2]="illu";
		names2[3]="siddu";
		myclass.acceptStudent(names2);
}}
class ClassRoom{
	public void acceptStudent(String name[]) {
		System.out.println("**********ananomus start******************");
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+"\t");
		}System.out.println("\n********anannomus end**********\n");
		
	}
}