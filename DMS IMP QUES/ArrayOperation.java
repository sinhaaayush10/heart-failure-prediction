public class ArrayOperation {
    public static void main(String[] args) {
        ArrayADT arr = new ArrayADT(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(264);
        System.out.print("Array Size: "+ arr.getSize());

        arr.traverse();
    }
    
}
