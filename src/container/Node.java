package container;

public class Node {

    Node next;
    int value;

    Node() {
        this.value = -1;
        this.next = null;
    }

    public int getValue() {
        return(this.value);
    }

    public Node getNext() {
        return(this.next);
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }

    public void setValue(int newValue) {
        this.value = newValue;
    }

}
