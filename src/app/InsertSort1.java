package app;
public class InsertSort1{

    public void sort(int a[],int n){
        if(n <= 1){
            return ;
        }


        for(int i = 1; i < n ; i ++){
            int value = a [i];

            int j = i - 1;
            for(;j >= 0; j --){
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
        int [] a = {6,7,4,1,10,3};

        InsertSort1 sort = new InsertSort1();
        sort.sort(a, a.length);

        for(int v: a){
            System.out.println(v);
        }
    }


}