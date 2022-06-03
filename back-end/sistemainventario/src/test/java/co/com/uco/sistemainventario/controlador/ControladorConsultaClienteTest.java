package co.com.uco.sistemainventario.controlador;

import co.com.uco.sistemainventario.SistemaInventarioApplication;
import co.com.uco.sistemainventario.comando.ComandoCliente;
import co.com.uco.sistemainventario.consulta.cliente.ControladorConsultaCliente;
import co.com.uco.sistemainventario.controlador.builder.ComandoClienteTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = SistemaInventarioApplication.class
)
public class ControladorConsultaClienteTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;



    @Test
    @DisplayName("Deberia listar cliente")
    void deberiaListarCliente() throws Exception {
        // arrange
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
        ComandoCliente comandoCliente= new ComandoClienteTestDataBuilder().setIdentificacion("1007334302").setNombreCompleto("Brayan Estiven Sepulveda Quintero")
                        .setContacto("320 864 91 85").setCorreo("brayan.sepulveda4302@soyuco.edu.co").setResidencia("Marinilla").build();

        // act - assert
        mockMvc.perform(get("/v1/cliente")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].identificacion", is(comandoCliente.getIdentificacion())));

    }
}
