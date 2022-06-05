package myproject;

public class AritmeticOperators {
			public static void main(String[] args) {
			int num1=10;
			int num2=3;
			int add=num1+num2;
		System.out.println("Addition..."+add);
		
		int sub=add-1;
		System.out.println( "Subraction..."+sub);
		
		int mul=num1*num2;
		System.out.println("multiplication...."+mul);
		
		int div=num1/num2;
		System.out.println("Division..."+div);
		
		int mod=num1%num2;
		System.out.println("Remainder is..."+mod);
		
		System.out.println("Relational Opretors..<=."+(num1<=num2));//r
		System.out.println("Relational Opretors..>=."+(num1>=num2));//r
		System.out.println("Relational Opretors.==."+(num1==num2));//r
		System.out.println("Relational Opretors.!=.."+(num1!=num2));//r
		System.out.println("Relational Opretors.+=.."+(num1+=num2));//c a 2f
		System.out.println("Relational Opretors.-=.."+(num1-=num2));
		System.out.println("Relational Opretors..*=."+(num1*=num2));
		System.out.println("Relational Opretors..!=."+(num1!=num2));
		System.out.println("Relational Opretors..%=."+(num1%=num2));//c a
		System.out.println("Relational Opretors.>.."+(num1 >num2));//a
		System.out.println("Relational Opretors.<.."+(num1 <num2));//A
		
		int i=10;
		System.out.println(i++);//p
		System.out.println(i);
		
		System.out.println(++i);//pe
		System.out.println(i);
		
		System.out.println(i--);//p
		System.out.println(i);
		
		System.out.println(--i);
		System.out.println(i);
		
		i-=2;//c
		System.out.println(i);
		i+=3;
		System.out.println(i);
		
		i*=5;
		System.out.println(i);
		
		i%=2;
		System.out.println(i);
		
		System.out.println(num1<num2&&num1>num2);//l
		System.out.println(num1<=num2||num1>=num2);
			}
}
