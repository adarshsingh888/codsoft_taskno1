import java.util.*;
public class NumberGame{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         Random random = new Random();
        
       
         
         System .out.println ("****  Welcome to the Number Game   ****");
         System .out.println ();
         boolean newgame=true;
        
         

        while(newgame){    //loop for new game
             int round=0;     //Count number of round you play 
             int score=0;     //Count your score
             int randomno=random.nextInt(100)+1;  // Generating  random number 
             boolean tryagain=true;
             while(tryagain){    // Loop for rounds
            
                 int attempt=-1;
                 int guessno=0;
                
               
                for (int i=0;i<=5;i++){    //Loop for attempts
               
                    System.out.println("Guess new number");
                    guessno=sc.nextInt();
                     attempt++;
                    if(guessno == randomno){
                       score++;
                        break;      //if guess is correct 

                    }
                    else if((randomno - guessno)>5){
                        System.out.println("Too low guess");
                    }
                    else if ((guessno - randomno)>5){
                       System.out.println("Too heigh guess");
                    }
                    else {
                        System.out.println("Guess number is not matched");
                    } 
                    System .out.println ();
                }
                if(attempt == 5){
                   System.out.println("You reached your number of attempt limt 5.");
                }
                round++;
                tryagain=false;
                if ( guessno == randomno){
                        break; 
                }
                System.out.println ("Do you want try again ?");
                System.out.println("If Yes Enter 1 ?");
                int try1=sc.nextInt();
                if(try1 == 1){
                   tryagain=true;
                }
           
            }
        System.out.println ("Correct guess number is : " + randomno);
        System.out.println("Number of round you play : " + round );
        System.out.println("Your score is : " + score);
        newgame=false;
        System.out.println();
        System.out.println ("Do you want Play again ?");
        System.out.println("If Yes Enter 1 ?");
        int play=sc.nextInt();
        if(play == 1){
           newgame=true;
        }
    
        



    }
    

}
}