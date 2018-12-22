import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends Application {

    private static int APP_WIDTH = 400;
    private static int APP_HEIGHT = 400;
    private static String APP_NAME = "Sorting algorithm";

    private static int MINIMUM_DATA = 10;
    private static int MAXIMUM_DATA = 150;

    final int maxWidth = 5;
    int randBarGenerated;

    List<Integer> unOrderList = new ArrayList<>();
    List<Bar> barList;

    private Group root;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Creation and affectation of the Scene

        root = new Group();
        Scene scene = new Scene(root, APP_WIDTH, APP_HEIGHT);
        primaryStage.setTitle(APP_NAME);
        primaryStage.setScene(scene);
        primaryStage.show();


        randBarGenerated = 20; // int randValue = min + (int) (Math.random() * (max - min);

        // generate set of datas
        generateDisorderList();
        generateList();
        disorderList();
    }

    private void generateList() {
        Bar a = new Bar(100, 100);
        Bar b = new Bar(100, 100);


        System.out.println("a    :" + a);
        System.out.println("b    :" + b);


        barList = new ArrayList<>();
        final int width = (APP_WIDTH / randBarGenerated);   // width of bar

        for (int i = 0; i < unOrderList.size(); i++) {

            int value = unOrderList.get(i);

            // Add new rectangle of the root scene
            Bar bar = new Bar(value, width);
            bar.setLayoutX(i * bar.getWidth());
            bar.setLayoutY(APP_HEIGHT - bar.getHeight());
            barList.add(bar);
            root.getChildren().add(barList.get(barList.size() - 1));
        }
    }

    private void generateDisorderList() {
        unOrderList = new ArrayList<>();

        // add item on the list
        for(int i = 1; i < randBarGenerated + 1; i++) {
            unOrderList.add(i * (APP_HEIGHT / randBarGenerated));
        }
    }

    private void disorderList() {
        int minValue = barList.get(0).getValue();
        int maxValue = barList.get(barList.size() -1 ).getValue();


        for(Bar bar : barList) {

            int min = 0;
            int max = barList.size();
            int randElement = min + (int) (Math.random() * (max - min));


            Bar randomBar = (Bar) root.getChildren().get(randElement);
            randomBar.setOrdered(false);


            // swapping
            int tmpBarX = (int) bar.getLayoutX();
            bar.setLayoutX(randomBar.getLayoutX());
            randomBar.setLayoutX(tmpBarX);
        }
    }

}
