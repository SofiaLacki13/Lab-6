//PrintSpace method has been added for extra credit

public class PascalsTriangle {
    //Method for each row of Pascal's Triangle
    public void pascal(int max, int rows, int[] previousRow) {
        
        //Checks if we are at the limit of rows
        if (rows == max) {
            System.out.println();
            System.out.println("This is the end of that section of Pascal's Triangle");
        } else if (rows == 1) { //Prints the first row
            printSpace(max * 2 - 1);
            System.out.println("1");
            pascal(max, rows + 1, previousRow);
        } else { //Creates the rest of the rows
            int[] current = new int[rows];
            current[0] = 1;
            for (int i = 1; i < rows - 1; i++) { //Adds previous numbers together
                current[i] = previousRow[i] + previousRow[i - 1];
            }
            current[rows - 1] = 1;
            printSpace(max * 2 - rows);
            for (int num : current) { //Prints each number
                System.out.print(num + " ");
            }
            System.out.println();
            pascal(max, rows + 1, current);
        }

    }
    //Prints the spaces to give the output the triangle shape.
    public void printSpace(int spaces) {
        if (spaces == 1) {
            System.out.print(" ");
        } else {
            System.out.print(" ");
            printSpace(spaces - 1);
        }
    }
}
