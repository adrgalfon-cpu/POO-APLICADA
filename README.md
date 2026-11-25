# TAULER AMB OBJECTES
Aquest programa consta de tres classes de java.

|                                      Main.java                                      |                                  Rectangle                                  |                   Tauler                   |
|:------------------------------------------------------------------------------------|:----------------------------------------------------------------------------|:-------------------------------------------|
|Fitxer Main.<br/>S'encarrega de cridar<br/>les altres classes per <br/>crear objectes|Guarda diversos numeros enters <br/>i mòduls útils per representar rectangles|Guarda l'estat del Tauler i el  potdibuixar |
___
un exemple de crida del rectangle és:
````
int coordX = 0;
int coordY = 0;
int longitud = 2;
int altura = 2;
Rectangle rectangle = new Rectangle(coordX,coordY,longitud,altura);
Tauler tauler = new Tauler(10,10,"[ ]","▐█▌");
````

La crida a Rectangle rep les coordenades inicials del rectangle, la seva longitud i alçada.

>Rectangle rectangle = new Rectangle(coordX,coordY,longitud,altura); 

La crida a Tauler rep les dimensions del tauler i els caràcters que representen les caselles buides i plenes, respectivament.

> Tauler tauler = new Tauler(10,10,"[ ]","▐█▌");