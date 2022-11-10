public class Main {
    void run () {
        Player player = new Player();
        player.initAttributes();
        player.printAttributes();
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
