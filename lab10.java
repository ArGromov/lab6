import java.util.ArrayList;
import java.util.Scanner;

interface Tier {
public void run(int a);
public void jump(double a);
public void swim(int a); }

class Doggy implements Tier {
    public void run(int a) {
        if (a<500){ System.out.println("Doggy can run"); }
        else { System.out.println("Doggy cannot run"); } }
        
    public void swim(int a) {
        if (a<10){ System.out.println("Doggy can swim"); }
        else { System.out.println("Doggy cannot swim"); } }

    public void jump(double a) {
        if (a<0.5){ System.out.println("Doggy can jump"); }
        else { System.out.println("Doggy cannot jump"); }
    } }

class Cat implements Tier {
    public void run(int a) { 
        if (a<200)
    { System.out.println("Cat can run"); }
        else System.out.println("Cat cannot run"); }
        
    public void swim(int a) {
        if (a<=0) { System.out.println("Cat can swim"); }
        else System.out.println("Cat cannot swim"); }

    public void jump(double a) {
        if (a<2){ System.out.println("Cat cam jump"); }
        else System.out.println("Cat cannot jump");

    } }
    
public class lab10 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите животное на проверку:\n Кот или Собакен");
        String name = scan1.nextLine();
        if (name.equals("Собакен")) {
            scan1.nextLine();
            System.out.println("Сколько бежит");
            int distance1 = scan1.nextInt();
            scan1.nextLine();
            System.out.println("Сколько прыгает");
            double distance2 = scan1.nextDouble();
            scan1.nextLine();
            System.out.println("Сколько плывёт");
            int distance3 = scan1.nextInt();
            Doggy VDOG1 = new Doggy();
            VDOG1.run(distance1);
            VDOG1.jump(distance2);
            VDOG1.swim(distance3);
        }
        if (name.equals("Кот")) {
            System.out.println("Сколько бежит");
            int distance1 = scan1.nextInt();
            System.out.println("Сколько прыгает");
            double distance2 = scan1.nextDouble();
            System.out.println("Сколько плывтёт");
            int distance3 = scan1.nextInt();
            Cat VCAT1 = new Cat();
            VCAT1.run(distance1);
            VCAT1.jump(distance2);
            VCAT1.swim(distance3);
        } } }
