package composite;

public class Room implements RoomComponent {
    private List<RoomComponent> components = new ArrayList<>();

    public void addComponent(RoomComponent component) {
        components.add(component);
    }

    public void removeComponent(RoomComponent component) {
        components.remove(component);
    }

    @Override
    public void control() {
        for (RoomComponent component : components) {
            component.control();
        }
    }
}