package at.technikum.uiapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiController {

    @FXML
    private Label responseText;

    private HttpClient client;

    private ObjectMapper objectMapper;

    public ApiController() {
        this.client = HttpClient.newHttpClient();
        this.objectMapper = new ObjectMapper();
    }

    @FXML
    protected void onRequestButtonClick() {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(new URI("http://localhost:8080/lectures/1"))
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            Lecture lecture = objectMapper.readValue(response.body(), Lecture.class);

            responseText.setText("ECTS: %s".formatted(lecture.getEcts()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
