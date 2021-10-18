import java.util.Scanner;
import java.util.ArrayList;

public class Mario {

  static ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();

  static Order orderNr1 = new Order("nr. 1 ");
  static Order orderNr2 = new Order("nr. 2 ");
  static Order orderNr3 = new Order("nr. 3 ");
  static Order orderNr4 = new Order("nr. 4 ");
  static Order orderNr5 = new Order("nr. 5 ");
  static Order orderNr6 = new Order("nr. 6 ");
  static Order orderNr7 = new Order("nr. 7 ");
  static Order orderNr8 = new Order("nr. 8 ");


  static ArrayList<Order> fullOrder = new ArrayList<Order>();
  static ArrayList<Order> expOrder = new ArrayList<Order>();


  static Scanner in = new Scanner(System.in);

  static String pizzaInput;
  static String orderInput;
  static int orderNrInput;
  static int orderPizzaInput;
  static boolean yesOrNoInput;

  static Pizza pizza1 = new Pizza("Pizza Margherita", 1, 50);
  static Pizza pizza2 = new Pizza("Pizza vesuvio", 2, 55);
  static Pizza pizza3 = new Pizza("Pizza Capricciosa", 3, 59);
  static Pizza pizza4 = new Pizza("Pizza Hawaii", 4, 64);
  static Pizza pizza5 = new Pizza("Pizza Capone", 5, 64);
  static Pizza pizza6 = new Pizza("Pizza Italiano", 6, 64);
  static Pizza pizza7 = new Pizza("Pizza Luciano", 7 , 64);
  static Pizza pizza8 = new Pizza("Pizza Europa",8, 67);
  static Pizza pizza9 = new Pizza("Pizza Pepperoni" , 9, 59);
  static Pizza pizza10 = new Pizza("Pizza Quattro Stagioni", 10, 67);


public String toString(){
  return " " + fullOrder;
}

  public static void pizzaList(){
    pizzaList.add(pizza1);
    pizzaList.add(pizza2);
    pizzaList.add(pizza3);
    pizzaList.add(pizza4);
    pizzaList.add(pizza5);
    pizzaList.add(pizza6);
    pizzaList.add(pizza7);
    pizzaList.add(pizza8);
    pizzaList.add(pizza9);
    pizzaList.add(pizza10);



  }

  public static void pizzaMenuCard(){
    String pizzaMenuCard = """
        #################################################################################################
        ##                                                                                            
        ##  1   Pizza Margherita: Tomat, ost	50,-                                                     
        ##                                                                                             
        ##  2 	Pizza Vesuvio: Tomat, ost og kalkuntopping	55,-                                       
        ##                                                                                             
        ##  3 	Pizza Capricciosa: Tomat, ost, kalkuntopping og champignon	59,-                       
        ##                                                                                             
        ##  4 	Pizza Hawaii: Tomat, ost, kalkuntopping, champignon og kalve bacon	64,-               
        ##                                                                                             
        ##  5 	Pizza Capone: Tomat, ost, oksekød, champignon og løg	64,-                            
        ##                                                                                             
        ##  6 	Pizza Italiano: Tomat, ost, oksekød, løg og kalve bacon	64,-                           
        ##                                                                                               
        ##  7 	Pizza Luciano: Tomat, ost, oksekød, peberfrugt og cocktailpølser	64,-                 
        ##                                                                                             
        ##  8 	Pizza Europa: Tomat, ost, kylling, løg, kalve bacon og peberfrugt	67,-                 
        ##                                                                                             
        ##  9 	Pizza Pepperoni: Tomat, ost, pepperoni og løg	59,-                                     
        ##                                                                                             
        ##  10 	Pizza Quattro Stagioni: Tomat, ost, kalkuntopping, champignon, løg og rejer	67,-       
        ##                                                                                             
        #################################################################################################   
           
        """;

    System.out.println(pizzaMenuCard);
  }

  public static void seeOrderList(){

    System.out.println("\nOrdre listen: \n" + fullOrder.toString() + " \n");

  }

  public static void makeOrder(){

  // start ordre
  // Giv nr til ordre

  System.out.println("Ordre nr (Vælg mellem 1 - 8 for hvilket ordre nr)");
    System.out.print("->  ");

  orderNrInput = in.nextInt();

  if(orderNrInput == 1) {
    makeOrder1();
  } else if(orderNrInput == 2) {
    makeOrder2();
  } else if(orderNrInput == 3) {
    makeOrder3();
  } else if(orderNrInput == 4) {
    makeOrder4();
  } else if(orderNrInput == 5) {
    makeOrder5();
  } else if(orderNrInput == 6) {
    makeOrder6();
  } else if(orderNrInput == 7) {
    makeOrder7();
  } else if(orderNrInput == 8) {
    makeOrder8();
  }



}
  public static void makeOrder1(){


      // tilføj item

    yesOrNoInput = false;
    do {

      System.out.println("Pizza input (Vælg mellem input 0 - 9)");
      System.out.print("->  ");

      orderPizzaInput = in.nextInt();

      orderNr1.getOrderArrayList().add(pizzaList.get(orderPizzaInput));
      System.out.println(orderNr1.toString());
      // Ja / nej til flere items til ordre?

      System.out.println("Vil du tilføje mere til ordren?" +
          " Yes Or No");
      in.nextLine();
      System.out.print("->");

      orderInput = in.nextLine();

      if(orderInput.equalsIgnoreCase("yes")) {
        yesOrNoInput = false;
      } else if (orderInput.equalsIgnoreCase("no")) {
        yesOrNoInput = true;
      }

    }while(yesOrNoInput == false);

    if (!fullOrder.contains(orderNr1)) {fullOrder.add(orderNr1);}


  }
  public static void makeOrder2(){


    // tilføj item
    yesOrNoInput = false;

    do {

      System.out.println("Pizza input (Vælg mellem input 0 - 9)");
      System.out.print("->  ");

      orderPizzaInput = in.nextInt();

      orderNr2.getOrderArrayList().add(pizzaList.get(orderPizzaInput));
      System.out.println(orderNr2.toString());

      // Ja / nej til flere items til ordre?

      System.out.println("Vil du tilføje mere til ordren" +
          " Yes Or No");
      System.out.print("->  ");
      in.nextLine();

      orderInput = in.nextLine();

      if(orderInput.equalsIgnoreCase("yes")) {
        yesOrNoInput = false;
      } else if (orderInput.equalsIgnoreCase("no")) {
        yesOrNoInput = true;
      }

    }while(yesOrNoInput == false);

    if (!fullOrder.contains(orderNr2)) {fullOrder.add(orderNr2);}

  }
  public static void makeOrder3(){


    // tilføj item
    yesOrNoInput = false;
    do {

      System.out.println("Pizza input (Vælg mellem input 0 - 9)");
      System.out.print("->  ");

      orderPizzaInput = in.nextInt();

      orderNr3.getOrderArrayList().add(pizzaList.get(orderPizzaInput));
      System.out.println(orderNr3.toString());

      // Ja / nej til flere items til ordre?

      System.out.println("Vil du tilføje mere til ordren" +
          " Yes or No");
      System.out.print("->  ");
      in.nextLine();

      orderInput = in.nextLine();

      if(orderInput.equalsIgnoreCase("yes")) {
        yesOrNoInput = false;
      } else if (orderInput.equalsIgnoreCase("no")) {
        yesOrNoInput = true;
      }

    }while(yesOrNoInput == false);

    if (!fullOrder.contains(orderNr3)) {fullOrder.add(orderNr3);}

  }
  public static void makeOrder4(){

    // tilføj item
    yesOrNoInput = false;

    do {

      System.out.println("Pizza input (Vælg mellem input 0 - 9)");
      System.out.print("->  ");

      orderPizzaInput = in.nextInt();

      orderNr4.getOrderArrayList().add(pizzaList.get(orderPizzaInput));
      System.out.println(orderNr4.toString());

      // Ja / nej til flere items til ordre?

      System.out.println("Vil du tilføje mere til ordren" +
          " Yes Or No");
      System.out.print("->  ");
      in.nextLine();

      orderInput = in.nextLine();

      if(orderInput.equalsIgnoreCase("yes")) {
        yesOrNoInput = false;
      } else if (orderInput.equalsIgnoreCase("no")) {
        yesOrNoInput = true;
      }

    }while(yesOrNoInput == false);

    if (!fullOrder.contains(orderNr4)) {fullOrder.add(orderNr4);}

  }
  public static void makeOrder5(){

    // tilføj item
    yesOrNoInput = false;

    do {

      System.out.println("Pizza input (Vælg mellem input 0-9)");
      System.out.print("->  ");

      orderPizzaInput = in.nextInt();

      orderNr5.getOrderArrayList().add(pizzaList.get(orderPizzaInput));
      System.out.println(orderNr5.toString());
      // Ja / nej til flere items til ordre?

      System.out.println("Vil du tilføje mere til ordren" +
          " Yes Or No");
      System.out.print("->  ");
      in.nextLine();

      orderInput = in.nextLine();

      if(orderInput.equalsIgnoreCase("yes")) {
        yesOrNoInput = false;
      } else if (orderInput.equalsIgnoreCase("no")) {
        yesOrNoInput = true;
      }

    }while(yesOrNoInput == false);

    if (!fullOrder.contains(orderNr5)) {fullOrder.add(orderNr5);}

  }
  public static void makeOrder6(){


    // tilføj item
    yesOrNoInput = false;
    do {

      System.out.println("Pizza input (Vælg mellem input 0 - 9)");
      System.out.print("->  ");

      orderPizzaInput = in.nextInt();

      orderNr6.getOrderArrayList().add(pizzaList.get(orderPizzaInput));
      System.out.println(orderNr6.toString());

      // Ja / nej til flere items til ordre?

      System.out.println("Vil du tilføje mere til ordren" +
          " Yes Or No");
      System.out.print("->  ");
      in.nextLine();

      orderInput = in.nextLine();

      if(orderInput.equalsIgnoreCase("yes")) {
        yesOrNoInput = false;
      } else if (orderInput.equalsIgnoreCase("No")) {
        yesOrNoInput = true;
      }

    }while(yesOrNoInput == false);

    if (!fullOrder.contains(orderNr6)) {fullOrder.add(orderNr6);}

  }
  public static void makeOrder7(){

    // tilføj item
    yesOrNoInput = false;

    do {

      System.out.println("Pizza input (Vælg mellem input 0 - 9)");
      System.out.print("->  ");

      orderPizzaInput = in.nextInt();

      orderNr7.getOrderArrayList().add(pizzaList.get(orderPizzaInput));
      System.out.println(orderNr7.toString());

      // Ja / nej til flere items til ordre?

      System.out.println("Vil du tilføje mere til ordren" +
      " Yes Or No");
      System.out.print("->  ");
      in.nextLine();

      orderInput = in.nextLine();

      if(orderInput.equalsIgnoreCase("yes")) {
        yesOrNoInput = false;
      } else if (orderInput.equalsIgnoreCase("No")) {
        yesOrNoInput = true;
      }

    }while(yesOrNoInput == false);

    if (!fullOrder.contains(orderNr7)) {fullOrder.add(orderNr7);}

  }
  public static void makeOrder8(){

    // tilføj item
    yesOrNoInput = false;

    do {

      System.out.println("Pizza input (Vælg mellem input 0-9)");

      orderPizzaInput = in.nextInt();

      orderNr8.getOrderArrayList().add(pizzaList.get(orderPizzaInput));
      System.out.println(orderNr8.toString());
      // Ja / nej til flere items til ordre?

      System.out.println("Vil du tilføje mere til ordren" +
          " Yes Or No");
      System.out.print("->  ");
      in.nextLine();

      orderInput = in.nextLine();

      if(orderInput.equalsIgnoreCase("yes")) {
        yesOrNoInput = false;
      } else if (orderInput.equalsIgnoreCase("no")) {
        yesOrNoInput = true;
      }

    }while(yesOrNoInput == false);

    if (!fullOrder.contains(orderNr8)) {fullOrder.add(orderNr8);}

  }

  public static void changeOrder(){

    String changeOrderInput;

    System.out.println("Hvilken ordre vil du justere i?");
    System.out.print("->  ");

    seeOrderList();

    changeOrderInput = in.nextLine();

    switch (changeOrderInput) {

      case "1":
        changeOrder1();
        break;

      case "2":
        changeOrder2();
        break;

      case "3":
        changeOrder3();
        break;

      case "4":
        changeOrder4();
        break;

      case "5":
        changeOrder5();
        break;

      case "6":
        changeOrder6();
        break;

      case "7":
        changeOrder7();
        break;

      case "8":
        changeOrder8();
        break;

    }
  }
  public static void changeOrder1(){

    String changeItemInput;

    System.out.println(orderNr1);

    System.out.println("\nHvilket item vil du fjerne? (x -> y)");
    System.out.print("->  ");

    changeItemInput = in.nextLine();

    switch (changeItemInput) {

      case "1":
        orderNr1.getOrderArrayList().remove(0);

        break;

      case "2":
        orderNr1.getOrderArrayList().remove(1);
        break;

      case "3":
        orderNr1.getOrderArrayList().remove(2);
        break;

      case "4":
        orderNr1.getOrderArrayList().remove(3);
        break;

      case "5":
        orderNr1.getOrderArrayList().remove(4);
        break;

      case "6":
        orderNr1.getOrderArrayList().remove(5);
        break;

      case "7":
        orderNr1.getOrderArrayList().remove(6);
        break;

      case "8":
        orderNr1.getOrderArrayList().remove(7);
        break;

      case "9":
        orderNr1.getOrderArrayList().remove(8);
        break;

      case "10":
        orderNr1.getOrderArrayList().remove(9);
        break;

    }

    System.out.println(orderNr1);

  }
  public static void changeOrder2(){


    String changeItemInput;

    System.out.println(orderNr2);

    System.out.println("\nHvilket item vil du fjerne? (x -> y)");
    System.out.print("->  ");

    changeItemInput = in.nextLine();

    switch (changeItemInput) {

      case "1":
        orderNr2.getOrderArrayList().remove(0);

        break;

      case "2":
        orderNr2.getOrderArrayList().remove(1);
        break;

      case "3":
        orderNr2.getOrderArrayList().remove(2);
        break;

      case "4":
        orderNr2.getOrderArrayList().remove(3);
        break;

      case "5":
        orderNr2.getOrderArrayList().remove(4);
        break;

      case "6":
        orderNr2.getOrderArrayList().remove(5);
        break;

      case "7":
        orderNr1.getOrderArrayList().remove(6);
        break;

      case "8":
        orderNr1.getOrderArrayList().remove(7);
        break;

      case "9":
        orderNr1.getOrderArrayList().remove(8);
        break;

      case "10":
        orderNr1.getOrderArrayList().remove(9);
        break;
    }

    System.out.println(orderNr2);

  }
  public static void changeOrder3(){

    String changeItemInput;

    System.out.println(orderNr3);

    System.out.println("\nHvilket item vil du fjerne? (x -> y)");
    System.out.print("->  ");

    changeItemInput = in.nextLine();

    switch (changeItemInput) {

      case "1":
        orderNr3.getOrderArrayList().remove(0);

        break;

      case "2":
        orderNr3.getOrderArrayList().remove(1);
        break;

      case "3":
        orderNr3.getOrderArrayList().remove(2);
        break;

      case "4":
        orderNr3.getOrderArrayList().remove(3);
        break;

      case "5":
        orderNr3.getOrderArrayList().remove(4);
        break;

      case "6":
        orderNr3.getOrderArrayList().remove(5);
        break;

      case "7":
        orderNr1.getOrderArrayList().remove(6);
        break;

      case "8":
        orderNr1.getOrderArrayList().remove(7);
        break;

      case "9":
        orderNr1.getOrderArrayList().remove(8);
        break;

      case "10":
        orderNr1.getOrderArrayList().remove(9);
        break;

    }

    System.out.println(orderNr3);

  }
  public static void changeOrder4(){

    String changeItemInput;

    System.out.println(orderNr4);

    System.out.println("\nHvilket item vil du fjerne? (x -> y)");
    System.out.print("->  ");

    changeItemInput = in.nextLine();

    switch (changeItemInput) {

      case "1":
        orderNr4.getOrderArrayList().remove(0);

        break;

      case "2":
        orderNr4.getOrderArrayList().remove(1);
        break;

      case "3":
        orderNr4.getOrderArrayList().remove(2);
        break;

      case "4":
        orderNr4.getOrderArrayList().remove(3);
        break;

      case "5":
        orderNr4.getOrderArrayList().remove(4);
        break;

      case "6":
        orderNr4.getOrderArrayList().remove(5);
        break;

      case "7":
        orderNr1.getOrderArrayList().remove(6);
        break;

      case "8":
        orderNr1.getOrderArrayList().remove(7);
        break;

      case "9":
        orderNr1.getOrderArrayList().remove(8);
        break;

      case "10":
        orderNr1.getOrderArrayList().remove(9);
        break;
    }

    System.out.println(orderNr4);

  }
  public static void changeOrder5(){

    String changeItemInput;

    System.out.println(orderNr5);

    System.out.println("\nHvilket item vil du fjerne? (x -> y)");
    System.out.print("->  ");

    changeItemInput = in.nextLine();

    switch (changeItemInput) {

      case "1":
        orderNr5.getOrderArrayList().remove(0);

        break;

      case "2":
        orderNr5.getOrderArrayList().remove(1);
        break;

      case "3":
        orderNr5.getOrderArrayList().remove(2);
        break;

      case "4":
        orderNr5.getOrderArrayList().remove(3);
        break;

      case "5":
        orderNr5.getOrderArrayList().remove(4);
        break;

      case "6":
        orderNr5.getOrderArrayList().remove(5);
        break;

      case "7":
        orderNr1.getOrderArrayList().remove(6);
        break;

      case "8":
        orderNr1.getOrderArrayList().remove(7);
        break;

      case "9":
        orderNr1.getOrderArrayList().remove(8);
        break;

      case "10":
        orderNr1.getOrderArrayList().remove(9);
        break;
    }

    System.out.println(orderNr5);

  }
  public static void changeOrder6(){

    String changeItemInput;

    System.out.println(orderNr6);

    System.out.println("\nHvilket item vil du fjerne? (x -> y)");
    System.out.print("->  ");

    changeItemInput = in.nextLine();

    switch (changeItemInput) {

      case "1":
        orderNr6.getOrderArrayList().remove(0);

        break;

      case "2":
        orderNr6.getOrderArrayList().remove(1);
        break;

      case "3":
        orderNr6.getOrderArrayList().remove(2);
        break;

      case "4":
        orderNr6.getOrderArrayList().remove(3);
        break;

      case "5":
        orderNr6.getOrderArrayList().remove(4);
        break;

      case "6":
        orderNr6.getOrderArrayList().remove(5);
        break;

      case "7":
        orderNr6.getOrderArrayList().remove(6);
        break;

      case "8":
        orderNr6.getOrderArrayList().remove(7);
        break;

      case "9":
        orderNr6.getOrderArrayList().remove(8);
        break;

      case "10":
        orderNr6.getOrderArrayList().remove(9);
        break;
    }

    System.out.println(orderNr6);

  }
  public static void changeOrder7(){

    String changeItemInput;

    System.out.println(orderNr7);

    System.out.println("\nHvilket item vil du fjerne? (x -> y)");
    System.out.print("->  ");

    changeItemInput = in.nextLine();

    switch (changeItemInput) {

      case "1":
        orderNr7.getOrderArrayList().remove(0);

        break;

      case "2":
        orderNr7.getOrderArrayList().remove(1);
        break;

      case "3":
        orderNr7.getOrderArrayList().remove(2);
        break;

      case "4":
        orderNr7.getOrderArrayList().remove(3);
        break;

      case "5":
        orderNr7.getOrderArrayList().remove(4);
        break;

      case "6":
        orderNr7.getOrderArrayList().remove(5);
        break;

      case "7":
        orderNr7.getOrderArrayList().remove(6);
        break;

      case "8":
        orderNr7.getOrderArrayList().remove(7);
        break;

      case "9":
        orderNr7.getOrderArrayList().remove(8);
        break;

      case "10":
        orderNr7.getOrderArrayList().remove(9);
        break;
    }

    System.out.println(orderNr7);

  }
  public static void changeOrder8(){

    String changeItemInput;

    System.out.println(orderNr8);

    System.out.println("\nHvilket item vil du fjerne? (x -> y)");
    System.out.print("->  ");

    changeItemInput = in.nextLine();

    switch (changeItemInput) {

      case "1":
        orderNr8.getOrderArrayList().remove(0);

        break;

      case "2":
        orderNr8.getOrderArrayList().remove(1);
        break;

      case "3":
        orderNr8.getOrderArrayList().remove(2);
        break;

      case "4":
        orderNr8.getOrderArrayList().remove(3);
        break;

      case "5":
        orderNr8.getOrderArrayList().remove(4);
        break;

      case "6":
        orderNr8.getOrderArrayList().remove(5);
        break;

      case "7":
        orderNr8.getOrderArrayList().remove(6);
        break;

      case "8":
        orderNr8.getOrderArrayList().remove(7);
        break;

      case "9":
        orderNr8.getOrderArrayList().remove(8);
        break;

      case "10":
        orderNr8.getOrderArrayList().remove(9);
        break;
    }

    System.out.println(orderNr8);

  }

  public static void removeOrder(){

    String removeOrderInput;

    yesOrNoInput = false;

    do {

      System.out.println("Hvilken ordre vil du fjerne?");
      System.out.print("->  ");

      seeOrderList();

      removeOrderInput = in.nextLine();

      switch (removeOrderInput) {

        case "1":
          orderNr1.getOrderArrayList().clear();
          fullOrder.remove(orderNr1);
          break;

        case "2":
          orderNr2.getOrderArrayList().clear();
          fullOrder.remove(orderNr2);
          break;

        case "3":
          orderNr3.getOrderArrayList().clear();
          fullOrder.remove(orderNr3);
          break;

        case "4":
          orderNr4.getOrderArrayList().clear();
          fullOrder.remove(orderNr4);
          break;

        case "5":
          orderNr5.getOrderArrayList().clear();
          fullOrder.remove(orderNr5);
          break;

        case "6":
          orderNr6.getOrderArrayList().clear();
          fullOrder.remove(orderNr6);
          break;

        case "7":
          orderNr7.getOrderArrayList().clear();
          fullOrder.remove(orderNr7);
          break;

        case "8":
          orderNr8.getOrderArrayList().clear();
          fullOrder.remove(orderNr8);
          break;
      }

      System.out.println("Vil du fjerne en ordre til?" +
          "Yes Or No");
      System.out.print("->  ");

      orderInput = in.nextLine();

      if(orderInput.equalsIgnoreCase("yes")) {
        yesOrNoInput = false;
      } else if (orderInput.equalsIgnoreCase("no")) {
        yesOrNoInput = true;
      }

    }while(!yesOrNoInput);

  }

  public static void orderIsDone(){


    System.out.println("Hvilken ordre er blevet betalt og afhentet?");
    System.out.print("->  ");

    seeOrderList();

    String orderIsDoneInput;

    orderIsDoneInput = in.nextLine();

    switch (orderIsDoneInput) {

      case "1":
        expOrder.add(orderNr1);
        fullOrder.remove(orderNr1);
        break;

      case "2":
        expOrder.add(orderNr2);
        fullOrder.remove(orderNr2);
        break;

      case "3":
        expOrder.add(orderNr3);
        fullOrder.remove(orderNr3);
        break;

      case "4":
        expOrder.add(orderNr4);
        fullOrder.remove(orderNr4);
        break;

      case "5":
        expOrder.add(orderNr5);
        fullOrder.remove(orderNr5);
        break;

      case "6":
        expOrder.add(orderNr6);
        fullOrder.remove(orderNr6);
        break;

      case "7":
        expOrder.add(orderNr7);
        fullOrder.remove(orderNr7);
        break;

      case "8":
        expOrder.add(orderNr8);
        fullOrder.remove(orderNr8);
        break;

    }

  }

  public static void seeExpList(){

    System.out.println("\n ekspederet liste: \n" + expOrder);

  }

  public static void main(String[] args){


    System.out.println("Menukort");

    pizzaMenuCard();
    pizzaList();


    String mainInput;
    boolean mainExit = false;

    do {

      seeOrderList();

      System.out.println("\nHvad vil du vælge i menuen? \n");
      System.out.println("""
          ############################################################################
          ##                                                                        ##
          ##    Input 1: Lav en ordre (eller tilføj item til eksisterende ordre).   ##
          ##    Input 2: Fjern item fra en ordre.                                   ##
          ##    Input 3: Fjern ordre.                                               ##
          ##    Input 4: Ordre fuldført.                                            ##
          ##    Input 5: Se ekspederet ordre liste.                                 ##
          ##    Input 6: Exit program.                                              ##
          ##                                                                        ##
          ############################################################################
          """);

      System.out.print("->  ");

      mainInput = in.nextLine();

      switch (mainInput) {

        case "1":
          makeOrder();
        break;

        case "2":
          changeOrder();
          break;

        case "3":
          removeOrder();
          break;

        case "4":
          orderIsDone();
          break;

        case "5":
          seeExpList();
          break;

        case "6":
          mainExit = true;
          break;
      }

    } while(!mainExit);



  }


}
