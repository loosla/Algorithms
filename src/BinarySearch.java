public class BinarySearch {

    /*
    Binary search:
    1. Start and end indexes
    2. Flag to know where we should move next: to the right or to the left.
    3. Breaking condition if element is not found => Check that indexToCheck changed.
    If not - it means that element is not in an array.
    4. Recursion.

    If element is found - returns array index of the element.
    If element is not found - returns -1.
     */
    public int binarySearch(int elem, int[] arr, int start, int end, boolean flagRight) {

        int ret = -1;
        int indexToCheck;

        if (flagRight) {
            indexToCheck = (end + start) / 2;
        } else {
            indexToCheck = (end - start) / 2;
        }
        // System.out.println("Checking : " + arr[indexToCheck]);
        if (elem == arr[indexToCheck]) {
            // System.out.println("Found: " + arr[indexToCheck]);
            ret = indexToCheck; // success breaking condition
        } else if (elem > arr[indexToCheck]) {
            if (start != indexToCheck) { // failure breaking condition
                start = indexToCheck;
                ret = binarySearch(elem, arr, start, end, true);
            } else {
                return -1;
            }
        } else {
            if (end != indexToCheck) { // failure breaking condition
                end = indexToCheck;
                ret = binarySearch(elem, arr, start, end, false);
            } else {
                return -1;
            }
        }
        return ret;
    }
}