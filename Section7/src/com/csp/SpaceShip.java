package com.csp;

class SpaceShipControls {
    void up(int v) {
        System.out.println("up " + v);
    }

    void down(int v) {
        System.out.println("down " + v);
    }
}

/**
 * 代理
 */
public class SpaceShip {
    private String name;
    private SpaceShipControls spaceShipControls = new SpaceShipControls();

    SpaceShip(String name) {
        this.name = name;
    }

    //重写代理方法
    public void up(int v) {
        spaceShipControls.up(v);
    }

    public void down(int v) {
        spaceShipControls.down(v);
    }

    public static void main(String[] args){
        SpaceShip spaceShip = new SpaceShip("天宫号");
        spaceShip.up(2);
        spaceShip.down(3);
    }
}
