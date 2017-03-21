public class Hangman {

  public static void main(String[] args) { 
    //create a new instance of the game object. Can now access the Hangman class.
    Game game = new Game("kenway");
    
    //create a new instance of the Prompter object. Can now access the Prompter class.
    Prompter prompter = new Prompter(game);
    
    prompter.displayProgress();
    
    boolean isHit = prompter.promptForGuess();
    
    if(isHit) {
      
      System.out.ln("We have a hit!");
      
    } else {
      
      System.out.ln("Oops, you missed!");
      
    }
    
    prompter.displayProgress();
    
  }
}