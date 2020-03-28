import br.com.unibh.patterns.singleton.Incremental;
import br.com.unibh.patterns.singleton.IncrementalSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testando utilizando uma classe com padrão singleton")
public class IncrementalSingletonTest {

    private static final int QTD_INSTANCIA = 1;

    @Test
    @DisplayName("1 - Teste para verificar se toda vez que instanciar a classe incremental não  vai incrementar o contador")
    public void testIncremental(){
        IncrementalSingleton incremental = IncrementalSingleton.getInstance();
        Assertions.assertEquals(incremental.toString(), String.format("%s %d", IncrementalSingleton.class.getName(),QTD_INSTANCIA));
    }

    @Test
    @DisplayName("2 - Teste para verificar a criação da instancia dentro do loop se o seu incrementador vai funcionar corretamente")
    public void testIncrementalWithLoop(){
        int quantidadeInstancias = Incremental.getCount();
        for (int i = Incremental.getCount(); i< quantidadeInstancias + 10; i++){
            IncrementalSingleton incremental = IncrementalSingleton.getInstance();
            Assertions.assertEquals(incremental.toString(), String.format("%s %d", IncrementalSingleton.class.getName(),QTD_INSTANCIA));
        }
    }

    @Test
    @DisplayName("3 - Teste criando o incremental fora do for para verificar se é incrementado a instancia")
    public void testIncrementalWithoutLoop(){
        int quantidadeInstancias = Incremental.getCount();
        IncrementalSingleton incremental = IncrementalSingleton.getInstance();

        for (int i =0; i<10; i++){
            Assertions.assertEquals(incremental.toString(), String.format("%s %d", IncrementalSingleton.class.getName(),QTD_INSTANCIA));
        }
    }

}
