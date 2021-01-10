import java.io.*;
import java.util.Arrays;
import java.util.Objects;

//Горохов АА ПИ-19-1 вариант по номеру в списке группы - шестой
/*Задание: Создать проект, позволяющий из одного текстового
файла, содержащего несколько строк (тип String) заранее подготовленного текста на русском языке, построчно переписать 
в другой текстовый файл слова с четным числом букв*/

public class neposredstveno_lab6 {

    public static void main(String[] args) {

        File withSource = new File("D://fileforlab6-source.txt");

        File withNew=new File("D://fileforlab6-new.txt");
        try{
            BufferedReader lesen = new BufferedReader(new FileReader(withSource));
            String string_v1;
            while((string_v1 = lesen.readLine()) != null ){
                if(!string_v1.isEmpty()){
                    String[] slovechki = string_v1.split(" ");
                    for (int i = 0; i < slovechki.length; i++) {
                        if (slovechki[i].length() % 2 != 0) {
                            slovechki[i] = null;
                        } }
                    String[] string_v2 = Arrays.stream(slovechki).filter(Objects::nonNull).toArray(String[]::new);

                    try(FileWriter schreiben = new FileWriter(withNew)){
                        String output = String.join(" ", string_v2);
                        schreiben.write(output);
                        schreiben.flush();
                    } } }
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        } } }