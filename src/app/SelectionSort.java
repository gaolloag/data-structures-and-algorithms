package app;
/**
 * 选择排序，第次找到最小数，然后交换位置，比较排序，本地排序，不稳定排序，空间复杂度O(1)，时间复杂度 O(n*n)
 */
public class SelectionSort{
    public void sort(int [] a,int n){
        if(n <= 1){
            return ;
        }

        for(int i = 0 ; i < n; ++i){
            int min = a[i];
            int index = i;
            for(int j = i ; j < n; ++j){
                if(min > a[j]){
                    min = a[j];
                    index = j;   
                }
            }

            a[index] = a[i];
            a[i] = min;
        }
    }

    public static void main(String[] args){
        int[] s = {4,5,6,3,2,1};

        SelectionSort sort = new SelectionSort();
        sort.sort(s, s.length);
        for (int v:s){
            System.out.println(v);
        }
    }
}