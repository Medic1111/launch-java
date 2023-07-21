package exercises;
import java.util.Locale;
import java.util.Scanner;
public class Alice {
    public static Scanner scan = new Scanner(System.in);
    public static void logger() {

        System.out.println("What is your name: ");
        String username = scan.nextLine();
        System.out.println("Hello" + " " + username);
    }
    public static void main(String[] args) {
        System.out.println("Enter a word to search: ");
        String target = scan.nextLine();


      String firstPara = "Alice was beginning to get " +
              "very tired of sitting by her sister" +
              " on the bank, and of having nothing to" +
              " do: once or twice she had peeped into " +
              "the book her sister was reading, but it" +
              " had no pictures or conversations in it," +
              " 'and what is the use of a book,' " +
              "thought Alice 'without pictures or " +
              "conversation?'";

        int targetIndex = firstPara.toLowerCase().indexOf(target.toLowerCase());
        System.out.print(firstPara.toLowerCase().contains(target.toLowerCase() )? "FOUND AT INDEX: ": "NOT FOUND, THEREFORE INDEX IS: ");
        System.out.print(targetIndex);
        System.out.print(" AND IT CONTAINS: ");
        System.out.print(target.length());
        System.out.println(" CHARS");

        String firstChunk = firstPara.substring(0, targetIndex);
        String secChunk = firstPara.substring( targetIndex + target.length());

        firstPara = firstChunk+ " " + secChunk;
        System.out.println(firstPara);
        scan.close();
    }
}
