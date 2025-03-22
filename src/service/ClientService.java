package service;

import dao.ClientDao;
import dao.IclienteDao;

public class ClientService {

    private IclienteDao clientDao;

    public ClientService(IclienteDao clientDao) {
        this.clientDao = clientDao;
    }

    public String salvar() {
        clientDao.salvar();
        return "Sucesso";
    }
}
