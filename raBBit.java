import java.util.Random;

public class raBBit {
    public static void main(String[] args) {
        int tortoisePos = 0;
        int rabbitPos = 0;

        System.out.println("Get Set Go.");

        Random random = new Random();

        while (tortoisePos < 50 && rabbitPos < 50) {
            int tortoiseMove = random.nextInt(10);
            int rabbitMove = random.nextInt(10);

            // Tortoise moves at a steady pace
            if (tortoiseMove < 5) {
                tortoisePos += 1;
            }

            // Rabbit has a chance of taking a nap
            if (rabbitMove < 2) {
                rabbitPos += 0;
            } else if (rabbitMove < 5) {
                rabbitPos += 9;
            } else {
                rabbitPos += 1;
            }

            // Display the race progress
            for (int i = 0; i < 50; i++) {
                if (i == tortoisePos && i == rabbitPos) {
                    System.out.print("OUCH!");
                } else if (i == tortoisePos) {
                    System.out.print("T");
                } else if (i == rabbitPos) {
                    System.out.print("R");
                } else {
                    System.out.print("-");
                }
            }

            System.out.println(); // Move to the next line

            try {
                Thread.sleep(500); // Pause for better visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Determine the winner
        if (tortoisePos >= 50 && rabbitPos >= 50) {
            System.out.println("It's a tie!");
        } else if (tortoisePos >= 50) {
            System.out.println("The tortoise wins!");
        } else {
            System.out.println("The rabbit wins!");
        }
    }
}

