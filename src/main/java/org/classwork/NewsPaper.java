package org.classwork;

public class NewsPaper extends Publication {
    public NewsPaper(String name) {
        super(name);
    }

    public void readNewsPaper() {
        System.out.println("readNewsPaper:\t" + this.getName());
    }
}
