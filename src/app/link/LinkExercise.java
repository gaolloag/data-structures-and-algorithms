package app.link;

class LinkExercise<E> {
    class Node<T> {
        private Node<T> next;
        private T data;

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

    private Node<E> link;

    public void testNodeAdd(E str){
        Node<E> node = new Node<E>(str);
        if(link == null){
            link = node;
        }else{
            link.add(node);
        }
    }

    public Node<E> find(E e){
        while(this.link.next != null){
            if(e.equals(link.data)){
                return link;
            }
        }
        return null;
    }

    public void delete(E e){
        Node<E> prve = null;

        if(e.equals(link.data)){
            link = link.next;    
        }else{
            while(link != null){
                prve = link;
                Node<E> temp = link.next;
                
                if(temp == null){
                    System.out.println("未找到节点");
                }
    
                if(e.equals(temp.data)){
                    prve.next = temp.next;
                    break;
                }
                link = link.next;
            }
        }

       
        play();

    }

    public void play(){
        Node<E> temp = link;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("");
    }

    public void play(Node<E> nodes){
        Node<E> temp = nodes;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("");
    }

    public Node<E> reverse(Node<E> node){
        Node<E> prev = null;
        Node<E> next = null;
        while(node != null){
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;

    } 

    public static void main(String args[]){
        LinkExercise<String> t1 = new LinkExercise<String>();
        t1.testNodeAdd("a");
         t1.testNodeAdd("b");
        t1.testNodeAdd("c");
        t1.testNodeAdd("d");
        t1.play(t1.reverse(t1.link));

        
    }
}


