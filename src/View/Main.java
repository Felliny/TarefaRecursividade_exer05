package View;

import Controller.QuantDigitos;

public class Main {
    public static void main(String[] args) {
        int n= 12023;
        QuantDigitos re= new QuantDigitos();
        System.out.println("Total de digitos: "+ re.ContaDigitos(n));
    }
}
