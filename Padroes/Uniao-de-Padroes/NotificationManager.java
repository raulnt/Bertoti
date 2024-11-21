//SINGLETON

package Padroes.Uniao-de-Padroes;

import java.util.ArrayList;

public class NotificationManager {
  private static NotificationManager instance;
  private final List<Observer> observers = new ArrayList<>();

  private NotificationManager() {}

  public static NotificationManager getInstance () {
    if (instance == null) {
      instance = new NotificationManager();
  }
  return instance;
}

public void subscribe(Observer observer) {
  observers.add(observer);
}

public void notifyAll(String message) {
  for (Observer observer : observers) {
      observer.update(message);
  }
}
}