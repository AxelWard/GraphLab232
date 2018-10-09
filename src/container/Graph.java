package container;

public class Graph {
    Node[] nodeArray;
    int size;

    Graph() {
        size = 0;
    }

    public void expandArray() {
        if(nodeArray == null) {
            nodeArray = new Node[1];
            nodeArray[0] = new Node();
            size++;
        } else {
            Node[] tempArray = new Node[size+1];
            for(int copy = 0; copy < size; copy++) {
                tempArray[copy] = nodeArray[copy];
            }
            tempArray[size+1] = new Node();
            nodeArray = tempArray;
            size++;
        }
    }

    public void addNode(int location, int addValue) {
        if(nodeArray[location].getValue() == -1) {
            nodeArray[location].setValue(addValue);
        } else {
            nodeArray[location].setNext(new Node());
            nodeArray[location].getNext().setValue(addValue);
        }
    }


}
