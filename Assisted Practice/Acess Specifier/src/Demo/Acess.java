package Demo;

public class Acess 
{

		public static void main(String[] args, boolean c) {
			// Unary operator
			int a = 10;
			System.out.println(a++);
			System.out.println(a--);
			System.out.println(a);

			// Arithmatic operators _+, - * / %
			int b = 12;
			System.out.println(a+b);
			System.out.println(2 % 2);


			// Relational opeeratos <, > <= >=
			System.out.println(10<12);

			// Equality operators == and !=
			System.out.println(18 != 10);

			//Logical operators && and ||
			System.out.println(true && true);
			System.out.println(false && true);
			System.out.println(1==1 && 1==2);

			System.out.println(1==1 || 1==2);

			//Shift operators	<< >> 
			// a<<b		
			// 0	0	0	0	0	0	0	1
			// 0	0	0	0	0	1	0	0
			// a * (2^b) == 10 * (8)  80
			System.out.println(10 << 1);
			System.out.println(10 << 2);
			System.out.println(10 << 3);

			// a>>b - Right shift operators
			// a/ (2^b)
			// 20/2 == 10
			// 10/2 = 5
			// 5/ 2 = 2
			System.out.println(10 >> 1);
			System.out.println(20 >> 3);

			// Ternary operator (Condition) ? Y : F
			System.out.println(  (1==1) ? 5 : 2  );

		}

	
	}


