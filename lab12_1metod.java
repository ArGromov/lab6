import java.util.Arrays;

public class lab12_1metod {

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        int size = 10000000;
        int half = size /2;
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(float)(arr[i]* Math.sin(0.2f + i/5)*Math.cos(0.2f+i/5)*Math.cos(0.4f +i/2));
        } System.out.println("Время работы метода 1: "+(System.currentTimeMillis()-a));
    } }
