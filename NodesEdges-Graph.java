// this program demonstrates how nodes and edges function
// by using object oriented programming

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Graph graph = new Graph();

        System.out.println("Enter the number of nodes:");
        int numNodes = userInput.nextInt();

        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter the name of node " + (i + 1) + ":");
            String nodeName = userInput.next();
            graph.addNode(new Node(nodeName));
        }

        System.out.println("Enter the number of edges:");
        int numEdges = userInput.nextInt();

        for (int i = 0; i < numEdges; i++) {
            System.out.println("Enter the source node of edge " + (i + 1) + ":");
            String srcNode = userInput.next();
            System.out.println("Enter the destination node of edge " + (i + 1) + ":");
            String dstNode = userInput.next();

            int srcIndex = -1;
            int dstIndex = -1;

            for (int j = 0; j < graph.alist.size(); j++) {
                if (graph.alist.get(j).get(0).data.equals(srcNode)) {
                    srcIndex = j;
                }
                if (graph.alist.get(j).get(0).data.equals(dstNode)) {
                    dstIndex = j;
                }
            }

            if (srcIndex != -1 && dstIndex != -1) {
                graph.addEdge(srcIndex, dstIndex);
            } else {
                System.out.println("Invalid node. Please try again.");
                i--;
            }
        }

        graph.print();
    }
}


class Graph {

    ArrayList<LinkedList<Node>> alist;

    Graph(){
        alist = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);

        for(Node node : currentList) {
            if(node == dstNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for(LinkedList<Node> currentList : alist) {
            for(Node node : currentList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}


class Node {

    String data;

    Node(String data){
        this.data = data;
    }
}


/*
 
Example Output

Enter the number of nodes:
3
Enter the name of node 1:
star
Enter the name of node 2:
light
Enter the name of node 3:
twinkle
Enter the number of edges:
3
Enter the source node of edge 1:
star
Enter the destination node of edge 1:
light
Enter the source node of edge 2:
light
Enter the destination node of edge 2:
twinkle
Enter the source node of edge 3:
twinkle
Enter the destination node of edge 3:
star
star -> light -> 
light -> twinkle -> 
twinkle -> star -> 
 * 
 * 
 */