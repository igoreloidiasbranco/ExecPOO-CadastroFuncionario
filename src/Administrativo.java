public class Administrativo extends Funcionario{

        private double horasTrab;
        private double horasExtras;
        private double horaAdm = 20;


        public double getHorasTrab() {
                return horasTrab;
        }

        public void setHorasTrab(double horasTrab) {
                this.horasTrab = horasTrab;
        }

        public double getHorasExtras() {
                return horasExtras;
        }

        public void setHorasExtras(double horasExtras) {
                this.horasExtras = horasExtras;
        }

        public double getHoraAdm() {
                return horaAdm;
        }


public void calculoSalario(){
        double salario = (horasTrab + horasExtras) * horaAdm;
        System.out.println("Salário: " + salario);
}

        @Override
        public String toString() {
                return "Administrativo{" +
                        "horasTrab=" + horasTrab +
                        ", horasExtras=" + horasExtras +
                        ", horaAdm=" + horaAdm +
                        '}';
        }
}
