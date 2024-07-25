package TimeComplexity;

//find the time complexity to search element from array
public class Sample12 {
    public static void main(String[] args) {
       //search item from given array
        int [] arrayName = {1, 7, 9, 11, 5, 13};
        //call method to search the element from array
        findElementInArray(arrayName, 5);
    }

    private static int findElementInArray(int[] arrayName, int item) {
        for(int i=0; i<arrayName.length; i++) {
            if(arrayName[i] == item) {
                return i;
            }
        }
        return -1;
    }
}
