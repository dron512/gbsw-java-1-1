package entity;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
public class Car {
    private String model;
    private String color;
    private int Speed;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSpeed() {
        return Speed;
    }
    public void setSpeed(int speed) {
        Speed = speed;
    }

    public Car(){}
    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        Speed = speed;
    }
    public Car(String model) {
        this.model = model;
    }
    @Override   // 오버라이드 재정의
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", Speed=" + Speed +
                '}';
    }

}