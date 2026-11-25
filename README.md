# TAULER AMB OBJECTES
Aquest programa consta de tres classes de java.

|                                      Main.java                                      |                                  Rectangle                                  |                   Tauler                   |
|:------------------------------------------------------------------------------------|:----------------------------------------------------------------------------|:-------------------------------------------|
|Fitxer Main.<br/>S'encarrega de cridar<br/>les altres classes per <br/>crear objectes|Guarda diversos numeros enters <br/>i mòduls útils per representar rectangles|Guarda l'estat del Tauler i el  potdibuixar |
___
un exemple de crida del rectangle és:
````java
int coordX = 0;
int coordY = 0;
int longitud = 2;
int altura = 2;
Rectangle rectangle = new Rectangle(coordX,coordY,longitud,altura);
Tauler tauler = new Tauler(10,10,"[ ]","▐█▌");
````

El constructor `Rectangle` rep les coordenades inicials del rectangle, la seva longitud i alçada.

>Rectangle rectangle = new Rectangle(coordX,coordY,longitud,altura); 

El constructor `Tauler` rep les dimensions del tauler i els caràcters que representen les caselles buides i plenes, respectivament.

> Tauler tauler = new Tauler(10,10,"[ ]","▐█▌");

---
# ENGLISH:
# BOARD WITH OBJECTS

This program consists of three Java classes.

| Main.java | Rectangle | Board |
|:---|:---|:---|
| Main file. Responsible for calling the other classes to create objects. | Stores several integer values and useful methods for representing rectangles. | Stores the board's state and can draw it. |

___

An example of how to create a rectangle:

```java
int coordX = 0;
int coordY = 0;
int length = 2;
int height = 2;

Rectangle rectangle = new Rectangle(coordX, coordY, length, height);
Board board = new Board(10, 10, "[ ]", "▐█▌");
```

The `Rectangle` constructor receives the rectangle's initial coordinates, length and height.

> `Rectangle rectangle = new Rectangle(coordX, coordY, length, height);`

The `Board` constructor receives the board's dimensions and the characters used to represent empty and filled cells, respectively.

> `Board board = new Board(10, 10, "[ ]", "▐█▌");`

