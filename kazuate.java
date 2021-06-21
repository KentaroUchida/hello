public class kazuate{
    public static void main(String[] args){

        int correctnum,ansnum;
        String [] times = { "first", "second", "third", "fourth", "last"};

        System.out.println("【Number guessing game】");

        correctnum = new java.util.Random().nextInt(90)+10;
        System.out.println("A number have been confirmed.(The number is a two-digit positive integer.)");
        
        System.out.println("You can answer up to 5 times.");

        for (int i = 0;i < 5; i++){

            System.out.println("Please enter your " + times[i] + " answer.");
            ansnum = new java.util.Scanner(System.in).nextInt();

            if ( ansnum == correctnum ){
                System.out.println("Bingo!");
                break;
            } else {
                System.out.print("No!");
                if ( i == 4 ){
                    System.out.println("The answer is " + correctnum + ".");
                    break;
                }
                if ( ansnum > correctnum ) {
                    System.out.println("That number is larger than the answer.");
                } else {
                    System.out.println("That number is smaller than the answer.");
                }
                if ( Math.abs(correctnum-ansnum) >= 20) {
                    System.out.println("There is a difference of more than 20 from the answer.");
                }
            }

        }

    }
}