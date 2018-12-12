# MVVM

```
N’essayez pas d’utiliser MVVM en tant que modèle de conception structurel unique,
mais plutôt en tant que guide pour une bonne architecture d’application,
ou un ensemble de modèles de conception pouvant résoudre certains de nos problèmes.
```
## Description
MVC pour _Modèle-Vue-Controller_ est un patron d'architecture logicielle destiné aux interfaces graphiques lancé en 1978 et qui est devenu très populaires pour applications web.

### UML

## Android implementation
I choose to implement the MVVM model in Android environmenet because i am familiar with it, accompagned with the java languahge.

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
- [Wikipédia] (https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel)
- Florina M. - #GDDEurope : https://www.youtube.com/watch?v=Ts-uxYiBEQ8
