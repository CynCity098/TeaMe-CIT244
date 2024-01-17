/**
  * @author Cynthia Obiekezie 
  * James Winyard CIT 244
  * Fall 2023
 */
package TeaMe;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class mainStage extends Application{
 

    @Override
    public void start(Stage stage) throws Exception {
        TeaMe_Sc1 sc1 = new TeaMe_Sc1();
        Pane pane1 = sc1.mainEvents();
        Circle submitSc1 = sc1.submitBtn;
        Scene scene1 = new Scene(pane1);
        
        TeaMe_Sc2 sc2 = new TeaMe_Sc2();
        submitSc1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                if (!Invalid(sc1.getUser(), sc1.getCore(),
                        sc1.getInfusion(), sc1.getSpice())) {
                    
                    sc2.setName(sc1.getUser());;
                    sc2.setCore(sc1.getCore());
                    sc2.setInfusion(sc1.getInfusion());
                    sc2.setSpice(sc1.getSpice());
                    
                    try {
                        Pane pane2 = new Pane(sc2.mainEvents());
                        Scene scene2 = new Scene(pane2);
                        stage.setScene(scene2);
                    } catch (Exception ex) {
                        System.out.println("crashed at mainStage");
                    }
                }
                else{
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Oops...Spilled Tea!");
                    alert.setHeaderText("Missing Ingredients!");
                    alert.setContentText("Hey there Emotional Emu!\n\n"
                            + "We dont need your NAME but finish up ALL fields on the form.\n"
                            + "That way we know how mood-tea you're feeling! \nTry again.");
                    alert.showAndWait();
                }
                    Circle newFormBtnSc2 = sc2.newFormBtn;
                    //back to scene 1
                    newFormBtnSc2.addEventHandler(MouseEvent.MOUSE_CLICKED,(back) -> { 
                        stage.setScene(scene1);
                        sc2.reciept();
                        System.out.println(sc2.sessionInfo());
                    });
                 
            }
        });
        
/*
____________________________
*/
//        TeaMe_Sc2 sc1 = new TeaMe_Sc2();
//        Pane pane1 = sc1.mainEvents();
//        //Circle submitSc1 = sc1.submitBtn;
//        Scene scene1 = new Scene(pane1);
/*
____________________________
*/              
        stage.setTitle("TEA ME");
        stage.setScene(scene1);
        stage.setResizable(false);
        stage.show();

    }
    private boolean isBlank(String field){
        return field == "";
    }
    private boolean Invalid(String n, String c, String i, String sp){
        String[] section = {n,c,i,sp};
        for (String field : section) {
            if(isBlank(field)) return true;
        }
        return false;
    }
    public static void main(String[] args) { 
        launch(args);
    }
}
