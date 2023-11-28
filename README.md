# Biblionet

Nous utilisons Eclipse, un environnement de développement intégré (IDE), dans le cadre de cette application J2EE.

Nous exploitons le serveur de bases de données MySQL pour cette solution web qui propose plusieurs fonctionnalités :

Recherche des livres par ISSN, titre, domaine et auteur afin de faciliter l'accès aux informations documentaires pour le public cible.
Authentification d'un administrateur lui permettant d'ajouter des données relatives aux livres et auteurs.
Cette application suit l'architecture Model View Controller (MVC), une structure qui permet de séparer la logique de l'application de l'interface utilisateur et de contrôler les interactions entre ces deux éléments.

Dans cette architecture :

Le modèle représente les données et les règles régissant leur accès et leur mise à jour. Il sert souvent à modéliser les processus réels dans les logiciels d'entreprise.
La vue affiche le contenu du modèle, déterminant la présentation des données. Elle se met à jour si le modèle change.
Le contrôleur traduit les interactions de l'utilisateur avec la vue en actions exécutées par le modèle.
