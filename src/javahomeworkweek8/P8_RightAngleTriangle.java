package javahomeworkweek8;

/**
 * 8. Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class P8_RightAngleTriangle {

    public static void main(String[] args) {
        int n = 5; // number of rows

        // outer loop for rows
        for (int i = 1; i <= n; i++) {

            // inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("@ ");
            }

            //next line
            System.out.println();
        }
    }
}
