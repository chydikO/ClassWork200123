package org.classwork;

public class Magazine extends Publication {
    public Magazine(String name) {
        super(name);
    }

    public void readMagazine() {
        System.out.println("readMagazine:\t" + this.getName());
    }
}
