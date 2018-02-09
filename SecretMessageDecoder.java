import java.util.Scanner;
import java.io.*;

/** The SecretMessageDecoder class uses a scanner to read text
from the file secret.txt. It then decodes the secret message by
printing the first letter of each fifth word.
*/

public class SecretMessageDecoder {

   public static void main(String[] args) throws IOException {
      
      //To hold the text read from the file
      String secretCode = "";
      
      // To build the code word from the first letter of each word
      // of the secret code file
      StringBuilder codeWord = new StringBuilder();
      
      // Create a file object to read data from
      File secretCodeFile = new File("secret.txt");
      
      // Create a scanner object and pass the file to read from
      Scanner fileReader = new Scanner(secretCodeFile);
      
      
      // Read each line of the file and store in the secretCode var
      while(fileReader.hasNextLine()) {
         secretCode += fileReader.nextLine() + " ";
      }
      
      // Close the file
      fileReader.close();
      
      // Split the secretCode string into word tokens and store
      // in a string array named tokens
      String[] tokens = secretCode.split(" ");
      
      // Loop through the tokens array and copy the first letter
      // of each fifth word, capitalizing the letter first
      for(int i = 0; i < tokens.length; i += 5) {
         codeWord.append(Character.toUpperCase(tokens[i].charAt(0)));
      }
      
      // Print the secret word created from the secret file
      System.out.print("The secret code word is: " + codeWord);
   
   }
}