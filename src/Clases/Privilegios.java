package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Privilegios {

    int id;
    String valor, estado;

    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public Privilegios() {
    }

    public Privilegios(int id, String nombre, String estado) {
        this.id = id;
        this.valor = nombre;
        this.estado = estado;
    }

    public ArrayList Listar(String valor) {
        ArrayList<Privilegios> lista = new ArrayList();

        sql = "call `sp.getPrivilegio` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, valor);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Privilegios(rs.getInt("id"), rs.getString("valor"), rs.getString("estado")));
            }
        } catch (Exception e) {
            Logger.getLogger(Privilegios.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public int newPrivilegio(String nombrex) {
        int valor = 0;
        sql = "call  `sp.newPrivilegio` (?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, nombrex);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Privilegios.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

    public int updatePrivilegio(int idx, String nombrex, String estadox) {
        int valor = 0;
        sql = "call  `sp.UpdatePrivilegio` (?,?,?)";
        try (Connection con = new ConectarCloudcPanel("comredsy_prueba").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, idx);
            pst.setString(2, nombrex);
            pst.setString(3, estadox);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Privilegios.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return valor;
    }

    public void setNombre(String nombre) {
        this.valor = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
            Logger.getLogger(Privilegios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
