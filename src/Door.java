public class Door {
    private int width;
    private int height;
    private String model = "x22";
    private String name = "ceramic";

    public String getModel(){
        return model;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println("The name of the door is :" + name + ", model number : " + model);
    }
}
