public class Queue <N>{
    Node<N> first; // creating an instance variables for the first node in the queue
    Node<N> last; // last stack in the queue
    int size = 0; // size counter variable

    public void Queue() { // creating an empty constructor
    }

    void enqueue(N element){ // creating the enqueue method
        Node<N> node = new Node<>(element); // making a node
        if(last == null){ // testing if the queue is empty
            first = node; // setting the first to node
            last = node; // setting the last to node
        } else { // creating an else statement
            last.setChild(node); // setting the last node to the new one
            last = node; // setting node to last
        }
        size++; // updating size
    }

     N dequeue(){ // creating a dequeue method
        if(first != null) { // checking to see if the queue is null
            N data = first.getData(); // setting the data from first
            first = first.getChild(); // setting first to the next node
            size--; // decreasing size
            return data; // returning the value of first
        } else { // creating an else statement
            return null; // returning null
        }
    }

    N peek(){ // creating a peek method
        if(first != null){ // seeing if the queue is null
            return first.getData(); // returning the data from first
        }else{ // creating an else statement
            return null; // returning null
        }
    }

    boolean isEmpty(){ // creating an isEmpty boolean method
        if (size == 0 && last == null && first == null){ // returning if it is empty
            return true; // returning true
        } else { // if not null
            return false; // returning false
        }
    }

   int size(){ // creating a size method
        return size; // returning the size of the queue
    }
}
