package fibonacciseriesfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @author Mauricio Belduque <m.belduque@hotmail.com>
 */
public class FibonacciSeriesFX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLFibonacciAppView.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Fibonacci Series");
        stage.getIcons().add(new Image("fibonacciseriesfx/resources/Typicons_e06b(0)_128.png"));
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
