public class shaiker {

    static int[] pool = {4,8,10,-41,51,75,22,156,0,777};
    public static void cocktailSort(int[] pool) {
        int size = pool.length;
        boolean swapped = false;
        for (int k = size - 1; k > 0; k--) {
            swapped = false;
            for (int i = k; i > size - 1 - k; i--)
                if (pool[i] < pool[i-1]) {
                    // swap
                    int temp = pool[i];
                    pool[i] = pool[i-1];
                    pool[i-1] = temp;
                    swapped = true;
                }

            for (int i = size - k; i < k; i++) //двигаемся слева направо
                if (pool[i] > pool[i+1]) {
                    // swap
                    int temp = pool[i];
                    pool[i] = pool[i+1];
                    pool[i+1] = temp;
                    swapped = true;
                }

            if (!swapped)
                break;
        }

    }
    public static void main(String[] args) {


    cocktailSort(pool);
        for (int i = 0; i <pool.length ; i++) {
            System.out.print(pool[i]+" ");
        }
    }
}
