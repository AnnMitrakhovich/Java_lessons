import java.util.Arrays;

public class Autotest_5_heapSort {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }

}


class HeapSort {
    public static void buildTree(int[] tree, int length, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < length && tree[left] > tree[largest]) {
            largest = left;
        }
        if (right < length && tree[right] > tree[largest]) {
            largest = right;
        }
        if (largest != i) {
            int tmp = tree[i];
            tree[i] = tree[largest];
            tree[largest] = tmp;
            buildTree(tree, length, largest);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
// Введите свое решение ниже
        if (sortArray.length == 0) {
            return;
        }

        int length = sortArray.length;

        // Moving from the first element that isn't a leaf towards the root
        for (int i = length / 2 - 1; i >= 0; i--) {
            buildTree(sortArray, length, i);
        }

        for (int i = length - 1; i >= 0; i--) {
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;
            buildTree(sortArray, i, 0);
        }
    }
}
