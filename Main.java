import java.util.Scanner;
/**
 *
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a positive integer to determine its factors:");
    int userNum = input.nextInt();

    int count = 1;

    do{
      count = count + 1;
      if(userNum % count == 0){
        System.out.println(count);
      }

    } while(userNum > 0);

    
    
  }
}
