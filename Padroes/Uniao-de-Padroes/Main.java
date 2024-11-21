import Padroes.Uniao.Product;

public class Main {
  public static void main(String args[]){
    InventorySystem system = new IventorySystem();
    system.addCostumer("Alice");
    system.addCostumer("Bob");

    Product p1 = new Product("Notebook", 1000.0, new RegularPricing());
    Product p2 = new Product("Celular", 700.0, new DiscountPricing());

    Category eletronicos = new Category();
    eletronicos.addComponent(p1);
    eletronicos.addComponent(p2);

    system.notifyRestock("Notebook");

    System.out.println("Preço total do Eletrônicos: R$ " + system.caculateTotalPrice(eletronicos));
  }
}