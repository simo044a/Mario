public class Pizza {

  private String pizzaName;
  private int pizzaNum;
  private double pizzaPrice;


  Pizza(String pizzaName, int pizzaNum, double pizzaPrice){
    setPizzaName(pizzaName);
    setPizzaNum(pizzaNum);
    setPizzaPrice(pizzaPrice);
  }

  public void setPizzaName(String pizzaName){this.pizzaName = pizzaName;}
  public String getPizzaName(){return pizzaName;}

  public void setPizzaNum(int pizzaNum){this.pizzaNum = pizzaNum;}
  public int getPizzaNum(){return pizzaNum;}

  public void setPizzaPrice(double pizzaPrice){this.pizzaPrice = pizzaPrice;}
  public double getPizzaPrice(){return pizzaPrice;}

public String toString(){
return this.pizzaNum + " " + this.pizzaName + " " + this.pizzaPrice;
}

}
