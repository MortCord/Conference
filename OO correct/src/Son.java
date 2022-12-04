public class Son extends Father {
    void playFootball(){
        System.out.println("Son played with football");
    }
    void playCompGames(){
        System.out.println("Son is playing comp games");
    }

    @Override
    void goBuyProducts(){
        System.out.println("Son go buy products");
    }

    @Override
    void fixSmth(){
        System.out.println("Son fix smth");
    }
}