import java.util.Arrays;
import java.util.Scanner;

class Triangle{
    int a,b,c;
    int UslovieExist= 1;
    Triangle(int a, int b, int c){
        if (a+b>c & a+c>b & b+c>a){ this.a=a; this.b=b; this.c=c; }
        else { UslovieExist= 0; System.out.println("Такого треугольника нет в природе!"); } }
    int Perimetr(){ return a+b+c; }
    double Square(){ double p = ((double) a + (double) b + (double) c) / 2;
    return Math.sqrt(p*(p-a)*(p-b)*(p-c)); } }

class Rectangle{
    int a,b;
    Rectangle(int a, int b){ this.a=a; this.b=b; }
    public String getAandB() { return a+" " + b; }

    int Perimetr(){ return 2*a+2*b; }
    int Square(){ return a*b; } }

class workWithArrays{ int[] arr; int n;
    workWithArrays(int n){ this.n=n; arr = new int[n]; }
    void inputArr(){ Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            this.arr[i]= sc.nextInt(); } }
    void outputArr(){
        for (int value : arr) {
            System.out.println(value); } }
    void sortArr1(){ Arrays.sort(arr); }
    void sortArr2(){
        Arrays.sort(arr);
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int rab = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = rab;
                } } } } }



public class lab11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте стороны треугольника");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Triangle qwerty = new Triangle(a,b,c);
        if (qwerty.UslovieExist==1) {
            System.out.println("Периметр: " + qwerty.Perimetr() + "\n Площадь: " + qwerty.Square());
        }

        System.out.println("Задайте стороны прямоугольника");
        int meowA = sc.nextInt();
        int meowB = sc.nextInt();
        Rectangle meow = new Rectangle(meowA,meowB);
        System.out.println("Длина сторон: "+ meow.getAandB()+"\n Периметр: " + meow.Perimetr() + "\n Площадь: " + meow.Square());

        workWithArrays w = new workWithArrays(9);
        System.out.println("Ввод массива: ");
        w.inputArr();
        w.sortArr2();
        w.outputArr();

    }
}