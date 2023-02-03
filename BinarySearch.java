
public class BinarySearch {

    public int binarySearch(int[] a, int value, int left, int right) {

        int idx = (left + right) / 2;

        if (idx >= a.length) {
            return -1;
        }
        int pivot = a[idx];

        if (left > right)
            return -1;

        if (value < pivot) {
            right = idx - 1;
            return binarySearch(a, value, left, right);
        } else if (value > pivot) {
            left = idx + 1;
            return binarySearch(a, value, left, right);
        } else {
            return pivot;
        }
    }

    
    public static void main(String[] args) {
        
        int[] a = { 11, 22,33, 44, 55 };
        BinarySearch bs = new BinarySearch();

        System.out.println(bs.binarySearch(a, 3, 0, a.length));
    }
}
