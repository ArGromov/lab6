import java.util.ArrayList;
import java.util.Scanner;

//Горохов АА ПИ-19-1 вариант по номеру в списке группы - шестой
/*Задание: Базовый класс – файл. Производные – звуковой файл и видео-файл. Создать класс Каталог, который может
содержать оба вида объектов. Предусмотреть метод подсчета отдельно звуковых и видео-файлов */

class file{
    String name;
    String path;
    file(String name, String path){
        this.name= name;
        this.path=path;
    }
    @Override
    public String toString() {
        return "file{" +
                "Название: '" + name + '\'' +
                ", путь к файлу: '" + path + '\'' +
                '}';
    }
}
class musicFile extends file{
    musicFile(String name, String path) {
        super(name, path);
    }
    @Override
    public String toString() {
        return "Музыкальный файл{" +
                "Название: '" + name + '\'' +
                ", путь к файлу: '" + path + '\'' +
                '}';
    }
}

class videoFile extends file{
    videoFile(String name, String path) {
        super(name, path);
    }
    @Override
    public String toString() {
        return "Видеофайл{" +
                "Название: '" + name + '\'' +
                ", путь к файлу: '" + path + '\'' +
                '}';
    }
}

class Package{
    private ArrayList<file> masCar=new ArrayList<file>();
    public void addFile(file m){
        masCar.add(m); }
    public void printFiles() {
        System.out.println("В каталоге: ");
        for (file a : masCar) {
            System.out.println("\t" + a.toString()); } }

    public void numberOfMusicFiles(){
        int kolMus=0;
        for (file a : masCar) {
            if (a instanceof musicFile) {
                kolMus+=1; } }
        System.out.println("Количество музыкальных файлов "+ kolMus); }
    public void numberOfVideoFiles(){
        int kolVideo=0;
        for (file a : masCar) {
            if (a instanceof videoFile) {
                kolVideo+=1; } }
        System.out.println("\t" +"Количество видеофайлов "+ kolVideo); } }

public class task2lab9 {
        public static void main(String[] args) {
            Package Meoww = new Package();
            Scanner sc = new Scanner(System.in);
            System.out.println("\t" +"Введите количество музыкальных файлов");
            int kolmusic= sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < kolmusic; i++) {
                System.out.println("Введите название музыкального файла ");
                String name = sc.nextLine();
                System.out.println("Укажите путь к музыкальному файлу");
                String path = sc.nextLine();
                musicFile music1 = new musicFile(name,path);
                Meoww.addFile(music1); }
            System.out.println("Введите количество видеофайлов");
            int kolvideo= sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < kolvideo; i++) {
                System.out.println("Введите название видеофайла");
                String name = sc.nextLine();
                System.out.println("Укажите путь к видеофайлу");
                String path = sc.nextLine();
                videoFile video1 = new videoFile(name,path);
                Meoww.addFile(video1); }
            Meoww.printFiles();
            Meoww.numberOfMusicFiles();
            Meoww.numberOfVideoFiles(); } }
