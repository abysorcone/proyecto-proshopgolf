/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelvo;

/**
 *
 * @author BITS AMERICAS
 */
public class UserVO {

    private String id_usuario;
    private String id_rol;
    private String identificacion;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;
    private String clave;
    private String estado;

    //Constructor clase usuario con todos los datos
    public UserVO(
            String id_usuario,
            String id_rol,
            String identificacion,
            String nombre,
            String apellido,
            String direccion,
            String telefono,
            String correo,
            String clave,
            String estado) {
        
        this.id_usuario = id_usuario;
        this.id_rol = id_rol;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.clave = clave;
        this.estado = estado;
        
    }
    
    //constructor para insercion de datos

    public UserVO(
            String identificacion, 
            String nombre, 
            String apellido, 
            String direccion, 
            String telefono, 
            String correo, 
            String clave) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.clave = clave;
    }
    
    
    
    //Get clase usuario

    public String getId_usuario() {
        return id_usuario;
    }

    public String getId_rol() {
        return id_rol;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }

    public String getEstado() {
        return estado;
    }
    
     
    //Set clase usuario

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setId_rol(String id_rol) {
        this.id_rol = id_rol;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

}
