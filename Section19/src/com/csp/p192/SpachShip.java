package com.csp.p192;

public enum SpachShip {
    SCOUT, CARGO, CRUISER;

    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for (SpachShip s : SpachShip.values())
            System.out.println(s);
    }
}
