import java.util.ArrayList;
import java.util.Scanner;

class Auto {
    private String firm; //создаем закрытый член нашего класса с названием фирмы автомобиля
    private String nom;
    private int maxSpeed; // закрытый член класса, содержащий максимальную скорость
    public void setFirm(String firma){ //открытая функция (метод класса) для задания
        firm=firma; //значения фирмы автомобиля
    }
    public void setMaxSpeed(int speed){ //открытая функция (метод класса) для задания
        maxSpeed=speed; //значения максимальной скорости автомобиля
    }
    public int getMaxSpeed(){ //открытая функция (метод класса) для вывода значения
        return maxSpeed; //максимальной скорости
    }
    public String getFirm(){ //открытая функция (метод класса) для вывода значения
        return firm; //заданной фирмы
    }
    public Auto(){ // конструктор класса (без параметров)
        firm="Без названия";
        maxSpeed=0;
    }
    public Auto(String firma, int speed){ //конструктор класса (с параметрами)
        firm=firma;
        maxSpeed=speed;
    }
    public Auto(String nomer){ //конструктор класса (с параметрами)
        nom=nomer;
    }
}

    class Garagecar {
    private ArrayList<Auto> mascar=new ArrayList<Auto>();//массив с машинами
    public void addcar(Auto m){//метод для добавления машины в гараж
        mascar.add(m);
    }
    public Garagecar (){
    }
    public Boolean findcar(Auto m){ //для выяснения – есть ли машина m в гараже
        return mascar.contains(m);
    }
    public Garagecar(ArrayList< Auto> n){//конструктор для внесения существующего списка машин
//в гараж
        mascar=n;
    }
    public void printGarage() { //для вывода на экран списка машин в гараже
        System.out.println("В гараже: ");
        for (Auto a:mascar){ //
            System.out.println("\t"+a.toString());
        }
    }
}


public class task1lab9 {

    public static void main(String[] args) {
        Garagecar myGarage=new Garagecar(); //создаем новый гараж
        car mycar1=new car("Ford", 200, "Mustang", 2,false); //создаем легковую машину
        myGarage.addcar(mycar1); // добавляем ее в гараж
        myGarage.addcar(new car("LADA", 140, "Kalina", 4, false));//добавляем еще одну машину
        truck mytruck=new truck("Dove",160,"DTS",700,true);//создаем грузовик
        myGarage.addcar(mytruck); //добавляем его в гараж
        myGarage.printGarage(); //выводи на экран содержимое гаража
        if (myGarage.findcar(mycar1)) { //ищем машину
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }
    }

}
