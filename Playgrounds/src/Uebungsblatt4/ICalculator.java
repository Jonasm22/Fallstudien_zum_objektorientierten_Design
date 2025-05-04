package Uebungsblatt4;

// enums posible?
public interface ICalculator<T extends  Number>{
    T addieren( T ... values);
    T subtrahieren(T ... values);
    T multiplizieren(T ... values);
    T dividieren(T ... values);


}
