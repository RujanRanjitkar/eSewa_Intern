package Day4;

public class JumpStatement {
    public static void main(String[] args) {
        //used to transfer the flow of progarm at specific statement
        //1. break
        //used to transfer the flow of program to the statement outside the loop or switch case
        for (int i=0;i<10;i++){
            System.out.println(i);
            if(i==5){
                System.out.println("reached 5");
                break;
            }
            //after reaching to 5 below statement is not executed
            System.out.println("end of break");
        }
        System.out.println("start of continue");

        //2. continue
            //used to  skip the specific part of  the loop and continue the loop from next iteration
        for (int i=0;i<10;i++){

            if(i==5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
