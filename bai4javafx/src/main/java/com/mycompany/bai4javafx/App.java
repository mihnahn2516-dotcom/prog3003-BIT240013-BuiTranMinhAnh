package com.mycompany.bai4javafx;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("Chuyển đổi nhiệt độ C → F");

        TextField txtC = new TextField();
        txtC.setPromptText("Nhập nhiệt độ °C");

        Button btn = new Button("Chuyển đổi");

        Label result = new Label("Kết quả:");

        btn.setOnAction(e -> {
            try {
                double c = Double.parseDouble(txtC.getText());
                double f = c * 9 / 5 + 32;
                result.setText("Nhiệt độ F: " + f);
            } catch (Exception ex) {
                result.setText("Vui lòng nhập số!");
            }
        });

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(title, txtC, btn, result);

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("Temperature Converter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
