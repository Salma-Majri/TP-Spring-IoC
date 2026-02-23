# Rapport de TP : Inversion de Contrôle et Injection de Dépendances
**Nom :** MAJRI SALMA
**Filière :** SDIA-1
**Encadrant :** Pr. Mohamed YOUSSFI

---

## 1. Introduction
Ce projet consiste à mettre en œuvre le concept d'**Inversion de Contrôle (IoC)** et d'**Injection de Dépendances (DI)**.
## 2. Objectifs du TP
- Séparer la logique d'accès aux données (DAO) de la logique métier.
- Pratiquer l'injection des dépendances par instanciation statique et dynamique.
- Maîtriser la configuration de Spring via XML et Annotations.
- Développer un **Mini-Framework IoC** (Partie 2).

## 3. Architecture du Projet
L'application est structurée autour de deux interfaces principales :
- `IDao` : Interface pour la récupération des données.
- `IMetier` : Interface pour les calculs métiers.


## Partie 1 : Création des Interfaces et Implémentations
- Mise en place de l'interface `IDao` et son implémentation `DaoImpl`.
- Mise en place de l'interface `IMetier` et son implémentation `MetierImpl`.
- Application du **couplage faible** : la classe métier communique avec la couche DAO via une interface.