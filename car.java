public class car extends Auto{//файл car.java
    private String model;
    private int numDoors;
    private Boolean fullTime; //полный привод
    public car(){
        super();// вызываем конструктор класса-родителя без параметров (см. класс Auto)
        model=""; // добавляем инициализацию новых членов
        numDoors=4;
        fullTime=false;
    }

    public car(String firma, int speed, String name, int n, Boolean f){
        super(firma,speed);
        model=name; // добавляем инициализацию новых членов
        numDoors=n;
        fullTime=f;
    }
    public void setModel(String name){
        model=name;
    }
    public String getModel(){
        return model;
    }
    public void setNumDoors(int n){
        numDoors=n;
    }
    public int getNumDoors(){
        return numDoors;
    }
    public void setFullTime(Boolean b){
        fullTime=b;
    }
    public Boolean isFullTime(){
        return fullTime;
    }
    public String toString(){
        return getFirm()+" "+getMaxSpeed()+" "+model+" "+numDoors+" "+fullTime;
    }
}