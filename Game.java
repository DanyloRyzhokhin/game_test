import java.util.Scanner;
public class Game {
    private String hidden;
    private String guess;
    private String hint;
    private  Scanner keyb;

    public static void main(String[] args){
        Game game = new Game();


        game.runGame();
    }
     public void runGame(){
         keyb = new Scanner(System.in);
         System.out.println("Enter a hidden word");
         hidden = keyb.next();
         System.out.println("Enter a "+hidden.length()+" letter word");
         guess = keyb.next();
         hint = "";
         boolean run = true;
         //System.out.println(hidden.substring(0,1));
         while(run){
             for(int i =0; i<hidden.length();i++ ){
                 if(hidden.substring(i,i+1).equals(guess.substring(i,i+1))){
                     hint += hidden.substring(i,i+1);
                 }else{
                     if(hidden.contains(guess.substring(i,i+1))){
                         hint+="+";
                     }else{
                         hint+="*";
                     }
                 }
             }
             if(!hint.equals(hidden)){
                 run = true;
                 System.out.println("Hint for you: "+hint);
                 System.out.println("Try again, enter here:");
                 guess = keyb.next();
                 hint ="";
             }else{
                 run = false;
             }
         }
         System.out.println("Congratulations you guess the hidden word");
         System.out.println(hint);
     }
}

                /* for (int j = 0;j<hidden.length();j++){
                        if(guess.substring(i,i+1).equals(hidden.substring(j,j+1))){
                            hint +="+";
                        }else{
                            hint +="*";
                        }
                    }*/


// метод нахождения составляющего числа
    /*  boolean exist =false;
                     for(int j=0;j<hidden.length();j++){
        if(guess.substring(i,i+1).equals(hidden.substring(j,j+1))){
        exist = true;
        }
        }
        if(exist){
        hint+="+";
        }else{
        hint+="*";
        }
    */