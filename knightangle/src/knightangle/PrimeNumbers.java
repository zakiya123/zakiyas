package knightangle;

public class PrimeNumbers {
			public static void main(String[] args) {
				int i=0;
				int num=0;int counter=0;
				String primeNumbers ="";
				for(i=1;i<=10;i++) {
					 counter=0;
					for(num=i;num>=1;num--) {
						if(i%num==0) {
							counter=counter+1;
						}
					}
					if(counter==2) //because prime num have only two factors..
						//one -it is divisible by 1and it is divisible by it self.
						{
						primeNumbers=primeNumbers+i+"";
						
					}
				}
				System.out.println("Prime numbers from 1 to 10 are:");
				System.out.println(primeNumbers);
			}
}
