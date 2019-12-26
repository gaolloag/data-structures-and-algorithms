package app.sort;
import java.util.Arrays;

/**
 * 左右移动
 * 把小数插到左侧
 * 
*/
public class InsertSort{


    public static void main(String args[]){
        Integer [] a = {1,2,6,4,3,2};
        InsertSort s = new InsertSort();
        s.sort(a);
    }

    public void sort(Integer[] args){
        Integer [] a = args;
        int n = a.length;
        for(int i = 1; i<n; i++){
            int var = a[i];
            int j = i -1;
            for(;j>=0;j--){
                if(a[j] > var){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }

            a[j+1] = var;
        }

        Arrays.asList(a).forEach(item -> System.out.print(item));
    }

    public void sort2(Integer[] args){
        Integer[] a = args;
        int n = a.length;

        for(int i = 1 ; i < n; i++){
            int var = a[i];
            int j = i - 1;
            for(;j>=0;j--){
                if(a[j]>var){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = var;
        }
    }
}