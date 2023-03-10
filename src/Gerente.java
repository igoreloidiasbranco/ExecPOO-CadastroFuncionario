public class Gerente extends Funcionario {

private double horasSemanais = 44;
private double horasTrab;


    public double getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(double horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public double getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(double horasTrab) {
        this.horasTrab = horasTrab;
    }

public void horasMais(){
        double horasExtras = horasTrab - horasSemanais;
        System.out.println("Horas Extras: " + horasExtras);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "horasSemanais=" + horasSemanais +
                ", horasTrab=" + horasTrab +
                '}';
    }
}
