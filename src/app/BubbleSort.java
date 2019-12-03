package app;

/**
 * 冒泡法，比较排序，原地排序，稳定排序，时间复杂度为 O(n*n),空间复杂度O(1)
 * 代码中两个版本
 * 版本1：传统版本，会比较 n * n 次。
 * 版本2：优化版本，比较次数减少，每次小循环后结果将不参与下次的比较
 * 
 */
public class BubbleSort{
    public void bubbleSort(int [] a,int n,String v){
        if(n < 1){
            return ;
        }

        if("v1".equals(v)){
            /**
             * 版本一
             */
            for(int i = 0; i < n; ++ i){
                for(int j = 0; j < n; ++j){
                    if(j+1 == n){
                        break;
                    }
                    if(a[j] > a[j+1]){
                        int tmp = a[j];
                        a[j] = a[j + 1];
                        a[j+1] = tmp;
                    }
                }
            }
        }else {
            /**
             * 版本二
             */
            for(int i = 0; i < n; ++ i){
                boolean flag = false;
                for(int j = 0; j < n - i - 1; ++j){
                    
                    if(a[j] > a[j+1]){
                        int tmp = a[j];
                        a[j] = a[j + 1];
                        a[j+1] = tmp;
                        flag = true;
                    }
                }

                if(!flag){
                    break;
                }

            }
        }  
    }

    public static void main(String args[]){
        int[] s = {4,5,6,3,2,1};
        BubbleSort b = new BubbleSort();

        b.bubbleSort(s, s.length,"v2");

        for (int i : s) {
            System.out.println(i);
        }

    }
}