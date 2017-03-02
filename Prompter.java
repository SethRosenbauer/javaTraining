import java.util.Scanner;

class Prompter {
  
 Private Game game;  
 Private guess;
  
 //Create new instance of game object?
 Prompter(Game game) {
      
   this.game = game;
      
 }
 
 Public boolean promptForGuess () {    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a letter:  ");
    String guessInput = scanner.nextLine();
    char guess = guessInput.charAt(0);
    return game.applyGuess(guess);
   
 }  
  
  public void displayProgress() {
    
    System.out.println("Try to Solve: %%n", 
                       game.getCurrentProgress());
        
  }
  
}
