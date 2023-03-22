package Day4;

public class LoopStatement {
    public static void main(String[] args) {
        //used when you need to execute same block of code continously
        //1. while loop
        //block of while loop is proceded every time condition is true
        int  val=2;  //initalization
        while(val<10){ //contition
            //increment
            val++; //3 4 5 6 7 8 9 10 loop vitra xirya paxe matra increment hune ho so 10 ne print hunxa
            System.out.println(val);
//            val++; //2 3 4 5 6 7 8 9 loop vitra xirnu vanda aagade naii val ko value 10 vai sakxa so
        }


        //2. do while
        //use when you have to execute the statement inside loop even if condition in not genuine
        int val1=1; //initalization
        System.out.println();
        System.out.println();
        do{
            System.out.println(val1);
            val1++;//incerement
        }while (val1<9); //condition

        int val2=10;
        System.out.println();
        System.out.println();
        do{
            System.out.println(val2);
            val2++;
        }while (val2<10);

        //3.for  loop
        //use for loop when we know exactly how many times we have to execute the statement inside the loop
        String str="Badsna";
        System.out.println(str.length());
        for(int i=0;i<str.length();i++){
            System.out.println(i);
            System.out.println(str.charAt(i));
        }

        System.out.println();
        System.out.println("for each loop");
        //4. for each loop
        //we use for each loop in array or collection where we dont have to increment the value
        //was introduced in java 5
        int [] mynumber = {0, 5, 10, 15, 20};
        for(int i : mynumber ){
            //here i is referenced varaiable
            //mynumber is the name of array
            if(i>10){
                System.out.print( i );
                System.out.print("," );
            }


        }


    }


}
