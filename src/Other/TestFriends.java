package Other;

// exercise 11

public class TestFriends {
    public void testStatic() {
        Friends f1 = new Friends();
        Friends f2 = new Friends();

        System.out.println(f1.firstNamesOfMyFriends[0] + f1.firstNamesOfMyFriends[1] + f1.firstNamesOfMyFriends[2]);
        System.out.println(f2.firstNamesOfMyFriends[0] + f2.firstNamesOfMyFriends[1] + f2.firstNamesOfMyFriends[2]);
    }
}
