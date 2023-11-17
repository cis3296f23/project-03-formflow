package src;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main {
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(""));
        Scene scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.setTitle("Container2");
        stage.show();
    }
    public static void main(String[] args){
        launch(args);

    }

}