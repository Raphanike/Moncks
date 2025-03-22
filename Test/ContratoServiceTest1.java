import org.junit.Assert;
import org.junit.Test;
import service.*;

public class ContratoServiceTest1 {


    @Test
    public void salvar() {
        IcontratoDao dao = new ContratoDao();
        IcontartoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }


    @Test
    public void atualizar() {
        IcontratoDao dao = new ContratoDao();
        IcontartoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Contrato atualizado com sucesso!", retorno);
    }


    @Test
    public void excluir() {
        IcontratoDao dao = new ContratoDao();
        IcontartoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Contrato excluído com sucesso!", retorno);
    }


    @Test
    public void buscar() {
        IcontratoDao dao = new ContratoDao();
        IcontartoService service = new ContratoService(dao);
        String retorno = service.buscar(1);
        Assert.assertEquals("Contrato encontrado com sucesso!", retorno);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void salvarTest2() {
        IcontratoDao dao = new ContratoMonk();
        IcontartoService service = new ContratoService(dao);
        service.salvar();
    }
}
