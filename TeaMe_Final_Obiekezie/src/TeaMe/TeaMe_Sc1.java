package TeaMe;

/**
  * @author Cynthia Obiekezie 
  * CIT 244 Final
  * Fall 2023
 */



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class TeaMe_Sc1{
    private String core, spice, inf, usrName;
    public Circle submitBtn;
    private List infusion;
    
    public TeaMe_Sc1(){
        this.usrName = "";
        clear();
    }
    public Pane mainEvents() throws Exception {
        Pane pane = new Pane();
        Paint l_colors = Paint.valueOf(SCHEME.Sc2.smitten_pink);
        Paint h_colors = Paint.valueOf(SCHEME.Sc2.smitten_pink);
        
        //CREATE FORM
        GridPane form = new GridPane();
        form.setGridLinesVisible(false);
        form.setAlignment(Pos.TOP_LEFT);
        form.setHgap(15);
        form.setVgap(30);
        form.setPadding(new Insets(9,20,10,30));
        
        //Logo
        Image logoImg = new Image("logo.png",false);
        Circle logo = new Circle(50);
        logo.setFill(new ImagePattern(logoImg));
        form.add(logo, 0,0);
        
        //----Title
        Text scenetitle = new Text("Menu");
        scenetitle.setFill(h_colors);
        scenetitle.setFont(Font.font("Rage Italic",FontWeight.BOLD, 60));
        form.add(scenetitle, 1, 0, 2, 1);
        
        //----Name info
        Font mfont = Font.font("Arial", FontWeight.BOLD,11);
        
        Label nameLabel = new Label("Name for Order:");
        nameLabel.setTextFill(l_colors);
        nameLabel.setFont(mfont);
        form.add(nameLabel, 0, 1);
        TextField nameTXF = new TextField();
        nameTXF.setMaxWidth(220);
        form.add(nameTXF, 1, 1);
        
        //----Core Emotions Buttons
        String[] baseEmotions = {"Love", "Fear","Anger", "Sadness", "Joy", "Surprise"};
        Label leafLabel = new Label("Choose Tea Leaves:");
        leafLabel.setTextFill(l_colors);
        leafLabel.setFont(mfont);
        form.add(leafLabel,0, 2);
       
        GridPane coreform = new GridPane();
        coreform.setPadding(new Insets(0));
        coreform.setGridLinesVisible(false); 
        
        ToggleGroup coreEmoteGrp = new ToggleGroup();
        ArrayList<Label> labelArr = new ArrayList();
        
        //create infusion drop down before passing it
        ComboBox infusionDrpDwn = new ComboBox();
        infusionDrpDwn.setMaxWidth(220);
        infusionDrpDwn.getItems().addAll(this.infusion);
        
        for (String emo : baseEmotions) {
            Label lb = createRadioLabel(emo, coreEmoteGrp,form, infusionDrpDwn);
            labelArr.add(lb);
        }
        
        HBox hbox1 = new HBox(); //set the rows for radio buttons
        HBox hbox2 = new HBox();
        hbox1.setSpacing(50);
        hbox2.setSpacing(50);
        hbox2.setPadding(new Insets(5,0,0,15));

        for (int i = 0; i < labelArr.size(); i++) { //add labels x radios to rows
            if(i<3){
                hbox1.getChildren().add(labelArr.get(i));
            }
            else{
                hbox2.getChildren().add(labelArr.get(i));
            }
        }
        coreform.add(hbox1,0,0);
        coreform.add(hbox2, 0,1);
        form.add(coreform,1,2);
        
        //----Infusion dropdown menu
        Label infuseLable = new Label("Add Infusion:");
        infuseLable.setTextFill(l_colors);
        infuseLable.setFont(mfont);
        form.add(infuseLable,0, 3);
        form.add(infusionDrpDwn,1,3);
        
        //----Spice dropdown menu
        Label spiceLable = new Label("Choose your Spice:");
        spiceLable.setTextFill(l_colors);
        spiceLable.setFont(mfont);
        form.add(spiceLable,0, 4);
        
        SpiceCabinet openCabinet = new SpiceCabinet();
        ComboBox spiceDrpDwn = new ComboBox();
        spiceDrpDwn.setMaxWidth(220);
        
        infusionDrpDwn.setOnAction((e) -> {
            this.inf = infusionDrpDwn.getSelectionModel().getSelectedItem().toString();
            updateSpice(setSpiceList(openCabinet),spiceDrpDwn);     
        });
       
        form.add(spiceDrpDwn,1,4);
        

        VBox subBtn = createSubmitBtn(nameTXF,spiceDrpDwn);
        
        //Add all to the pane
        //----scene backdrop
        Canvas canvas = setDecoration();
        //----actionable events
        pane.getChildren().addAll(canvas, form, subBtn);
        
        return pane;
    }
    
    private static Canvas setDecoration() {
        //load bg & Barista image
        Image bg = new Image("cozy-pink-cafe.png", 1000,600, false, false);
        Image gir1 = new Image("barista-crossed.png",480,574, false, false);
       
        Canvas canvas = new Canvas(1000.0f,600.0f);
        GraphicsContext gfxContent = canvas.getGraphicsContext2D();
        gfxContent.drawImage(bg, 0, 0,bg.getWidth(),bg.getHeight());
        
        //menu rectangle
        gfxContent.setFill(Paint.valueOf(SCHEME.Sc1.faded_red));
        gfxContent.fillRect(0,0, 400, 600);
        //place barista
        gfxContent.drawImage(gir1, 600, 120);//, gir1.getHeight(), gir1.getWidth());
        
        return canvas;
    }
    private Label createRadioLabel(String text, ToggleGroup tg, GridPane f, ComboBox infDrpDwn) {
        Label label = new Label(text);
        RadioButton rb = new RadioButton();
        rb.setToggleGroup(tg);
        rb.setOnAction((e) ->{
            this.core = label.getText();
            setInfusionList();
            updateInfusion(infDrpDwn);
        });
        label.setTextFill(Paint.valueOf(SCHEME.Sc2.sand));
        label.setGraphic(rb);
        label.setContentDisplay(ContentDisplay.TOP);
        
        return label;
    }
    private VBox createSubmitBtn( TextField nameTXF,ComboBox spiceDrpDwn){
        Image submitImgG = new Image("sub_grey.png",false);
        Image submitImg = new Image("submit.png",false);
        this.submitBtn = new Circle(50);
        submitBtn.setFill(new ImagePattern(submitImgG));
        submitBtn.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, (e) -> {
            submitBtn.setFill(new ImagePattern(submitImg));
            this.usrName = nameTXF.getText();
            this.spice = spiceDrpDwn.getSelectionModel().getSelectedItem().toString();
            //System.out.println("Loading...");
 
        });
        submitBtn.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, (e) -> {
            submitBtn.setFill(new ImagePattern(submitImgG));
        });
        VBox vb = new VBox(submitBtn);
        vb.setLayoutX(150);
        vb.setLayoutY(450);
        return vb;
    }
    
    private void setInfusionList(){
        switch(core.toLowerCase()){
            case "love":
                this.infusion = new SecondaryEmotions().love(core);
                break;
            case "fear":
                this.infusion = new SecondaryEmotions().fear(core);
                break;
            case "anger":
                this.infusion = new SecondaryEmotions().anger(core);
                break;
            case "sadness":
                this.infusion = new SecondaryEmotions().sadness(core); 
                break;
            case "joy":
                this.infusion = new SecondaryEmotions().joy(core);
                break;
            case "surprise":
                this.infusion = new SecondaryEmotions().suprise(core);
                break;
            default:
                break;
        }
    }
    private void updateInfusion(ComboBox infusionDrpDwn){
        if (!infusionDrpDwn.getItems().isEmpty()) {
            infusionDrpDwn.getItems().clear();
        }
        infusionDrpDwn.getItems().addAll(this.infusion);
        
    }
    private List setSpiceList(SpiceCabinet cabinet){
            List spiceList;
            switch(core.toLowerCase()){
            case "love":
                spiceList = cabinet.love(inf);
                break;
            case "fear":
                spiceList = cabinet.fear(inf);
                break;
            case "anger":
                spiceList = cabinet.anger(inf);
                break;
            case "sadness":
                spiceList = cabinet.sadness(inf); 
                break;
            case "joy":
                spiceList = cabinet.joy(inf);
                break;
            case "surprise":
                spiceList = cabinet.suprise(inf);
                break;
            default:
                spiceList = Arrays.asList("nothing"); 
                break;
        }
            return spiceList;
    }
    private void updateSpice(List spiceList,ComboBox spiceDrpDwn){
        if (!spiceDrpDwn.getItems().isEmpty()) {
            spiceDrpDwn.getItems().clear();
        }
        spiceDrpDwn.getItems().addAll(spiceList);
    }
       
    public String getCore(){
        return this.core;
    }
    public String getSpice(){
        return this.spice;
    }
    public String getInfusion(){
        return this.inf;
    }
    public String getUser(){
        return this.usrName;
    }
    
    public void clear(){
        this.core = "";
        this.inf = "";
        this.spice = "";
        this.infusion = new ArrayList();
    }

}
