package model;
/**
 * 
 * @author ADMIN
 */
public class directores {
    public int id;
    public String nombre;
    public String apellido;
    public String nacionalidad;
    public directores(int id, String nombre, String apellido, String nacionalidad){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }
    public String getId(){
        String idString = String.valueOf(id);
        return idString;
    }
    public String getNombre (){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNacionalidad(){
        return nacionalidad;
    }
    public String opcion (int i){
        switch(i){
            case (0) -> {
                return getId();
            }
            case (1) -> {
                return getNombre();
            }
            case (2) -> {
                return getApellido();
            }
            case (3) -> {
                return getNacionalidad();
            }
        }
        return null;
    }
}