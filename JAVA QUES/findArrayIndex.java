import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter Size Of Array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int[size];


		//input
		for(int i=0; i<size; i++) {
			numbers[i] = sc.nextInt();
		}

		System.out.print("Enter No to find: ");
		int x = sc.nextInt();
		System.out.print("Array is found at indeces at: ");

		//output
		for(int i =0; i<numbers.length; i++) {
			if(numbers[i] == x)
				System.out.print(i+" ");
		}
	}
}