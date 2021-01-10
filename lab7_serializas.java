import java.io.*;
import java.util.Scanner;

//Горохов АА ПИ-19-1 вариант по номеру в списке группы - шестой
/*Задание: Записать в исходный файл информацию о горах:
Название, место_расположения, высота
Количество гор задать с клавиатуры.
Создать программным способом другой файл и переписать в него информацию о горах, расположенных в Африке
Способ с сереализацией*/

class Mountain implements Serializable {
    String MOUNTname;
    String MOUNTlocation;
    String MOUNTheight;
}

public class lab7_serializas {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Scanner scaner1=new Scanner(System.in);
        File LocationOnDrive1=new File("D:\\Afrikas_Berge1.txt");
        File LocationOnDrive2=new File("D:\\Afrikas_Berge2.txt");
        if (LocationOnDrive2.exists()) {LocationOnDrive2.delete(); }
        LocationOnDrive2.createNewFile();
        if (LocationOnDrive1.exists()) {LocationOnDrive1.delete();}
        LocationOnDrive1.createNewFile();
        System.out.println("Количество гор в таблице: ");
        int kolvo = scaner1.nextInt();
        int kolAfrika=0;
        FileOutputStream a = new FileOutputStream(LocationOnDrive1);
        ObjectOutputStream b = new ObjectOutputStream(a);
        FileOutputStream fOSLocationOnDrive2 = new FileOutputStream(LocationOnDrive2);
        ObjectOutputStream oosLocationOnDrive2 = new ObjectOutputStream(fOSLocationOnDrive2);
        Mountain MOUNT = new Mountain();
        scaner1.nextLine();
        for (int i = 0; i < kolvo; i++) {
            MOUNT = new Mountain();
            System.out.println("Введите название горы: ");
            MOUNT.MOUNTname = scaner1.nextLine();
            System.out.println("Введите адрес местонахождения горы:");
            MOUNT.MOUNTlocation = scaner1.nextLine();
            System.out.println("Введите высоту горы: ");
            MOUNT.MOUNTheight = scaner1.nextLine();
            b.writeObject(MOUNT);
            if (MOUNT.MOUNTlocation.equals("Afrika")){
                oosLocationOnDrive2.writeObject(MOUNT);
                kolAfrika+=1; }
            if (MOUNT.MOUNTlocation.equals("Африка")){
                oosLocationOnDrive2.writeObject(MOUNT);
                kolAfrika+=1;
            } }
        FileInputStream fis = new FileInputStream(LocationOnDrive2);
        ObjectInputStream oin = new ObjectInputStream(fis);
        int kol=1;
        System.out.println("Горы по заданным параметрам ->");
        if (kolAfrika!=0){
            for (int i = 0; i < kolAfrika; i++) {
                MOUNT = (Mountain) oin.readObject();
                System.out.println("Гора №"+ kol);
                System.out.println(" Название: "+ MOUNT.MOUNTname);
                System.out.println(" Место: "+ MOUNT.MOUNTlocation);
                System.out.println(" Высота: "+ MOUNT.MOUNTheight);
                System.out.println();
                kol+=1;
            } } else {
            System.out.println("Таких гор не обнаружено"); }
        b.flush();
        b.close();

        System.out.println();
        System.out.println("Вывод всего списка гор,");
        System.out.println("введите да если нужно");
        String ask=scaner1.nextLine();
        if (ask.equals("да")){
            fis = new FileInputStream(LocationOnDrive1);
            oin = new ObjectInputStream(fis);
            for (int i = 0; i < kolvo; i++) {
                MOUNT = (Mountain) oin.readObject();
                System.out.println("Гора №"+ kol);
                System.out.println(" Название: "+ MOUNT.MOUNTname);
                System.out.println(" Место: "+ MOUNT.MOUNTlocation);
                System.out.println(" Высота: "+ MOUNT.MOUNTheight);
                System.out.println();
                kol+=1;
            } }
        oosLocationOnDrive2.flush();
        oosLocationOnDrive2.close();
        Reader in=null;
        Writer out=null;
        try {
            in = new FileReader("D:\\Afrikas_Berge1.txt");
            out= new FileWriter("D:\\Afrikas_Berge2.txt", true);

            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            } } catch (IOException e) {
            System.out.println("Ошибка!!!! "); }
        finally{
            in.close();
            out.close();
        }
    } }
