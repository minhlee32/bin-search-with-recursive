public class BinarySearch {
    static int[] list = {1, 3, 5, 7, 9, 10, 12, 15, 16, 22, 24, 27, 39, 60, 65, 85};

    public static void main(String[] args) {
        System.out.println(binarySearch(list,5,1,10));
    }

    static int binarySearch(int[] list, int key, int low, int high) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                return binarySearch(list, key, low, mid - 1);
            } else if (key == list[mid]) {
                return mid;
            }else
                return binarySearch(list, key, mid + 1, high);
        }
        return -1;
    }

}
