// Q1) Write a program(WAP) to print INEURON using pattern programming logic.

// *****     *     *    ******     *     *  ******        *****     *     *  
//   *       *     *    *          *     *  *    *       *     *    *     *
//   *       *     *    *          *     *  *    *       *     *    *     *
//   *       **    *    *          *     *  *    *       *     *    **    *
//   *       * *   *    *          *     *  *    *       *     *    * *   *
//   *       *  *  *    ***        *     *  *****        *     *    *  *  *  
//   *       *   * *    *          *     *  **           *     *    *   * *
//   *       *    **    *          *     *  * *          *     *    *    **
//   *       *     *    *          *     *  *  *         *     *    *     *
//   *       *     *    *          *     *  *   *        *     *    *     *
// *****     *     *    ******      *****   *    *        *****     *     *

public class Q1 {
    public static void main(String args[]) {
        int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) // I
            {
                if (i==0 && j>n/4 && j<(3*n)/4 ||
                    i==n-1 && j>n/4 && j<(3*n)/4 ||
                    j==(n-1)/2 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) // N
            {
                if (i==j && j>=n/4 && j<=(3*n)/4 || 
                    j==n/4 && i>=0 && i<=n-1 ||
                    j==(3*n)/4 && i>=0 && i<=n-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) //E
            {
                if (j==n/4 || i==0 && j>n/4 && j<(3*n)/4 ||
                     i==n-1 && j>n/4 && j<(3*n)/4 ||
                    i==(n-1)/2 && j>n/4 && j<(n-1)/2 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) //U
            {
                if (i==n-1 && j>n/4 && j<(3*n)/4 ||
                 j==n/4 && i<n-1 ||
                  j==(3*n)/4 && i<n-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) // R
            {
                if (i-j==(n-1)/2 || j==0 ||
                    i==0 && j<(n-1)/2 || 
                    i==(n-1)/2 && j<(n-1)/2 || 
                    j==(n-1)/2 && i<(n-1)/2 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) //0
            {
                if (i==0 && j>n/4 && j<(3*n)/4 || 
                    j==n/4 && i>0 && i<n-1 || 
                    i==n-1 && j>n/4 && j<(3*n)/4 || 
                    j==(3*n)/4 && i>0 && i<n-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) // N
            {
                if (i==j && j>=n/4 && j<=(3*n)/4 || 
                    j==n/4 && i>=0 && i<=n-1 ||
                    j==(3*n)/4 && i>=0 && i<=n-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();    
        }
    }       
}
