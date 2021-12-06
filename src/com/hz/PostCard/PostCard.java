package com.hz.PostCard;

public abstract class PostCard {
    public void print() {
        this.printHeader();
        this.printMessage();
        this.printImage();
        this.printFooter();
    }

    protected abstract void printHeader();

    protected abstract void printMessage();

    protected abstract void printImage();

    protected abstract void printFooter();
    
}
