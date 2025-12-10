package ie.atu.productv3;

public class TV extends Product {

    private String screenSize;
    private String manufacturer;

    public TV() {
        super();
        screenSize = "";
        manufacturer = "";
        count++;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + "\nScreen size is " + screenSize
                + "\nby " + manufacturer;
    }
}
