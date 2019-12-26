package app.sort;
import java.util.Arrays;

public class BubbleSort{

    /**
     * 冒泡每次循环都能找出一个最大的数，数据交换
     * 
     * 逆序度可以计算得出交换次数
     * 逆序度 = 满序度 - 初始有序度
     * 满序度 = n * (n-1) / 2
     * 初始有序度 例：4 5 6 3 2 1
     * 初始有序度 = 3 即：(4,5) (4,6) (5,6)
     * 
    */
    public static void main(String args[]){
        Integer [] i = {4,5,6,3,2,1};
        BubbleSort b = new BubbleSort();
        b.sort2(i);

    }

    public void sort(Integer [] atoms){

        Integer a[] = atoms;
        int n = a.length;


        for(int i = 0; i < n; i++){

            /**
             * 提前退出冒泡标志，减少资源消耗
            */
            boolean breakFlag = false;
            /**
             * 每次都少循环一次
            */
            for(int j = 0 ; j < n-i-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    breakFlag = true;
                }
            }

            Arrays.asList(a).forEach(item -> System.out.print(item));
            System.out.println();

            if(!breakFlag) break;

            
        }
       
    }

   
    public void sort1(Integer arg[]){

        Integer [] a  = arg;

        int n = a.length;
        for(int i = 0; i < n; i ++){
            boolean flag = false;
            for(int j = 0; j < n - i - 1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }

            if(!flag) break;
        }

        Arrays.asList(a).forEach(item->System.out.print(item));

    }

    public void sort2(Integer [] args){
        Integer [] a = args;

        int n = a.length;
        
        for(int i = 0; i < n; i++){

            boolean flag = false;
            for(int j = 0 ; j < n-i-1; j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                    flag = true;
                }
            }
            if(!flag) break;

        }

        Arrays.asList(a).forEach(item -> System.out.print(item));
    }

}