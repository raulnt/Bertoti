//OBSERVER

package Padroes.Uniao-de-Padroes;

public interface Observer {
  void update(String message);
}

public class Customer implements Observer {
  private final String name;

  public Customer(String name) {
      this.name = name;
  }

  @Override
  public void update(String message) {
      System.out.println("Notification for " + name + ": " + message);
  }
}

