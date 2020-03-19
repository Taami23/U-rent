package com.web.urent.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import com.web.urent.model.Arrendador;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class ArrendadorServiceTest {

    @Autowired
    protected ArrendadorService ArrendadorService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldFindArrendadorById() throws Exception {
        // Act(Caso exitoso)
        Optional<Arrendador> arrendador = this.ArrendadorService.get(10);
        // Assert
        assertThat(arrendador.get().getId_Arrendador()).isEqualTo(3);

        // Act (Caso fallido)
        arrendador = this.ArrendadorService.get(3);
        // Assert
        assertThat(arrendador.get().getId_Arrendador()).isNotEqualTo(3);
    }
}