public class PascalsTriangle {
    
    public void pascal(int max, int rows, int[] previousRow) {
        if (rows == max) {
            System.out.println();
            System.out.println("This is the end of that section of Pascal's Triangle");
        } else if (rows == 1) {
            printSpace(max * 2 - 1);
            System.out.println("1");
            pascal(max, rows + 1, previousRow);
        } 
        
        else {
            int[] current = new int[rows];
            current[0] = 1;
            for (int i = 1; i < rows - 1; i++) {
                current[i] = previousRow[i] + previousRow[i - 1];
            }
            current[rows - 1] = 1;
            printSpace(max * 2 - rows);
            for (int num : current) {
                System.out.print(num + " ");
            }
            System.out.println();
            pascal(max, rows + 1, current);
        }

    }

    public void printSpace(int spaces) {
        if (spaces == 1) {
            System.out.print(" ");
        } else {
            System.out.print(" ");
            printSpace(spaces - 1);
        }
    }
}
