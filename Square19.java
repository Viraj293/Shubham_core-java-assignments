package java_Core_Assignments;
import java.io.*;
public class Square19 {
	  void Area(double side)
	    {
	        System.out.println("Area of the Square: "+ side * side);
	                        
	    }
	 
	  	    void Area(float side)
	    {
	        System.out.println("Area of the Square: "  + side * side);
	    }
	}
	 
	class GFG {
	    public static void main(String[] args)
	    {
	        Square19 obj = new Square19();
	        obj.Area(10);
	        obj.Area(3.2);
	    }
	}

