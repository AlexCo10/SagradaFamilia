
package Control;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Control implements ActionListener {
    //No se si es necesario eliminar los metodos dentro de la vista, ya que en este momento estan dentro del controlador
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
        //Se trata de ejecutar el comando de guardar
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
            
        } else if(e.getActionCommand().equals("Actualizar")) //Se trata de ejecutar el comando de actualizar
        {
            System.out.println("hhhhhh");
            String nombre, cedula, direccion, telefono, estado;
            boolean aux = false;
                for (int i = 0; i <= vista.feligresList.size(); i++) {
                if (vista.feligresList.get(i).equals(vista.feliCedulaTxField.getText())) {
                    aux = true;
                }
                    if (aux = true) {
                    nombre = vista.nombreTxField.getText();
                    cedula = vista.feliCedulaTxField.getText();
                    direccion = vista.direccionTxField.getText();
                    telefono = vista.telefonoTxField.getText();
                    estado = vista.estadoTxField.getText();
                    
                    feligres.setNombre(nombre);
                    feligres.setCedula(cedula);
                    feligres.setDireccion(direccion);
                    feligres.setTelefono(telefono);
                    feligres.setEstado(estado);
                } 
            }
            if(aux==false) JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        } else if(e.getActionCommand().equals("Eliminar")) //Se trata de ejecutar el comando de eliminar
        {
            System.out.println("hhhhhh");
            feligres.setNombre(null);
            feligres.setCedula(null);
            feligres.setDireccion(null);
            feligres.setTelefono(null);
            feligres.setEstado(null);
        } else if(e.getActionCommand().equals("Buscar")) //Se trata de ejecutar el comando de buscar
        {
            boolean aux = false;
                for (int i = 0; i <= vista.feligresList.size(); i++) {
                if (vista.feligresList.get(i).equals(vista.feliCedulaTxField.getText())) {
                    aux = true;
                }
                    if (aux = true) {
                    vista.resultadoTxArea.setText("Usuario Existente");
                } 
            }
        }
        
    }
    
}
