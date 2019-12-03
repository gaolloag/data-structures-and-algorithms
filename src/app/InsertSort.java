package app;
/**
 * 插入排序：原地排序，比较排序，时间复杂度O(n*n)，空间复杂度O(1)
 * 插入排序思想，找到待比较数据，大数后移，小数留出空位插入
 */
public class InsertSort{

    public void insert(int[] a,int n){

        if(n <= 1){
            return ;
        }

        for(int i = 1; i < n; ++ i){
            int value = a[i];
            int j = i - 1;

            for(; j>=0; -- j){
                if(a[j] > value){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }

            a[j+1] = value;
        }
    }

    public static void main(String args[]){
        int[] s = {4,5,6,3,2,1};
        InsertSort b = new InsertSort();

        b.insert(s, s.length);

        for (int i : s) {
            System.out.println(i);
        }

    }


}