package ContactsApp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class ContactsAppController {
    private ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @FXML    private Label NameLabel;
    @FXML    private Label SurnameLabel;
    @FXML    private Label EmailLabel;
    @FXML    private Label PhoneNumberLabel;
    @FXML    private TextField NameTextField;
    @FXML    private TextField SurnameTextField;
    @FXML    private TextField EmailTextField;
    @FXML    private TextField PhoneNumberTextField;
    @FXML    private Label Status;
    @FXML    private GridPane ContactsGrid;
    @FXML    private ListView<Contact> ContactsList;



    @FXML
    void OnPress(ActionEvent event) {
        String name = NameTextField.getText();
        String surname = SurnameTextField.getText();
        String email = EmailTextField.getText();
        String phone = PhoneNumberTextField.getText();
        if(!Validation()){
            Status.setText("Successfully Added Contact");
            Status.setTextFill(Color.rgb(0,128,0));
            this.contacts.add(new Contact(name, surname, email, phone));
        }else{
            Status.setText("Fill All Fields");
            Status.setTextFill(Color.rgb(255,0,0));
        }



    }

    public void initialize() {
        this.contacts.add(new Contact("AAAAA", "AAAAA", "AAAAA@gmail.com", "+111111111"));
        this.contacts.add(new Contact("BBBBB", "BBBBB", "BBBBB@gmail.com", "+222222222"));
        this.contacts.add(new Contact("CCCCC", "CCCCC", "CCCCC@gmail.com", "+333333333"));
        this.ContactsList.setItems(this.contacts);


//        this.ContactsList.getSelectionModel().selectedItemProperty().addListener();

    }
    public boolean Validation() {
        return  NameTextField.getText().trim().equals("") ||
                SurnameTextField.getText().trim().equals("") ||
                EmailTextField.getText().trim().equals("") ||
                PhoneNumberTextField.getText().trim().equals("");
    }

}
