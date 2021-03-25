import java.util.Scanner;

public class Gugudan {
	
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] calculate(int number, int gugudanRange) {
		int[] result = new int[gugudanRange];
		for(int i = 0; i < result.length; i++) {
			result[i] = number * (i + 1);
		}
		return result;
	}
	
	public static int[] getInput() {
		System.out.println("숫자를 입력하세요.(ex : num1,num2)");
		Scanner scanner = new Scanner(System.in);
		String inputValue;
		inputValue = scanner.nextLine();
		String[] splitInput = inputValue.split(",");
		int first = Integer.parseInt(splitInput[0]);
		int second = Integer.parseInt(splitInput[1]);
		int[] result = {first, second};
		return result;
	}
	
	public static void main(String[] args) {
		int[] input = getInput();
		for(int i = 2; i <= input[0]; i++) {
			int[] result = calculate(i, input[1]);
			print(result);
		}
	}
}