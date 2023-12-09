public class Person {

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }
    private String firstName;
    private String LastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void printPerson() {
        System.out.println(this.getFirstName());
        System.out.println(this.getLastName());
    }

    public String replaceCats(String sentence) {
        String replaced = sentence.replace("cat", "dog");
        return replaced;
    }

    public String question4(String word) {
        return word.trim().replace("t", "T");
    }

    public static void main (String[] args) {
        System.out.println("Hello, world!");
        Person person = new Person("Mikan", "Sleepy");
        person.printPerson();
        System.out.println(person.replaceCats("Mikan has a cat! Nope she doesn't have a cat..."));
        String memo = "  mimimi   ";
        System.out.println(memo.trim());
        System.out.println(person.question4("   alphabet  "));
    }
}
