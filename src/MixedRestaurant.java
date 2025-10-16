// Subsystem element
public class MixedRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        BothMenu b = new BothMenu();
        return b;
    }
}
