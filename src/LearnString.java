// Lecture 3 follow up
public class LearnString {

    // 27
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

    // 28
    public static void upperAndLowerCase() {
        String myText = "abcdefg";
        System.out.println(myText.toUpperCase());

        String myText2 = "ABCDEFG";
        System.out.println(myText2.toLowerCase());
    }

    // 29
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
    public static void main(String[] args) {
        creatingString();
        upperAndLowerCase();
        blankAndEmpty();
    }
}
