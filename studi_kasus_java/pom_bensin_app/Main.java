package studi_kasus_java.pom_bensin_app;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    headerApp("POM Bensin");
    content();
    // footer()
  }

  // Fuel
  static class Fuel {
    String name;
    int price;
    int stock;

    public Fuel(String name, int price, int stock) {
      this.name = name;
      this.price = price;
      this.stock = stock;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getPrice() {
      return price;
    }

    public void setPrice(int price) {
      this.price = price;
    }

    public int getStock() {
      return stock;
    }

    public void setStock(int stock) {
      this.stock = stock;
    }
  }

  // Scanner
  static Scanner input = new Scanner(System.in);

  // Header
  static void headerApp(String headerName) {
    System.out.println("Welcome to " + headerName + " Application");
  }

  // Main/Content
  static void content() {
    while (true) {
      System.out.println("(1) Refuel\n(2) Oxygen\n(3) Mini Market");
      System.out.print("Enter your choice: ");
      var choice = input.nextInt();

      if (choice == 1) {
        refuel();
        break;
      } else if (choice == 2) {
        // oxygen();
      } else if (choice == 3) {
        // miniMarket();
      } else {
        System.out.println("The keyword is incorrect!");
        System.out.println("Exit/close app (c) | Entering again (a)");
        System.out.print("> ");
        var check = input.next();
        if (check.toLowerCase().equals("c")) {
          break;
        } else if (check.toLowerCase().equals("a")) {
          content();
        }
      }
    }
  }

  // Refuel
  static void refuel() {
    System.out.println("Refuel");
    System.out.println("(1) Pertamax - Rp" + pertamax.getPrice() + "/liter");
    System.out.print("Entering types of fuel: ");
    var choice = input.nextLine();

  }

  // Fuels
  static Fuel pertamax = new Fuel("Pertamax", 14000, 3000);
  static Fuel pertalite = new Fuel("Pertalite", 10000, 90000);
  static Fuel bioSolar = new Fuel("Bio Solar", 7000, 6700);
}