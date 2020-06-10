package Factory;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        TextFactory textFactory = new TextFactory();

        Scanner sc = new Scanner(System.in);

            System.out.println("Wprowadź tekst.");
            String enteredText = sc.nextLine();

            System.out.println("Wybierz znacznik HTML z listy: ");
            System.out.println("1. <strong> </strong>");
            System.out.println("2. <p> </p>");
            System.out.println("3. <em> </em>");
            System.out.println("4. <mark> </mark>");
            int number = sc.nextInt();

            Text text = textFactory.getText(enteredText, number);
            text.print(enteredText);
        }
    }

