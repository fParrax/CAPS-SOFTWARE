
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ListaEspera {
    int id,idPaciente,idTrabajadorSocial,terapeutaAsignado;
    String estado,fechaModificacion;
    String sql;
    PreparedStatement pst;
    java.sql.ResultSet rs;

    public ListaEspera() {
    }
    public ListaEspera(int id, int idPaciente, int idTrabajadorSocial,String fechaModificacion,int terapeutaAsignado, String estado) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.idTrabajadorSocial = idTrabajadorSocial;
        this.estado = estado;
        this.fechaModificacion=fechaModificacion;
        this.terapeutaAsignado=terapeutaAsignado;
    }

    
   
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdTrabajadorSocial() {
        return idTrabajadorSocial;
    }

    public void setIdTrabajadorSocial(int idTrabajadorSocial) {
        this.idTrabajadorSocial = idTrabajadorSocial;
    }

    public int getTerapeutaAsignado() {
        return terapeutaAsignado;
    }

    public void setTerapeutaAsignado(int terapeutaAsignado) {
        this.terapeutaAsignado = terapeutaAsignado;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + this.idPaciente;
        hash = 67 * hash + this.idTrabajadorSocial;
        hash = 67 * hash + this.terapeutaAsignado;
        hash = 67 * hash + Objects.hashCode(this.estado);
        hash = 67 * hash + Objects.hashCode(this.fechaModificacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ListaEspera other = (ListaEspera) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idPaciente != other.idPaciente) {
            return false;
        }
        if (this.idTrabajadorSocial != other.idTrabajadorSocial) {
            return false;
        }
        if (this.terapeutaAsignado != other.terapeutaAsignado) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return Objects.equals(this.fechaModificacion, other.fechaModificacion);
    }

    

    @Override
    public String toString() {
        return "ListaEspera{" + "id=" + id + ", idPaciente=" + idPaciente + ", idTrabajadorSocial=" + idTrabajadorSocial + ", estado=" + estado + '}';
    }
    
    private void cerrar() {
        try {
            if (pst != null) {
                pst.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListaEspera.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
