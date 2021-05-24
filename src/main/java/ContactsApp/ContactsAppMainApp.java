package ContactsApp;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class ContactsAppMainApp extends Application{
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ContactsApp.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setTitle("Contacts App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
