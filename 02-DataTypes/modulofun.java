public class modulofun {
    public static void main(String[] args) {
        // division and modulo - considering the problem
        // Flower shop has 64 flowers.
        // Each flower order contains 7 flowers
        // There are 12 orders
        // How many flower orders can I fulfill with the flowers I have in stock?
        int flowersInShop = 64;
        int flowerOrders = 12;
        int flowersPerOrder = 7;
        // using type conversion here to have the result be a decimal value
        double ordersInStock = (double) flowersInShop / flowersPerOrder;
        // this answers the question, but the fraction (decimal precision)
        // isn't very useful... I can't fill .14... of an order
        System.out.printf("You can fill %.2f orders\n", ordersInStock);
        // This prints out the result using integer division, so only the
        // whole number result is stored
        ordersInStock = flowersInShop / flowersPerOrder;
        // the following printf statements do the same thing - print only the
        // whole number value
        System.out.printf("You can fill %.0f orders\n", ordersInStock);
        System.out.printf("You can fill %d orders\n", (int) ordersInStock);
        // modulo stores the remainder of a division operation
        // In the ongoing scenario, it would tell me how many flowers
        // I have remaining in stock, after completing as many whole orders
        // as possible
        int flowersRemaining = flowersInShop % flowersPerOrder;
        System.out.printf("You will have %d flowers left over\n", flowersRemaining);

    }
}
