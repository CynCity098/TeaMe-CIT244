
package TeaMe;
/**
  * @author Cynthia Obiekezie 
  * James Winyard CIT 244
  * Fall 2023
 */

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class TeaMe_Sc2 {
    private String name, core, infusion, spice;
    private String[] teaCompInfo;
    public Circle newFormBtn, randomTeaBtn, exitBtn;
    
    public TeaMe_Sc2(){
        this.name = "Adaeze";
        this.core = "fear";
        this.infusion = "terrified";
        this.spice = "hysterical";
    }
    public TeaMe_Sc2(String n, String c, String i, String s){
        this.name = n;
        this.core = c;
        this.infusion = i;
        this.spice = s;
               
    }
    
    public Pane mainEvents() throws Exception{
        Pane pane = new Pane();
        Text[] teaInfo = setTeaInfoSec();
        
        //CREATE labels pane
        GridPane form = new GridPane();
        form.setGridLinesVisible(false);
        form.setAlignment(Pos.TOP_RIGHT);
        form.setLayoutX(450);
        form.setLayoutY(0);
        form.setHgap(0);
        form.setVgap(35);
        form.setPadding(new Insets(50,20,10,50));
        
        //----Side Tags
        Font t_font = Font.font("Rage Italic",FontWeight.NORMAL, 35);
        Font sub_font = Font.font("Ink Free",FontWeight.NORMAL, 20);
        Font pgh_font = Font.font("Arial",FontWeight.THIN, 12);
        Font focus_font = Font.font("Ink Free",23);
        
        //Title tag
        HBox ttlTag = tags("Order for: ", t_font);
        form.add(ttlTag, 0, 0, 1, 1);
        
        Text n = new Text(this.name);
        n.setFont(pgh_font);
        n.setFill(Paint.valueOf(SCHEME.Sc2.burnt_orange));
        form.add(n, 1, 0);
        
        HBox flvr = tags("Flavor ", sub_font);
        flvr.setAlignment(Pos.CENTER_RIGHT);
        flvr.setMaxWidth(100);
        form.add(flvr,0,4);
        VBox flvrInfo = displayInfo(teaInfo[1], pgh_font);
        form.add(flvrInfo,1,4);
        
        HBox beni = tags("Benefits ", sub_font);
        beni.setAlignment(Pos.CENTER_RIGHT);
        beni.setMaxWidth(100);
        form.add(beni,0,5);
        VBox beniInfo = displayInfo(teaInfo[2], pgh_font);
        form.add(beniInfo,1,5);
        
        //tea img section
        VBox tea_cont = teaImg("logo.png",teaInfo[0].getText(),focus_font);
        
        Canvas canvas = setDecoration();
        
        pane.getChildren().addAll(canvas,tea_cont,form, createButtons(), getQuote());
        
        return pane;
    }
    
    private Canvas setDecoration(){
        //load bg & Barista image
        Image bg = new Image("cozy-pink-cafe.png", 1000, 600, false, false);
        Image gir1 = new Image("barista-ok.png",480,574, false, false);
        Canvas canvas = new Canvas(1000.0f,600.0f);
        GraphicsContext gfx = canvas.getGraphicsContext2D();
        gfx.drawImage(bg, 0, 0,bg.getWidth(),bg.getHeight());
        
        //menu rectangle
        gfx.setFill(Paint.valueOf(moodColor()));
        gfx.fillRect(600,0, 400, 600);
        //speech bubble
        gfx.setFill(new ImagePattern(new Image("speech-bubble-hi.png",false)));
        gfx.fillRect(310, 120, 250, 200);
        //place barista
        gfx.drawImage(gir1, -50, 50);
        
        
        return canvas;
    }
    private HBox createButtons(){
    //Buttons
        //go back to form btn
        Image backBtnG = new Image("order_grey.png",false);
        Image backBtnS = new Image("order.png",false);
        this.newFormBtn = new Circle(32); 
        newFormBtn.setFill(new ImagePattern(backBtnG));
        
        this.newFormBtn.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, (e) -> {
            newFormBtn.setFill(new ImagePattern(backBtnS));
            //System.out.println("Going Back...");
        });
        this.newFormBtn.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, (e) -> {
            newFormBtn.setFill(new ImagePattern(backBtnG));
        });
        
        //exit program btn
        Image eBtnG = new Image("close_grey.png",false);
        Image eBtnS = new Image("close.png",false);
        this.exitBtn = new Circle(30); 
        exitBtn.setFill(new ImagePattern(eBtnG));
        
        this.exitBtn.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, (e) -> {
            exitBtn.setFill(new ImagePattern(eBtnS));
        });
        this.exitBtn.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, (e) -> {
            exitBtn.setFill(new ImagePattern(eBtnG));
        });    
        this.exitBtn.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
            this.reciept();
            System.exit(0);
        });
        HBox btnBox = new HBox(newFormBtn, exitBtn);
        btnBox.setSpacing(150);
        btnBox.setLayoutX(670);
        btnBox.setLayoutY(510);
        
        return btnBox;
}
    private String moodColor(){
        switch(this.core.toLowerCase()){
            case "love":
                return SCHEME.Sc2.lgt_lvndr;
            case "fear":
                return SCHEME.Sc2.lgt_peach;
            case "anger":
                return SCHEME.Sc2.orange;
            case "sadness":
                return SCHEME.Sc2.lgt_blue;
            case "joy":
                return SCHEME.Sc2.bb_yellow;
            case "surprise":
                return SCHEME.Sc2.easter_green;
            default:
                return "#000000";
        }
    }
    private TextArea getQuote(){
        //Text q = new Text(340,150,"Words of Wisdom:\n\n" + new Quotes().getQuote(spice));
        TextArea ta = new TextArea();
        ta.setMaxSize(180, 110); //w , h
        ta.setText(new Quotes().getQuote(spice));
        ta.setLayoutX(340);
        ta.setLayoutY(135);
        ta.setEditable(false);
        ta.setWrapText(true);
        ta.setFont(Font.font(11));
        ta.setStyle("-fx-focus-color: transparent; -fx-text-box-border: transparent; -fx-text-fill:" + SCHEME.Sc2.burnt_orange);
        
        
       return ta;
    }
    private Text[] setTeaInfoSec(){
        teaCompInfo = new Tea(core,infusion).getTeaInfo();
        Text[] text = new Text[4];
        Font font = Font.font(15);
        for (int i = 0; i < teaCompInfo.length; i++) {
            text[i] = new Text(teaCompInfo[i]);
            text[i].setFont(font);
            text[i].setFill(Paint.valueOf(SCHEME.Sc2.smitten_pink));
        }
        
        return text;
    }
    private VBox teaImg(String file, String tName,Font f){
      
        Circle pic = new Circle(70); 
        pic.setFill(new ImagePattern(new Image(file, false)));
        Label lb = new Label(tName);
        lb.setFont(f);
        lb.setTextFill(Paint.valueOf(SCHEME.Sc2.brown));
        lb.setGraphic(pic);
        lb.setContentDisplay(ContentDisplay.TOP);
        VBox container = new VBox(lb);
        container.setLayoutX(720);
        container.setLayoutY(20);
        
        return container;
    }
    
    private HBox tags(String t, Font f){
        
        Label txt = new Label(t);
        HBox hb = new HBox(txt);
        //Title items
        if (t.equalsIgnoreCase("Order for: ")){
            hb.setPadding(new Insets(0,10,7,10));
            hb.setBackground(new Background(new BackgroundFill(Paint.valueOf(SCHEME.Sc2.sand),new CornerRadii(5),null)));
        }else{ //lower labels 
            Rectangle r = new Rectangle(95,45);
            r.setFill(Paint.valueOf(SCHEME.Sc2.sand));
            r.setArcHeight(15);
            r.setArcWidth(15);
            txt.setGraphic(r);
        }
        //all
        txt.setContentDisplay(ContentDisplay.CENTER);
        txt.setFont(f);
        txt.setTextFill(Paint.valueOf(SCHEME.Sc2.brown));
        
        
        return hb;
    }
    private VBox displayInfo(Text txt, Font f){
        txt.setFont(f);
        txt.setWrappingWidth(300);
        txt.setStyle("-fx-line-spacing: 5px");
        VBox vb = new VBox(txt);
        return vb;
    }
    
    public void setName(String n){
       this.name = n; 
    }
    public void setCore(String c){
       this.core = c; 
    }
    public void setInfusion(String inf){
       this.infusion = inf ; 
    }
    public void setSpice(String sp){
       this.spice = sp ; 
    }
    public String sessionInfo(){
        double tax =  Math.random()*3.50;
        double cost = tax + Math.random()*9.98;
        return "-------- RECEIPT -------\n"
                + core +" " + teaCompInfo[0]
                + " with a " + infusion + " infusion."
                + "\n\n+Spice: " + spice
                +"\n\nEmotional Labor tax: " + String.format("%.2f", tax)
                +"\n\n---------------- Total: " + String.format("%.2f", cost)
                +"\n\n ***Thank you for your patronage -Cynthia, TeaMe Cafe Owner*** \n";
    }
    public void reciept(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
         alert.setTitle("Thank you");
         alert.setHeaderText("RECIPT:");
         alert.setContentText(sessionInfo());
         alert.showAndWait();
    }
    
}
 