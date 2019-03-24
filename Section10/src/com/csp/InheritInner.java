package com.csp;

class WidthInner {
    class Inner{}
}

public class InheritInner extends WidthInner.Inner {
    InheritInner(WidthInner widthInner){
        widthInner.super();
    }

    public static void main(String[] args){
        WidthInner widthInner = new WidthInner();
        InheritInner inheritInner = new InheritInner(widthInner);
    }
}
