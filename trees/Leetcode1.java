package trees;

public class Leetcode1 {

    // method to print and shift current ball
    public int drawTriangle(int val1, int val2, String[] currentball) {
        int root = 1; // Start with the first level of the triangle
        int pos = 0;  // position of currentball
        int counter=0;
        while (val1 > 0 || val2 > 0) {
            // Print current level of the triangle
            for (int i = 0; i < root; i++) {
                System.out.print(currentball[pos] + " ");
            }
            System.out.println();

            // Update val1 or val2 based on the current ball
            if (currentball[pos].equals("red")) {
                val1-=root;
            } else {
                val2-=root;
            }

            // Move to the next ball in sequence
            pos = (pos + 1) % currentball.length;

            // Increment the root for the next level
            root++;
            counter++;
            // Break if we run out of a certain color of balls
            if (val1 < root && val2 < root) {
                break;
            }
        }
        return counter;
    }

    public void maxHeightOfTriangle() {

        int red=10;
        int blue=1;
        // list of balls to iterate over
        String[] ball={"blue","red"};
        System.out.println(drawTriangle(red,blue,ball));

    }

    public static void main(String[] args) {

     Leetcode1 _code=new Leetcode1();

     _code.maxHeightOfTriangle();


    }

    }

