package poo.exerciciopooUpDowncast;

public class RodarAplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente(); //upcast são implícitos, sai da classe filha para a classe mãe
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente_ = new Funcionario(); - está errado
      //  Vendedor vendedor_ = (Vendedor) new Funcionario(); - está certo, mas dando erro. é bom NÃO USAR

    }
}
