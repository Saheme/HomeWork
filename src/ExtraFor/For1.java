package ExtraFor;

public class For1 {

        public static void main(String[] args) {
            int n = 10;
            int[] array = new int[n];
            for (int i = 1; i <= n; i++) {
                array[i-1] = i;
            }
            for (int i = 0; i < n; i++) {
                System.out.println (array[i]);
            }

        }

}
