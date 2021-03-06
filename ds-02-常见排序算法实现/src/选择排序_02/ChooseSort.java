package 选择排序_02;

/**
 * 选择排序类似冒泡排序，只是减少数据交换的次数，比价的次数是一样的，方法也是一样的。
 * @author 25301
 */
public class ChooseSort {
    public static int[] chooseSort2(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            //这里对max赋予初值
            int maxIndex = 0;
            int max = ints[maxIndex];
            for (int j = 0; j < ints.length - i; j++) {
                // 如果出现更大值就将最大值赋值为更大值
                if (max < ints[j]) {
                    max = ints[j];
                    maxIndex = j;
                }
            }
            //最后将最大值移动到最后的位置
            int temp = ints[ints.length - 1 - i];
            ints[ints.length - 1 - i] = max;
            ints[maxIndex] = temp;
        }
        return ints;
    }

    public static int[] chooseSort(int[] arrays) {

        for (int i = 0; i < arrays.length; i++) {
            //这里对min 赋予初值
            int minIndex = i;
            int min = arrays[minIndex];
            for (int j = i + 1; j < arrays.length; j++) {
                // 如果出现更小的值就将最下值赋值给它
                if (arrays[j] < min) {
                    min = arrays[j];
                    minIndex = j;
                }
            }
            //最后将最小值移动到最开始的位置.
            arrays[minIndex] = arrays[i];
            arrays[i] = min;
        }
        return arrays;
    }
}
