/*  Problem:

    Display numbers in a pyramid pattern.
                        1
                      1 2 1
                    1 2 4 2 1
                  1 2 4 8 4 2 1
                1 2 4 8 16 8 4 2 1
             1 2 4 8 16 32 16 8 4 2 1
          1 2 4 8 16 32 64 32 16 8 4 2 1
*/

// Ankit Savani (21CE122)

public class Pr_1_7 {

    public static void main(String arguments[]) {
        int number = 0;
        for (int row = 0; row < 7; row++) {

            // This prints space before numbers
            for (int column = 1; column <= 7 - row; column++) {
                System.out.printf("%3s", " ");
            }

            // After space this prints power of 2
            for (int column = 0; column <= row; column++) {
                number = (int) Math.pow(2, column);

                System.out.printf("%3d", number);
            }

            // Printing Elements after 7th column
            for (int column = row - 1; column >= 0; column--) {
                number = (int) Math.pow(2, column);

                System.out.printf("%3d", number);
            }
            System.out.println();
        }
    }
}