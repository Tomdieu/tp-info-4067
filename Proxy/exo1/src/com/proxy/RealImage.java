package com.proxy;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename){
        this.filename = filename;
        this.loadImageFromDisk();

    }

    private void loadImageFromDisk(){
        System.out.println("Loading image : "+filename);
    }

    public void display(){
        System.out.println("Displaying image : "+filename);
    }    
}
