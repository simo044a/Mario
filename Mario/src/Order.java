import java.util.ArrayList;

public class Order {

  private String orderName;
  private ArrayList<Pizza> orderArrayList = new ArrayList<>();

  public Order(String orderName){
    setOrderName(orderName);
  }

  public void setOrderName(String orderName){this.orderName = orderName;}
  public String getOrderName(){return orderName;}


  public void setOrderArrayList(ArrayList<Pizza> orderArrayList){this.orderArrayList = orderArrayList;}
  public ArrayList<Pizza> getOrderArrayList(){return orderArrayList;}


public String toString(){
    return " " + orderName + " " + orderArrayList;
}

}
