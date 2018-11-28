package mx.edu.uacm.test.controller;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mx.edu.uacm.Application;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.Test;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
@AutoConfigureMockMvc
public class VehiculoControllerTest {

	
	@Autowired
	private MockMvc mvc;
	
	
	@Test
	public void testGuardarVehiculo() throws Exception {
		
		mvc.perform(post("/guardar").param("modelo", "2042"));
		
	}
}
