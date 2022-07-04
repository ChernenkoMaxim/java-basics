package org.itmo.java.lesson2;

public class Mobile {
    private String type;
    private String brand;
    private String model;
    private int simCards;
    private Color color;
    private long price;
    private double memory;
    private boolean isNew;

    public Mobile(String type, String brand, String model, int simCards, Color color, long price, double memory, boolean isNew) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.simCards = simCards;
        this.color = color;
        this.price = price;
        this.memory = memory;
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", simCards=" + simCards +
                ", color=" + color +
                ", price=" + price +
                ", memory=" + memory +
                ", isNew=" + isNew +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSimCards() {
        return simCards;
    }

    public void setSimCards(int simCards) {
        this.simCards = simCards;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
