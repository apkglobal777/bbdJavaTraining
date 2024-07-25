package TimeComplexity;

//find the time complexity to search element from 2D array
public class Sample13 {
    public static void main(String[] args) {
       //search item from given array
        int[][] arrayName = { { 1, 2, 3 }, { 4, 5, 6 } };
        //call method to search the element from array
        findElementInArray(arrayName, 5);
    }

    private static boolean findElementInArray(int[][] arrayName, int item) {
        for(int i=0; i<arrayName.length; i++) {
            for(int j=0; j<arrayName[i].length; j++) {
                if(arrayName[i][j] == item) {
                    return true;
                }
            }
        }
        return false;
    }
}
