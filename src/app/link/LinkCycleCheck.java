package app.link;
/**
 * 链表环检查
 * 
*/

public class LinkCycleCheck{
    class Node<T> {
        Node<T> next;
        T data;

        public Node(T t){
            this.data = t;
        }

        public void add(Node<T> node){
            if(this.next == null){
                this.next = node;
            }else{
                this.next.add(node);
            }
        }
    }

    private Node<String> link;
    Node<String> cycle = null;

    /**
     * 创建链表环
     * 
    */
    public void buildCycle(){

        link = new Node<String>("a");
        link.add(addNode("b"));
        link.add(addNode("c"));
        cycle = link.next;
        
        link.add(addNode("d"));
        link.add(cycle);
    }

    public void play(Node<String> nodes){
        Node<String> temp = nodes;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("");
    }

    private Node<String> addNode(String str){

        return new Node<String>(str);
    }

    public static void main(String args[]){
        LinkCycleCheck cycle = new LinkCycleCheck();
        cycle.buildCycle();
        cycle.play(cycle.link);
    }

}