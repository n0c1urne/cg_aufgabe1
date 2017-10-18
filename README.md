# Vektoren und Matrizen
Eine kurze Aufgabe für die Vorlesung Computergrafik I - dies ist eine IntelliJ-Projekt, Sie können dieses Repository entweder mit

    git clone https://github.com/n0c1urne/cg_aufgabe1.git

klonen und dann in IntelliJ öffnen. Wenn Sie git nicht installiert haben, dann können Sie es stattdessen auch als Archiv runterladen und lokal entpacken.

Für die grafische Ausgabe verwendet dieses Projekt die Java-Libraries von Processing (diese finden sich im Ordner `lib/`). Wenn Sie lieber Eclipse verwenden, findet sich hier ein Tutorial zur Einrichtung von den Processing-Libraries unter Eclipse: https://processing.org/tutorials/eclipse/

In dieser Aufgabe sollen zwei Klassen vervollständigt werden:

- `src/main/Vec2.java` repräsentiert einen 2D-Vektor - Sie müssen noch die Methoden `add`, `sub`, `mult`, `div`, `neg`, `length`, `unit` und `scalarProd` implementieren. Dazu existieren bereits (einfache) Unit-Tests in `src/test/main/TestVecAndMatrix.java`. Ergänzen Sie diese Tests, falls Sie weitere Testfälle abdecken möchten.

- `src/main/Matrix2.java` repräsentiert eine 2x2-Matrix, in dieser Klasse sollen die Methoden `mult(Matrix2 m)` (Matrix-Matrix-Multiplikation) und `mult(Vec2 v)` (Matrix-Vektor-Multiplikation) implementiert werden. Wenn Sie möchten, können Sie noch die Hilfsmethoden `rotate` und `scale` implementieren, allerdings werden diese in den Beispielen nicht verwendet. Die Matrixelemente sind dabei in einzelnen Variablen abgelegt (nicht als Array):

        | a11 a12 |
        | a21 a22 |

Wenn Sie die Vektor- und Matrix-Operationen implementiert haben, können Sie die beiden Beispielprogramme ausführen. `ExampleWithVector` zeigt ein einfaches Beispiel mit Vektoren (eine Linie, die immer in Richtung des Mauszeigers zeigt) und `ExampleWithMatrix` erlaubt es, visuell verschiedene 2D-Matrizen und die daraus resultierende Abbildung auszuprobieren.

Processing hat natürlich bereits Klassen für Vektoren und Matrizen - aber es ist hilfreich, wenn man die verschiedenen Operationen einmal selbst programmiert.

Viel Spass, bei Fragen können Sie sich gern im Forum an mich wenden.