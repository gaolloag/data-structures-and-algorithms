package app;

public class BubbleSort1{

    public void sort(int [] a,int n){

        if(n <= 1){
            return ;
        }
        boolean flag = false;
        for(int i = 0; i < n; i ++){
           
            for(int j = 0; j < n - i - 1; j ++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }

            if(!flag){
                break;
            }
        }
    }

    public static void main(String args[]){
        int [] a = {4,5,6,1,2,3};

        BubbleSort1 sort = new BubbleSort1();
        sort.sort(a, a.length);

        for(int v: a){
            System.out.println(v);
        }
    }
}