package quiz2;

public final class AdvancedMachine extends Machine {
    private static int totalCost = 0;
    private static final double TAX_RATE = 0.1;

    public AdvancedMachine(String model, int price) {
        super(model, price);
        totalCost += price;
    }

    @Override
    public int getPrice() {
        return (int)(super.getPrice() * (1 + TAX_RATE));
    }

    public static int getTotalPrice() {
        return totalCost;
    }
}
