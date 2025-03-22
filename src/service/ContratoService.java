package service;

public class ContratoService implements IcontartoService {

    private IcontratoDao contratoDao;


    public ContratoService(IcontratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String atualizar() {
        return "Contrato atualizado com sucesso!";
    }

    @Override
    public String excluir() {
        return "Contrato excluído com sucesso!";
    }

    @Override
    public String buscar(int id) {
        return "Contrato encontrado com sucesso!";
    }
}
