import java.util.Scanner;

public class TicTacToe {
    // yo chai table banako
    static void pattern(String[][] arr) {
        System.out.println("-------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "|");
            }
            System.out.println("");
            System.out.println("-------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = {{" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}};
        pattern(arr);

        String symbol = " ";
        // yo loop vaneko player xutauna ko lagi start chai 0 bata hunxa
        for (int i = 0; i < 9; i++) {
            System.out.println("Enter index");
            int index = sc.nextInt();
            if (i % 2 == 0) {
                symbol = "0";
            } else {
                symbol = "X";
            }
            // kun index ma k symbol halne
            switch (index) {
                case 1:
                    arr[0][0] = symbol;
                    break;
                case 2:
                    arr[0][1] = symbol;
                    break;
                case 3:
                    arr[0][2] = symbol;
                    break;
                case 4:
                    arr[1][0] = symbol;
                    break;
                case 5:
                    arr[1][1] = symbol;
                    break;
                case 6:
                    arr[1][2] = symbol;
                    break;
                case 7:
                    arr[2][0] = symbol;
                    break;
                case 8:
                    arr[2][1] = symbol;
                    break;
                case 9:
                    arr[2][2] = symbol;
                    break;
                default:
                    System.out.println("hahahah");
            }
            pattern(arr);
            // winner check garne
            if(i>3){
                if(arr[0][0]==arr[0][1] && arr[0][1]==arr[0][2] && arr[0][0]=="0"){
                    System.out.println("Player 1 is Winner");
                    break;
                }

                if(arr[1][0]==arr[1][1] && arr[1][1]==arr[1][2]){
                    System.out.println("Winner");
                    break;
                }
                if(arr[2][0]==arr[2][1] && arr[2][1]==arr[2][2]){
                    System.out.println("Winner");
                    break;
                }
                if(arr[0][0]==arr[1][0] && arr[1][0]==arr[2][0]){
                    System.out.println("Winner");
                    break;
                }
                if(arr[0][1]==arr[1][1]&& arr[1][1]==arr[2][1]){
                    System.out.println("Winner");
                    break;
                }
                if(arr[0][2]==arr[1][2] && arr[1][2]==arr[2][2]){
                    System.out.println("Winner");
                    break;
                }
                if(arr[0][0]==arr[1][1]&& arr[1][1]==arr[2][2]){
                    System.out.println("Winner");
                    break;
                }
                if(arr[0][2]==arr[1][1]&& arr[1][1]==arr[2][0]){
                    System.out.println("Winner");
                    break;
                }
            }

        }


    }
}
