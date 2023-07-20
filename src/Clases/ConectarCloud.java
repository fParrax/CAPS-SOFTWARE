package Clases;


import java.io.FileNotFoundException;
import java.io.IOException;
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
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import org.apache.commons.dbcp2.BasicDataSource;
import rojeru_san.rsdate.RSDateChooser;


public class ConectarCloud {
     static Connection con = null;

    public static final String url = "jdbc:mysql://34.122.153.206:3306/";
    
    public static final String user = "root";
    public static final String pass = "356200Parra#";

    private static final String KEY_STORE_FILE_PATH = ""
            + "C:\\Users\\Family\\Desktop\\Gestion de Sistemas\\02.Codigo Fuente\\bigMedicdb\\firstApp\\SSL\\client-key.pem";
    private static final String KEY_STORE_PASS = "MIIEpQIBAAKCAQEAr0yxsPgv+hoTeoOAbYc2WZhzjsiG9IiPdVfLn6Yfe6BZ77PQ\n" +
"xIjEbLHrCPgtiQLyIq9mb2ulPjsc1RhLZOzdiHuEGea9oPVy+u9QZEGhQEc3vKW6\n" +
"sVHQlAKKSqTQuIc61Ui5khxvl3Ps2SZ2PNNyHGJoraTJsfKH2w56dx9SIYGAnABb\n" +
"/ozEIU8iBsjPDwUEjWyDpeZBzFEkjlmYaAfIOz3CgiOQGl//up+qznhrPcl0EnDy\n" +
"iQsRw+LeTU1eft/Cb8peB6cjYOhVpugZThkFVFOmCtQ0L2aFu5Vdm1FQqEPL+jST\n" +
"19AizNnTbnv05OWfueIlF3tqAYqiwoUBAZ5iwQIDAQABAoIBAQCV/5w0f8odyd5N\n" +
"AOUN05sQA0EuNiw0Zf3LPLrB+xYJZOZQE59Z7GWXVI52+FWOXXTvdQLD6GpW26IK\n" +
"PWWWEJBnTrl0qFoutpgSXGB/ySC/rbDlvTIItKczXxESWgE3RI91HWucuLRL9if+\n" +
"j8iwt4V3AEXt/4mOuKbDLJph/+z5OTgALH+bJSzrs8LNH7z4uN5SjnhePbK/a4Tz\n" +
"ntkaXAvVUc+g+D1lryRaNueHBP3sGjqK2tpebjoIHhTAvE/CbyJe6jdmZOeiMqo4\n" +
"6Vgww4FXgGT41+jzfyZcICShccyRH5XrjfijI5Vkn71vCisK4GBAuJS3uhVO08qz\n" +
"LCZn6Ey5AoGBAO1TfdOpiXRNUnlvvbDTZKM8z5qm7mm8mr6VBfgs2y07WDcXcH1A\n" +
"mW3c0GDHj+YU6Ftvw0TYx1wn5VpLHCh/O014uCfJ9ApKjiUiJ/rJs3FlbOxtL20n\n" +
"kBIGhgzJKmNifBLsNy8EPLNvHqpNJ5+VZGkyKo9WhqK01dCE3NRPe7T3AoGBAL0X\n" +
"yggcKkUT8MJ6oxkU16Y0VVEFg582RuiTTFrh2U0aqKITAU7ht2eKw+61KeyXDU+A\n" +
"rjh/UKm4ZxxjCja+bk1nbIjwZLAvpDSltlX2yioE3EcsR6H5XbAyn9VPbLxgYCVS\n" +
"4ugMhQQfYE5usOA/jpoNg/mQIjbpVDCkYFKDOxAHAoGAV6q800BQPz8E1Uj6qGQe\n" +
"S9J92eIKNdLu0rHX56oiOJ4wYwFsk0gWpSepbeap+FMG1if92OO/GQK/zU/rkeYV\n" +
"8PNEC6alWFvcEEmCvThe6eeOifN3TnoL1SzFvdldqCLMNG0/oUWOarYEfOJNXbzg\n" +
"v59Ba3uJ9naYeRNrQ54s01cCgYEAlqwnCvFOaT6rYHwSDAFEmKYouWe4apv4Qohk\n" +
"liJSYZL1fjfAmhdXagTzfPkUT/ZI3+m8aT5hiutqFf+A+wAgqkLYBAHxaUZ9BIpq\n" +
"0PLWQkcfMwNAjPtDwQuFupYQIcZ1tifmsFqRfyh1N+oRvI5IVc6hM7G64aBoul2w\n" +
"du8kl+8CgYEAmN4Rgkoe/9kcfetmVlVaK9RnUdfB6pnTk8UFdgpQYP7GP7/rjBfv\n" +
"y9Sd7ZKCg2vIQk5yOeM60MO/Wt3ZO0OP06kq2OjSb0vXMmLQSMtXgz1ZwvdyGLAs\n" +
"wMoYP4mk0jzSKSWmyHRDi5KgASgUKnQM+iJblwYrJG/o/1OxjA5YV9w=";
        
    
    
    static BasicDataSource ds = new BasicDataSource();
    static Properties propiedades = new Properties();
    static DataSource dataSource;

    public ConectarCloud() {

    }

    public ConectarCloud(String dataBase) {
        try {
            ds.setDriverClassName("com.mysql.jdbc.Driver");
            ds.setUsername(user);
            ds.setPassword(pass);
            ds.setUrl(url + dataBase);
            
            ds.setInitialSize(1);
            ds.setMaxTotal(3);
            ds.setTestWhileIdle(true);
            ds.setTimeBetweenEvictionRunsMillis(10000);
            ds.setValidationQuery("select 1");

            /*propiedades.load(new FileInputStream(
                    "src/connection.properties"));
            dataSource = BasicDataSourceFactory.createDataSource(propiedades);
            ds = (BasicDataSource) dataSource;
            ds.setInitialSize(1);
            ds.setMaxTotal(2);
            ds.setValidationQuery("select 1");*/
 /* Thread.currentThread().getStackTrace();     

    StackTraceElement[] elements = Thread.currentThread().getStackTrace();
    String class2 = elements[2].getClassName();
    String method = elements[2].getMethodName(); 
    System.out.println("clase: "+class2 +"   Metodo: "+method + "   Activos: "+ds.getNumActive());
             */
        } catch (Exception ex) {
            Logger.getLogger(ConectarCloud.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al Conectar con la base de Datos\n" + ex);
        }
    }

    
    public static void main(String[] args) {
        try(Connection contest  = new ConectarCloud("mainbigmedic").getCon()) {
            String sql ="select * from test";
            PreparedStatement pst = contest.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("valor"));
            }
                
        } catch (Exception e) {
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

    public String getFechaServidor() {
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
        }
        return fechaFinal;
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

        String formato = "dd/MM/yyyy hh:mm:ss aa"; // Definimos el Formato a usar
        Date temp = new Date();
        try {
            temp = new SimpleDateFormat(formato).parse(fechaFinal);
        } catch (ParseException ex) {
            Logger.getLogger(ConectarCloud.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return temp;
    }

    private String tomarFecha() {
        String fecha = "";
        try (Connection conex = new ConectarCloud("test").getCon()) {
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
