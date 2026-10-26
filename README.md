# University Metro System

A simple **Java console application** that simulates a university metro ticketing system. It is built as a **NetBeans Ant (J2SE) project**.

## Features

- **User registration** with a random 4-digit verification code.
- **Wallet** with deposits and balance checks (a minimum of 5 SAR is required to start a trip).
- **Trip selection** across 10 university stations with start/end validation.
- **User management** for up to 10 registered users.
- **Ticket generation** with a fixed fare of 5 SAR deducted from the wallet.

## Requirements

- JDK 23 or later (the project is configured with `javac.source=23` / `javac.target=23`; built and tested with Temurin 25).
- Apache Ant (bundled with NetBeans) to build from the command line.

## Build

Using the NetBeans bundled Ant:

```bash
ant clean jar
```

This produces `dist/metro.jar`.

## Run

```bash
java -jar dist/metro.jar
```

## Project structure

```
metro/
├── src/metro/            # Java source files
│   ├── Metro.java        # Application entry point (main)
│   ├── SignIn.java       # User registration and verification
│   ├── Stations.java     # Station catalog and search
│   ├── Destination.java  # Trip selection (start/end)
│   ├── Wallet.java       # Balance and ticket fare
│   └── manifest.mf       # Manifest template
├── nbproject/            # NetBeans project configuration
├── build.xml             # Ant build script
└── test/                 # (empty) test sources root
```

## Main classes

| Class | Responsibility |
|-------|----------------|
| `Metro` | Entry point and main menu |
| `SignIn` | User name, phone number and random-code verification |
| `Stations` | List of 10 stations, printing and searching |
| `Destination` | Choose the start/end station of a trip |
| `Wallet` | Deposit money and deduct the 5 SAR fare |

## Note

The `test/` directory is currently empty; no automated tests are included.
