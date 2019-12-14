package org.hyperskill.samples.oop.protectedmodifier;

public class SmartPhone extends MobileGadget {

    private Laptop connectedLaptop;

    public SmartPhone() {
        this.connectedLaptop = new Laptop();
    }

    private void sendInfoToLaptop(String data) {
        printNotification("Sending data to laptop : "  + data);
        connectedLaptop.receiveInfo(data);
    }
}
