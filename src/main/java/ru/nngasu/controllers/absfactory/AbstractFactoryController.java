package ru.nngasu.controllers.absfactory;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import ru.nngasu.solutons.absfactory.AbstractFactory;
import ru.nngasu.solutons.absfactory.Car;
import ru.nngasu.solutons.absfactory.CarName;
import ru.nngasu.solutons.absfactory.Currency;

import java.util.Arrays;
import java.util.List;

public class AbstractFactoryController {

    @FXML
    private ComboBox<CarName> comboBox;

    @FXML
    private TableView<Long> tableView;

    @FXML
    private TableColumn<Car, Long> byColumn;

    @FXML
    private TableColumn<Car, Long> ruColumn;

    @FXML
    public void initialize() {
        ObservableList<CarName> items = FXCollections.observableList(Arrays.asList(CarName.values()));
        comboBox.setItems(items);
    }

    @FXML
    void initTable(ActionEvent event) {
        CarName chosenCar = comboBox.getValue();
        long ruPrice = AbstractFactory.getPrice(Currency.RU, chosenCar);
        long byPrice = AbstractFactory.getPrice(Currency.BY, chosenCar);
        ObservableList<Long> prices = FXCollections.observableList(List.of(ruPrice, byPrice));
        byColumn.setCellValueFactory(a -> new SimpleObjectProperty<>(byPrice));
        ruColumn.setCellValueFactory(a -> new SimpleObjectProperty<>(ruPrice));
        tableView.setItems(prices);
    }

}
