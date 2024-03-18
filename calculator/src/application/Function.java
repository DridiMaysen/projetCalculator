package application;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Function implements Initializable{
	float data;
	int operation;
	@FXML
    private Button clear;

    @FXML
    private Button div;

    @FXML
    private Button eight;

    @FXML
    private Button equal;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button minus;

    @FXML
    private Button mltp;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button plus;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private TextField text;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button zero;

    @FXML
    void handleButtonAction(ActionEvent event) {
    	if (event.getSource()== one) {
    		text.setText(text.getText()+"1");
    	}else if (event.getSource()== two ) {
    		text.setText(text.getText()+"2");
    	}else if(event.getSource()== three) {
    		text.setText(text.getText()+"3");
    	}else if(event.getSource()== four) {
    		text.setText(text.getText()+"4");
    	}else if(event.getSource()== five) {
    		text.setText(text.getText()+"5");
    	}else if(event.getSource()== six) {
    		text.setText(text.getText()+"6");
    	}else if(event.getSource()== seven) {
    		text.setText(text.getText()+"7");
    	}else if(event.getSource()== eight) {
    		text.setText(text.getText()+"8");
    	}else if(event.getSource()== nine) {
    		text.setText(text.getText()+"9");
    	}else if(event.getSource()== zero) {
    		text.setText(text.getText()+"0");
    	}else if(event.getSource()== clear) {
    		text.setText("");
    	}else if(event.getSource()== plus) {
    		data=Float.parseFloat(text.getText());
    		operation=1;
    		text.setText("");
    	}else if(event.getSource()== mltp) {
    		data=Float.parseFloat(text.getText());
    		operation=2;
    		text.setText("");
    	}else if(event.getSource()== minus) {
    		data=Float.parseFloat(text.getText());
    		operation=3;
    		text.setText("");
    	}else if(event.getSource()== div) {
    		data=Float.parseFloat(text.getText());
    		operation=4;
    		text.setText("");
    	}else if(event.getSource()== equal) {
    		Float secondOperand = Float.parseFloat(text.getText());
    		Float ans;
    		if (operation==1) {
    			 ans =data+secondOperand ;
    			text.setText(String.valueOf(ans));}
    		else if (operation==2) {
    			ans =data*secondOperand ;
    			text.setText(String.valueOf(ans));}
    	else if (operation==3) {
    			ans =data-secondOperand ;
    			text.setText(String.valueOf(ans));}
    else if(operation==4) {
    			ans =data/secondOperand ;
    			text.setText(String.valueOf(ans));
    		}
    		
    		}

    }

	@Override
	public void initialize(java.net.URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
