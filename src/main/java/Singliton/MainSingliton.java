package Singliton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
//выполнить Sngliton
public class MainSingliton {
    public static void main(String[] args) {
        Properties properties = Singliton.getInstance().getProperties();
        FileInputStream fileInputStream;
        //инициализируем специальный объект Properties
        //типа Hashtable для удобной работы с данными
        Properties prop = new Properties();
        try {
            //обращаемся к файлу и получаем данные
            fileInputStream = new FileInputStream("src/main/resources/config.properties");
            prop.load(fileInputStream);

            String site = prop.getProperty("site");
            //String loginToSite = prop.getProperty("login");
            // String passwordToSite = prop.getProperty("password");

            //печатаем полученные данные в консоль
            System.out.println(
                    // "site: " + site
                    "Чтение файла singliton.properties: " + prop
                    // + "\npasswordToSite: " + passwordToSite
            );

        } catch (IOException e) {
            System.out.println("Ошибка в программе: файл " + "resources/singliton.properties" + " не обнаружено");
            e.printStackTrace();
        } }
}