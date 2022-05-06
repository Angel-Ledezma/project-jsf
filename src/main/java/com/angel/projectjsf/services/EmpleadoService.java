/**
 * 
 */
package com.angel.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.angel.projectjsf.entity.Empleado;

/**
 * @author Miguel Garcia
 * Clase que permite realizar la logica de negocios para empleados
 *
 */
public class EmpleadoService {
	/**
	 * Metodo que permite consultar la lista de empleados de empresas de TI.
	 * @return {@link Empleado} lista de empleados.
	 */
	public List<Empleado> consultarEmpleados(){
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM =new Empleado();
		Empleado empleadoMicrosoft =new Empleado();
		Empleado empleadoApple =new Empleado();
		Empleado empleadoNetflix =new Empleado();
		Empleado empleadoSamsung =new Empleado();
		Empleado empleadoLG =new Empleado();
		Empleado empleadoSony =new Empleado();
		Empleado empleadoHP =new Empleado();
		Empleado empleadoAsus =new Empleado();
		
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("López");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setStatus(true);
		
		empleadoMicrosoft.setNombre("Miguel");
		empleadoMicrosoft.setPrimerApellido("Garcia");
		empleadoMicrosoft.setSegundoApellido("Ledezma");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setStatus(true);
		
		empleadoApple.setNombre("Erick");
		empleadoApple.setPrimerApellido("Cruz");
		empleadoApple.setSegundoApellido("Ceron");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setStatus(true);
		
		//::::::::::::::::::::::::::::::::::::::::::::::::
		
		empleadoNetflix.setNombre("Michel");
		empleadoNetflix.setPrimerApellido("Alvarez");
		empleadoNetflix.setSegundoApellido("Peredo");
		empleadoNetflix.setPuesto("Director");
		empleadoNetflix.setStatus(true);
		
		empleadoSamsung.setNombre("Pedro");
		empleadoSamsung.setPrimerApellido("Martinez");
		empleadoSamsung.setSegundoApellido("Morales");
		empleadoSamsung.setPuesto("Gerente");
		empleadoSamsung.setStatus(false);
		
		empleadoLG.setNombre("Maria");
		empleadoLG.setPrimerApellido("Gonzalez");
		empleadoLG.setSegundoApellido("Ayala");
		empleadoLG.setPuesto("Encargada");
		empleadoLG.setStatus(true);
		
		empleadoSony.setNombre("Vanessa");
		empleadoSony.setPrimerApellido("Montes");
		empleadoSony.setSegundoApellido("Hernandez");
		empleadoSony.setPuesto("CEO");
		empleadoSony.setStatus(true);
		
		empleadoHP.setNombre("Pamela");
		empleadoHP.setPrimerApellido("Medina");
		empleadoHP.setSegundoApellido("Olaya");
		empleadoHP.setPuesto("CEO");
		empleadoHP.setStatus(true);
		
		empleadoAsus.setNombre("Rebeca");
		empleadoAsus.setPrimerApellido("Pineda");
		empleadoAsus.setSegundoApellido("Santana");
		empleadoAsus.setPuesto("Gerente");
		empleadoAsus.setStatus(false);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoSamsung);
		empleados.add(empleadoLG);
		empleados.add(empleadoSony);
		empleados.add(empleadoHP);
		empleados.add(empleadoAsus);
		
		return empleados;
	}

}
