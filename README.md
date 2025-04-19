# decorator-pattern-projekt
Ein Projekt von Anton Filipiak, Alexandra Kossilov und Dennis Kasch

## Versionierung
Da keine Versionierung angegeben wurde haben wir uns für eine Eigene entschieden.

- Roter-Test endet mit einer 1
- Grüner-Test endet mit einer 2
- Refactoring endet mit einer 3 oder höher.


##### Beispielsweise:

Erster Test
\
0.1: Red-Test ...
\
0.2: Green-Test ...
\
0.3: Refactoring ...

Zweiter Test
\
1.1: Red-Test ...
\
1.2: Green-Test ...
\
1.3: Refactoring ...

### Wichtig

Wir haben unser bestes gegeben auf die Versionierung zu achten.
\
Es kann aber mal vorkommen das diese nicht immer 100% korrekt sind.

## Boni

### BaseBonus
Der Grundbonus liegt bei 1000 Euro.

### BonusService

### DaysAbsentBonus
Bei normalen Fehlzeiten gibt es keinen Bonus und keinen Abzugsbonus.
#### Geringe Fehlzeit
Wenn ein Mitarbeiter 5 Tage oder weniger gefehlt hat gibt es einen Bonus, der anhand der performance berechnet wird (3 abstufungen).
\
Als standard Bonus Wert wird hier 100 Euro verwendet.
\
Der Standard Faktor liegt hier bei 1.5.

Performance ab 8 und höher (Hohe Performance)     = Bonus(100) * Faktor(1.5)^3
\
Performance ab 4 und höher (Mittlere Performance) = Bonus * Faktor^2
\
Performance ab 0 und höher (Niedrige Performance) = Bonus * Faktor

#### Hohe Fehlzeit
Wenn ein Mitarbeiter 20 Tage oder mehr gefehlt hat, gibt es einen Bonusabzug (2 Abstufungen).

Als standard Bonusabzugs Wert wird hier -100 Euro verwendet.

Fehltage ab 20 Tagen = Bonus(-100) / 2
Fehltage ab 25 Tagen = Bonus 


### PerformanceBonus
Bei einer Performance unter 7 liegt der Faktor bei 1.0.
Ab einer Performance von 7 bis 8 liegt der Faktor bei 1.2. 
Wenn die Performance über 8 ist, liegt der Faktor bei 1.5. 

### ProjectCompletionBonus
Jeder Mitarbeiter, der ein Projekt vollendet hat, bekommt pro Projekt einen bonus von 5 euro.

Beispiel:
Bonus pro Projekt = 5
Vollendete Projekte = 20

Bonus Gesamt = Vollendete Projekte(20) * Bonus pro Projekt(5)
### SeniorityBonus

### TeamleaderBonus