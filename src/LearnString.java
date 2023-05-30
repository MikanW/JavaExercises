// Lecture 3 follow up
public class LearnString {

    // 26
    public static void creatingString() {
        String fruit = "Apple";
        String anotherFruit = "Apple";
        // these two same strings share a same memory address

        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");
        // these two same strings with "new" don't share memory address

        System.out.println(fruit == anotherFruit); // true
        System.out.println(vegetable == anotherVegetable); // false
    }

    // 27
    public static void upperAndLowerCase() {
        String myText = "abcdefg";
        System.out.println(myText.toUpperCase());

        String myText2 = "ABCDEFG";
        System.out.println(myText2.toLowerCase());
    }

    // 28
    public static void blankAndEmpty() {
        String myText = "";
        System.out.println(myText.isEmpty()); // true

        String myText2 = " ";
        System.out.println(myText2.isEmpty()); // false

        String myText3 = " ";
        System.out.println(myText3.isBlank()); // true

        String myText4 = "";
        System.out.println(myText4.isBlank()); // true

        String myText5 = "a";
        System.out.println(myText5.isBlank()); // false
    }

    // 29
    public static void replaceString() {
        String myText = "Firf";
        System.out.println(myText.replace("Firf", "Nice")) ;
    }

    // 30
    public static void removeWhiteSpace() {
        String firstName = "   Jake   ";
        System.out.format("'%s'", firstName);
        System.out.format("'%s'", firstName.strip());
        System.out.format("'%s'", firstName.stripLeading());
        System.out.format("'%s'", firstName.stripTrailing());
        System.out.format("'%s'", firstName.trim());
        System.out.format("'%s'", myStrip(firstName));
    }


    public static String myStrip( String text ) {
        return text.replace(" ", "");
    }



    // 31
    public static void getCharAt() {
        String myText = "Apple";
        int length = myText.length();
        if (length>9) {
            System.out.println(myText.charAt(9));
        }
        System.out.println(myText.charAt(3));
    }

    // 32

    public static void compareString() {
        String firstWord = "Apple";
        String secondWord = "Banana";
        System.out.println(firstWord.compareTo(secondWord));
    }
    public static void main(String[] args) {
        creatingString();
        upperAndLowerCase();
        blankAndEmpty();
        replaceString();
        removeWhiteSpace();
        getCharAt();
        compareString();
    }
}
