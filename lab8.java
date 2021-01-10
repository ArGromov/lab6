class People 
{
    String firstname, lastname;
    int age;
    void allgemeine(){ System.out.println("Фамилия: " + this.lastname +", имя: " + this.firstname +", возраст: " + this.age);}
    void walk(){ System.out.println("Человек-прямоходящий"); }
    void voice(){ System.out.println("Человвек-говорящий"); }
    void run(){ System.out.println("Человек-бегающий"); }
    People(){ firstname= "Zero"; lastname = "Zerovich"; age = 0; }
    People(String firstname, String lastname, int age ) { this.age=age; this.lastname=lastname; this.firstname=firstname; } 
}
    
class Student extends People
{
    Student(String firstname, String lastname, int age ){ super(firstname, lastname, age); }
    void learn(){ System.out.println("Халява приди"); }
}

class Teacher extends People
{
    Teacher(String firstname, String lastname, int age ){ super(firstname, lastname,age); }
    void teach(){ System.out.println("Халява не придёт"); }
}

public class lab8 {
    public static void main(String[] args) {
        People DefaultMen = new People();
        DefaultMen.allgemeine();
        System.out.println();

        People Ivan = new People("Ivan","Sidorov",25 );
        Ivan.allgemeine();
        Ivan.walk();
        System.out.println();

        Student Vasya = new Student("Vasya","Pupkin",30);
        Vasya.allgemeine();
        Vasya.voice();
        Vasya.learn();
        System.out.println();

        Teacher Andrey= new Teacher("Andrey","Petrow",35);
        Andrey.allgemeine();
        Andrey.run();
        Andrey.teach();
        System.out.println();
    }
}