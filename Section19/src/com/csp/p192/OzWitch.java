package com.csp.p192;

public enum OzWitch {
    WEST("WEST"),
    NORTH("NORTH"),
    EAST("EAST"),
    SOUTH("SOUTH");
    private String description;

    private OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;

    }

    public static void main(String[] args) {
        for (OzWitch ozWitch : OzWitch.values())
            System.out.println(ozWitch + ": " + ozWitch.getDescription());
    }
}
