public class App {
    public static void main(String[] args) {
        Restaurant restaurant= new Restaurant ("Winemeat restaurant");
        restaurant.addTable("White");
        restaurant.addTable("Black)");

        restaurant.getTable("White")
            .addOrder("Beer", 3);



            restaurant.printTableOrders("White");
            restaurant.printTableOrders("Black");
            restaurant.printTableOrders("Green");
    }
}
