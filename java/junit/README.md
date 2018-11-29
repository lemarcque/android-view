# JUnit
JUnit est un framework open source pour le développement et l'exécution de tests unitaires automatisables. Le principal intérêt est de s'assurer que le code répond toujours aux besoins même après d'éventuelles modifications. Plus généralement, ce type de tests est appelé tests unitaires de non-régression.

## Description

### TDD
Le Test-Driven Development (TDD) ou développement piloté par les tests en français est une méthode de développement de logiciel qui consiste à écrire chaque test, notamment des tests unitaires, avant d'écrire le code source d'un logiciel, de façon itérative.

En écrivant les tests d'abord, on utilise le programme avant même qu'il existe. On s'assure ainsi que le code produit est testable unitairement. Il est donc impératif d'avoir une vision précise de la manière dont on va utiliser le programme avant même d'envisager son implémentation. Cela évite souvent des erreurs de conception dues à une précipitation dans l'implémentation avant d'avoir défini les objectifs.

Etapes de Robert C. Martin (Uncle Bob):
1. Écrire une fonction de test qui doit obtenir un résultat défini dans les spécifications. Ce code appelant un code qui n'existe pas encore, celui-ci doit échouer. Ceci a pour but de définir une fonction qui teste « quelque chose ».
2. Écrire le code (le « quelque chose ») pour faire réussir le test.
3. Une fois le test en succès, rajouter un autre test pour obtenir un résultat légèrement différent, en faisant varier les entrées par exemple. Ce nouveau test fera faillir le code principal.
4. Modifier le code principal pour faire réussir les tests.
5. Recommencer, en éliminant et refactorisant les éventuelles redondances dans le code des tests. On refactorise en même temps le code principal que le code des tests.
6. Un test unitaire doit tester une caractéristique et une seule. On ne définit pas un « scénario » de test complexe dans un test unitaire.
7. Il est déconseillé de tester les fonctions privées d'une classe, on se concentrera à tester les fonctions publiques, c'est-à-dire les interfaces avec lesquelles les acteurs extérieurs interagissent.

Etapes (simplifié)
1. __Ecrire le test qui échoue__ décrivant une partie du problème à résoudre
2. __Modifier le code juste assez__ pour que le test réussisse;
3. __Vérifier__ que tous les tests passent
4. __Refactoring__ - Améliorer le code sans altérez le comportement

## Code
`Calculator.java`
```java
package main;

/**
 * Interface to perform basic arithmetic operation
 */
public interface Calculator {

    int multiply(int a , int b);
    int divide(int a , int b);
    int add(int a , int b);
    int subtract(int a , int b);
}

```
`CalculatorImpl.java`
```java
package main;

/**
 * Implementation of {@link Calculator}
 */
public class CalculatorImpl implements Calculator {

    /**
     * Multiplication : a * b
     * @param a product
     * @param b product
     * @return
     */
    @Override
    public int multiply(int a, int b) {
        return 0;
    }

    /**
     * Division : a / b
     * @param a dividend
     * @param b divider
     * @return
     */
    @Override
    public int divide(int a, int b) {
        return 0;
    }

    /**
     * Addition : a + b
     * @param a term
     * @param b term
     * @return
     */
    @Override
    public int add(int a, int b) {
        return 0;
    }

    /**
     * Substraction : a - b
     * @param a diminuende
     * @param b subtrahend
     * @return
     */
    @Override
    public int subtract(int a, int b) {
        return 0;
    }
}



```
## Test 
Avec JUnit, la plus petite unité de tests est l'assertion dont le résultat de l'expression booléenne indique un succès ou une erreur.

Les cas de tests utilisent des affirmations (assertion en anglais) sous la forme de méthodes nommées assertXXX() proposées par le framework. Il existe de nombreuses méthodes de ce type qui sont héritées de la classe junit.framework.Assert :




| Méthode   |   Rôle |
| ------------- | ------------- |
| assertEquals()      | Vérifier l'égalité de deux valeurs de type primitif ou objet (en utilisant la méthode equals()). Il existe de nombreuses surcharges de cette méthode pour chaque type primitif, pour un objet de type Object et pour un objet de type String |
| assertFalse()       | Vérifier que la valeur fournie en paramètre est fausse|
| assertNull()      |  Vérifier que l'objet fourni en paramètre soit null |
| assertNotNull()      | Vérifier que l'objet fourni en paramètre ne soit pas null |
| assertSame()      | Vérifier que les deux objets fournis en paramètre font référence à la même entité

Exemples identiques :

assertSame("Les deux objets sont identiques", obj1, obj2);

assertTrue("Les deux objets sont identiques ", obj1 == obj2); |
| assertNotSame()      | Vérifier que les deux objets fournis en paramètre ne font pas référence à la même entité |
| assertTrue()      | Vérifier que la valeur fournie en paramètre est vraie |


Before test : `CalculatorImplTest.java`
```java
class CalculatorImplTest {

    @org.junit.jupiter.api.Test
    void multiply() {
        fail("Not yet implemented"); // TODO
    }

    @org.junit.jupiter.api.Test
    void divide() {
        fail("Not yet implemented"); // TODO
    }

    @org.junit.jupiter.api.Test
    void add() {
        fail("Not yet implemented"); // TODO
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        fail("Not yet implemented"); // TODO
    }
}
```

Source : wikipédia / developpez
