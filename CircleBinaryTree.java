/* 

Explanation: The program defines three classes: Circle, BST, and BSTNode. 
The Circle class defines a circle object with three attributes: radius, x-coordinate, and y-coordinate. 
The class also implements the Comparable interface, which allows circles to be compared based on their radius. 
This is used to order the elements in the binary search tree. 

The BSTNode class defines a node in the binary search tree. 
Each node contains an element of type T (which can be any type that 
implements Comparable) and two pointers to its left and right children. 

The BST class defines a binary search tree. It contains a root pointer 
that points to the root node of the tree. The class provides methods 
to insert new elements into the tree, search for elements in the tree, 
and display all elements in the tree. 

The insert method of the BST class inserts a new element into the tree based on its ordering 
relative to the other elements already in the tree. It does this by 
traversing the tree from the root node and comparing the new element 
to the elements at each node along the way until it finds an appropriate 
place to insert the new element. 

The search method of the BST class searches for a given element in the tree by traversing the tree from 
the root node and comparing the given element to the elements at each
node along the way until it either finds the element or reaches a 
leaf node (i.e., a node with no children) that does not contain the element. 

The inorder method of the BST class traverses the tree in-order 
(i.e., left subtree, root, right subtree) and prints out all the 
elements in the tree in ascending order based on their 
ordering (i.e., radius). 

The main method of the program provides a menu for the user to interact with the binary search tree. 
The user can add new circle objects to the tree, search for circle objects in the tree, 
display all circle objects in the tree, and exit the program. 
The program uses a Scanner object to read input from the user 
and a switch statement to execute the appropriate action based on the user's choice. 

*/


import java.util.Scanner;

public class CircleBinaryTree {
    public static void main(String[] args) {
        BST<Circle> circleTree = new BST<>();

        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add Circle Object to Binary Tree");
            System.out.println("2. Search for Circle Object in Binary Tree");
            System.out.println("3. Display all Binary Tree Circle Objects");
            System.out.println("4. Exit");

            int choice = userInput.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Circle Object (radius, x, y):");
                    double radius = userInput.nextDouble();
                    double x = userInput.nextDouble();
                    double y = userInput.nextDouble();
                    Circle circle = new Circle(radius, x, y);
                    circleTree.insert(circle);
                    System.out.println("Circle Object added to Binary Tree.");
                    break;
                case 2:
                    System.out.println("Enter Circle Object to search for (radius, x, y):");
                    radius = userInput.nextDouble();
                    x = userInput.nextDouble();
                    y = userInput.nextDouble();
                    circle = new Circle(radius, x, y);
                    Circle foundCircle = circleTree.search(circle);
                    if (foundCircle == null) {
                        System.out.println("Circle Object not found in Binary Tree.");
                    } else {
                        System.out.println("Circle Object found in Binary Tree: " + foundCircle);
                    }
                    break;
                case 3:
                    System.out.println("All Circle Objects in Binary Tree:");
                    circleTree.inorder();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

class Circle implements Comparable<Circle> {
    private double radius;
    private double x;
    private double y;

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + ", x=" + x + ", y=" + y + "}";
    }

    @Override
    public int compareTo(Circle other) {
        if (this.radius < other.radius) {
            return -1;
        } else if (this.radius > other.radius) {
            return 1;
        } else {
            return 0;
        }
    }
}

class BSTNode<T> {
    T el;
    BSTNode<T> left;
    BSTNode<T> right;

    public BSTNode(T el) {
        this.el = el;
        this.left = null;
        this.right = null;
    }
}

class BST<T extends Comparable<T>> {
    private BSTNode<T> root;

    public BST() {
        root = null;
    }

    public void insert(T el) {
        BSTNode<T> p = root, prev = null;
        while (p!= null) { // find a place for inserting new node;
            prev = p;
            if (el.compareTo(p.el) < 0)
                p = p.left;
            else
                p = p.right;
        }

        if (root == null) // tree is empty;
            root = new BSTNode<T>(el);
        else if (el.compareTo(prev.el) < 0)
            prev.left = new BSTNode<T>(el);
        else
            prev.right = new BSTNode<T>(el);
    }

    public T search(T el) {
        return search(root, el);
    }

    private T search(BSTNode<T> node, T el) {
        if (node == null) {
            return null;
        } else if (node.el.compareTo(el) == 0) {
            return node.el;
        } else if (node.el.compareTo(el) < 0) {
            return search(node.right, el);
        } else {
            return search(node.left, el);
        }
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(BSTNode<T> node) {
        if (node!= null) {
            inorder(node.left);
            System.out.println(node.el);
            inorder(node.right);
        }
    }
}