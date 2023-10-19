
package Clases;

import java.util.Objects;


public class ListaEspera {
    int id,idPaciente,idTrabajadorSocial;
    String estado;
    

    public ListaEspera() {
    }
    public ListaEspera(int id, int idPaciente, int idTrabajadorSocial, String estado) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.idTrabajadorSocial = idTrabajadorSocial;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.id;
        hash = 73 * hash + this.idPaciente;
        hash = 73 * hash + this.idTrabajadorSocial;
        hash = 73 * hash + Objects.hashCode(this.estado);
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
        return Objects.equals(this.estado, other.estado);
    }

    @Override
    public String toString() {
        return "ListaEspera{" + "id=" + id + ", idPaciente=" + idPaciente + ", idTrabajadorSocial=" + idTrabajadorSocial + ", estado=" + estado + '}';
    }
    
    
    
}
