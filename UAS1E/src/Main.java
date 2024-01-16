import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> d = new ArrayList<>();

        int[] h = {24, 56, 71, 34, 25, 54, 17};

        for (int f : h) {
            splitAndAddToArrayList(f, d);
        }

        for (int b : d) {
            System.out.println(b); // Output will be the separated odd digits
        }
    }

    // Method to split the number into two digits if it's odd and add to ArrayList
    private static void splitAndAddToArrayList(int num, ArrayList<Integer> arrayList) {
        if (num % 2 == 1) {
            arrayList.add(num / 10); // Adding the first digit
            arrayList.add(num % 10); // Adding the second digit
        }
    }
}