package com.practice;

interface Camera {
    void takeSpan();
    void recordVideo();
    /*void record4KVideo(); error while updating interface
      that why we are using default method.
     */
    default void record4KVideo(){
        System.out.println("Taking video in 4K");
    }
}

interface Wifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class CellPhone {
    void callNumber(int number) {
        System.out.println("Calling" + number);
    }

    void pickCall(int number) {
        System.out.println("Connecting" + number);
    }
}

class MySmartPhone extends CellPhone implements Camera, Wifi{
    public void takeSpan(){
        System.out.println("Taking span");
    };

    public void recordVideo(){
        System.out.println("Recording start...");
    };
    public String[] getNetworks(){
        String[] ar = {"Net1", "Net2","Net3", "Net4"};
        return ar;
    };

    public void connectToNetwork(String network){
        System.out.println("Connecting with " + network);
    };

    public void record4KVideo(){
        System.out.println("Taking span and Taking video in 4K");
    }

}

public class DemoDefaultMethod {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getNetworks();

        for ( String data:ar) {
            if(data == "Net1"){
                ms.connectToNetwork(data);
            }
        }

        ms.record4KVideo();
    }

}
