package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.text.DecimalFormat;



public class Controller {
    public TextField input;
    public Label lbLeft, lbO, lbRight;
    public boolean isFloat = false;
    public double left, right ;
    public String o;
    DecimalFormat df = new DecimalFormat("#0.##########");

    public void operation(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        o = button.getText();
        if (input.getText().equals("")){
            left = left;
        } else {
        left = Double.parseDouble(input.getText());}
        input.setText("");
        lbLeft.setText(String.valueOf(df.format(left)));
        lbO.setText(o);
    }

    public void digit(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        input.setText(input.getText() + button.getText());

    }

    public void equals(ActionEvent actionEvent) {

        if (input.getText().equals("") || o == null){
            input.requestFocus();
        } else {
            right = Double.parseDouble(input.getText());
            lbRight.setText(df.format(right));
        switch (o){
            case "+" :
                if (isFloat) {
                    input.setText(String.valueOf(left + right));
                } else {
                    input.setText(String.valueOf((int)left + (int)right));
                }
                break;
            case "-" :
                if (isFloat) {
                    input.setText(String.valueOf(left - right));
                } else {
                    input.setText(String.valueOf((int)left - (int)right));
                }
                break;
            case "*" :
                if (isFloat) {
                    input.setText(String.valueOf(left * right));
                } else {
                    input.setText(String.valueOf((int)left * (int)right));
                }
                break;
            case "/" :
                double d = left / right;

                input.setText(df.format(d));
                isFloat = false;
                break;
            case "%" :
                if (isFloat) {
                    input.setText("Error mode float type.");
                } else {
                    input.setText(String.valueOf((int)left % (int)right));
                }
                break;
            }
        }
    }

    public void clear(ActionEvent actionEvent) {
        input.setText("");
        lbRight.setText("");
        lbLeft.setText("");
        lbO.setText("");
        left = 0; right = 0;
        isFloat = false;
    }

    public void div(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        if (input.getText().equals("") || input.getText().contains(".")){

        } else {
            input.setText(input.getText() + button.getText());
            isFloat = true;
        }
    }

    public void about(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("about.fxml"));
            Stage stage = new Stage();
            stage.setTitle("About");
            stage.setScene(new Scene(root, 340, 140));
            stage.setResizable(false);
            stage.show();
            // Hide this current window (if this is what you want)
           // ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}


