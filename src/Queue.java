public class Queue <N>{
    Node<N> first;
    Node<N> last;
    int size;

    public void Queue() {
        size = 0;
    }

    void enqueue(N element){
        Node<N> node = new Node<>(element);
        if(size == 0){
            node = first;
        } else {
            last.setChild(node);
        }
        last = node;
        size++;
    }

     N dequeue(){
        N value = first.getData();
        first = first.getChild();
        size --;
        return value;
    }

    N peek(){
        return first.getData();
    }

    boolean isEmpty(){
        return size == 0;
    }

   int size(){
        return size;
    }
}
