// Subsystem element
public class NonVegRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}
