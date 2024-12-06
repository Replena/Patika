
public class Main {

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20, 18, 7, 7};

        int[] fr = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited;
                }
            }

            if (fr[i] != visited) {
                fr[i] = count;
            }
        }

        System.out.println("Tekrar Sayıları:");
        for (int i = 0; i < arr.length; i++) {
            if (fr[i] != visited) {
                System.out.println(arr[i] + " sayısı " + fr[i] + " kere tekrar edildi.");
            }
        }
    }
}
