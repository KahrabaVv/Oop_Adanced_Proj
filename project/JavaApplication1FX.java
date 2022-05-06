/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javaapplication1;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Kerolossamehel-shaip
 */
public class JavaApplication1FX extends Application {
     protected String path ;
     
    @Override
    public void start(Stage primaryStage) {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.setHgap(5);
        pane.setVgap(5);
        // Place nodes in the pane
        TextField textfiled =new TextField() ;
        pane.getChildren().addAll(new Label("please enter your path:"),
                
        textfiled);

        
        HBox pane2 =new HBox();
        
        Button ok=new Button("ok") ;
        
        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.println(textfiled.getText());
                path=textfiled.getText();
            }
        });
        
        Button cancel=new Button("cancel") ;
        CancelHAndlerClass handler2=new CancelHAndlerClass();
        cancel.setOnAction(handler2);
        pane2.getChildren().addAll(ok ,cancel);
        pane2.setAlignment(Pos.CENTER);
        pane2.setSpacing(20);
        BorderPane borderpane= new BorderPane() ;
        borderpane.setTop(pane);
        borderpane.setCenter(pane2);
        
          Scene scene=new Scene(borderpane,250,250);
          primaryStage.setTitle("project");
          primaryStage.setScene(scene);
          primaryStage.show();
    }
        public String getPath(){
            return path;
    }
         public void setPath(){
             this.path = path;
    }
    
    
    

    class CancelHAndlerClass implements EventHandler<ActionEvent> {
    
    @Override 
    public void handle (ActionEvent e ){
    System.out.println("cancel bottun is clicked") ;
    
    }
 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    



}