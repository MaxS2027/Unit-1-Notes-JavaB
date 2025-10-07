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
   }
}
