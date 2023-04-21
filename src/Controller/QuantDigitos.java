package Controller;

public class QuantDigitos {


    public QuantDigitos(){
        super();
    }

    public int ContaDigitos(int n){
        if (n < 10 && n > -10){ //codição de parada
            return 1;
        }
        else {
            int quantidade= ContaDigitos(n / 10); //chamada da recursiva
            if (n > 10 && n > -10){
                return quantidade + 1;
            }
            else {
                return quantidade;
            }
        }

    }


}
