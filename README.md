# Application de streaming musical fullstack style Spotify (Angular 17 + Spring Boot 3)

Ce projet est une application web de streaming musical.  
Elle permet à un utilisateur de se connecter, parcourir une bibliothèque musicale, écouter des morceaux, les rechercher et gérer ses favoris, le tout via une interface moderne inspirée des standards actuels du streaming.

---

## Technologies utilisées

### Frontend
- Angular 17 (Standalone Components, Signals)
- Bootstrap 5 + SCSS
- FontAwesome pour les icônes
- Lecteur audio intégré
- Appels API sécurisés

### Backend
- Spring Boot 3
- PostgreSQL pour la base de données
- Spring Data JPA + MapStruct
- Liquibase pour la gestion des migrations SQL
- Authentification OAuth2 avec Auth0 (Google)

---

## Fonctionnalités principales

- Connexion sécurisée via Google
- Lecture de morceaux audio
- Recherche dans le catalogue
- Ajout/retrait de favoris
- Affichage de sa bibliothèque personnelle
- Interface responsive avec mode sombre

---

## Structure des projets

### `spotify-clone-back`
- API REST en Java (Spring Boot)
- Modules pour `user` et `catalog`
- Gestion des utilisateurs, chansons, et favoris
- Authentification OAuth2

### `spotify-clone-front`
- Interface Angular modulaire
- Routage entre les vues (accueil, recherche, favoris)
- Services pour consommer l'API backend
- Lecteur audio avec gestion du volume

---

## ⚙️ Lancer le projet localement

### Prérequis
- Java 17
- Node.js 18+
- PostgreSQL

### Démarrage du backend
```
cd spotify-clone-back
./mvnw spring-boot:run
```

### Démarrage du frontend
```
cd spotify-clone-front
npm install
ng serve
```
