package access.ex;

public class AccessEx2 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("마늘", 2000, 2));
        cart.addItem(new Item("상추", 3000, 4));
        cart.addItem(new Item("고추", 1500, 3));
        cart.addItem(new Item("양파", 1200, 5));
        cart.addItem(new Item("대파", 1800, 2));
        cart.addItem(new Item("당근", 1000, 6));
        cart.addItem(new Item("감자", 2300, 8));
        cart.addItem(new Item("오이", 900, 4));
        cart.addItem(new Item("호박", 1700, 3));
        cart.addItem(new Item("배추", 4000, 1));
        cart.addItem(new Item("브로콜리", 2500, 2));
        cart.displayItems();

    }
}