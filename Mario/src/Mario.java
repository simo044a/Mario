import java.util.Scanner;
import java.util.ArrayList;

public class Mario {

  static ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();

  static Order orderNr1 = new Order("nr. 1 ");
  static Order orderNr2 = new Order("nr. 2 ");
  static Order orderNr3 = new Order("nr. 3 ");
  static Order orderNr4 = new Order("nr. 4 ");
  static Order orderNr5 = new Order("nr. 5 ");

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

public String toString(){
  return " " + fullOrder;
}

  public static void pizzaList(){
    pizzaList.add(pizza1);
    pizzaList.add(pizza2);
    pizzaList.add(pizza3);
    pizzaList.add(pizza4);
    pizzaList.add(pizza5);

    System.out.println("\n" + pizzaList.toString());

  }

  public static void pizzaMenuCard(){
    String pizzaMenuCard = """
        1   Pizza Margherita: Tomat, ost	50,-
        
        2 	Pizza Vesuvio: Tomat, ost og kalkuntopping	55,-
        
        3 	Pizza Capricciosa: Tomat, ost, kalkuntopping og champignon	59,-
        
        4 	Pizza Hawaii: Tomat, ost, kalkuntopping, champignon og kalve bacon	64,-
        
        5 	Pizza Capone: Tomat, ost, oksekød, champignon og løg	64,-
        
        6 	Pizza Italiano: Tomat, ost, oksekød, løg og kalve bacon	64,-
        
        7 	Pizza Luciano: Tomat, ost, oksekød, peberfrugt og cocktailpølser	64,-
        
        8 	Pizza Europa: Tomat, ost, kylling, løg, kalve bacon og peberfrugt	67,-
        
        9 	Pizza Pepperoni: Tomat, ost, pepperoni og løg	59,-
        
        10 	Pizza Quattro Stagioni: Tomat, ost, kalkuntopping, champignon, løg og rejer	67,-
        
        11 	Pizza Calzone (Indbagt): Tomat, ost, kalkuntopping, champignon og rejer 64,-
       
        12 	Pizza Spaghetti (Indbagt): Tomat, ost, spaghetti og oksekød 59,-
        
        13 	Pizza Speciale: Tomat, ost, oksekød, kalkuntopping, champignon, løg, pepperoni og gorgonzola 69,-
        
        14 	Pizza Prins: Tomat, ost, oksemørbrad, kalve bacon, peberfrugt, oliven og gorgonzola	69,-
        
        15 	Pizza Super: Tomat, ost, oksemørbrad, champignon, løg, rejer og kalve bacon	69,-
        
        16 	Pizza Arlecchino: Tomat, ost, kalkuntopping, løg, kalve bacon, cocktailpølser og peberfrugt	69,-
        
        17 	Pizza Pescatore: Tomat, ost, rejer og ananas	59,-
        
        18 	Pizza Marinara: Tomat, ost, tun, rejer, hummer, muslinger og oliven	70,-
     
        19 	Pizza Vegetarian: Tomat, ost, champignon, løg, ananas, peberfrugt og oliven	60,-
        
        19A 	Kebab Pizza: Tomat, ost, kebab, med salat og dressing	59,-
        
        20 	Pizza Margherita: Tomat, ost	 	60,-
        
        21 	Pizza Miami: Tomat, ost, kalkuntopping og champignon	 	65,-
        
        22 	Pizza Texas: Tomat, ost, kylling, løg, kalve bacon og peberfrugt	 	69,-
        
        23 	Pizza Las Vegas: Tomat, ost, oksekød, løg og kalve bacon	 	67,-
        
        24 	Pizza Denver: Tomat, ost, oksekød, kalkuntopping, pepperoni og peberfrugt	 	69,-
        
        25 	Pizza Chicago: Tomat, ost, kebab, champignon, salat og dressing	 	69,-
        
        26 	Pizza Hawaii: Tomat, ost, kalkuntopping, champignon og kalve bacon	 	67,-
        
        27 	Pizza Mexico: Tomat, ost, pepperoni, champignon, løg og oliven	 	69,-
        
        28 	Pizza Vegetarian: Tomat, ost, champignon, løg, ananas og oliven	 	67,-
        
        29 	Pizza Florida: Tomat, ost, ananas og rejer	 	65,-
        
        30 	Pizza L.A.: Tomat, ost, kalkuntopping, rejer, hummer og ananas   65,-
               
        """;

    System.out.println(pizzaMenuCard);
  }

  public static void chooseMenu(){}

  public static void seeOrderList(){

    System.out.println("\n" + fullOrder.toString());

  }

  public static void makeOrder(){

  // start ordre
  // Giv nr til ordre

  System.out.println("Ordre nr (Vælg mellem 1 - 5 for hvilket ordre nr)");

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
  }



}
  public static void makeOrder1(){


      // tilføj item

    yesOrNoInput = false;
    do {

      System.out.println("Pizza input (Vælg mellem input 0 - 4)");

      orderPizzaInput = in.nextInt();

      orderNr1.getOrderArrayList().add(pizzaList.get(orderPizzaInput));
      System.out.println(orderNr1.toString());
      // Ja / nej til flere items til ordre?

      System.out.println("Vil du tilføje mere til ordren?");
      in.nextLine();

      orderInput = in.nextLine();

      if(orderInput.equalsIgnoreCase("yes")) {
        yesOrNoInput = false;
      } else if (orderInput.equalsIgnoreCase("nej")) {
        yesOrNoInput = true;
      }

    }while(yesOrNoInput == false);

    if (!fullOrder.contains(orderNr1)) {fullOrder.add(orderNr1);}


  }
  public static void makeOrder2(){


    // tilføj item
    yesOrNoInput = false;

    do {

      System.out.println("Pizza input (Vælg mellem input 0 - 4)");

      orderPizzaInput = in.nextInt();

      orderNr2.getOrderArrayList().add(pizzaList.get(orderPizzaInput));
      System.out.println(orderNr2.toString());

      // Ja / nej til flere items til ordre?

      System.out.println("Vil du tilføje mere til ordren");
      in.nextLine();

      orderInput = in.nextLine();

      if(orderInput.equalsIgnoreCase("yes")) {
        yesOrNoInput = false;
      } else if (orderInput.equalsIgnoreCase("nej")) {
        yesOrNoInput = true;
      }

    }while(yesOrNoInput == false);

    if (!fullOrder.contains(orderNr2)) {fullOrder.add(orderNr2);}

  }
  public static void makeOrder3(){


    // tilføj item
    yesOrNoInput = false;
    do {

      System.out.println("Pizza input (Vælg mellem input 0 - 4)");

      orderPizzaInput = in.nextInt();

      orderNr3.getOrderArrayList().add(pizzaList.get(orderPizzaInput));
      System.out.println(orderNr3.toString());

      // Ja / nej til flere items til ordre?

      System.out.println("Vil du tilføje mere til ordren");
      in.nextLine();

      orderInput = in.nextLine();

      if(orderInput.equalsIgnoreCase("yes")) {
        yesOrNoInput = false;
      } else if (orderInput.equalsIgnoreCase("nej")) {
        yesOrNoInput = true;
      }

    }while(yesOrNoInput == false);

    if (!fullOrder.contains(orderNr3)) {fullOrder.add(orderNr3);}

  }
  public static void makeOrder4(){

    // tilføj item
    yesOrNoInput = false;

    do {

      System.out.println("Pizza input (Vælg mellem input 0 - 4)");

      orderPizzaInput = in.nextInt();

      orderNr4.getOrderArrayList().add(pizzaList.get(orderPizzaInput));
      System.out.println(orderNr4.toString());

      // Ja / nej til flere items til ordre?

      System.out.println("Vil du tilføje mere til ordren");
      in.nextLine();

      orderInput = in.nextLine();

      if(orderInput.equalsIgnoreCase("yes")) {
        yesOrNoInput = false;
      } else if (orderInput.equalsIgnoreCase("nej")) {
        yesOrNoInput = true;
      }

    }while(yesOrNoInput == false);

    if (!fullOrder.contains(orderNr4)) {fullOrder.add(orderNr4);}

  }
  public static void makeOrder5(){

    // tilføj item
    yesOrNoInput = false;

    do {

      System.out.println("Pizza input (Vælg mellem input 0-4)");

      orderPizzaInput = in.nextInt();

      orderNr5.getOrderArrayList().add(pizzaList.get(orderPizzaInput));
      System.out.println(orderNr5.toString());
      // Ja / nej til flere items til ordre?

      System.out.println("Vil du tilføje mere til ordren");
      in.nextLine();

      orderInput = in.nextLine();

      if(orderInput.equalsIgnoreCase("yes")) {
        yesOrNoInput = false;
      } else if (orderInput.equalsIgnoreCase("nej")) {
        yesOrNoInput = true;
      }

    }while(yesOrNoInput == false);

    if (!fullOrder.contains(orderNr5)) {fullOrder.add(orderNr5);}

  }

  public static void changeOrder(){

    String changeOrderInput;

    System.out.println("Hvilken ordre vil du justere i?");

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

    }
  }
  public static void changeOrder1(){

    String changeItemInput;

    System.out.println(orderNr1);

    System.out.println("\nHvilket item vil du fjerne? (x -> y)");

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

    }

    System.out.println(orderNr1);

  }
  public static void changeOrder2(){


    String changeItemInput;

    System.out.println(orderNr2);

    System.out.println("\nHvilket item vil du fjerne? (x -> y)");

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

    }

    System.out.println(orderNr2);

  }
  public static void changeOrder3(){

    String changeItemInput;

    System.out.println(orderNr3);

    System.out.println("\nHvilket item vil du fjerne? (x -> y)");

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

    }

    System.out.println(orderNr3);

  }
  public static void changeOrder4(){

    String changeItemInput;

    System.out.println(orderNr4);

    System.out.println("\nHvilket item vil du fjerne? (x -> y)");

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

    }

    System.out.println(orderNr4);

  }
  public static void changeOrder5(){

    String changeItemInput;

    System.out.println(orderNr5);

    System.out.println("\nHvilket item vil du fjerne? (x -> y)");

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

    }

    System.out.println(orderNr5);

  }

  public static void removeOrder(){

    String removeOrderInput;

    yesOrNoInput = false;

    do {

      System.out.println("Hvilken ordre vil du fjerne?");

      seeOrderList();

      removeOrderInput = in.nextLine();

      switch (removeOrderInput) {

        case "1":
          orderNr1.getOrderArrayList().clear();
          break;

        case "2":
          orderNr2.getOrderArrayList().clear();
          break;

        case "3":
          orderNr3.getOrderArrayList().clear();
          break;

        case "4":
          orderNr4.getOrderArrayList().clear();
          break;

        case "5":
          orderNr5.getOrderArrayList().clear();
          break;

      }

      System.out.println("Vil du fjerne en ordre til?");

      orderInput = in.nextLine();

      if(orderInput.equalsIgnoreCase("yes")) {
        yesOrNoInput = false;
      } else if (orderInput.equalsIgnoreCase("nej")) {
        yesOrNoInput = true;
      }

    }while(!yesOrNoInput);

  }

  public static void orderIsDone(){


    System.out.println("Hvilken ordre er blevet betalt og afhentet?");

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

    }

  }

  public static void seeExpList(){

    System.out.println(expOrder);

  }

  public static void main(String[] args){


    System.out.println("Menukort");

    pizzaList();



    String mainInput;
    boolean mainExit = false;

    do {

      seeOrderList();

      System.out.println("\nHvad vil du vælge i menuen? \n");
      System.out.println("""
          Input 1: Lav en ordre (eller tilføj item til eksisterende ordre).
          Input 2: Fjern item fra en ordre.
          Input 3: Fjern ordre fra ordre liste.
          Input 4: Ordre fuldført.
          Input 5: Se ekspideret ordre liste.
          Input 6: Exit program.
          """);

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
