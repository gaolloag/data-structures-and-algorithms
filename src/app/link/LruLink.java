package app.link;

public class LruLink{

    class Node<T>{
        T data;
        Node<T> next;

        Node (T data){
            this.data = data;
        }

        public void add(Node<T> node){
            if(this.next == null){
                this.next = node;
            }else{
                this.next.add(node);
            }
        }

        public Node<T> search (T t){
            if(this != null && t.equals(this.data) ){
                return this;
            }

            if(this.next == null){
                return null;
            }

            return this.next.search(t);
            
        }
       

    }

    private Node<String> n = null;

    public void add(String str) {
        Node<String> newNode = new Node<String>(str);
        if(n == null){
            this.n = newNode;
            this.n.next = null;
        }else{
            this.n.add(newNode);
        }

    }

    public void find(String str){
        Node<String> node = this.n.search(str);
        System.out.println(node.data);
    }

    public void addHead(String str){
        
    }

    public void display(){
        Node<String> node = n;
        while(true){
            if(node == null){
                break;
            }
            System.out.print( node.data + "->");
            node = node.next;
         
        }
    }

    public static void main(final String args[]) {

        LruLink l = new LruLink();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");

        l.display();

        System.out.println();
        l.find("d");


    }
}