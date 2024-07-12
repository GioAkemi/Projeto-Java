package carro.repository;

import carro.model.carroZero;

public interface CarroRepository {

    // CRUD do Estacionamento
    public void procurarPorId(int idCarro);
    public void listarTodos();
    public void cadastrar(carroZero carro);
    public void atualizar(int idCarro, float precoCarroAtualizado);
    public void deletar(int idCarro);

}