package Composition;

public class Television {
    private String name;
    private int size;
    private String model;

    public Television(String name, int size, String model ) {
        this.name = name;
        this.model = model;
        this.size = size;
    }

    public Television() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int width, int length) {
        size = width * length;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {

        return size;
    }

    public String getModel() {
        return model;
    }
}
