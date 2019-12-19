package app.stack;

public class ArrayStack{
    private String[] items; //栈数组
    private Integer n; //栈大小
    private Integer count; //栈个数

    public ArrayStack(Integer n){
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    public void push(String str){
        if(count == n){
            return;
        }

        items[count ++] = str;

    }

    public String pop(){

        if(count == 0){
            return null;
        }
        String str = items[--count];
        return str;
    }

    public static void main(String args[]){
        ArrayStack s = new ArrayStack(10);
        s.push("a");
        s.push("b");
        s.push("c");
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
