package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			// stage > scene > container > node
			
			Button button1 = new Button();
			button1.setText("Button");
			button1.prefWidthProperty().bind(pane.widthProperty()); //pane의 가로랑 길이 맞추기
			button1.prefHeightProperty().bind(pane.heightProperty());
			
			pane.getChildren().add(button1);
			pane.setStyle("-fx-border-color: black;");
			
			stage.setScene(scene);
			stage.show();
			
			
//			//3번째 수업			
//			Label label = new Label();
//			label.setText(Integer.toString(num));
//			label.setStyle("-fx-font-size:30");
//			
//			Button button = new Button();
//			button.setText("ADD");
//			button.setStyle("-fx-font-size: 15;");
//			button.setOnAction(e->{
//				num++;
//				label.setText(Integer.toString(num));
//			});
//			
//			StackPane pane = new StackPane();
//			pane.getChildren().addAll(label, button);
//			StackPane.setAlignment(label, Pos.TOP_CENTER);
//			StackPane.setAlignment(button, Pos.BOTTOM_CENTER);
//			
//			Scene scene = new Scene(pane, 800,500);
//			stage.setScene(scene);
//			stage.show();
			
			
			// 2번쨰 수업
////			Pane pane = new Pane();
//			Label text = new Label();
//			text.setText("Hello World");
//			//CSS
//			text.setStyle("-fx-font-size: 30; -fx-text-fill: red; -fx-background-color: yellow;"
//					+ "-fx-border-color: black");
//			
//			StackPane pane = new StackPane();
//			pane.getChildren().add(text);
//			
//			Scene scene = new Scene(pane,800,500);
//			
//			stage.setScene(scene);
//			
//			stage.show();
//			stage.setTitle("Master Jung");
//			stage.setResizable(false); // 창 크기 변경을 못하게 막음
			
			
//			기본 값들
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
//	int num = 0; //3번째 수업
	StackPane pane = new StackPane();
	Scene scene = new Scene(pane, 100, 100);

	
	public static void main(String[] args) {
		launch(args);
	}
}
