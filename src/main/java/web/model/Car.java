package web.model;

public class Car {
    private String brand;
    private int series;
    private double engineV;

    public Car(String brand, int series, double engineV) {
        this.brand = brand;
        this.series = series;
        this.engineV = engineV;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public double getEngineV() {
        return engineV;
    }

    public void setEngineV(double engineV) {
        this.engineV = engineV;
    }

    @Override
    public String toString() {
        return "Car : " +
                "brand='" + brand + '\'' +
                ", series=" + series +
                ", engineV=" + engineV;
    }
}
