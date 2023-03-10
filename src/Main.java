import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String resposta = "S";
        String cadastro;

        while(resposta.equals("S")) {

            System.out.println("Digite qual opção deseja cadastrar: " +
                    "1- Funcionário, 2- Gerente, 3- Administrativo, 4- Estagiário");

            cadastro = entrada.nextLine();

            if (cadastro.equals("1")) {
                Funcionario funcionario = new Funcionario();

                System.out.print("Digite o nome do funcionário: ");
                funcionario.setNome(entrada.nextLine());
                System.out.print("Digite a idade do funcionário: ");
                funcionario.setIdade(Integer.parseInt(entrada.nextLine()));
                System.out.print("Digite o bairro do funcionário: ");
                funcionario.setBairro(entrada.nextLine());
                System.out.println(funcionario.toString());

            } else if (cadastro.equals("2")) {
                Gerente gerente = new Gerente();

                System.out.print("Digite o nome do gerente: ");
                gerente.setNome(entrada.nextLine());
                System.out.print("Digite a idade do gerente: ");
                gerente.setIdade(Integer.parseInt(entrada.nextLine()));
                System.out.print("Digite o bairro do gerente: ");
                gerente.setBairro(entrada.nextLine());
                System.out.print("Digite as horas trabalhadas na semana pelo gerente: ");
                gerente.setHorasTrab(Double.parseDouble(entrada.nextLine()));
                System.out.println(gerente.toString());
                gerente.horasMais();

            } else if (cadastro.equals("3")) {
                Administrativo adm = new Administrativo();

                System.out.print("Digite o nome do administrativo: ");
                adm.setNome(entrada.nextLine());
                System.out.print("Digite a idade do administrativo: ");
                adm.setIdade(Integer.parseInt(entrada.nextLine()));
                System.out.print("Digite o bairro do administrativo: ");
                adm.setBairro(entrada.nextLine());
                System.out.print("Digite as horas trabalhadas: ");
                adm.setHorasTrab(Double.parseDouble(entrada.nextLine()));
                System.out.print("Digite as horas extras: ");
                adm.setHorasExtras(Double.parseDouble(entrada.nextLine()));
                System.out.println(adm.toString());
                adm.calculoSalario();

            } else if (cadastro.equals("4")) {
                Estagiario estagiario = new Estagiario();

                System.out.print("Digite o nome do estagiário: ");
                estagiario.setNome(entrada.nextLine());
                System.out.print("Digite a idade do estagiário: ");
                estagiario.setIdade(Integer.parseInt(entrada.nextLine()));
                System.out.print("Digite o bairro do estagiário: ");
                estagiario.setBairro(entrada.nextLine());
                System.out.print("Digite as horas trabalhadas na semana: ");
                estagiario.setHorasSemana(Double.parseDouble(entrada.nextLine()));
                System.out.print("Digite a quantidade de meses do estágio: ");
                estagiario.setQtdeMeses(Double.parseDouble(entrada.nextLine()));
                System.out.println(estagiario.toString());
                estagiario.calculaHoras();
            }

                else{
                    System.out.println("Digite um valor válido");
            }
            System.out.println("Deseja realizar outro cadastro? (S) ou (N)");
            resposta = (entrada.nextLine());

        }
}
}