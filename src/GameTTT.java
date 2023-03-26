import java.util.Scanner;

class GameTTT {

    public static void main(String[] args) {
        int game[] = new int[9];
        String board[] = { " ", " ", " ", " ", " ", " ", " ", " ", " " };
        drawGame(board);
        int player = 1;
        while (true) {
            try {
                int winner = winner(game);
                if (winner == 0) {
                    play(player, board, game);
                    player = player + 1;
                } else {
                    if (winner % 2 == 0)
                        System.out.println("Player 2 (X) won!");
                    if (winner % 2 == 1)
                        System.out.println("Player 1 (O) won!");
                    break;
                }

            } catch (Exception e) {
                System.out.println("Board space already occupied");
            }
        }
    }

    private static void play(int player, String[] board, int game[]) throws GameTTT.CustomException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice of play");
        int choice = sc.nextInt();
        String symbol = "";
        choice = choice - 1;
        if (game[choice] != 0)
            throw new GameTTT().new CustomException("Place already selected");

        if (choice >= 9)
            throw new ArrayIndexOutOfBoundsException();

        if (player % 2 == 1) {
            symbol = "O";
            board[choice] = symbol;
            game[choice] = 1;

        } else if (player % 2 == 0) {
            symbol = "X";
            game[choice] = 2;
            board[choice] = symbol;
        }
        drawGame(board);

    }

    private static void drawGame(String[] board) {

        System.out.println("---------------------");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " | ");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " | ");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " | ");
        System.out.println("---------------------");

    }

    private static int winner(int[] arr) {
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]);
        // }
        if (arr[0] != 0 && arr[0] == arr[1] && arr[1] == arr[2])
            return arr[0] + arr[1] + arr[2];

        if (arr[3] != 0 && arr[0] == arr[3] && arr[3] == arr[6])
            return arr[0] + arr[3] + arr[6];

        if (arr[1] != 0 && arr[1] == arr[4] && arr[4] == arr[7])
            return arr[1] + arr[4] + arr[7];

        if (arr[4] != 0 && arr[3] == arr[4] && arr[4] == arr[5])
            return arr[3] + arr[4] + arr[5];

        if (arr[5] != 0 && arr[2] == arr[5] && arr[5] == arr[8])
            return arr[2] + arr[5] + arr[8];

        if (arr[6] != 0 && arr[6] == arr[7] && arr[7] == arr[8])
            return arr[6] + arr[7] + arr[8];

        if (arr[2] != 0 && arr[2] == arr[4] && arr[4] == arr[6])
            return arr[2] + arr[4] + arr[6];

        if (arr[0] != 0 && arr[0] == arr[4] && arr[4] == arr[8])
            return arr[0] + arr[4] + arr[8];

        return 0;
    }

    class CustomException extends Exception {
        CustomException(String message) {
            super(message);
        }
    }
}