package gui.controllers.space.open.model;

import api.dto.DtoOpenSpace;
import javafx.beans.property.*;

public class OpenSpace {

    private final IntegerProperty id;
    private final StringProperty name;
    private final BooleanProperty available;
    private final IntegerProperty capacity;

    public OpenSpace(DtoOpenSpace dtoSpace) {
        this.id = new SimpleIntegerProperty(dtoSpace.getId());
        this.name = new SimpleStringProperty(dtoSpace.getName());
        this.available = new SimpleBooleanProperty(dtoSpace.isAvailable());
        this.capacity = new SimpleIntegerProperty(dtoSpace.getCapacity());
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public boolean getAvailable() {
        return available.get();
    }

    public BooleanProperty availableProperty() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available.set(available);
    }

    public int getCapacity() {
        return capacity.get();
    }

    public IntegerProperty capacityProperty() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity.set(capacity);
    }

}
