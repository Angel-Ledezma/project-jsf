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
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
	}

}
