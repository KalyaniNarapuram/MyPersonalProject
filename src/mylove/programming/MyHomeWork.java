package mylove.programming;

public class MyHomeWork {

    public static void main(String[] args) {

        int x, y;
        int z =4;


        // outer loop to handle number of rows
        // z in this case
        for (x = 1; x <= z; x++) {

            //  inner loop to handle number of columns
            //  values changing according to outer loop

            for (y = 0; y<=10; y++) {

                System.out.print("*");
            }

            System.out.println();

        }
    }
}
