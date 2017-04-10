package test.maven.helloWorldJavaFx;

import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import test.maven.policyCreateAndPrint.PolicyConsolePrinter;
import test.maven.policyCreateAndPrint.PolicyCreator;
import test.maven.policyData.Policy;
 
public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    PolicyCreator creator = new PolicyCreator();
    List<Policy> policyList = creator.getPolicyList();
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                System.out.println(PolicyConsolePrinter.printAll(policyList));
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}