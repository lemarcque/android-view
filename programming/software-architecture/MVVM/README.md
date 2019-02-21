# MVVM

```
N’essayez pas d’utiliser MVVM en tant que modèle de conception structurel unique,
mais plutôt en tant que guide pour une bonne architecture d’application,
ou un ensemble de modèles de conception pouvant résoudre certains de nos problèmes.
```
## Description

Le modèle-vue-vue modèle (en abrégé MVVM, de l'anglais Model View ViewModel) est une architecture et une méthode de conception utilisée dans le génie logiciel.1,2

Apparu en 20043, MVVM est originaire de Microsoft et adapté pour le développement des applications basées sur les technologies Windows Presentation Foundation et Silverlight4 via l'outil MVVM Light5 par exemple. Cette méthode permet, tel le modèle MVC (modèle-vue-contrôleur), de séparer la vue de la logique et de l'accès aux données en accentuant les principes de binding et d’événement.

<img src="https://inducesmile.com/wp-content/uploads/2018/06/mvvm.png" />

### UML

## Android implementation
I choose to implement the MVVM model in Android environmenet because i am familiar with it, accompagned with the java languahge.

### View
A View is represented by a Fragment or Activity.
```java
/**
 * A fragment containing shape.
 */
public class ColorFragment extends Fragment {


    // Android View
    private Shape circle;
    private Shape rectangle1;
    private Shape rectangle2;

    /**
     * Static factory methpd that create an new instance of the ColorFragment
     * @return a ColorFragment object
     */
    public static ColorFragment newInstance() {
        return new ColorFragment();
    }

    /**
     * Construct thew view by inflating a XML Layout and displaying it into a ViewGroup
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.color_fragment_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // binding views
        circle = view.findViewById(R.id.circle_fragment_color);
        rectangle1 = view.findViewById(R.id.rect1_fragment_color);
        rectangle2 = view.findViewById(R.id.rect2_fragment_color);

        // Instantiate ViewModel
        ColorViewModel colorViewModel = ViewModelProviders
                .of(this)
                .get(ColorViewModel.class);

        // Observe changes of the color from the ViewModel
        // Retrieve data from the ViewModel

        colorViewModel.getColor().observe(this, this::updateColorApp);
    }

    private void updateColorApp(Color colorApp) {
        circle.setBackgroundColor(colorApp.toArgb());
        rectangle1.setBackgroundColor(colorApp.toArgb());
        rectangle2.setBackgroundColor(colorApp.toArgb());
    }
}
```

### ViewModel
in Android, The ViewModel class is designed to store and manage UI-related data so that the data survives configuration changes such as screen rotations. — developer.android.com

`ViewModel.java`
```java
/**
 * View model represent data formatted to be displayed in a View.
 */
public class ColorViewModel extends ViewModel {

    private MutableLiveData<Color> color;        // Color of the application

    public ColorViewModel() {

    }

    /**
     * Return the current color of the application.
     * @return A color object
     */
    public MutableLiveData<Color> getColor() {
        if(color == null) {
            color = new MutableLiveData<>();
            loadColors();
        }
        return color;
    }

    /**
     * Load data from a data source (Example : Model)
     * @return a color object
     */
    private Color loadColor() {
        // Do something to load (Network or Database)
        return Color.valueOf(Color.rgb(255, 0, 0));
    }

    private void loadColors() {
        // List of colors
        final Color[] colors = {
                Color.valueOf(Color.rgb(255, 0, 0)),       // RED
                Color.valueOf(Color.rgb(0, 255, 0)),       // GREEN
                Color.valueOf(Color.rgb(0, 0, 255)),       // BLUE
                Color.valueOf(Color.rgb(100, 65, 0)),      // YELLOW
                Color.valueOf(Color.rgb(50, 0, 50)),      // PURPLE
        };

        // Create a timer to simulate data change from the  network
        final int[] count = new int[1];
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(count[0] + 1 == colors.length) {
                    count[0] = 0;
                }
                else {
                    count[0]++;
                }

                // Expose the new value to the Observer (view)
                color.postValue(colors[count[0]]);
            }
        }, 0, 700);
    }
}
```

# Sources
- [Wikipédia](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel)
- Florina M. - #GDDEurope : https://www.youtube.com/watch?v=Ts-uxYiBEQ8
- ViewModels under the hood : https://medium.com/google-developer-experts/viewmodels-under-the-hood-f8e286c4cc72
