import java.util.Scanner;

class main {
  public static void main(String[] args) {
    int myNumber = (int)(Math.random()*100);
   Scanner sc = new Scanner(System.in);
    int Usernumber = 0;
    
    do {
    System.out.println("Guess What Number I am Thinking Of Right Now 🤔💭 (Remember It Is In a Range Of 1-100): ");
    Usernumber = sc.nextInt();
    if(Usernumber == myNumber) {
      System.out.println("SHEESH!!!!. YOU GUESSED THE NUMBER ✅✅✅✅✅.");
      break;
    }
      else if(Usernumber > myNumber) {
        System.out.println("OOOH... YOUR NUMBER IS LARGE ⬆⬆⬆⬆⬆ . ");
      } 
      else if(Usernumber < myNumber) {
        System.out.println("OOOH...YOUR NUMBER IS SHORT ⬇⬇⬇⬇⬇.");
      }
    } while(Usernumber >= 0);
    
    System.out.print("GOOD TRY👍. My number was : ");
    System.out.println(myNumber);
    System.out.println("DO YOU WANT TO TRY AGAIN???. CLICK ON THE RUN BUTTON.");
  }
}
