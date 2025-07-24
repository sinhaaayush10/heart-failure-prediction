import java.util.Scanner;
class Stack {
    private int size;
    private int[] stackArray;
    private int top;
       public Stack(int maxSize) {
        size = maxSize;
        stackArray = new int[size];
        top = -1; 
    }
        public void push(int value) {
        if (top == size - 1) {
    System.out.println("Stack is full! Cannot add more items.");
        } else {
            top++;
            stackArray[top] = value;
      System.out.println(value + " Added.");
        }
    }
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty! Nothing to remove.");
        } else {
            System.out.println(stackArray[top] + " has been removed from the stack.");
            top--;
        }
    }
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty! No items to show.");
        } else {
            System.out.println("The top item is: " + stackArray[top]);
        }
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack items:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Size Of stack");
        int maxSize = input.nextInt();
        Stack myStack = new Stack(maxSize);
        int choice;
        do {
            System.out.println("\nChoose:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter No: ");
                    int value = input.nextInt();
                    myStack.push(value);
                    break;
                case 2:
                    myStack.pop();
                    break;
                case 3:
                    myStack.peek();
                    break;
                case 4:
                    myStack.display();
                    break;
                case 5:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
        input.close();
    }
}
