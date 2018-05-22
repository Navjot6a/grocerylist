package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static  Grocerylist grocerylist = new Grocerylist();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0 ;
        while (!quit) {
            System.out.println(" enter your choice ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printinstruction();
                    break;

                case 1:
                    grocerylist.printgrocerylist();
                    break;

                case 2:
                    additem();
                    break;

                    case 3:
                    modifyitem();
                    break;


                case 4:
                    removeitem();
                    break;

//                case 5:
//                    searchitem();
//                    break;

                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public  static  void  printinstruction() {
        System.out.println(" 1 - to print the choice options");

}

public  static void  additem() {
    System.out.println(" please enter the grocery item  ");
    grocerylist.addgroceryitem(scanner.nextLine());
//    grocerylist.addgroceryitem(scanner.nextLine());
//    grocerylist.addgroceryitem(scanner.nextLine());

}


  public static void modifyitem() {
      System.out.println(" enter item number ");
      int itemno =  scanner.nextInt();
      scanner.nextLine();
      System.out.println(" enter replacement item ");
      String newitem = scanner.nextLine();
      grocerylist.modifygroceryitem(itemno , newitem);

  }


  public  static  void  removeitem () {
      System.out.println(" enter item number ");
     int itemno = scanner.nextInt() ;
     scanner.nextLine();
     grocerylist.removegroceryitem(itemno);
      System.out.println(" item " + itemno + " is removed" );

  }

  public  static void searchforitem() {
      System.out.println(" item to search for ");
      String searchitem = scanner.nextLine() ;
      if( grocerylist.finditem(searchitem ) != null ) {
          System.out.println(" found " +searchitem + " in the list ");
      } else {
          System.out.println( searchitem + " is not in the list ");
      }
  }

        }






//
//    }
//}
