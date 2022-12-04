public class Robot {
    private boolean isPizzaDestroyed = false;
    private boolean isKnifeBroken = true;

    public Robot() {
        System.out.println("I can eat pizza only with knife but my knife is broken");
        usingItem = new MiniAx();
    }

    UsingItem usingItem;

    public void UseSmth() {
        if (isKnifeBroken == true) {
            if (usingItem.Using() == true) {
                isPizzaDestroyed = true;
                System.out.println("Robot destroyed pizza");
            }
        }else{
            System.out.println("I don't need use another instruments");
        }
    }
}
