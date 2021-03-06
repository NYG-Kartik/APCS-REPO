/***
 * Team Up2U (Ziying Jian - Scruffy, Emily Ortiz - Applesauce, Kartik Vanjani - Krrish)
 * APCS
 * HW31 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
 * 2021-11-04
 * time spent: .5 hrs
 *
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 *
 * QCC:
 * - Can using an if statement within a for statement make the code more susceptible to break?
 * - If the variable is a boolean and we want it to return a value, will it always just result in true and false?
 * - What is the difference between .equals and == and are they interchangeable?
 *
 * DISCO:
 * - Since the part before and after .equals had to be the same they both were a string for us.
 * - The for statement goes back and goes through each index and returns a vowel if it matches one from the string.
 ***/

public class Pig
{
    //Q: How does this initialization make your life easier?
    //A: Since the variable, VOWELS, has already been initialized outside of the methods, you can
    //just directly refer to the variable in the methods.
    private static final String VOWELS = "aeiouAEIOU";

    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA("cat", "a") -> true
      hasA("cat", "p")       -> false
      =====================================*/
    public static boolean hasA( String w, String letter )
    {
       for(int i = 0; i < w.length()-1; i++){
           if ( w.substring(i, i+1).equals(letter) ){
               return true;
           }
       } return false;
    }//end hasA()


    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter )
    {
        for (int i = 0; i < VOWELS.length() -1; i++){
            if ( letter.equals(VOWELS.substring(i, i+1)) ){
                return true;
            }
        } return false;
    }


    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels("meatball") -> 3
      =====================================*/
    public static int countVowels( String w ){
        int counter = 0;
        for (int i = 0; i < w.length() - 1; i++){
            if ( isAVowel(w.substring(i, i+1)) ){
                counter++;
            }
        } return counter;
    }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel("cat") -> true
      hasAVowel("zzz")       -> false
      =====================================*/
    public static boolean hasAVowel( String w ) {
        return countVowels(w) > 0;
    }


    /*=====================================
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels("meatball") -> "eaa"
      =====================================*/
    public static String allVowels( String w )
    {
        String vowelStorage = "";
        for (int i = 0; i < w.length() - 1; i++){
            if ( isAVowel(w.substring(i, i+1)) ){
                vowelStorage += w.substring(i,i+1);
            }
        } return vowelStorage;
    }


    public static void main( String[] args )
    {
        System.out.println(hasA("cat", "p") + "...should be false");
        System.out.println(hasA("applesauce scruffy krrish", "p") + "...should be true");

        System.out.println(isAVowel("a") + "...should be true");
        System.out.println(isAVowel("p") + "...should be false");

        System.out.println(countVowels("meatball") + "...should be 3");
        System.out.println(countVowels("many vowels here") + "...should be 5");

        System.out.println(hasAVowel("meatball") + "...should be true");
        System.out.println(hasAVowel("bcd") + "...should be false");

        System.out.println(allVowels("meatball") + "...should be eaa");
        System.out.println(allVowels("PIG LATIN") + "...should be IAI");
    }//end main()

}//end class Pig
