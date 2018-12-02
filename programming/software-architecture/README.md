# Software Architecture

# Description
L’architecture logicielle décrit d’une manière symbolique et schématique les différents éléments d’un ou de plusieurs systèmes informatiques, leurs interrelations et leurs interactions. 

## Objectif
Bien que ces architectures varient toutes quelque peu dans leurs détails, elles sont très similaires.
Ils ont tous le même objectif, qui est la séparation des préoccupations.
Ils réalisent tous cette séparation en divisant le logiciel en couches.
Chacun comporte au moins une couche pour les règles métier et une autre pour les interfaces.

## Exemple
- [MVC](https://badootech.badoo.com/do-mvc-like-its-1979-da62304f6568) / MVP / MVVM
- [Onion Architecture](https://jeffreypalermo.com/2008/07/the-onion-architecture-part-1/)
- Layered Architecture [1]() [2](https://towardsdatascience.com/10-common-software-architectural-patterns-in-a-nutshell-a0b47a1e9013)
- Clean Architecture[1](http://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html) [2](https://github.com/googlesamples/android-architecture/tree/todo-mvp-clean/) (Meta-Architecture)

_Certaines personnes clament que le MVC n'est pas un patron d'architecture, mais cela est un autre débat_

## L'architecture - Une question de point de vue [*](https://fr.wikipedia.org/wiki/Architecture_logicielle#L'architecture_une_question_de_point_de_vue)
Le rôle de l'architecte informatique se déplace donc vers celui de bibliothécaire. L'architecte informatique doit explorer la bibliothèque pour trouver les composants logiciels appropriés puis créer les composants manquants, les documenter et les intégrer à la bibliothèque. Dans une grande entreprise, ce rôle de bibliothécaire est rempli par l'architecte informatique en chef qui est responsable du développement harmonieux de la bibliothèque et de la conservation de l'intégrité de son architecture.

L'architecture une question de point de vue
La description d'un système complexe comme un logiciel informatique peut être faite selon plusieurs points de vue différents mais chacun obéit à la formule de Perry et Wolf4 : architecture = elements + formes + motivations. Selon le niveau de granularité, les éléments peuvent varier en tailles (lignes de code, procédures ou fonctions, modules ou classes, paquetages ou couches, applications ou systèmes informatiques), ils peuvent varier en raffinement (ébauche, solution à améliorer ou solution aboutie) et en abstraction (idées ou concepts, classes ou objets, composants logiciels). Les éléments peuvent également posséder une temporalité (une existence limitée dans le temps) et une localisation (une existence limitée dans l'espace).

Si les éléments sont, en général, représentés par des rectangles ou des ovales, les formes sont quant à elles constituées, la plupart du temps, d'éléments reliés par des droites ou des flèches. La sémantique des liens détermine la majeure partie de la sémantique du diagramme et l'aspect du système qui y est décrit.

### Principaux type de liens [*](https://fr.wikipedia.org/wiki/Architecture_logicielle#L'architecture_une_question_de_point_de_vue)
- La dépendance fonctionnelle, signifie que l'élément source nécessite l'élément de destination pour réaliser ses fonctionnalités.
- Le flot de contrôle, signifie que l'élément de destination prendra le contrôle de l'exécution après la terminaison de l'élément source.
- La transition d'état, signifie que le système passera de l'état source à l'état de destination.
- Le changement d'activité, signifie que le système réalisera l'activité de destination après l'activité source.
- Le flot de données, signifie que l'information s'écoule de l'élément source vers l'élément de destination.
- Le lien de communication, signifie que deux éléments échangent de l'information.
- La composition, signifie que l'élément source est composé d'une ou de plusieurs données du type de l'élément de destination.
- L'héritage (généralisation), signifie que l'élément source possède l'ensemble des données et des comportements de l'élément de destination.
- L'envoi de message, signifie que l'élément source envoie un message à l'élément de destination.

Indépendamment de la forme que prend un diagramme d'architecture, celui-ci ne représente toujours qu'un point de vue sur le système considéré, le plus important étant les motivations. En effet, à quoi sert de produire un diagramme s'il est inutile (pas utilisé) ou si les raisons des choix architecturaux sont vagues et non-explicités. Pour éviter de formuler les motivations pour chaque diagramme, l'architecte informatique produira les différents diagrammes en fonction d'un modèle de conception et réutilisera des patrons de conception éprouvés.

### Les modèles d'architecture [*](https://fr.wikipedia.org/wiki/Architecture_logicielle#Les_modèles_d'architecture)
ndépendamment de la forme que prend un diagramme d'architecture, celui-ci ne représente toujours qu'un point de vue sur le système considéré, le plus important étant les motivations. En effet, à quoi sert de produire un diagramme s'il est inutile (pas utilisé) ou si les raisons des choix architecturaux sont vagues et non-explicités. Pour éviter de formuler les motivations pour chaque diagramme, l'architecte informatique produira les différents diagrammes en fonction d'un modèle de conception et réutilisera des patrons de conception éprouvés.
Un modèle d'architecture est composé d'un ensemble de points de vue, chacun étant composé d'un ensemble de différentes sortes de diagrammes.

## Choix de l'architecture
Objectivement, il n'existe pas une unique architecture pouvant répondre à tous les spécifications systèmes mais 
plutôt une ou des architecture(s) plus adaptés à certaine suivant les fonctionnalités que ceux-ci demande.
