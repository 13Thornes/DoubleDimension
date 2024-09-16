public class DoubleDimension {
    int [] [] arr = null;
    int rowSize = 0;
    int columnSize = 0;


    // constructor
    public DoubleDimension(int numOfRows, int numOfColumns) {
        rowSize = numOfRows;
        columnSize = numOfColumns;
        arr = new int[rowSize][columnSize];

        int i, j;
        for ( i = 0; i < rowSize ; i++) {
            for (j = 0; j < columnSize; j++) {
                arr[i] [j] = Integer.MIN_VALUE;
            }
        }
    }

    // Insert an element
    public void Insert(int row, int column, int valueToInsert) {
        try {
            if (arr[row] [column] == Integer.MIN_VALUE) {
                arr[row] [column] = valueToInsert;
                System.out.println("Successfully Inserted " + valueToInsert);
            }
            else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }

    // traverse an array
    public void Traverse() {

        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.println(arr[i] [j]);
                }

            }
        } catch (Exception e) {
            System.out.println("Array no longer exists");
        }

    }

    // Search for an element
    public void searchArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] [j] == valueToSearch) {
                    System.out.println("Value was found in row " + i + " column " + j);
                    return;
                }
            }

        }
        System.out.println(valueToSearch + " is not found");
    }

    // delete a value from an array
    public void DeleteValueAtIndex(int row, int column) {
        try {
            arr[row] [column] = Integer.MIN_VALUE;
            System.out.println("The value had been deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index of this array is out of bounds");
        }
    }

//     delete an entire array
    public void DeleteArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i] [j] = Integer.MIN_VALUE;
                }
        }
   }

    public static void  main(String[] args) {
        DoubleDimension doubleDimension = new DoubleDimension(2, 2);
        doubleDimension.Insert(0,0, 1);
        doubleDimension.Insert(0,1, 2);
        doubleDimension.Insert(1,0, 3);
        doubleDimension.Insert(1,1, 4);
        doubleDimension.Traverse();
        doubleDimension.searchArray(4);
        doubleDimension.searchArray(7);
        doubleDimension.DeleteValueAtIndex(0, 1);
        doubleDimension.Traverse();
        doubleDimension.DeleteArray();
        doubleDimension.Traverse();

    }
}
