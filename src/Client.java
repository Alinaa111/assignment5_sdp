// Client usage
public class Client {
    public static void main (String[] args) {
        HotelKeeper keeper = new HotelKeeperImplementation();

        VegMenu v = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        BothMenu both = keeper.getBothMenu();

        v.getMenu();
        nv.getMenu();
        both.getMenu();
    }
}