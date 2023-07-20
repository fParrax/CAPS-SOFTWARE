package Clases;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import org.apache.commons.dbcp2.BasicDataSource;
import rojeru_san.rsdate.RSDateChooser;
import rojerusan.RSNotifyFade;


public class ConectarCloudcPanel {
     static Connection con = null;

     public static  String url ;//= "jdbc:mysql://xxxxxxxxxx/";
    String user2 ;
    String pass2 ;
     
     
    
    static BasicDataSource ds = new BasicDataSource();
    Properties propiedades = new Properties();
    static DataSource dataSource;

        public ConectarCloudcPanel() {
          // Propiedades p = new Propiedades();
          // p.openPropiedades();
          //  this.url = new AES256().decrypt(p.getPropiedad("url"))+"/";
          //  this.user2 = new AES256().decrypt(p.getPropiedad("user"));
          //  this.pass2 = new AES256().decrypt(p.getPropiedad("password"));
           
    }

    public  ConectarCloudcPanel(String dataBase) {
            EncriptadorAES a = new EncriptadorAES();
        try {
            Propiedades p = new Propiedades();
            p.openPropiedades();
            url = a.desencriptar(p.getPropiedad("url"));
            //url="jdbc:mysql://capsperu.dyndns.org/"+ dataBase;
           //url="jdbc:mysql://181.66.168.57/";
            user2 = a.desencriptar(p.getPropiedad("user"));
            pass2 = a.desencriptar(p.getPropiedad("password"));
            try {
                ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
                ds.setUsername(user2);
                ds.setPassword(pass2);
                ds.setUrl(url+dataBase);
                ds.setInitialSize(1);
                ds.setMaxTotal(2);
                ds.setTestWhileIdle(true);
                ds.setTimeBetweenEvictionRunsMillis(10000);
                ds.setValidationQuery("select 1");
            } catch (Exception ex) {
                Logger.getLogger(ConectarCloud.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error al Conectar con la base de Datos\nPor favor verifique su conexión a internet o contacte al administrador." + ex);
            }
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ConectarCloudcPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
             Logger.getLogger(ConectarCloudcPanel.class.getName()).log(Level.SEVERE, null, ex);
         } catch (InvalidKeyException ex) {
             Logger.getLogger(ConectarCloudcPanel.class.getName()).log(Level.SEVERE, null, ex);
         } catch (NoSuchPaddingException ex) {
             Logger.getLogger(ConectarCloudcPanel.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IllegalBlockSizeException ex) {
             Logger.getLogger(ConectarCloudcPanel.class.getName()).log(Level.SEVERE, null, ex);
         } catch (BadPaddingException ex) {
             Logger.getLogger(ConectarCloudcPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    
    public static void main(String[] args) {
        
         try {
             System.out.println(new EncriptadorAES().encriptar("."));
         } catch (UnsupportedEncodingException ex) {
             Logger.getLogger(ConectarCloudcPanel.class.getName()).log(Level.SEVERE, null, ex);
         } catch (NoSuchAlgorithmException ex) {
             Logger.getLogger(ConectarCloudcPanel.class.getName()).log(Level.SEVERE, null, ex);
         } catch (InvalidKeyException ex) {
             Logger.getLogger(ConectarCloudcPanel.class.getName()).log(Level.SEVERE, null, ex);
         } catch (NoSuchPaddingException ex) {
             Logger.getLogger(ConectarCloudcPanel.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IllegalBlockSizeException ex) {
             Logger.getLogger(ConectarCloudcPanel.class.getName()).log(Level.SEVERE, null, ex);
         } catch (BadPaddingException ex) {
             Logger.getLogger(ConectarCloudcPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    public BasicDataSource getDataSource() {
        return ds;
    }

    public static DataSource getDataSourcePROPERTIES() throws FileNotFoundException, IOException, Exception {
        return ds;

    }

    public Connection getCon() {
         try {
             //con = getDataSourcePROPERTIES().getConnection();
             con = getDataSource().getConnection();
             return con;
         } catch (SQLException ex) {
             Logger.getLogger(ConectarCloud.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
    }

    public static Connection getCon2() throws SQLException, Exception {
        con = getDataSourcePROPERTIES().getConnection();
        return con;
    }

   
public String parsearFecha(String fecha) {
        String formato = "dd/MM/yyyy"; // Definimos el Formato a usar
        String separador = ""; // Separador Vacio
        String fechaFinal = ""; // Fecha Final Vacio
        if (fecha != null) {
            if (fecha.contains("/")) {// si la fecha recibida tiene </>
                separador = Pattern.quote("/"); // el separador a usar es </>
            } else if (fecha.contains("-")) {//pero si el separador de la fecha recibida es <->
                separador = Pattern.quote("-");//se separa la fecha con <->
            }
            String[] parts = fecha.split(separador);//Sabiendo el separador a usar, creamos un String[] con sus valores por separados (yyyy , MM , dd)

            if (parts[0].length() == 4) { // si el primer valor recibido tiene 4 digitos entonces es el valor del Año, por lo que...
                fechaFinal = parts[2] + "/" + parts[1] + "/" + parts[0];// cambiamos la posición de la fecha al preferido
                // System.out.println("Fecha Recibida: "+fnac+"\nFecha Parseada: "+fechaFinal); // se imprime recibido y cambiado
            } else if (parts[0].length() == 2) {
                fechaFinal = parts[0] + "/" + parts[1] + "/" + parts[2];// En este caso si el primer valor recibido tiene 2 digitos
                //System.out.println("Fecha Recibida: "+fnac+"\nFecha Parseada: "+fechaFinal); // no hace falta cambiar la fecha pero lo obligamos y nos aseguramos

            }
           
        }
        return fechaFinal;
    }
    public void parsearFecha(RSDateChooser campoFecha) {
        String fnac = tomarFecha();
        String formato = "dd/MM/yyyy"; // Definimos el Formato a usar
        String separador = ""; // Separador Vacio
        String fechaFinal = ""; // Fecha Final Vacio
        if (fnac != null) {
            if (fnac.contains("/")) {// si la fecha recibida tiene </>
                separador = Pattern.quote("/"); // el separador a usar es </>
            } else if (fnac.contains("-")) {//pero si el separador de la fecha recibida es <->
                separador = Pattern.quote("-");//se separa la fecha con <->
            }
            String[] parts = fnac.split(separador);//Sabiendo el separador a usar, creamos un String[] con sus valores por separados (yyyy , MM , dd)

            if (parts[0].length() == 4) { // si el primer valor recibido tiene 4 digitos entonces es el valor del Año, por lo que...
                fechaFinal = parts[2] + "/" + parts[1] + "/" + parts[0];// cambiamos la posición de la fecha al preferido
                // System.out.println("Fecha Recibida: "+fnac+"\nFecha Parseada: "+fechaFinal); // se imprime recibido y cambiado
            } else if (parts[0].length() == 2) {
                fechaFinal = parts[0] + "/" + parts[1] + "/" + parts[2];// En este caso si el primer valor recibido tiene 2 digitos
                //System.out.println("Fecha Recibida: "+fnac+"\nFecha Parseada: "+fechaFinal); // no hace falta cambiar la fecha pero lo obligamos y nos aseguramos

            }
            try {
                campoFecha.setDatoFecha(new SimpleDateFormat(formato).parse(fechaFinal)); // Asigamos al campoFecha la fecha Parseada con el formato usando un nuevo SimpleDateFormat
            } catch (ParseException ex) {
                Logger.getLogger(ConectarCloud.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static String getFechaServidor() {
        String fnac = tomarFecha();
        /*
        String formato = "dd/MM/yyyy"; // Definimos el Formato a usar
        String separador = ""; // Separador Vacio
        String fechaFinal = ""; // Fecha Final Vacio
        if (fnac != null) {
            if (fnac.contains("/")) {// si la fecha recibida tiene </>
                separador = Pattern.quote("/"); // el separador a usar es </>
            } else if (fnac.contains("-")) {//pero si el separador de la fecha recibida es <->
                separador = Pattern.quote("-");//se separa la fecha con <->
            }
            String[] parts = fnac.split(separador);//Sabiendo el separador a usar, creamos un String[] con sus valores por separados (yyyy , MM , dd)
            if (parts[0].length() == 4) { // si el primer valor recibido tiene 4 digitos entonces es el valor del Año, por lo que...
                fechaFinal = parts[2] + "/" + parts[1] + "/" + parts[0];// cambiamos la posición de la fecha al preferido
                // System.out.println("Fecha Recibida: "+fnac+"\nFecha Parseada: "+fechaFinal); // se imprime recibido y cambiado
            } else if (parts[0].length() == 2) {
                fechaFinal = parts[0] + "/" + parts[1] + "/" + parts[2];// En este caso si el primer valor recibido tiene 2 digitos
                //System.out.println("Fecha Recibida: "+fnac+"\nFecha Parseada: "+fechaFinal); // no hace falta cambiar la fecha pero lo obligamos y nos aseguramos
            }
        }
        */
        
        
        return fnac;
    }

    public Date getFechaServidorCompleta() {
        String fnac = tomarFecha();

        String separador = ""; // Separador Vacio
        String fechaFinal = ""; // Fecha Final Vacio
        if (fnac != null) {
            if (fnac.contains("/")) {// si la fecha recibida tiene </>
                separador = Pattern.quote("/"); // el separador a usar es </>
            } else if (fnac.contains("-")) {//pero si el separador de la fecha recibida es <->
                separador = Pattern.quote("-");//se separa la fecha con <->
            }
            String[] parts = fnac.split(separador);//Sabiendo el separador a usar, creamos un String[] con sus valores por separados (yyyy , MM , dd)

            if (parts[0].length() == 4) { // si el primer valor recibido tiene 4 digitos entonces es el valor del Año, por lo que...
                fechaFinal = parts[2] + "/" + parts[1] + "/" + parts[0];// cambiamos la posición de la fecha al preferido
                // System.out.println("Fecha Recibida: "+fnac+"\nFecha Parseada: "+fechaFinal); // se imprime recibido y cambiado
            } else if (parts[0].length() == 2) {
                fechaFinal = parts[0] + "/" + parts[1] + "/" + parts[2];// En este caso si el primer valor recibido tiene 2 digitos
                //System.out.println("Fecha Recibida: "+fnac+"\nFecha Parseada: "+fechaFinal); // no hace falta cambiar la fecha pero lo obligamos y nos aseguramos
            }

        }

        String formato = "yyyy/MM/dd"; // Definimos el Formato a usar
        Date temp = new Date();
        try {
            temp = new SimpleDateFormat(formato).parse(fechaFinal);
        } catch (ParseException ex) {
            Logger.getLogger(ConectarCloud.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        return temp;
    }

    private static String tomarFecha() {
        String fecha = "";
        try (Connection conex = new ConectarCloudcPanel("comredsy_siscaps").getCon()) {
            String sql = "select replace(CURDATE(),'-','/') as a";
            PreparedStatement s = conex.prepareStatement(sql);
            ResultSet rs = s.executeQuery();
            while (rs.next()) {
                fecha = rs.getString("a");
            }
            try {
                if (s != null) {
                    s.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConectarCloud.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            Logger.getLogger(ConectarCloud.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        }

        return fecha;
    }

    public int Desconectar() {
        int a = 0;
        try {
            con.close();
            a = 1;
        } catch (SQLException ex) {
            Logger.getLogger(ConectarCloud.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, null, 0);
            a = 0;
        }
        return a;
    }
}
