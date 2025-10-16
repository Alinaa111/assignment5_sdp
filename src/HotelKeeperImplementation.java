// Facade
public class HotelKeeperImplementation implements HotelKeeper {
    public VegMenu getVegMenu() {
        VegRestaurant v = new VegRestaurant();
        return (VegMenu)v.getMenus();
    }

    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant v = new NonVegRestaurant();
        return (NonVegMenu)v.getMenus();
    }

    public BothMenu getBothMenu() {
        MixedRestaurant v = new MixedRestaurant();
        return (BothMenu)v.getMenus();
    }
}
