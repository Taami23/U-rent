package com.web.urent.rest;

import com.web.urent.controller.ArrendadorController;
import com.web.urent.controller.ExceptionControllerAdvice;
import com.web.urent.model.*;
import com.web.urent.service.ApplicationTestConfig;
import com.web.urent.service.ArrendadorService;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationTestConfig.class)
@WebAppConfiguration

public class ArrendadorRestControllerTests {
    @Autowired
    private ArrendadorController arrendadorRestController;

    @MockBean
    protected ArrendadorService arrendadorService;

    private MockMvc mockMvc;

    private List<Arrendador> arrendadores;

    @Before
    public void initArrendadores() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(arrendadorRestController)
                .setControllerAdvice(new ExceptionControllerAdvice()).build();
        arrendadores = new ArrayList<Arrendador>();

        Arrendador arrendador1 = new Arrendador();
        arrendador1.setId_Arrendador(1);
        arrendador1.setCalificacion(5.1);
        arrendador1.setClave("carolina123");
        arrendador1.setCorreo("matias.robles1601@gmail.com");
        arrendador1.setDescripcion("");
        arrendador1.setEstado(1);
        arrendador1.setNombre("Matías RObles");
        arrendador1.setRut_Arrendador("19.912.557-5");
        arrendador1.setTelefono("932346496");
        arrendadores.add(arrendador1);

        Arrendador arrendador2 = new Arrendador();
        arrendador1.setId_Arrendador(2);
        arrendador1.setCalificacion(5.1);
        arrendador1.setClave("carolina123");
        arrendador1.setCorreo("matias.robles1501@gmail.com");
        arrendador1.setDescripcion("");
        arrendador1.setEstado(1);
        arrendador1.setNombre("Matías Díaz");
        arrendador1.setRut_Arrendador("19.812.557-7");
        arrendador1.setTelefono("942346496");
        arrendadores.add(arrendador2);

        Arrendador arrendador3 = new Arrendador();
        arrendador1.setId_Arrendador(3);
        arrendador1.setCalificacion(5.1);
        arrendador1.setClave("carolina123");
        arrendador1.setCorreo("matias.robles1401@gmail.com");
        arrendador1.setDescripcion("");
        arrendador1.setEstado(1);
        arrendador1.setNombre("Miguel Martinez Lopez");
        arrendador1.setRut_Arrendador("19.712.557-6");
        arrendador1.setTelefono("952346496");
        arrendadores.add(arrendador3);
    }

    @Test
    public void testGetAlumnoSuccess() throws Exception {
        
        given(this.arrendadorService.get(2)).willReturn(Optional.of(arrendadores.get(1)));
        this.mockMvc.perform(get("/api/Arrendador/2")
        	.accept(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.id_Arrendador").value(1))
            .andExpect(jsonPath("$.nombre").value("Matías RObles"));
    }

	@Test
    public void testGetArrendadorNotFound() throws Exception {
        given(this.arrendadorService.get(-1)).willReturn(null);
        this.mockMvc.perform(get("/api/Arrendador/-1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }
}
