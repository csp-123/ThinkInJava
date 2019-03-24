package com.csp.p197;

public interface Food {
    enum Appetizer implements Food {
        SALAD, SOUP, SPRING_ROLLS;
    }

    enum MainCourse implements Food {
        LASAGNE, BURRITO, PAD_THAI;
    }

    enum Dessert implements Food {
        GELATO, FRUIT;
    }

    enum Coffee implements Food {
        LATTE, TEA, CAPPUCCINO;
    }
}
