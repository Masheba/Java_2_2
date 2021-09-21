public class BonusMilesService {
    public int calculate(int ticketprice) {
        int bonus = 20;
        int total = ticketprice / bonus;
        return total;
    }
}


