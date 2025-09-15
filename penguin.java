import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Club Penguin money converter!");
        System.out.print("How much coin do you have ? ");

        int coin = input.nextInt();
        double USD = coin * 0.0045;
        System.out.println("You have " + USD + " USD");
            }
        }

