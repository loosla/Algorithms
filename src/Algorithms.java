

public class Algorithms {

    public static void main (String [] args) {

        int k = 2;
        int [] arr = {1, 2, 3, 4}; // 12 13 14 23 24 34
        Combination combination = new Combination(arr, k);
        //combination.combination(0);

        // Binary Search in Ordered int array
        int [] arrBs = {-150, -13, 1, 2, 3, 4,6,7,8,9,10};
        BinarySearch bs = new BinarySearch();
        int res = bs.binarySearch(-130, arrBs, 0, arrBs.length, false);
        System.out.println("Result: " + res);
    }
}
