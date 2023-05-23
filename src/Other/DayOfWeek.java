package Other;

public class DayOfWeek {
    // exercise2
    public static String[] dayOfWeek = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};

    // exercise3
    public static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // exercise4 tic-tac-toe board
    public static boolean[][] ticTacToe = { {true, false, false}, {true, true, true}, {true, true, true}};
    public boolean bottomRight = ticTacToe[2][2];

    // exercise 5

    public void receiveAnyNumberOfStr( String ...messages) {
        System.out.println(messages.length);
    }

    // exercise 6

    public static void printTicTacToe() {
        System.out.println(ticTacToe);
    }

    public static void main(String[] args) {
        // exercise2
        System.out.println(dayOfWeek.length);
        System.out.println(dayOfWeek[3]);

        // exercise5
        DayOfWeek instance = new DayOfWeek();
        instance.receiveAnyNumberOfStr("Hello ", "World");

        // exercise6
        printTicTacToe();
    }
}
