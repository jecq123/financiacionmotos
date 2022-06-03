package co.com.uco.sistemainventario.controlador;

import co.com.uco.sistemainventario.SistemaInventarioApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = SistemaInventarioApplication.class
)
public class ComandoControladorCreditoTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;



    @Test
    @DisplayName("Deberia listar cliente")
    void deberiaCrearUnCredito() throws Exception {

    }

}
