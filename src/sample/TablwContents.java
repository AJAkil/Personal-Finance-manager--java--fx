package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class TablwContents {
    private SimpleStringProperty Serial;
    private SimpleStringProperty Name;
    private SimpleStringProperty Type;
    private SimpleStringProperty amount;
    private SimpleStringProperty date;

    TablwContents(String serial,String name,String Type,String amount, String date){
        this.Serial = new SimpleStringProperty(serial);
        this.Name = new SimpleStringProperty(name);
        this.Type = new SimpleStringProperty(Type);
        this.amount = new SimpleStringProperty(amount);
        this.date = new SimpleStringProperty(date);
    }

    public String getSerial() {
        return Serial.get();
    }

    public SimpleStringProperty serialProperty() {
        return Serial;
    }

    public void setSerial(String serial) {
        this.Serial.set(serial);
    }

    public String getName() {
        return Name.get();
    }

    public SimpleStringProperty nameProperty() {
        return Name;
    }

    public void setName(String name) {
        this.Name.set(name);
    }

    public String getType() {
        return Type.get();
    }

    public SimpleStringProperty typeProperty() {
        return Type;
    }

    public void setType(String type) {
        this.Type.set(type);
    }

    public String getAmount() {
        return amount.get();
    }

    public SimpleStringProperty amountProperty() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount.set(amount);
    }

    public String getDate() {
        return date.get();
    }

    public SimpleStringProperty dateProperty() {
        return date;
    }

    public void setDate(String date) {
        this.date.set(date);
    }
}
