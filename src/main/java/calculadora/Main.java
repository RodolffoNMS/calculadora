package calculadora;

import calculadora.controllers.CalculadoraController;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(); 
        CalculadoraController controller = new CalculadoraController(); 
        controller.iniciar(menu);
    }
}
