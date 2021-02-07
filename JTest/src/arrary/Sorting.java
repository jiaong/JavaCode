package arrary;

import java.util.Calendar;

/**
 * 演示各种排序法
 */

public class Sorting {
    public static void main(String[] args) {

        int len = 8000000;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            //  随机产生一个1-10000之间的数
            //  Math.random() 会随机产生一个0-1之间的数
            int t = (int) (Math.random() * 10000);
            arr[i] = t;
        }
        //  创建bubble类
        // Bubble bubble=new Bubble();

        //  创建select类
        //  Select select=new Select();

        //  创建InsertSort类
        //  InsertSort is=new InsertSort();

        //创建快速排序法
        QuickSort qs = new QuickSort();

        //  打印排序前时间
        Calendar cal = Calendar.getInstance();
        System.out.println("排序前时间：" + cal.getTime());
        //  select.sort(arr);
        //  bubble.sort(arr);
        //  is.sort(arr);
        qs.sort(0, arr.length - 1, arr);
        //  重新获得实例
        cal = Calendar.getInstance();
        System.out.println("排序后时间：" + cal.getTime());

        //  输出结果
        /*
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        */
    }
}

//  选择排序法
class Select {
    public void sort(int arr[]) {
        //  假设第一个数是最小数
        int temp = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            //  定义最小数
            int min = arr[j];
            //  最小数的元素下标
            int minIndex = j;
            //  不用跟自己比较
            for (int k = j + 1; k < arr.length; k++) {
                if (min > arr[k]) {
                    //  修改为最小数
                    min = arr[k];
                    minIndex = k;
                }
            }
            //  退出循环时，找到了最小值
            temp = arr[j];
            arr[j] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

//  冒泡排序
class Bubble {
    public void sort(int arr[]) {
        int temp;
        //  外层循环
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }
}

//  插入排序法
class InsertSort {
    //  插入排序法
    public void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            //  insertVal准备和前一个数做比较
            int index = i - 1;
            while (index >= 0 && insertVal < arr[index]) {
                //  将把arr[index]向后移动
                arr[index + 1] = arr[index];
                //  index 向前移动
                index--;
            }
            //  将insertVal插入合适的位置
            arr[index + 1] = insertVal;
        }
    }
}

//  快速排序法
class QuickSort {
    public void sort(int left, int right, int[] array) {
        int l = left;
        int r = right;
        int pivot = array[(left + right) / 2];
        int temp = 0;

        while (l < r) {
            while (array[l] < pivot) l++;
            while (array[r] > pivot) r--;

            if (l >= r) break;

            temp = array[l];
            array[l] = array[r];
            array[r] = temp;

            if (array[l] == pivot) --r;
            if (array[r] == pivot) ++l;


        }

        //		System.out.println("the current array is");
        //		for(int i=0;i<5;i++){

        //			System.out.print(" "+array[i]);

        //		}

        if (l == r) {
            l++;
            r--;
        }

        if (left < r) sort(left, r, array);
        if (right > l) sort(l, right, array);

    }
}