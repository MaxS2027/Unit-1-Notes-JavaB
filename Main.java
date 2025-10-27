/** 
 * @MaxS2027
 * @since oct 3 2025
 * @version 1.0
*/
public class Main {
   /**
    * @param input is an array of string
    * @return VOID means NO OUTPUT
    */
   public static void main(String []args) {
      System.out.println("Math Class methods");

      // Absolute value .abs() method
      //Methods wth a RETURN VALUE
      //mean you need to do something  with outpuit
      Math.abs(-41);
      // you can store result in a variable
      int absValue = Math.abs(-35);
      System.out.println(absValue);

      //OR you can display it directly
      System.out.println(Math.abs(-388));
      //.abs is an OVERLOADED method
      // meaning there is multiple versions of the same method, with the same name but diff parameters
      double absValueDoub = Math.abs(-79);
      System.out.println(absValueDoub);

      // Math.abs takes two arguments
      // and raises the first arg to power of second
      double threeSquared = Math.pow(3, 2);

      System.out.println(threeSquared);

      // Math.sqrt() takes one argument
      // returns one root
      double root99 = Math.sqrt(99.0);
      System.out.println(root99);
      // Math.random returns a double
      // between (0.0 and 1.0 is not included)
      double randNum = Math.random();
      System.out.println(randNum);

      // If you want to generate a number in a different
      // rangem you just adjust the output of the Math.random
      //EN: random number between 0-100
      double randNum2 = Math.random() * 100;
      System.out.println(randNum2);
      //To adjust the starting point, add
      double randNum3 = Math.random() + 10;
      System.out.println(randNum3);

      // GENERAL FORMAT:
      // (int) (math.random) + max) + num
      int randInt = (int) (Math.random() + 9) + 3;
      System.out.println(randInt);
      //Strings are objects from the String CLASS
      // containing a SEQUENCE OF CHARACTERS
      // indexed starting from it

      //Create String objects in 2 ways
      // 1. call the string CONSTRUCTOR
      String str1 = new String("Comp Sci");
      //2. They made a SHORTCUT to set a String
      String str2 = "AP Java";

      //Call strong METHODS
      int str1len = str1.length();
      int str2len = str2.length();
      System.out.println("length 1 " + str1len); //CONCATENATED STRING
      System.out.println("length 2" + str2len );
      //.length returns the NUMBER OF CHARACTERS
      //spaces included

      //.substring is an OVERLOADED method (2 versions)
      // That returns PART of a larger string
      String message = "The Yankees Lose";

      String firstWord = message.substring(0, 3);
      System.out.println(firstWord);
      //.substring int from, int, to DOES NOT DECLARE
      //The character at index to
      String lastWord = message.substring(8);

      // .index of returns an int
      //the first index of the string youre entering in

      String message1 = "This is cool";
      String message2 = "This is not cool";

      int indexOfNot1 = message1.indexOf("not");
      int indexOfNot2 = message2.indexOf("not");

      System.out.println("Index of not in message1 " +indexOfNot1);
      System.out.println("Index of not in message2 "+ indexOfNot2);
      //.equals() allows you to compare the contents of string objects
      //checks evert cgaracter then returns boolean answer
      boolean areTheyEqual = message1.equals(message2);
      System.out.println("Does message 1 equal message 2?v " + areTheyEqual);
      // order does not matter
      System.out.println(areTheyEqual);
      areTheyEqual = message1.equals("This is cool");
      System.out.println(areTheyEqual);

      //.compare compares two strings character by character
      System.out.println(message1.compareTo("2"));
      System.out.println(message1.compareTo("T"));
      System.out.println(message1.compareTo("A"));
}
}
