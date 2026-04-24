import java.util.List;
import java.util.Scanner;

public class ConsoleView implements GameView{ //add implements GameView
  private final Scanner in = new Scanner(System.in);

  public ConsoleView(){

  }

  public boolean checkContinue(){
    System.out.println("Would you like to continue on your quest (y/n)? ");
    if(in.nextLine().equalsIgnoreCase("y") || in.nextLine().equalsIgnoreCase("yes")){
      return true;
    }
    return false;
  }

  public String displayMainMenu(){
    System.out.println("What would you like to do?");
    return in.nextLine();
  }

  public void endGame(){
    System.out.println("Thank you for playing!");
  }

  public void knightNotFound(){
    System.out.println("Knight not found!");
  }

  public void listKnights(List<Knight> knights){
    if(knights.isEmpty()){
      System.out.println("No knights to list");
    }
    else {
      int i = 1;
      for(Knight knight: knights){
        System.out.println(i + ": " + knight.getName());
        i += 1;
      }
    }
  }

  public void printBattleText(List<MOB> monsters, List<Knight> activeKnights){
    System.out.println("Our heroes come across the following monsters. Prepare for battle!");
    System.out.println("Knights     Foes");
    
    for(int i = 0; i < activeKnights.size(); ++i){
      System.out.print(activeKnights.get(i).getName() + "     ");
      if(i < monsters.size() && monsters.get(i) != null){
        System.out.print(monsters.get(i).getName() + "\n");
      }
    }
  }

  public void printBattleText(MOB dead){
    System.out.println(dead.getName() + " was defeated!");
  }

  public void printDefeated(){

  }

  public void printFortunes(List<Knight> activeKnights){

  }

  public void printHelp(){

  }

  public void setActiveFailed(){

  }

  public void showKnight(Knight knight){

  }

  public void splashScreen(){

  }
  
}