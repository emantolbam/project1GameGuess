import java.io.File;
import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        String data = scanner.nextLine();
        while (scanner.hasNextLine()){
            data += scanner.nextLine();
        }
        String[] film = data.split("/");
        int filmNumber = (int)(Math.random()*25)+1;
        film[filmNumber].length();
         String dashed=film[filmNumber];
        dashed="";
        for (int i=0; i< film[filmNumber].length(); i++){
            dashed+="-";
        }
        System.out.println(film[filmNumber].length());
        System.out.println(dashed);

        Scanner user = new Scanner(System.in);
        System.out.println("Guess the letter ");
        String guess = "";
        //System.out.println(film[filmNumber].indexOf(guess));
        System.out.println(dashed);
        for (int i=0; i<10; i++){
             guess = user.nextLine();
            int newIndex =film[filmNumber].indexOf(guess);
            String newName = dashed.substring(0,newIndex)+guess+dashed.substring(newIndex+1);
            System.out.println(newName);

          // if (guess ==   ){
          //     System.out.println("true");
         //  }else {
          //     System.out.println("false");
         //  }
        }



    }
}
