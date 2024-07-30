public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int bonusMile = ticketPrice / 20;
        return bonusMile;
    }
}
