package com.csp;

class Game{
    Game(int i){
        System.out.println("Game");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame");
    }
}

/**
 * 调用基类构造器是在子类构造器中要做的第一件事
 */
public class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println("Chess");
    }

    public static void main(String[] args){
        Chess c = new Chess();
    }
}
