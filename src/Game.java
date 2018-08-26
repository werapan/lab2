import java.util.Scanner;

public class Game {
    private static OX ox;
    private static Scanner sc = new Scanner(System.in);
    private static int col, row;

    public static void input() {
        System.out.print(ox.getCurrentPlayer() + " (Col): ");
        col = sc.nextInt();
        System.out.print(ox.getCurrentPlayer() + " (Row): ");
        row = sc.nextInt();
    }

    public static void main(String[] args) {
        ox = new OX();
        while(true) {
            System.out.print(ox.getTableString());
            input();
            ox.put(col, row);
            ox.switchPlayer();
            if(ox.checkWin(col,row)) {
                break;
            }
        }
    }
}
