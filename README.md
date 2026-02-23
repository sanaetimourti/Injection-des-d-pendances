# Projet : Inversion de Contrôle (IoC) et Injection des Dépendances (DI) - Partie 1

Ce projet illustre les concepts fondamentaux du **couplage faible**, de l'**Inversion de Contrôle (IoC)** et de l'**Injection des Dépendances (DI)** en Java. 

L'objectif est de montrer l'évolution de la conception logicielle, en partant d'une instanciation classique pour arriver à l'utilisation d'un framework robuste comme **Spring**.

## Travail Réalisé

Le projet est divisé en plusieurs étapes clés respectant le cahier des charges :

1. **Création de la couche DAO** : 
   - Création de l'interface `IDao` avec la méthode `getData()`.
   - Création d'une implémentation `DaoImpl`.
2. **Création de la couche Métier** :
   - Création de l'interface `IMetier` avec la méthode `calcul()`.
   - Création d'une implémentation `MetierImpl` respectant le principe de **couplage faible** (la classe métier ne dépend que de l'interface `IDao`, pas de son implémentation).
3. **Mise en œuvre de l'Injection des Dépendances (4 approches)** :
   - **a. Instanciation Statique** : Injection directe dans le code (utilisation du mot-clé `new`).
   - **b. Instanciation Dynamique** : Utilisation de l'API de Réflexion Java (`Class.forName()`) et lecture d'un fichier `config.txt` pour modifier l'implémentation sans recompiler.
   - **c. Framework Spring (Version XML)** : Utilisation du conteneur Spring avec configuration dans le fichier `applicationContext.xml`.
   - **d. Framework Spring (Version Annotations)** : Utilisation des annotations Spring (`@Component`, `@Autowired`, etc.) pour une configuration automatique via le balayage des composants (Component Scan).

## Architecture du Projet

Le code source est organisé selon l'architecture suivante :

```text
src/main/java/ma/projet/ioc/
├── dao/               # Couche d'accès aux données
│ ── IDao.java
│   ── DaoImpl.java
│   ── DaoImplV2.java # (Optionnel) Seconde implémentation pour tester le couplage faible
│
├── metier/            # Couche métier
│   ── IMetier.java
│   ── MetierImpl.java
│
├── pres/              # Couche de présentation (Points d'entrée)
│   ├ PresStatique.java      # Test de l'injection statique
│   ── PresDynamique.java     # Test de l'injection dynamique (Reflection)
│   ── PresSpringXML.java     # Test avec Spring XML
│   └─ PresSpringAnnotation.java # Test avec Spring Annotations
│
└── config.txt         # Fichier texte contenant les noms des classes pour l'instanciation dynamique

src/main/resources/
─ applicationContext.xml  # Fichier de configuration Spring (Version XML)
