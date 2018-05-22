package com.company;

import java.util.ArrayList;

public class Grocerylist {
    private ArrayList<String> grocerylist = new ArrayList<String>();

// adding an item into an array
    public void addgroceryitem( String item) {
        grocerylist.add(item) ;
    }

   public void printgrocerylist() {
       System.out.println(" you have " + grocerylist.size() + " items in your list ");
       for ( int i = 0 ;  i < grocerylist.size() ; i++) {
           System.out.println( " element at " +(i+1) + " = " + grocerylist.get(i));
       }
   }

  // replacing an item in array
   public void modifygroceryitem(int position , String newitem ) {
        grocerylist.set(position , newitem) ;
   }

  //removing an item in array
   public void removegroceryitem ( int position ) {
        String theitem = grocerylist.remove( position) ;
        grocerylist.remove(position);

   }
    public String finditem ( String searchitem ) {
        int position = grocerylist.indexOf(searchitem);
        if ( position >= 0 ) {
            return grocerylist.get(position) ;
        }
        return null;


    }
}
