/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colleciones2;

/**
 *
 * @author imelgrat
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa emp = new Empresa("Tuti");
        
        emp.incorporarEmpleado(new Empleado("Gaston Micheri",50));
        emp.incorporarEmpleado(new Empleado("Gaston Torrean",40));
        
        System.out.println(emp.getEmpleados());
        emp.mostrarEmpleados();
        
    }
    
}
