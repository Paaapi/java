import java.io.*;
import java.util.Scanner;

public class ATM_Simulator {
    private static final String BALANCE_FILE = "Balance_Record.txt"; // jis vich  Balance store hai 

    public static void main(String[] args) {
        int Availbal = readBalanceFromFile(); // ehh read karuga phela waale Balance nu 
        int Set_Pin = 90304;
        int Entered_pin;

            System.out.println("Welcome to Automated Teller Machine.");
        try (Scanner Money = new Scanner(System.in)) {
            System.out.println("Enter your Pin=");
            Entered_pin = Money.nextInt();
           

            if (Entered_pin == Set_Pin) {
                System.out.println("Successfully Login.");

                while (true) {
                    System.out.println( "Press 1 for Check balance \n Press 2 for Deposit money \n Press 3 for Withdraw money \n Press 4 for Exit the server");

                    while (!Money.hasNextInt()) {//integer k ilawa kuch vi chaluga tah loop runs 
                        System.out.println("Invalid Option. \nPlease Enter a valid Input.");
                        Money.next();
                    }
                    int choose = Money.nextInt();

                    switch (choose) {
                        case 1:
                            System.out.println("Your balance is Rs." + Availbal);
                            break;

                        case 2:
                            System.out.println("Enter the amount you want to deposit Rs.");
                            if (Money.hasNextInt()) {
                                int Amountdeposit = Money.nextInt();
                                Availbal += Amountdeposit;
                                updateBalanceInFile(Availbal); // Update balance in file
                                System.out.println("Your Updated balance is Rs." + Availbal);
                            } else {
                                System.out.println("Invalid input for deposit amount.");
                                Money.next();
                            }
                            break;

                        case 3:
                            System.out.println("Enter the amount to withdraw Rs.");
                            if (Money.hasNextInt()) {
                                int withdrawAmount = Money.nextInt();
                                if (withdrawAmount > Availbal) {
                                    System.out.println("Insufficient Amount!!");
                                } else {
                                    Availbal -= withdrawAmount;
                                    updateBalanceInFile(Availbal); // Update balance after withdrawal
                                    System.out.println("Successfully Withdrawn Money Rs." + withdrawAmount);
                                    System.out.println("Available Balance= Rs." + Availbal);
                                }
                            } else {
                                System.out.println("Invalid input for withdrawal amount.");
                                Money.next();
                            }
                            break;

                        case 4:
                            System.out.println("Thanks for Using ATM.\n Please remove your card.");
                            System.exit(0);

                        default:
                            System.out.println("Option is not Valid.");
                    }
                }
            } else {
                System.out.println("Incorrect Pin. \n Reinsert your ATM card.");
            }
        }
    }

    // Read karuga Balance nu file cho
    private static int readBalanceFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(BALANCE_FILE))) {
            String balanceStr = reader.readLine();
            return Integer.parseInt(balanceStr);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading balance from file \n Setting balance to default.");
            return 0; // default nu run karduga agar it fails to reads
        }
    }

    // Update karuga Balance nu
    private static void updateBalanceInFile(int newBalance) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(BALANCE_FILE))) {
            writer.write(String.valueOf(newBalance));
        } catch (IOException e) {
            System.out.println("Error updating balance in file.");
        }
    }
}