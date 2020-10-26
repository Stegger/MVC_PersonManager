package personmanager.gui.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import personmanager.gui.javafx.mainView.Controller;
import personmanager.gui.javafx.model.PersonModel;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        PersonModel personModel = new PersonModel();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainView/person.fxml"));

        Parent root = loader.load();
        Controller controller = loader.getController();
        controller.setPersonModel(personModel);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
