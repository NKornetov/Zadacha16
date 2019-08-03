import java.io.*;

public class Zadacha16 {

    public static void main(String[] args) {
        String output;
        try(BufferedReader s = new BufferedReader(new FileReader ("text.txt"))) {

            while((output = s.readLine()) !=null)
            {System.out.println(output);}

        }
        catch(IOException exc){

         System.out.println("Ошибка! " + exc);
     }

    }

}
