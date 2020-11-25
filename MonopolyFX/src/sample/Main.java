package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Map.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1920, 985));
        primaryStage.show();

/*

        final int x = 10;
        final int y = 20;
        final int width = 100;
        final int height = 130;

        // Rectangle1
        Rectangle rectangle1 = new Rectangle(x, y, width, height);

        // Rectangle2 (Same position and size to rectangle1)
        Rectangle rectangle2 = new Rectangle(x, y, width, height);

        rectangle1.setFill(Color.BROWN);


        rectangle2.setFill(Color.CADETBLUE);


        // Creating the translation transformation
        Translate translate = new Translate();

        // Set arguments for translation
        translate.setX(150);
        translate.setY(150);
        //translate.setZ(10);

        // Adding transformation to rectangle2
        rectangle2.getTransforms().addAll(translate);
        rectangle2.getTransforms().addAll(translate);
        rectangle2.getTransforms().addAll(translate);
        Group roots = new Group(rectangle1, rectangle2);

        Scene scene = new Scene(roots, 1450, 1050);


        primaryStage.setScene(scene);
        primaryStage.show();*/
  /*  }


    public static void main(String[] args) {
        launch(args);
    }
}/*

import javafx.application.Application;

import static javafx.application.Application.launch;

import javafx.event.EventHandler;

import javafx.scene.Group;
import javafx.scene.Scene;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;


public class Main extends Application {
    @Override
    public void start(Stage stage) {/*
        //Drawing a Circle
        ImageView image = new ImageView("/img/Train.png");
        Circle circle = new Circle();
        Circle circle2 = new Circle();
        //Setting the position of the circle
        circle.setCenterX(300.0f);
        circle.setCenterY(135.0f);

        //Setting the radius of the circle
        circle.setRadius(25.0f);

        //Setting the color of the circle
        //circle.setFill(Color.BROWN);

        //Setting the stroke width of the circle
        circle.setStrokeWidth(20);

        //Setting the text
        Text text = new Text("Click on the circle to change its color");

        //Setting the font of the text
        text.setFont(Font.font(null, FontWeight.BOLD, 15));

        //Setting the color of the text
        text.setFill(Color.CRIMSON);

        //setting the position of the text
        text.setX(150);
        text.setY(50);
        image.setX(100);
        image.setY(100);
        //Creating the mouse event handler
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                Random rand = new Random();

                circle.setFill(Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                circle.setCenterX(rand.nextInt(500));
                circle.setCenterY(rand.nextInt(500));
                circle.setRadius(rand.nextInt(10) + 5);
                circle2.setFill(Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                circle2.setCenterX(rand.nextInt(500));
                circle2.setCenterY(rand.nextInt(500));
                circle2.setRadius(rand.nextInt(10) + 5);
                image.setRotate(rand.nextInt(500));

            }
        };
        //Registering the event filter
        circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        circle2.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        image.addEventFilter(MouseEvent.MOUSE_CLICKED,eventHandler);
        //Creating a Group object
        Group root = new Group(circle, circle2,image, text);

        //Creating a scene object
        Scene scene = new Scene(root, 500, 500);

        //Setting the fill color to the scene
        scene.setFill(Color.WHITE);

        //Setting title to the Stage
        stage.setTitle("Event Filters Example");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();*/
    }

    public static void main(String args[]) {
        Monopoly m = new Monopoly();
        launch(args);
    }
}