import java.util.ArrayList;

public class Order {

  private String orderName;
  private String orderNr;
  private ArrayList<Pizza> orderArrayList = new ArrayList<>();

  public void setOrderName(String orderName){this.orderName = orderName;}
  public String getOrderName(){return orderName;}

  public void setOrderNr(String orderNr){this.orderNr = orderNr;}
  public String getOrderNr(){return orderNr;}

  public void setOrderArrayList(ArrayList<Pizza> orderArrayList){this.orderArrayList = orderArrayList;}
  public ArrayList<Pizza> getOrderArrayList(){return orderArrayList;}


public String toString(){
    return orderName + orderArrayList;
}

}
