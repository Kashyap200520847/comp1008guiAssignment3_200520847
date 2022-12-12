package com.example.finalassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;



public class A3Controller {

    @FXML
    private ColorPicker colorFav;

    @FXML
    private TextField givenName;

    @FXML
    private Pane pupilPane1;

    @FXML
    private Pane pupilPane2;

    @FXML
    private Pane pupilPane3;

    @FXML
    private Pane pupilPane4;

    @FXML
    private Pane pupilPane5;

    @FXML
    private Pane pupilPane6;

    @FXML
    private Pane pupilPane7;

    @FXML
    private Pane pupilPane8;

    @FXML
    private Pane pupilPane9;
    @FXML
    private Text nameOfPeer1;

    @FXML
    private Text nameOfPeer2;

    @FXML
    private Text nameOfPeer3;

    @FXML
    private Text nameOfPeer4;

    @FXML
    private Text nameOfPeer5;

    @FXML
    private Text nameOfPeer6;
    @FXML
    private Label errTextDisplay;

    @FXML
    private Text nameOfPeer7;

    @FXML
    private Text nameOfPeer8;

    @FXML
    private Text nameOfPeer9;


    ArrayList<Integer> arrayListRand = new ArrayList<Integer>(10);

    int variable=0;



    int funRan(int randomNum){

        while(true){
            Random rand = new Random();
            int max = 9;
            int min = 1;
            int range = max - min + 1;
            int ran = (int) (Math.random() * range) + min;

            if(arrayListRand.contains(ran)){
                continue;
            }else{
                arrayListRand.add(ran);
                return ran;

            }
        }
    }


    @FXML
    void onGenerate(ActionEvent event) throws Exception {
        Random rand = new Random();
        int wrong=0;
        String nameEntered=givenName.getText();
        Color color= colorFav.getValue();
        if(variable==9){
            errTextDisplay.setVisible(true);
            errTextDisplay.setText("ALL SEATS Full!! ");
        }
        int numRand= rand.nextInt(1,10);

        int randomSpace = funRan(numRand);



        if(nameOfPeer1.getText().compareTo(nameEntered)==0||nameOfPeer2.getText().compareTo(nameEntered)==0||nameOfPeer3.getText().equals(nameEntered)
                ||nameOfPeer4.getText().equals(nameEntered)||nameOfPeer5.getText().equals(nameEntered)||nameOfPeer6.getText().equals(nameEntered)||
                nameOfPeer7.getText().equals(nameEntered)||nameOfPeer8.getText().equals(nameEntered)||nameOfPeer9.getText().equals(nameEntered)){
            wrong=10;

            arrayListRand.remove(arrayListRand.indexOf(randomSpace));
        }

        if(color.toString().equals("0xffffffff"))
            wrong=100;
        if(pupilPane1.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)) || pupilPane2.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||pupilPane3.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||pupilPane4.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||pupilPane5.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||pupilPane6.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
    ||pupilPane7.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
       ||pupilPane8. getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||pupilPane9.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            wrong=100;

        if(nameEntered.isEmpty()){
            wrong=50;
            errTextDisplay.setText("Name is Empty");
            errTextDisplay.setVisible(true);
            arrayListRand.remove(randomSpace);
            arrayListRand.remove(arrayListRand.indexOf(randomSpace));
        }
        if(wrong==0){
            variable++;
            if(randomSpace==1){
                errTextDisplay.setVisible(false);
                pupilPane1.setStyle("-fx-background-color: #" +color.toString().substring(2));
                nameOfPeer1.setText(nameEntered);
                nameOfPeer1.setVisible(true);

                if(variable==9){
                    errTextDisplay.setVisible(true);
                    errTextDisplay.setText("Full attendance");

                }

            }
            if(randomSpace==2){
                errTextDisplay.setVisible(false);
                pupilPane2.setStyle("-fx-background-color: #" +color.toString().substring(2));
                nameOfPeer2.setText(nameEntered);
                nameOfPeer2.setVisible(true);
                if(variable==9){
                    errTextDisplay.setVisible(true);
                    errTextDisplay.setText("Full Attendance");

                }

            }
            if(randomSpace==3){
                errTextDisplay.setVisible(false);
                pupilPane3.setStyle("-fx-background-color: #" +color.toString().substring(2));
                nameOfPeer3.setText(nameEntered);
                nameOfPeer3.setVisible(true);

                if(variable==9){
                    errTextDisplay.setVisible(true);
                    errTextDisplay.setText("Full Attendance");

                }

            }
            if(randomSpace==4){
                errTextDisplay.setVisible(false);
                pupilPane4.setStyle("-fx-background-color: #" +color.toString().substring(2));
                nameOfPeer4.setText(nameEntered);
                nameOfPeer4.setVisible(true);
                if(variable==9){
                    errTextDisplay.setVisible(true);
                    errTextDisplay.setText("Full Attendance");

                }

            }
            if(randomSpace==5){
                errTextDisplay.setVisible(false);
                pupilPane5.setStyle("-fx-background-color: #" +color.toString().substring(2));
                nameOfPeer5.setText(nameEntered);
                nameOfPeer5.setVisible(true);
                if(variable==9){
                    errTextDisplay.setVisible(true);
                    errTextDisplay.setText("Full Attendance");

                }

            }
            if(randomSpace==6){
                errTextDisplay.setVisible(false);
                pupilPane6.setStyle("-fx-background-color: #" +color.toString().substring(2));
                nameOfPeer6.setText(nameEntered);
                nameOfPeer6.setVisible(true);
                if(variable==9){
                    errTextDisplay.setVisible(true);
                    errTextDisplay.setText("Full Attendance");

                }

            }
            if(randomSpace==7){
                errTextDisplay.setVisible(false);
                pupilPane7.setStyle("-fx-background-color: #" +color.toString().substring(2));
                nameOfPeer7.setText(nameEntered);
                nameOfPeer7.setVisible(true);
                if(variable==9){
                    errTextDisplay.setVisible(true);
                    errTextDisplay.setText("Full Attendance");

                }

            }
            if(randomSpace==8){
                errTextDisplay.setVisible(false);
                pupilPane8.setStyle("-fx-background-color: #" +color.toString().substring(2));
                nameOfPeer8.setText(nameEntered);
                nameOfPeer8.setVisible(true);
                if(variable==9){
                    errTextDisplay.setVisible(true);
                    errTextDisplay.setText("Full Attendance");

                }

            }
            if(randomSpace==9){
                errTextDisplay.setVisible(false);
                pupilPane9.setStyle("-fx-background-color: #" +color.toString().substring(2));
                nameOfPeer9.setText(nameEntered);
                nameOfPeer9.setVisible(true);
                if(variable==9){
                    errTextDisplay.setVisible(true);
                    errTextDisplay.setText("Full Attendance");

               }
           }
        }

        else if(wrong==10) {
            errTextDisplay.setText("Student name is taken");
            errTextDisplay.setStyle("-fx-background-color: rgba(255,0,0)");
            errTextDisplay.setVisible(true);

            arrayListRand.remove((Integer) randomSpace);

        }
        else if(wrong==100) {
            errTextDisplay.setText("COLOR NOT AVAILABLE");
            errTextDisplay.setStyle("-fx-background-color: rgba(255,0,0)");
            errTextDisplay.setVisible(true);

            arrayListRand.remove(arrayListRand.indexOf(randomSpace));

        }
        else {
            errTextDisplay.setVisible(false);
            errTextDisplay.setText("SEATS ARE FULL!!");
            errTextDisplay.setStyle("-fx-background-color: rgba(255,0,0,.4)");
            errTextDisplay.setVisible(true);
        }
    }
    @FXML
    void initialize(){
        nameOfPeer1.setVisible(false);
        nameOfPeer3.setVisible(false);
        nameOfPeer2.setVisible(false);
        nameOfPeer4.setVisible(false);
        nameOfPeer5.setVisible(false);
        nameOfPeer6.setVisible(false);
        nameOfPeer7.setVisible(false);
        nameOfPeer8.setVisible(false);
        nameOfPeer9.setVisible(false);
        errTextDisplay.setVisible(false);
    }


}