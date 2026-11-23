# santa-village-simulation

[![Java CI with Maven](https://github.com/eabc2318/santa-village-simulation/actions/workflows/ci.yml/badge.svg)](https://github.com/eabc2318/santa-village-simulation/actions/workflows/ci.yml)
![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?logo=apachemaven)
![JUnit5](https://img.shields.io/badge/JUnit-5-25A162?logo=junit5)
![JaCoCo](https://img.shields.io/badge/JaCoCo-Coverage-blue)

HO HO HO venez gouter a mes biscuits au goût qualité de dev saupoudré d'un peu de javadoc et de CI avec du lait de README.

## Commandes utiles

```bash
# Nettoyer le dossier target/
mvn clean

# Compiler le projet
mvn compile

# Lancer les tests unitaires + générer le rapport JaCoCo
mvn test

# Générer la Javadoc
mvn javadoc:javadoc
```

### Consulter les rapports générés (dans `target/`)

- **Couverture JaCoCo** : `target/site/jacoco/index.html`
- **Javadoc** : `target/reports/apidocs/index.html`

Pour les ouvrir directement dans le navigateur depuis le terminal :

```bash
xdg-open target/site/jacoco/index.html
xdg-open target/reports/apidocs/index.html
```

## Architecture du projet

```text
villageperenoel/
├── .github/workflows/ci.yml              # Pipeline CI GitHub Actions (main & dev)
├── pom.xml                               # Configuration Maven, Java 21, JUnit 5, JaCoCo, Javadoc
├── src/
│   ├── main/java/fr/amu/iut/noel/
│   │   ├── building/                     # Bâtiments (Building, Dormitory, Enclosure, etc.)
│   │   ├── character/                    # Personnages (Humanoïdes & Créatures)
│   │   ├── exception/                    # Exceptions métier personnalisées
│   │   ├── lycanthrope/                  # Colonie de lycanthropes (meutes, rangs, hurlements)
│   │   ├── model/                        # Modèle principal (SantaVillage, SantaClaus, enums...)
│   │   ├── simulation/                   # Boucles temporelles, événements, threads
│   │   └── ui/                           # Interface utilisateur (CLI / JavaFX)
│   └── test/java/fr/amu/iut/noel/        # Tests unitaires JUnit 5
└── README.md
```
