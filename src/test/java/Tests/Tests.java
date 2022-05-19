/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import com.jimenez.movilbackend.Movilbackend;
import com.jimenez.movilbackend.dao.DirectionRepository;
import com.jimenez.movilbackend.dao.EmailRepository;
import com.jimenez.movilbackend.dao.PersonRepository;
import com.jimenez.movilbackend.dao.PhoneRepository;
import com.jimenez.movilbackend.enums.EstadoCivil;
import com.jimenez.movilbackend.enums.Sexo;
import com.jimenez.movilbackend.model.Direction;
import com.jimenez.movilbackend.model.Email;
import com.jimenez.movilbackend.model.Person;
import com.jimenez.movilbackend.model.Phone;
import java.util.Calendar;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 *
 * @author SANTIAGO
 */

@SpringBootTest
@ContextConfiguration(classes = Movilbackend.class)
public class Tests {
    
   @Autowired
   private PersonRepository personRepository;
   
   @Autowired
   private PhoneRepository phoneRepository;
   
   @Autowired
   private EmailRepository emailRepository;
   
   @Autowired
   private DirectionRepository directionRepository;
    
   @Test
   public void testing(){
       
       Calendar fecha = Calendar.getInstance();
       fecha.set(1981, 1, 1);
       
       Person persona = new Person();
       persona.setCedula("1105623589");
       persona.setNombres("Diego Palacios");
       persona.setFechaNacimiento(fecha.getTime());
       persona.setEstadoCivil(EstadoCivil.SOLTERO);
       persona.setSexo(Sexo.HOMBRE);
       
       personRepository.save(persona);
       
       
       Phone telefono = new Phone();
       telefono.setPerson(persona);
       telefono.setTelefono("0984851524");
       
       phoneRepository.save(telefono);
       
       Email correo = new Email();
       
       correo.setPerson(persona);
       correo.setEmail("smjimenez9702@gmail.com");
       
       emailRepository.save(correo);
       
       Direction direccion = new Direction();
       
       direccion.setPerson(persona);
       direccion.setDireccion("La Argelia");
       
       directionRepository.save(direccion);
      
   }
}
