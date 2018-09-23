package recursive;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{2, 8, 7, 1, 3, 5, 6, 4, 10000};
        quicksort(array,0,array.length-1);
        print(array);
    }

    public static void quicksort(int[] array, int left, int right) {
        if (left < right) {
            int index = partition(array, left, right);
            quicksort(array, left, index-1);
            quicksort(array, index+1, right);
        }
    }

    public static int partition(int[] array, int left, int right) {

        int pivot = array[right];
        int boundary = left - 1;

        for (int j = left; j <= right-1; j++) {
            if (array[j] <= pivot) {
                boundary++;
                swap(array, boundary, j);
            }
        }
        swap(array, boundary + 1, right);
        return boundary + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

