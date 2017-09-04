
package simpleclient;

public class Main {

    public static void main(String[] args) {
        
        ServerInterface serverInterface = new ServerInterface();
        UI ui = new UI();
        DataHandler dataHandler = new DataHandler();
        
        ui.setServerInterface(serverInterface);
        ui.setDataHandler(dataHandler);
        ui.setTitle("Simple Client");
        ui.start();
    }
    
}
