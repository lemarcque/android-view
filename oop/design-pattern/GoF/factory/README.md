# Factory pattern
La fabrique (factory method) est un patron de conception créationnel utilisé en programmation orientée objet.
Elle permet d'instancier des objets dont le type est dérivé d'un type abstrait. La classe exacte de l'objet __n'est donc pas connue par l'appelant__.

Le patron Factory permet de mettre en pratique le principe de _couplage faible_. Le couplage faible signifie que les composants du programme seront structurés de telle façon à ce que la quantité d'information requise pour connaitre ne transitent pas inutilement.

Loose coupling simply means that individual design elements should be constructed so the amount of unnecessary information they need to know about other design elements are reduced.

## UML Representation

# Sample Implementation (in Java)

Questions :
- Why do we use a Singleton when instanciating an factory ? [[answer]](https://stackoverflow.com/questions/1285110/singleton-factories-ok-or-bad)
- Is there an naming convention for method of factory ? [[answer]](https://docs.oracle.com/javase/tutorial/datetime/overview/naming.html)

# Sources
- https://fr.wikibooks.org/wiki/Patrons_de_conception/Fabrique
- https://en.wikipedia.org/wiki/Factory_method_pattern
- Loose coupling : https://stackoverflow.com/a/402970
- Loose coupling : https://stackoverflow.com/a/227016
