# Lab: Abstrakte Klassen in Java

In diesem Lab lernen Sie, wie Sie **abstrakte Klassen** in Java nutzen k�nnen, um Ihre Programme flexibler und modularer zu gestalten. Wir werden das Konzept mit Beispielen und Mini�bungen Schritt f�r Schritt erarbeiten. Ich empfehle Ihnen, die Beispiele selbst auszuprobieren und die Mini�bungen zu l�sen, um Ihr Verst�ndnis zu vertiefen. Debuggen Sie gerne auch den Beispielcode, um zu sehen, wie er funktioniert und was passiert, wenn Sie ihn �ndern. Die gesch�tzte Bearbeitungszeit betr�gt ca. 90 Minuten. Viel Erfolg!

## Lernziele
Nach Bearbeitung dieses Labs sollten Sie in der Lage sein:
- Eine abstrakte Klasse in Java zu definieren und zu verwenden
- Den Unterschied zwischen abstrakten Klassen und Interfaces zu erkl�ren
- Abstrakte Methoden in Unterklassen zu implementieren
- Polymorphismus durch abstrakte Klassen zu nutzen
- Abstrakte Klassen in der Praxis einzusetzen

## Einf�hrung
**Eine abstrakte Klasse ist eine Klasse, die nicht direkt instanziiert werden kann, sondern als Vorlage f�r andere Klassen dient.** Sie kann abstrakte Methoden enthalten, die von Unterklassen implementiert werden m�ssen. Zus�tzlich kann sie konkrete Methoden enthalten, die von den Unterklassen �bernommen werden k�nnen.

### Syntaxregel:
```java
abstract class �KLASSENNAME� {
    // Abstrakte Methode (ohne Implementierung)
    abstract void �METHODENNAME�();
    
    // Konkrete Methode (mit Implementierung)
    void konkreteMethode() {
        System.out.println("Diese Methode ist bereits implementiert.");
    }
}
```

Sollen Klassen eine abstrakte Klasse erweitern, so wird dies durch das Schl�sselwort `extends` angegeben:

```java
class �UNTERKLASSENNAME� extends �KLASSENNAME� {
    // Pflicht: Implementierung der abstrakten Methode
    @Override
    void �METHODENNAME�() {
        System.out.println("Spezifische Implementierung in der Unterklasse");
    }
}
```

- **Eine abstrakte Klasse kann sowohl abstrakte als auch konkrete Methoden enthalten.**
- **Eine Unterklasse, die von einer abstrakten Klasse erbt, muss alle abstrakten Methoden implementieren oder selbst als abstrakt deklariert werden.**
- **Von einer abstrakten Klasse kann kein Objekt direkt erzeugt werden (`new AbstrakteKlasse()` ist nicht erlaubt).**

> **Wichtig:** Eine abstrakte Klasse ist eine unvollst�ndige Klasse, die als Basis f�r andere Klassen dient.

## Warum braucht man abstrakte Klassen?
- **Code-Wiederverwendung:** Gemeinsame Eigenschaften und Methoden k�nnen in einer abstrakten Oberklasse definiert und in Unterklassen wiederverwendet werden.
- **Strukturierte Vererbung:** Abstrakte Klassen erlauben es, eine gemeinsame Basis f�r verwandte Klassen bereitzustellen.
- **Polymorphismus:** Durch abstrakte Methoden k�nnen Unterklassen unterschiedlich aufgerufen werden, ohne dass der genaue Typ bekannt sein muss.

### Beispiel: Tier-Hierarchie
```java
// Abstrakte Klasse
abstract class Tier {
    String name;

    Tier(String name) {
        this.name = name;
    }
    
    // Abstrakte Methode - keine Implementierung hier
    abstract void macheGeraeusch();
    
    // Konkrete Methode
    void schlafen() {
        System.out.println(name + " schl�ft.");
    }
}

// Konkrete Unterklasse
class Hund extends Tier {
    Hund(String name) {
        super(name);
    }
    
    @Override
    void macheGeraeusch() {
        System.out.println(name + " bellt: Wuff!");
    }
}
```

### �bung 1: Abstrakte Klasse und Unterklasse erstellen
Erstellen Sie eine abstrakte Klasse `Fahrzeug` mit:
- einem Attribut `marke`
- einer abstrakten Methode `beschleunigen(int wert)`
- einer konkreten Methode `zeigeMarke()`, die die Marke ausgibt

Erstellen Sie eine Unterklasse `Auto`, die von `Fahrzeug` erbt und `beschleunigen()` implementiert.

<details><summary>L�sung anzeigen</summary>

```java
abstract class Fahrzeug {
    String marke;
    Fahrzeug(String marke) { this.marke = marke; }
    abstract void beschleunigen(int wert);
    void zeigeMarke() {
        System.out.println("Fahrzeug der Marke " + marke);
    }
}

class Auto extends Fahrzeug {
    Auto(String marke) { super(marke); }
    @Override
    void beschleunigen(int wert) {
        System.out.println("Auto beschleunigt um " + wert + " km/h.");
    }
}
```
</details>

## Unterschiede zwischen abstrakten Klassen und Interfaces
| Merkmal                | Abstrakte Klasse                                     | Interface                                           |
|------------------------|------------------------------------------------------|-----------------------------------------------------|
| Kann abstrakte Methoden enthalten | ?                                                    | ?                                                   |
| Kann konkrete Methoden enthalten | ?                                                    | ? (nur default/static-Methoden)                     |
| Kann Attribute mit Zustand enthalten | ? (Instanzvariablen als Attribute innerhalb m�glich) | ? (nur public static final Konstanten)              |
| Erlaubt Mehrfachvererbung | ? (nur eine Klasse)                                  | ? (mehrere Interfaces m�glich)                      |
| Hat Konstruktoren | ?                                                    | ? (aber implizit vom implementierenden Typ genutzt) |

**Wann verwende ich was?**
- **Abstrakte Klassen**, wenn eine **gemeinsame Basisklasse mit geteiltem Code** notwendig ist.
- **Interfaces**, wenn Klassen nur **eine gemeinsame Schnittstelle teilen sollen**, aber ansonsten nichts gemeinsam haben.

**Merke**: Sie k�nnen keine Instanzen von abstrakten Klassen erstellen, aber Sie k�nnen sie als Typen f�r Variablen und Parameter verwenden.

### Mini�bung:
Entscheiden Sie in den folgenden Szenarien, ob Sie eine abstrakte Klasse oder ein Interface verwenden w�rden.

1. Ein Spiel hat verschiedene Charaktere (Krieger, Magier, Bogensch�tze) mit Lebenspunkten und `angreifen()`. Die Angriffsweise ist unterschiedlich, aber sie teilen gemeinsame Attribute.
2. Sie schreiben ein Plugin-System, in dem verschiedene Plugins `start()` enthalten, aber sonst keine Gemeinsamkeiten haben.

<details><summary>L�sung anzeigen</summary>
1. **Abstrakte Klasse**, weil Charaktere gemeinsame Eigenschaften (Lebenspunkte) haben.
2. **Interface**, weil alle Plugins `start()` ben�tigen, aber keine gemeinsamen Attribute haben.
</details>

### Abschlie�ende Aufgabe:
Erstellen Sie eine abstrakte Klasse `Form` mit einer abstrakten Methode `berechneFlaeche()`. Erstellen Sie eine Unterklasse `Rechteck`, die von `Form` erbt und `berechneFlaeche()` implementiert. Testen Sie die Berechnung der Fl�che eines Rechtecks. Erstellen Sie eine weitere Unterklasse `Kreis`, die ebenfalls von `Form` erbt und `berechneFlaeche()` implementiert. Testen Sie die Berechnung der Fl�che eines Kreises. 
In Ihrem Testprogramm sollten Sie eine Liste von Formen erstellen und die Fl�che jeder Form berechnen und ausgeben. Hierbei wenden Sie Polymorphismus an, machen Sie sich dies bitte nochmals bewusst. Die Aufgabe w�re ebenso mit einem Interface l�sbar, �berlegen Sie sich, was in diesem Fall der Unterschied w�re. 

<details><summary>L�sung anzeigen</summary>
    
```java 
abstract class Form {
    abstract double berechneFlaeche();
}

class Rechteck extends Form {
    double laenge, breite;
    Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }
    @Override
    double berechneFlaeche() {
        return laenge * breite;
    }
}

class Kreis extends Form {
    double radius;
    Kreis(double radius) {
        this.radius = radius;
    }
    @Override
    double berechneFlaeche() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Form[] formen = new Form[] {
            new Rechteck(5, 3),
            new Kreis(4)
        };
        for (Form form : formen) {
            System.out.println("Fl�che: " + form.berechneFlaeche());
        }
    }
}
```

**Unterschied zu einem Interface**: Eine abstrakte Klasse kann Attribute und konkrete Methoden enthalten, w�hrend ein Interface nur Methoden-Signaturen enth�lt. In diesem Fall s�he die L�sung mit einem Interface so aus:

```java
interface Form {
    double berechneFlaeche();
}

class Rechteck implements Form {
    double laenge, breite;
    Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }
    @Override
    double berechneFlaeche() {
        return laenge * breite;
    }
}

class Kreis implements Form {
    double radius;
    Kreis(double radius) {
        this.radius = radius;
    }
    @Override
    double berechneFlaeche() {
        return Math.PI * radius * radius;
    }
}
```
Das Hauptprogramm mit der main-Methode bleibt gleich. Der Unterschied ist, dass die Klassen `Rechteck` und `Kreis` das Interface `Form` implementieren statt von einer abstrakten Klasse zu erben.
</details>

## Zusammenfassung
In diesem Lab haben Sie gelernt, wie abstrakte Klassen in Java funktionieren. Sie haben gesehen:
- Wie abstrakte Klassen aufgebaut sind
- Wie sie sich von Interfaces unterscheiden
- Wie sie zur Code-Wiederverwendung und f�r Polymorphismus genutzt werden

Bearbeiten Sie die zus�tzlichen �bungen auf Moodle, um Ihr Wissen zu vertiefen. Viel Erfolg!

_� Prof. Dr. Alexander Bartel, Hochschule Neu-Ulm. Alle Rechte vorbehalten._
