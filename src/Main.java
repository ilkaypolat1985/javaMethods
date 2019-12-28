public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        int findNumber = 5;

        if (findNumber(numbers, findNumber)) {
            printMessage(findNumber + " is in numbers");
        } else {
            printMessage(findNumber + " is not in numbers");
        }
    }

    public static boolean findNumber(int[] numbers, int findNumber) {
        for (int number : numbers) {
            if (number == findNumber) return true;
        }
        return false;
    }

    public static void printMessage(String message){
        System.out.println(message);
    }
}
