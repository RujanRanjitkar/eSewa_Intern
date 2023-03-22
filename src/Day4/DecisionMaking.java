package Day4;

public class DecisionMaking {
    public static void main(String[] args) {
        //decide th flow of program on the basis of boolean values
        //1.if statement
        //diverts the value based upon boolean values provided by if condtions
        int a=5;
        //return sout if true, if not prints nothing
        if (a>5) {
            System.out.println("a is greater than 5");
        }

        //if case false vaya matra else ko part herxa natra ignore garxa
        int b=11;
        if(b>10){
            System.out.println("b is greater than 10");
        }
        else {
            System.out.println("b is less than 10");
        }

        int c=12;
        // both if case herxa
        if(c==12){
            System.out.println("c is 12");
        }
        if(c%2==0){
            System.out.println("c is even number");
        }

        int d=10;
        //first if check garxa, milya xa vanya matra then only vitra ko if check garxa
        if(d==12){
            if(d%2==0){
                System.out.println("d is even number");
            }
        }

        //switch case
        //same as if else if
        //terminates the switch case when the match is found and in that case there is break
        //if no brek found,following case is executed
        //default is made is no match is found and it doesn't require break
        //we can do other if statements inside switch case
        char mygrade = 'A';
        int ba=5;
        switch(mygrade)
        {
            case 'A' :
                System.out.println("Excellent Performance!");
                if(ba==5){
                    System.out.println("true");
                }
                break;
            case 'B' :
                System.out.println("Good Performance!");
                break;
            default :
                System.out.println("Failed");
        }
    }

}
