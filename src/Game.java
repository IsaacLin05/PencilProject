import java.util.*;
public class Game {
    public static void main(String[] args) {
        int check = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to start the game? Yes to start, No to cancel");
        String checkStart = scan.nextLine();
        if (checkStart.toLowerCase().equals("yes")) {
            check = 1;
            Board b1 = new Board();
            while (check != 0) {
                b1.returnOne();
                int roll = b1.roll();

                    System.out.print(b1.returnB11() + " ");

                System.out.println("The number is " + roll);

                System.out.print(b1.returnB12() + " ");

                System.out.println("Where to input?");
                System.out.print(b1.returnB13() + " ");
                System.out.println("Note: Note: first 0 is 0,0 and last 0 on far right is 4,4 (Row, Col)");
                    System.out.print(b1.returnB14() + " ");
                System.out.println("Row: ");
                System.out.print(b1.returnB15() + " ");
                int where1 = scan.nextInt();
                System.out.println("Column: ");
                int where2 = scan.nextInt();
                b1.replaceX(where1, where2, roll);
                int zero = 0;

                if (check == 1) {
                    for (int[] e : b1.returnOne()) {
                        for (int o : e) {
                            if (o == 0) {
                                zero++;
                            }
                        }
                    }
                    if (zero > 0) {
                        check = 1;
                    } else {
                        check = 0;
                    }
                }
            }
            int[][] board2 = b1.returnOne();
            System.out.println(b1.returnB11() + " ");
            System.out.println(b1.returnB12() + " ");
            System.out.println(b1.returnB13() + " ");
            System.out.println(b1.returnB14() + " ");
            System.out.println(b1.returnB15() + " ");

            System.out.println("Score: ");
            b1.returnScore2(board2);
        }
    }
}
