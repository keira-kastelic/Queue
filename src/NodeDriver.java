public class NodeDriver {
    public static void main(String[] args) {
        // Testing all the node constructors using different data types
        Node <String> n1 = new Node<>("Hello");
        Node <Integer> n2 = new Node<>();
        Node <String> n3 = new Node<>(n1, n2, "oop");
        Node <Integer> n4 = new Node<>(2);

        // printing out all the nodes
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

        // testing the node methods
        // testing the mutator methodsg
        n2.setData(7);
        n4.setParent(n2);
        n2.setChild(n4);
        // testing the accessor methods
        System.out.println("getChild test = " + n2.getChild());
        System.out.println("getParent test = " + n1.getParent());
        System.out.println("getData test = " + n3.getData());
        
    }
}
