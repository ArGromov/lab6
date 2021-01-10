import java.io.*;
import java.util.Scanner;

//Горохов АА ПИ-19-1 вариант по номеру в списке группы - шестой
/*Задание: Записать в исходный файл информацию о горах:
Название, место_расположения, высота
Количество гор задать с клавиатуры.
Создать программным способом другой файл и переписать в него информацию о горах, расположенных в Африке
Способ с произвольным доступом*/

public class lab7_proizvol_dostup {

    public static void main(String[] args) throws IOException{
        Scanner scaner1 = new Scanner(System.in);
        System.out.println("Количество гор в таблице: ");
        int count = scaner1.nextInt();
        scaner1.nextLine();
        RandomAccessFile raf1, raf2;
        String MOUNTname, MOUNTplace, MOUNTheig, LocationOnDrive1 = "D:\\Afrikas_Berge1.txt", LocationOnDrive2 = "D:\\Afrikas_Berge2.txt";
        try{
            File file1 = new File(LocationOnDrive1);
            File file2 = new File(LocationOnDrive2);
            raf1 = new RandomAccessFile(file1, "rw");
            raf2 = new RandomAccessFile(file2, "rw");

            for (int i = 0; i < count; i++) {
                System.out.println("Введите название горы: ");
                MOUNTname = scaner1.nextLine();
                raf1.writeUTF(MOUNTname);
                for (int j = 0; j < 20 - MOUNTname.length(); j++) { raf1.writeByte(1); }

                System.out.println("Введите адрес местонахождения горы: ");
                MOUNTplace = scaner1.nextLine();
                raf1.writeUTF(MOUNTplace);
                for (int j = 0; j < 20 - MOUNTplace.length(); j++) { raf1.writeByte(1); }

                System.out.println("Введите высоту горы: ");
                MOUNTheig = scaner1.nextLine();
                raf1.writeUTF(MOUNTheig);
                for (int j = 0; j < 20 - MOUNTheig.length(); j++) { raf1.writeByte(1); }

                System.out.println();
                if (MOUNTname.equals("Африка")){
                    raf2.writeUTF(MOUNTname);
                    for (int j = 0; j < 20 - MOUNTname.length(); j++) raf2.writeByte(1);
                    raf2.writeUTF(MOUNTplace);
                    for (int j = 0; j < 20 - MOUNTplace.length(); j++) raf2.writeByte(1);
                    raf2.writeUTF(MOUNTheig);
                    for (int j = 0; j < 20 - MOUNTheig.length(); j++)raf2.writeByte(1);
                } } } catch (Exception e){
            e.printStackTrace(); }

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
    } } }
