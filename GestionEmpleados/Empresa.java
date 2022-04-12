
package colleciones2;

import java.util.*;


public class Empresa {
    private String razon;
    private List <Empleado> empleados = new ArrayList <Empleado>();
    

    public Empresa(String razon) {
        this.razon = razon;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public void incorporarEmpleado(Empleado e){
        empleados.add(e);        
    }
    
    public void mostrarEmpleados(){
        empleados.sort(null);
        System.out.println(empleados);
    }
    
    
    
}
