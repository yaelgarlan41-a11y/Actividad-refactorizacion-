import java.util.ArrayList;
import java.util.List;

public class InventarioServicio {
    private List<Item> listaItems = new ArrayList<>();

    public boolean agregarItem(String id, String nombre, double precio) {
        if (precio <= 0) {
            return false;
        }
        listaItems.add(new Item(id, nombre, precio));
        return true;
    }

    public List<Item> obtenerTodos() {
        return listaItems;
    }
}
