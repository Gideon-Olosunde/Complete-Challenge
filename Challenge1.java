
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.stage.WindowEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Challenge1
{
    private static TextField txtFieldRankings;
    private static TextField txtFieldCountry;
    private static TextField txtFieldName;
    public static void main(String args[]){

        launchFX();
    } 

    private static void launchFX(){
        new JFXPanel();
        Platform.runLater(()-> initialiseGUI());

    }

    private static void initialiseGUI(){
        Stage stage = new Stage();
        stage.setTitle("Top Universities For Computer Science ");
        stage.setResizable(false);
        Pane rootPane = new Pane();
        stage.setScene(new Scene(rootPane));
        stage.setWidth(1024);
        stage.setHeight(768);
        stage.show();// This presents the GUI
        stage.setOnCloseRequest((WindowEvent we) -> terminate()); //this call the function terminate when the X is press to close the GUI

        txtFieldRankings = new TextField();  // Creates text fields and set the location of the text field 
        txtFieldRankings.setLayoutX(400);
        txtFieldRankings.setLayoutY(250);
        txtFieldRankings.setPrefWidth(100);
        txtFieldRankings.setPromptText("Ranking");
        rootPane.getChildren().add(txtFieldRankings); // This adds the txt field to the GUI

        txtFieldCountry = new TextField();
        txtFieldCountry.setLayoutX(400);
        txtFieldCountry.setLayoutY(300);
        txtFieldCountry.setPrefWidth(100);
        txtFieldCountry.setPromptText("Country");
        rootPane.getChildren().add(txtFieldCountry);

        txtFieldName = new TextField();
        txtFieldName.setLayoutX(400);
        txtFieldName.setLayoutY(350);
        txtFieldName.setPrefWidth(100);
        txtFieldName.setPromptText("Name");
        rootPane.getChildren().add(txtFieldName);

        Image image = new Image("cat.png");
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        iv1.setLayoutX(130);
        iv1.setLayoutY(180);
        iv1.setFitWidth(200);
        iv1.setPreserveRatio(true);
        rootPane.getChildren().add(iv1);

        Button btn = new Button();
        btn.setText("Enter");
        btn.setLayoutX(350);
        btn.setLayoutY(249);
        btn.setOnAction((ActionEvent ae) -> printHello());
        rootPane.getChildren().add(btn);
        Label ranking = new Label("Enter details of top University");
        ranking.setLayoutX(400);
        ranking.setLayoutY(220);
        rootPane.getChildren().add(ranking);

    }
    private static void terminate()
    {
        System.out.println("bye bye!");
        System.exit(0);
    }

    private static void printHello(){
        System.out.println(txtFieldRankings.getText()+"," + txtFieldName.getText()+","+txtFieldCountry.getText());
    }

    public static void hello(){
        System.out.println("Hello");

    }
}
