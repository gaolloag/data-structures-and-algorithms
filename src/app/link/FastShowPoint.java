/**
 * 链表快慢针
 * 
*/
package app.link;

class FastShowPoint{
    class Node<T>{
        T data;
        Node<T> next;

        public Node(T t){
            this.data = t;
            this.next = null;
        }
        
        public void add(Node<T> node){
            if(this.next == null){
                this.next = node;
            }else{
                this.next.add(node);
            }
        }
    }
    private Node<String> link = null;
    private Node<String> fast = null;
    private Node<String> show = null;
    private Node<String> perv = null;

    public void addtion(String str){

        Node<String> node = new Node<String>(str);
        if(link == null){
            link = node;
        }else{
            this.link.add(node);
        }
        
    }
    public boolean speed(Node<String> links){
        this.fast = links;
        this.show = links;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            Node<String> next = show.next;
            show.next = perv;
            /**
             * 为什么可以建立回路？如何做到反向？
            */
            perv = show;
            show = next;
            //print(perv);
        }

        if(fast != null){
            show = show.next;
        }

       
        while(show != null){
            if(!show.data.equals(perv.data)){
                return false;
            }
            show = show.next;
            perv = perv.next;
        }

        return true;
    }
    public Node<String> getLink(){
        return this.link;
    }

    public void print(Node<String> node){
        while(true){
            
            System.out.print(node.data + "->");
            if(node.next == null){
                break;
            }
            node = node.next;
        }

        System.out.println();
    }

    public void print(){
        Node<String> current = link;
        while(true){
            
            System.out.print(current.data + "->");
            if(current.next == null){
                break;
            }
            current = current.next;
        }

        System.out.println();

    }

    public static void main(String args[]){
        FastShowPoint fsp = new FastShowPoint();
        fsp.addtion("a");
        fsp.addtion("i");
        fsp.addtion("d");
        fsp.addtion("i");

        //fsp.print();
        Node<String> link = fsp.getLink();
        boolean r = fsp.speed(link);

        System.out.println(r);


    }

}