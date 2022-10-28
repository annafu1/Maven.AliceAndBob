/**
 * Created by iyasuwatts on 10/17/17.
 */
//need to create a scanner to input name
//need an if statement to see if Alice or Bob exist
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Input name: ");
        Scanner theName = new Scanner(System.in);
        String name = theName.nextLine();
        String name1 = "Alice";
        String name2 = "Bob";
        if (name.equals(name1) || name.equals(name2)) {
            System.out.println ("Hello " + name);
        } else {
            System.out.println(name + " does not exist");
        }
    }
}









