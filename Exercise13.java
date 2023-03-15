package java_Core_Assignments;

public class Exercise13 {
public static void main(String[] args) {
	String str1 = "topsint.com and topsint.com", str2 = "Topsint.com and topsint.com";
    CharSequence cs = "topsint.com and topsint.com";
     System.out.println("Comparing "+str1+" and "+cs+": " + str1.contentEquals(cs));
      System.out.println("Comparing "+str2+" and "+cs+": " + str2.contentEquals(cs));
          }

}

