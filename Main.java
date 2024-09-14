public class Main {
    public static void main(String[] args) {
        
        Farm farm = new Farm("1"); 

        CowController controller = new CowController(farm);

        MainView mainView = new MainView(controller);
        mainView.setVisible(true);
        
    }
}
