package Test4;
  interface First 
	{  
	    default void show() 
	    { 
	        System.out.println("Test First"); 
	    } 
	} 
	interface Second 
	{  
	    default void show() 
	    { 
	        System.out.println("Test Second"); 
	    } 
	}  
	public class TestClass implements First, Second 
	{  
	    public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	        TestClass ob = new TestClass(); 
	        ob.show(); 
	    } 
	}


