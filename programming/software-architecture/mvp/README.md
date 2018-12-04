# MVP
Le Model-View-Presenter (en français modèle-vue-présentation) est un patron d'architecture, considéré comme un dérivé du patron d'architecture modèle-vue-contrôleur.
Il garde les mêmes principes que MVC sauf qu'il élimine l'interaction entre la vue et le modèle parce qu'elle sera effectuée par le biais de la __présentation__, qui organise les données à afficher dans la vue.

# Implémentation sous Android
L'implémentation s'est faite sans utilisation d'un framework externe.
Les classe sont crées : 
- Une classe contractuelle définissant une connection entre la vue et la présentation
- Une activité qui crée le Fragment et la Présentation,
- Un Fragment qui implémente une interface.
- Une présentation qui implémente l'interface de la présentation dans le contrat correspondant. 

Un présentateur héberge généralement la logique métier([*](nothing)) associée à une fonctionnalité particulière, et la vue correspondante gère le travail de l'interface utilisateur Android. La vue ne contient presque aucune logique; il convertit les commandes du présentateur en actions de l'interface utilisateur et écoute les actions de l'utilisateur, qui sont ensuite transmises au présentateur.



<img src="https://raw.githubusercontent.com/lemarcque/software-skills/master/programming/software-architecture/mvp/ressource/mvp-scheme.png" />

# Ressources : 
- Google samples : https://github.com/googlesamples/android-architecture/tree/todo-mvp/
- (@android10) https://github.com/android10/Android-CleanArchitecture)
- https://www.youtube.com/watch?v=QrbhPcbZv0I&t=0s&list=WL&index=8
