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


Source : wikipédia / developpez
