public class Carros {
    public static void main(String[] args) {
        Automoveis carro1 = new Automoveis();
        carro1.setPlaca("ABC-321");
        carro1.setNome("HB20");

        Especificacao hyundai = new Especificacao();
        carro1.setEspecificacao(hyundai);

        carro1.getEspecificacao().setCor("Preto");
        carro1.getEspecificacao().setAno(2019);
        carro1.getEspecificacao().setUso("Semi-novo");

        System.out.println("Nome do Veículo: " + carro1.getNome());
        System.out.println("Placa Veículo: " + carro1.getPlaca());
        System.out.println("Cor: " + carro1.getEspecificacao().getCor());
        System.out.println(carro1.getEspecificacao().getUso());
        System.out.println("Ano do Carro: " + carro1.getEspecificacao().getAno());

        Titular nome1 = new Titular();
        hyundai.setTitular(nome1);
        hyundai.getTitular().setNome("Pablo Tokuo");
        hyundai.getTitular().setCpf("555-555-55-55");
        hyundai.getTitular().setTelefone("4002-8922");
        hyundai.getTitular().setEndereco("Avenida da Rua");
        System.out.println("Nome Titular: " + hyundai.getTitular().getNome());
        System.out.println("CPF: " + hyundai.getTitular().getCpf());
        System.out.println("Endereço: " + hyundai.getTitular().getEndereco());
        System.out.println("Telefone para contato: " + hyundai.getTitular().getTelefone());

        System.out.println("------------");

        Automoveis carro2 = new Automoveis();
        carro2.setNome("Onix");
        carro2.setPlaca("CBA-030");

        Especificacao chevrolet = new Especificacao();
        carro2.setEspecificacao(chevrolet);

        carro2.getEspecificacao().setCor("Laranja");
        carro2.getEspecificacao().setAno(2020);
        carro2.getEspecificacao().setUso("Novo");

        System.out.println("Nome do Veículo: " + carro2.getNome());
        System.out.println("Placa Veículo: " + carro2.getPlaca());
        System.out.println("Cor: " + carro2.getEspecificacao().getCor());
        System.out.println(carro2.getEspecificacao().getUso());
        System.out.println("Ano do Carro: " + carro2.getEspecificacao().getAno());

        Titular nome2 = new Titular();
        chevrolet.setTitular(nome2);

        chevrolet.getTitular().setNome("Naruto");
        chevrolet.getTitular().setCpf("555-555-333-21");
        chevrolet.getTitular().setEndereco("Avenida da Folha");
        chevrolet.getTitular().setTelefone("3333-4444");
        System.out.println("Nome Titular: " + chevrolet.getTitular().getNome());
        System.out.println("CPF: " + chevrolet.getTitular().getCpf());
        System.out.println("Endereço: " + chevrolet.getTitular().getEndereco());
        System.out.println("Telefone para contato: " + chevrolet.getTitular().getTelefone());
    }
}
