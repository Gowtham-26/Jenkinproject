public class OddNumbersWithDelay {
    public static void main(String[] args) {
        System.out.println("Printing odd numbers from 1 to 1000, one every 2 seconds:\n");

        for (int i = 1; i <= 1000; i += 2) {
            System.out.println(i);

            try {
                // Wait for 2 seconds (2000 milliseconds)
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted: " + e.getMessage());
            }
        }
    }
}
