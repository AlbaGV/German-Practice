package test.maven.helloWorldJavaFx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import test.maven.policyCreateAndPrint.PolicyConsolePrinter;
import test.maven.policyCreateAndPrint.PolicyCreator;
import test.maven.policyData.Policy;
 
public class App extends Application {
    private Stage stage;
    PolicyCreator creator = new PolicyCreator();
    java.util.List<Policy> policyList = creator.getPolicyList(); 
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Scene scene = logInScene();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public Scene logInScene(){
        Pane root = new Pane();
        Button createAccountButton = new Button("create account");
        createAccountButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  stage.setScene(CreateAccountScene());
            }
       });
        root.getChildren().add(createAccountButton);
        return new Scene(root);
    }
    protected Scene CreateAccountScene() {
        VBox root = new VBox();
        ListView<String> list = new ListView<String>();
        list.getItems().addAll(PolicyConsolePrinter.printAll(policyList));
        Button createAccountButton = new Button("create account");
        createAccountButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
                  System.out.println("Work!!");
            }
       });
        root.getChildren().add(list);

        root.getChildren().add(createAccountButton);
        return new Scene(root);
    }
    public static void main(String[] args) {
        launch(args);
    }

}