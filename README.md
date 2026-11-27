# santa-village-simulation

[![Java CI with Maven](https://github.com/eabc2318/santa-village-simulation/actions/workflows/ci.yml/badge.svg)](https://github.com/eabc2318/santa-village-simulation/actions/workflows/ci.yml)
![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?logo=apachemaven)
![JUnit5](https://img.shields.io/badge/JUnit-5-25A162?logo=junit5)
![JaCoCo](https://img.shields.io/badge/JaCoCo-Coverage-blue)

HO HO HO! Come taste my cookies flavored with software quality, sprinkled with a bit of Javadoc and CI, served with a glass of README milk.

## Useful Commands

```bash
# Clean the target/ directory
mvn clean

# Compile the project
mvn compile

# Run unit tests + generate the JaCoCo coverage report
mvn test

# Generate the Javadoc
mvn javadoc:javadoc
```

### Viewing Generated Reports (in `target/`)

- **JaCoCo Coverage**: `target/site/jacoco/index.html`
- **Javadoc**: `target/reports/apidocs/index.html`

To open them directly in your browser from the terminal:

```bash
xdg-open target/site/jacoco/index.html
xdg-open target/reports/apidocs/index.html
```

## Project Architecture

```text
villageperenoel/
├── .github/workflows/ci.yml              # GitHub Actions CI pipeline (main & dev)
├── pom.xml                               # Maven configuration, Java 21, JUnit 5, JaCoCo, Javadoc
├── src/
│   ├── main/java/fr/amu/iut/noel/
│   │   ├── building/                     # Buildings (Building, Dormitory, Enclosure, etc.)
│   │   ├── character/                    # Characters (Humanoids)
│   │   ├── creatures/                    # Creatures (Reindeer, LivingSnowman, NorthSpirit, Lycanthrope)
│   │   ├── exception/                    # Custom business exceptions
│   │   ├── interfaces/                   # Behavioral interfaces (Entertainable, Worker)
│   │   ├── lycanthrope/                  # Lycanthrope colony (packs, ranks, howls)
│   │   ├── model/                        # Core model (Character, Food, Gender, enums...)
│   │   ├── simulation/                   # Time loops, random events, threads
│   │   └── ui/                           # User interface (CLI / JavaFX)
│   └── test/java/fr/amu/iut/noel/        # JUnit 5 unit tests
└── README.md
```
