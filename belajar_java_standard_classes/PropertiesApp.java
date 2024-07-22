package belajar_java_standard_classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
  public static void main(String[] args) {
    try {
      Properties properties = new Properties();
      properties.load(new FileInputStream("application.properties"));

      String host = properties.getProperty("database.host");
      String port = properties.getProperty("database.port");
      String username = properties.getProperty("database.username");
      String password = properties.getProperty("database.password");

      System.out.println(host);
      System.out.println(port);
      System.out.println(username);
      System.out.println(password);

    } catch (FileNotFoundException e) {
      e.getMessage();
    } catch (IOException e) {
      e.getMessage();
    }

    try {
      Properties properties = new Properties();
      properties.put("APP_VERSION", "1.0.0");
      properties.store(new FileOutputStream(".env"), "");
    } catch (FileNotFoundException e) {
      System.out.println("Tidak dapat membuat file!");
    } catch (IOException e) {
      System.out.println("Tidak dapat menyimpan file!");
    }
  }
}