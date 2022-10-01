
package Control;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements ActionListener {

    private Feligres feligres;   
    private Vista vista;

    public Control() {
    }

    public Control(Feligres feligres, Vista v) {
        super();
        this.feligres = feligres;
        this.vista = v;
        actionListener(this);
        
    }
    

    public void actionListener(ActionListener control) {

        System.out.println("Peurr");
        vista.guardarBtn.addActionListener(control);
        vista.eliminarBtn.addActionListener(control);
        vista.actualizarBtn.addActionListener(control);
        vista.buscarBtn.addActionListener(control);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("action");
        if (e.getActionCommand().equals("Guardar")) {
            System.out.println("hhhhhh");
            String nombre = vista.nombreTxField.getText();
            String cedula = vista.feliCedulaTxField.getText();
            String direccion = vista.direccionTxField.getText();
            String telefono = vista.telefonoTxField.getText();
            String estado = vista.estadoTxField.getText();

            feligres.setNombre(nombre);
            feligres.setCedula(cedula);
            feligres.setDireccion(direccion);
            feligres.setTelefono(telefono);
            feligres.setEstado(estado);
        }

    }
    
}
