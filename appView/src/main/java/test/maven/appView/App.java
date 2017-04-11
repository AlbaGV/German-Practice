package test.maven.appView;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import test.maven.policyCreateAndPrint.PolicyConsolePrinter;
import test.maven.policyCreateAndPrint.PolicyCreator;
import test.maven.policyData.AssuranceComponent;
import test.maven.policyData.Policy;

public class App extends Application {
	private Stage stage;
	PolicyCreator creator = new PolicyCreator();
	//java.util.List<Policy> policyList = creator.getPolicyList();
	List<AssuranceComponent> assuranceComponentList = creator.getAllAssuranceComponents();
	List<Integer> idList = new ArrayList<Integer>();
	private TableView<Policy> table = new TableView<Policy>();
	private final ObservableList<Policy> policyList = FXCollections.observableArrayList(creator.getPolicyList());
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		primaryStage.setWidth(400);
		primaryStage.setHeight(400);
		Scene scene = logInScene();
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public Scene logInScene() {
		Pane root = new Pane();
		BackgroundFill color = new BackgroundFill(Color.AZURE, null, null);
		Background paint = new Background(color);
		root.setBackground(paint);
		root.setPrefSize(400, 400);
		Button createPolicyButton = new Button("Create Policy");
		createPolicyButton.setLayoutX(150);
		createPolicyButton.setLayoutY(200);
		createPolicyButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				stage.setScene(createPolicyScene());
			}
		});
		root.getChildren().add(createPolicyButton);
		return new Scene(root);
	}

	protected Scene createPolicyScene() {
		VBox root = new VBox();
		root.setPrefSize(400, 400);
		BackgroundFill color = new BackgroundFill(Color.AZURE, null, null);
		Background paint = new Background(color);
		root.setBackground(paint);
		// ----------------------------------------------------
		ListView<String> policyListFx = new ListView<String>();
		policyListFx.getItems().addAll(PolicyConsolePrinter.printAll(policyList));
		//-----------------------------------------------------
		TableColumn dateOfBeginningCol = new TableColumn("Date of Beginning");
		dateOfBeginningCol.setCellValueFactory(new PropertyValueFactory<Policy, String>("dateOfBeginning"));
		TableColumn dateOfEndCol = new TableColumn("Date of End");
		dateOfEndCol.setCellValueFactory(new PropertyValueFactory<Policy, String>("dateOfEnd"));
		
		//TODO Show coverage details in the table
		TableColumn coverageCol = new TableColumn("Coverage(s)");
		coverageCol.setCellValueFactory(new PropertyValueFactory<Policy, String>("coverageList"));

		table.setItems(policyList);
		table.getColumns().addAll(dateOfBeginningCol, dateOfEndCol, coverageCol);

		// ----------------------------------------------------
		ListView<Integer> idListFx = new ListView<Integer>();

		idListFx.getItems().addAll(PolicyConsolePrinter.createIdList(idList, assuranceComponentList));
		Button workButton = new Button("This work?");
		workButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				System.out.println("Work!!");
			}
		});
		root.getChildren().addAll(policyListFx,table, new Text("IDs"), idListFx);
		root.getChildren().add(workButton);
		return new Scene(root);
	}

	public static void main(String[] args) {
		launch(args);
	}

}