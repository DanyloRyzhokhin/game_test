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
                     hint+=hidden.substring(i,i+1);
                 }else{
                     hint+="*";
                 }
             }
             for(int i =0;i<hidden.length();i++){
                 for(int j =0;j<hidden.length();j++){
                     if(guess.substring(i,i+1).equals(hidden.substring(j,j+1))){
                        hint = hint.substring(0,i)+"+"+hint.substring(i+1);
                     }
                 }
             }
             run = false;
         }
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