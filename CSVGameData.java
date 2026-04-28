import java.util.Scanner;

public class CSVGameData extends GameData {
  public CSVGameData(String gameData, String saveData){
    loadGameData(gameData);
    loadSaveData(saveData);
  }
  
  public void loadSaveData(String saveData){
    int counter = 0;
    Scanner file = readFile(saveData);
    if(file == null) return;
    while(file.hasNextLine()){
      Scanner line = new Scanner(file.nextLine());
      line.useDelimiter(",");
      Knight kt = new Knight(
        ++ counter,
        line.next().trim(),
        line.nextInt(),
        line.nextInt(),
        line.nextInt(),
        DiceType.valueOf(line.next()),
        line.nextInt()
      );
      knights.add(kt);
    }
  }

  public void loadGameData(String gameData){
    Scanner file = readFile(gameData);
    if(file == null) return;
    while(file.hasNextLine()){
      Scanner line = new Scanner(file.nextLine());
      line.useDelimiter(",");
      if(line.next().trim().toLowerCase().equals("fortune")){
        //create a fortune object here
        Fortune ftn = new Fortune(
          line.next().trim(),
          line.nextInt(),
          line.nextInt(),
          line.nextInt(),
          line.next().equals("-") ? null : DiceType.valueOf(line.next())
        );
        fortunes.add(ftn);
      }
      if(line.next().trim().toLowerCase().equals("mob")){
        //create a MOB object here 
        MOB monster = new MOB(
          line.next().trim(),
          line.nextInt(),
          line.nextInt(),
          line.nextInt(),
          DiceType.valueOf(line.next())
        );
        monsters.add(monster);
      }
    }
  }

  private Scanner readFile(String fileName){
    Scanner scnr = new Scanner(System.in);
  }

  private void parseGameDataLine(Scanner line){

  }

  public void save(String filename){

  }
}