package Demo;


	class OuterClass {
		  int x = 50;

		  class InnerClass {
		    int y = 40;
		  }
		}

		public class Main 
		{
		  public static void main(String[] args) {
		    OuterClass myOuter = new OuterClass();
		    OuterClass.InnerClass myInner = myOuter.new InnerClass();
		    System.out.println(myInner.y + myOuter.x);
		  }
		}

		// Outputs 15 (50 + 40)
		 




