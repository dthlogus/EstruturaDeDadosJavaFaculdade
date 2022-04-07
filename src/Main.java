import controller.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        try {

        }catch (Exception e){
            System.out.printf(e.getMessage());
            Main.main(args);
        }
    }
}
