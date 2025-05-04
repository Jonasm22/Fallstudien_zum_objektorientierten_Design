package Aufgabe_3;

public interface ICalculator<T extends  Number>{
    T addieren( T a, T b);
    T subtrahieren(T a, T b);
    T multiplizieren(T a, T b);
    T dividieren(T a, T b);


}
