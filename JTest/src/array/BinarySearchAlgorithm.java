package array;

/**
 * BinarySearchAlgorithm 二分查找
 */
public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 12, 25};
        BinaryFind bf = new BinaryFind();
        bf.find(0, arr.length - 1, 7, arr);
    }
}

class BinaryFind {
    public void find(int leftIndex, int rightIndex, int val, int arr[]) {
        //  首先找到中间的数
        int midIndex = (rightIndex + leftIndex) / 2;
        int midVal = arr[midIndex];
        if (rightIndex >= leftIndex) {
            //  如果要找的数比midval大
            if (midVal > val) {
                //  在arr的左边找
                find(leftIndex, midIndex - 1, val, arr);
            } else if (midVal < val) {
                find(midIndex + 1, rightIndex, val, arr);
            } else if (midVal == val) {
                System.out.println("找到数组元素下标：" + midIndex);
                return;
            }
        }
    }
}