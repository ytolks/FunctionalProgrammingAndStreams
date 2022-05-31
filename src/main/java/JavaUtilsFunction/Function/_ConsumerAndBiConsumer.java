package JavaUtilsFunction.Function;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _ConsumerAndBiConsumer {
    public static void main(String[] args) {
        _ConsumerAndBiConsumer consumer = new _ConsumerAndBiConsumer();
        consumer.appleConsumer.accept(new Apple("green", 120));
        consumer.appleConsumerV2.accept(new Apple("red", 130), true);
    }

    Consumer<Apple> appleConsumer = apple -> System.out.println(
            "In the store 2 big " + apple.getColor()
                    + " " + apple.getWeight() + "gram apples"
    );
    BiConsumer<Apple, Boolean> appleConsumerV2 = (apple, showKgms) ->
            System.out.println(
                    "In the store 2 big " + apple.getColor()
                            + " apples with weight of 120 grams - " +
                            (showKgms ? apple.getWeight() == 120 : " does not exist"
                            ));
}

class Apple {
    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
