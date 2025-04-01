public record Endereco(String logradouro,
                      String complemento,
                      String bairro,
                      String localidade,
                      String uf,
                      String cep,
                      String unidade) {

    public void write(String json) {
    }
}
