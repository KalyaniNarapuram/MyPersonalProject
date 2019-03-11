package mylove.programming;

public class PrintTriangle {

    public static void main(String[] args) {

        int i, j;
        int n = 5;

        // outer loop to handle number of rows
        //  n in this case
        for (i = 0; i < n; i++) {

            //  inner loop to handle number of columns
            //  values changing according to outer loop
            for (j = 0; j <= i; j++) {

                // printing stars
                System.out.print("* ");
            }
            // ending line after each row
            System.out.println();



            /* Function to demonstrate printing pattern

            {
                int i, j;
                int n = 5;

                // outer loop to handle number of rows
                //  n in this case
                for(i=0; i<n; i++)
                {

                    // inner loop to handle number spaces
                    // values changing acc. to requirement
                    for(j=2*(n-i); j>=0; j--)
                    {
                        // printing spaces
                        System.out.print(" ");
                    }

                    //  inner loop to handle number of columns
                    //  values changing acc. to outer loop
                    for(j=0; j<=i; j++)
                    {
                        // printing stars
                        System.out.print("* ");
                    }

                    // ending line after each row
                    System.out.println();

                    }*/
        }
    }
}













