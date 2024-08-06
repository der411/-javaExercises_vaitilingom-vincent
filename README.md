# Exercices API Java MVC (Model-View-Controller)

Ce dépôt contient une série d'exercices et de projets développés lors d'une formation Spring Boot. L'objectif principal est de fournir une compréhension pratique de la création d'API RESTful en utilisant Java et le framework Spring.

## Structure du Projet

- **Modèle :** Représente les données et la logique métier de l'application.

  - Animal.java
  - User.java
 
- **Contrôleur :** Gère les requêtes et réponses HTTP, orchestre les interactions entre le modèle et la vue.

  - AnimalController.java
  - UserController.java
 
- **Service :** Contient la logique métier et les méthodes de service utilisées par les contrôleurs.

  - AnimalService.java
  - UserService.java

- **Ressources :** Contient les propriétés de l'application et les fichiers de configuration.

  - application.properties
 
## Prise en Main

1. Cloner le dépôt :
``` sh
git clone git@github.com:der411/SpringBoot_API_MVC.git
```
2. Naviguer dans le répertoire du projet et construire le projet :
``` sh
cd JavaAPIExercises
./mvnw clean install
```
3. Lancer l'application :
``` sh
./mvnw spring-boot:run
```
## Technologies Utilisées
- Java
- Spring Boot
- Maven
