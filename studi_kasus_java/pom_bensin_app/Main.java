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
    System.out.println("(1) Refuel\n(2) Oxygen\n(3) Mini Market");
    System.out.print("Enter your choice: ");
    var choice = input.nextInt();

    if (choice == 1) {
      refuel();
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
        //
      } else if (check.toLowerCase().equals("a")) {
        //
      }
    }
  }

  // Refuel
  static void refuel() {
    System.out.println("Refuel");
    // Get type of fuel from customer request
    System.out.println("(1) " + pertamax.getName() + " - Rp" + pertamax.getPrice() + "/liter");
    System.out.println("(2) " + pertalite.getName() + " - Rp" + pertalite.getPrice() + "/liter");
    System.out.println("(3) " + bioSolar.getName() + " - Rp" + bioSolar.getPrice() + "/liter");
    System.out.print("Entering types of fuel: ");
    var choice = input.next();
    // Check request
    if (choice.toLowerCase().equals("pertamax") || choice.equals("1")) {
      // If type of fuel is Pertamax
      System.out.println(pertamax.getName() + " - Rp" + pertamax.getPrice());
      // Get type of payment
      System.out.print("(l) liter | (p) purchase\nChoice your payment way: ");
      String paymentWay = input.next();
      // Check type of payment
      if (paymentWay.toLowerCase().equals("l") || paymentWay.toLowerCase().equals("liter")) {
        // If payment with litering
        System.out.print("Entering fuel: ");
        var fuel = input.nextInt();
        // Check if blank/null
        if (fuel > 0) {
          // If not blank/null
          var totalPayment = fuel * pertamax.getPrice();
          System.out.println("Your purchase description");
          System.out.println("Total liter: " + fuel);
          System.out.println("Price/liter: " + pertamax.getPrice());
          System.out.println("Total payment: " + totalPayment);
        } else if (fuel < 0) {
          // If blank/null
          System.out.println("Please entering quantities of fuel do you need!");
        } else {
          // If keyword is wrong or not integer
          System.out.println("Keyword is incorrect!");
        }
      } else if (paymentWay.toLowerCase().equals("p") || paymentWay.toLowerCase().equals("purchase")) {
        System.out.print("Entering purchase: ");
        var purchase = input.nextInt();
        if (purchase > 0) {
          var fuel = purchase / pertamax.getPrice();
          System.out.println("Your purchase description");
          System.out.println("Total liter: " + fuel);
          System.out.println("Price/liter: " + pertamax.getPrice());
          System.out.println("Total payment: " + purchase);
        }
      } else {
        System.out.println("Keyword is incorrect");
      }
    }
  }

  // Fuels
  static Fuel pertamax = new Fuel("Pertamax", 14000, 3000);
  static Fuel pertalite = new Fuel("Pertalite", 10000, 90000);
  static Fuel bioSolar = new Fuel("Bio Solar", 7000, 6700);
}