import java.util.Arrays;

class Test1 implements Runnable{
    Thread thrd; float[] general;
    Test1(String name,float[] general){
        this.general = general;
        thrd = new Thread(this,name); thrd.start(); }

    @Override
    public void run() {
        System.out.println(thrd.getName()+ " запущено");
        try { for (int i = 0; i < general.length; i++)
        { general[i]=(float)(general[i]* Math.sin(0.2f + i/5)*Math.cos(0.2f+i/5)*Math.cos(0.4f +i/2)); }
        } catch (Exception exc)
        { System.out.println(thrd.getName()+ " - прервано"); }
        System.out.println(thrd.getName()+ " - завершено"); } }

public class lab12_2metod {
    public static void main(String[] args) throws InterruptedException {

        long a = System.currentTimeMillis();
        int size = 10000000;
        int halfSize = size /2;
        float[] general =new float[size];
        float[] first = new float[halfSize];
        float[] second= new float[halfSize];

        Arrays.fill(general,1);

        System.arraycopy(general,0,first,0,halfSize);
        System.arraycopy(general,0,second,0,halfSize);

        Test1 t1 = new Test1("1 поток",first);
        Test1 t2 = new Test1("2 поток",second);
        t1.thrd.join();
        t2.thrd.join();

        System.arraycopy(first,0,general,0,halfSize);
        System.arraycopy(second,0,general,halfSize,halfSize);

        System.out.println("Время работы метода:"+(System.currentTimeMillis()-a));
        System.out.println("Завершение основного потока");
        System.out.println(first.length);
        System.out.println(second.length);
        System.out.println(general.length);
    } }
