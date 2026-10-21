import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TestJavaFX extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("JavaFX fonctionne !");
        Button bouton = new Button("Cliquez ici");
        bouton.setOnAction(e -> label.setText("Bouton cliqué : JavaFX OK"));
        VBox root = new VBox(10, label, bouton);
        root.setStyle("-fx-padding: 20;");
        stage.setTitle("Test JavaFX");
        stage.setScene(new Scene(root, 300, 120));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}