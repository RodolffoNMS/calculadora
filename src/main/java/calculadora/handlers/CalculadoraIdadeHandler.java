package calculadora.handlers;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraIdadeHandler {

    public int calcularIdade(LocalDate dataNascimento) {
        LocalDate hoje = LocalDate.now();
        return Period.between(dataNascimento, hoje).getYears();
    }
}
