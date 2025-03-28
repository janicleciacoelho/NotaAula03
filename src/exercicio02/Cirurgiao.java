package exercicio02;

class Cirurgiao extends Medico {
    public Cirurgiao(boolean trabalhaNoHospital) {
        super(trabalhaNoHospital);

    }

    public void fazerIncisao() {
        System.out.println("O cirurgiao está fazendo uma incisão!");
    }

}



