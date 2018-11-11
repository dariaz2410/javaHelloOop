package com.company;

public class Fruit {

    // тип
    private FruitType type;

    // цвет
    private Color color;

    // вес (кг)
    private double weight;

    // цена за кг
    private double priceKg;

    public Fruit(FruitType type) {
        this.type = type;
    }

    public Fruit(FruitType type, Color color, double weight, double priceKg) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.priceKg = priceKg;
    }
    //====================================

    public double price() {
        return weight * priceKg;
    }

    //====================================

    public double getWeight() {
        return weight;
    }

    public FruitType getType() {
        return type;
    }

    public double getPriceKg() {
        return priceKg;
    }

    //====================================


    public void setType(FruitType type) {
        this.type = type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPriceKg(double priceKg) {
        this.priceKg = priceKg;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", color=" + color +
                ", weight=" + weight +
                ", priceKg=" + priceKg +
                '}';
    }
}
