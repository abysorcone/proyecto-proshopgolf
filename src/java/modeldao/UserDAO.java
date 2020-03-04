/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeldao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import modelvo.UserVO;
import util.Conexion;
import util.CrudInterface;

/**
 *
 * @author BITS AMERICAS
 */
public class UserDAO extends Conexion implements CrudInterface {

    private Connection connection = null;
    private ResultSet resultSet = null;
    private CallableStatement procedure = null;

    private String id_usuario = "";
    private String id_rol = "";
    private String identificacion = "";
    private String nombre = "";
    private String apellido = "";
    private String direccion = "";
    private String telefono = "";
    private String correo = "";
    private String clave = "";
    private String estado = "";

    private boolean action = false;

    public UserDAO() {

    }

    public UserDAO(UserVO userVO) {
        
        super();
        try{
        
        connection = this.openConnection();

        id_usuario = userVO.getId_usuario();
        id_rol = userVO.getId_rol();
        identificacion = userVO.getIdentificacion();
        nombre = userVO.getNombre();
        apellido = userVO.getApellido();
        direccion = userVO.getDireccion();
        telefono = userVO.getTelefono();
        correo = userVO.getCorreo();
        clave = userVO.getClave();
        estado = userVO.getEstado();
        }catch(Exception e){
            System.out.println("Error en optener GET en userDAO por: "+e.toString());
        }
    }

    @Override
    public boolean insert() {
        try{
            procedure = connection.prepareCall("call pa_registrar_cliente (?,?,?,?,?,?,?)");
            procedure.setString("pa_identificacion", identificacion);
            procedure.setString("pa_nombre", nombre);
            procedure.setString("pa_apellido", apellido);
            procedure.setString("pa_direccion", direccion);
            procedure.setString("pa_telefono", telefono);
            procedure.setString("pa_correo", correo);
            procedure.setString("pa_clave", clave);
            procedure.executeUpdate();
            action = true;
            this.closeConnection();
    
        }catch(Exception e){
            System.out.println("Error al registrar datos en usuario por: "+e.toString());
        }
        return action;
    }

    @Override
    public boolean update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
