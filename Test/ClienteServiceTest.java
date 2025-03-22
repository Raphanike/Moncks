import dao.ClientDao;
import dao.ClientDaoMonk;
import org.junit.Assert;
import org.junit.Test;
import service.ClientService;

public class ClienteServiceTest {


    @Test
    public void salvarTest() {
        ClientDaoMonk monk = new ClientDaoMonk();
        ClientService clienteService = new ClientService(monk);
        String retorno = clienteService.salvar();
        Assert.assertEquals("Sucesso", retorno);

    }
    @Test(expected = UnsupportedOperationException.class)

    public void erroEsperado() {
        ClientDao monk = new ClientDao();
        ClientService clienteService = new ClientService(monk);
        String retorno = clienteService.salvar();
        Assert.assertEquals("Sucesso", retorno);

    }
}
