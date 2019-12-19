package app.sort;
import java.util.Arrays;

public class BubbleSort{

    public static void main(String args[]){
        Integer [] i = {4,5,6,3,2,1};
        BubbleSort b = new BubbleSort();
        b.sort(i);

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

   
    

}