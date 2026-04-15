package April15;
class Device {
    String brandName;
    Device(String brandName) {
        this.brandName = brandName;
    }
    void showBrand() {
        System.out.println("The brand name of device is: " + brandName);
    }
}

class MobilePhone extends Device {
    int screenSize;
    MobilePhone(String brandName, int screenSize) {
        super(brandName);
        this.screenSize = screenSize;
    }
    void showScreenSize() {
        System.out.println("The screen size of device is: " + screenSize + "inches");
    }
}

class SmartPhone extends MobilePhone {
    String OS;
    SmartPhone(String brandName, int screenSize, String OS) {
        super(brandName, screenSize);
        this.OS = OS;
    }

    void showOS() {
        System.out.println("The operating system of device is: " + OS);
    }
    void showDetails() {
        System.out.println("The mobile's deials are as follow: ");
        showBrand();
        showScreenSize();
        showOS();
    }
}

public class practical {
    public static void main(String[] args) {
        SmartPhone M35 = new SmartPhone("Samsung",16,"Android");
        M35.showDetails();
    }
}
