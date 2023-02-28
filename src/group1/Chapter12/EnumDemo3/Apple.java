package group1.Chapter12.EnumDemo3;

public enum Apple {
    JOHNATHAN(10),
    GOLDEN_DEL(9),
    RED_DEL(12),
    WINESAP(15),
    CORTLAND(8);
    private int price;

    Apple(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
