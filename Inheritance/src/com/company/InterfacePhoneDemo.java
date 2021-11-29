package com.company;
interface Camera {
    void takeSnap();
    void recordVideo();
}
    interface Wifi{
        String[]getNetworks();
        void connectToNetwork(String network);
    }
class MyCellPhone{
    void takeSnap()
    {
        System.out.println("Taking a Picture");
    }
    //void recordVideo()
    //{
    //   System.out.println("Recording...");
    //}
    void callNumber(int phoneNumber){
        System.out.println("Calling... "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartphone extends MyCellPhone implements Wifi,Camera {
    public void takeSnap() {
        System.out.println("Taking a Picture");
    }

    public void recordVideo() {
        System.out.println("Recording...");
    }

    public String[] getNetworks() {
        System.out.println("Getting the list of available networks..");
        String[] networkList = {"Harry", "Ronit", "Sahil"};
        return networkList;
    }

    public void connectToNetwork(String Network) {
        System.out.println("Connecting to " + Network);
    }
}
public class InterfacePhoneDemo {
    public static void main(String[] args) {
        MySmartphone realme=new MySmartphone();
        String[]ar=realme.getNetworks();
        for(String item:ar)
        {
            System.out.println(item);
        }
    }
}
