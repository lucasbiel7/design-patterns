import br.com.unibh.patterns.singleton.Incremental;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Teste da classe incremental sem utilizar singleton somando toda vez que for criado uma instancia")
public class IncrementalTest {

    @Test
    @DisplayName("1 - Teste para verificar se toda vez que instanciar a classe incremental vai incrementar o contador")
    public void testIncremental(){
        int quantidadeInstancias = Incremental.getCount();
        Incremental incremental = new Incremental();
        Assertions.assertEquals(incremental.toString(), String.format("%s %d", Incremental.class.getName(),quantidadeInstancias + 1));
    }

    @Test
    @DisplayName("2 - Teste para verificar a criação da instancia dentro do loop se o seu incrementador vai funcionar corretamente")
    public void testIncrementalWithLoop(){
        int quantidadeInstancias = Incremental.getCount();
        for (int i = Incremental.getCount(); i< quantidadeInstancias + 10; i++){
            Incremental incremental = new Incremental();
            Assertions.assertEquals(incremental.toString(), String.format("%s %d", Incremental.class.getName(),i+1));
       }
    }

    @Test
    @DisplayName("3 - Teste criando o incremental fora do for para verificar se é incrementado a instancia")
    public void testIncrementalWithoutLoop(){
        int quantidadeInstancias = Incremental.getCount();
        Incremental incremental = new Incremental();

        for (int i =0; i<10; i++){
            Assertions.assertEquals(incremental.toString(), String.format("%s %d", Incremental.class.getName(),quantidadeInstancias+1));
        }
    }
}
