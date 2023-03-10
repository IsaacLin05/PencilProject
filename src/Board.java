import java.util.*;
public class Board {
    private int[][] Board;
    private int roll = 0;

    public Board() {
        Board = new int[5][5];
    }

    public String returnB11() {
        int[] b11 = new int[5];
        String check1 = "";
        for (int i = 0; i < Board[0].length; i++) {
            b11[i] = Board[0][i];
            check1+="[" + b11[i]+ "]";
        }
        return check1;
    }
    public String returnB12() {
        int[] b11 = new int[5];
        String check1 = "";
        for (int i = 0; i < Board[1].length; i++) {
            b11[i] = Board[1][i];
            check1+="[" + b11[i]+ "]";
        }
        return check1;

    } public String returnB13() {
        int[] b11 = new int[5];
        String check1 = "";
        for (int i = 0; i < Board[2].length; i++) {
            b11[i] = Board[2][i];
            check1+="[" + b11[i]+ "]";
        }
        return check1;

    } public String returnB14() {
        int[] b11 = new int[5];
        String check1 = "";
        for (int i = 0; i < Board[3].length; i++) {
            b11[i] = Board[3][i];
            check1+="[" + b11[i]+ "]";
        }
        return check1;

    } public String returnB15() {
        int[] b11 = new int[5];
        String check1 = "";
        for (int i = 0; i < Board[4].length; i++) {
            b11[i] = Board[4][i];
            check1+="[" + b11[i]+ "]";
        }
        return check1;
    }


    public int[][] returnOne() {
        return Board;
    }

    public int roll() {
        roll = (int) (Math.random()*10)+1;
        return roll;
    }

    public String returnBoard() {
        String returning = "";
        for (int[] e : Board) {
            returning = (Arrays.toString(e));
        }
        return returning;
    }

    public void replaceX(int replacement1, int replacement2, int num) {
        boolean check = true;
        while (check) {
            if (Board[replacement1][replacement2] == 0) {
                Board[replacement1][replacement2] = num;
                System.out.println("Slot " + replacement1 + ", " + replacement2 + " is now " + num);
                check = false;
            } else {
                System.out.println("There is a number here already, please choose another slot.");
            }
        }
    }


    public void returnScore2(int[][] board1) {
        int score = 0;
        int check1 = 0;
        int checking = 0;
        int check3 = 0;
        int checking2 = 0;


            for (int e = 0; e < board1.length; e++) {
                for (int w = 0; w<board1[e].length; w++) {
                   for (int q = e ; q < board1.length; q++) {
                       check1 = board1[e][w];
                       if (board1[q][w] == check1) {
                           checking++;
                       }
                       if (checking > 1) {
                           score+=check1;
                           checking = 0;
                       }
                   }




                    for (int o = w; o < board1[e].length; o++) {
                        check3 = board1[e][w];
                        if (board1[e][o] == check3) {
                            checking2++;

                        }
                        if (checking2 > 1) {
                            score+=check3;
                            checking2 = 0;
                        }
                    }
                }



                }


        System.out.println(score);
    }
}
