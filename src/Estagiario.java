public class Estagiario extends Funcionario{

    private double horasSemana;
    private double qtdeMeses;

    public double getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(double horasSemana) {
        this.horasSemana = horasSemana;
    }

    public double getQtdeMeses(double qtdeMeses) {
        return qtdeMeses;
    }

    public void setQtdeMeses(double qtdeMeses) {
        this.qtdeMeses = qtdeMeses;
    }

public void calculaHoras(){
        double horasEstagio = (horasSemana * 4) * qtdeMeses;
        System.out.println("Total de horas: " + horasEstagio);
}

    @Override
    public String toString() {
        return "Estagiario{" +
                "horasSemana=" + horasSemana +
                ", qtdeMeses=" + qtdeMeses +
                '}';
    }
}

