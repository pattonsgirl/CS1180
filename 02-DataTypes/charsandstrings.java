public class charsandstrings {
    public static void main(String[] args) {
        // these are two different characters when represented by a
        // computer (translated to ASCII character representation)
        char mychar = 'g';
        char otherchar = 'G';
        // the following strings are all different as the mix upper and lower case
        String mystring = "hello";
        String otherString = "Hello";
        String otherString2 = "HeLLo";
        // a string can be converted to uppercase as below
        String newString = mystring.toUpperCase();
        System.out.println(newString);
        // a character can also be converted to upper case, but we need to
        // use the character method to do it

        // for thought:
        // the convenience of these string manipulation methods
        // is really to parse input and get it to a common form
        // that we can logically work with

        char firstLetter = mystring.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);

        // question for thought:
        // You allow a user to input "yes" to do an action
        // What is they enter other forms of "yes"?
        // yes / Yes / YES / YeS / yse / y / Y / eys

        // a string is an array of character.
        // each character is positioned at an index
        // index starts at 0, the zeroeth postion

        // This statment will output the character at
        // postion 0 in the string mystring
        System.out.println(mystring.charAt(0));
        // This statment will output the index of
        // the character "o" in the string mystring
        System.out.println(mystring.indexOf("o"));

        String adams = "The answer to life the universe and everything is 42";
        // pull out just the word "universe" from the above string
        // store the index value of "u" - u happens to be first
        // used in the word "universe"
        int indexofU = adams.indexOf("u");
        System.out.println("The index of u in string adams is " + indexofU);
        // the word "universe" is 8 characters long. I can use this fact.
        System.out.println(adams.substring(indexofU, 31));
        System.out.println(adams.substring(indexofU, indexofU + 8));

        System.out.println("The string adams is " + adams.length() + " characters long");

        // Now, let's replace the answer to life the universe and everything with 37
        System.out.println(adams.replace("42", "37"));
        // This makes the replacement "permanent" by saving the new adams string back to
        // adams
        adams = adams.replace("42", "37");
        System.out.println(adams);
        // String concatenation has it's uses. + works, but is actually a
        // shorthand way to use the concat method
        String newPhrase = otherString + " " + adams;
        String newPhrase2 = otherString.concat(" " + adams);
        System.out.println("This: \n" + newPhrase);
        System.out.printf("Is the same as:\n%s\n", newPhrase2);
    }
}
