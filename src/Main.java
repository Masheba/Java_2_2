public class Main {
    public static class main {
        public static void main(String[] args) {
            BonusMilesService service = new BonusMilesService();
            int ticketprice = 10000;
            int total = service.calculate(ticketprice);
            System.out.println(total);
        }
    }
}
