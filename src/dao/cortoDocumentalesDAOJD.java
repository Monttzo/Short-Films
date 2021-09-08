package dao;
import java.sql.*;
import Util.Connection_M;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.directores;
import view.alertframe;
import view.frameRegistrar;
/**
 * 
 * @author ADMIN
 */
public class cortoDocumentalesDAOJD implements cortoDocumentalesDAO{
    public Connection_M conett;
    public ResultSet resulconsult;
    public PreparedStatement enviaconsulta;
    public String query1="SELECT * FROM director order by idDirector";
    public String query2 = "Select * from director where nombreDirector =?";
    public String query3 = "Select * from director where apellidoDirector =?";
    public String query4 = "Select * from director where nacionalidadDirector =?";
    public ArrayList<directores> misDirectores = new ArrayList<>();
    public String queryRegistrar = "Insert into director (nombreDirector, apellidoDirector, nacionalidadDirector) values (?,?,?)";
    /**
     * 
     */
    public cortoDocumentalesDAOJD() {
	conett=new Connection_M();
    }
    /**
     * 
     * @param filtroColumna
     * @param filtroString
     * @return 
     */
    @Override
    public ArrayList Consultar(String filtroColumna,String filtroString) {
        Connection conetda=conett.give_me_connection();
        resulconsult=null;
        try {
            switch (filtroColumna) {
                case ("*") -> {
                    enviaconsulta=conetda.prepareStatement(query1);
                    resulconsult=enviaconsulta.executeQuery();
                    while(resulconsult.next()){
                        directores Director = new directores(resulconsult.getInt(1),resulconsult.getString(2),
                        resulconsult.getString(3),resulconsult.getString(4));
                        misDirectores.add(Director);
                    }
                    resulconsult.close();
                }
                case ("Nombre") -> {
                    if (!filtroString.equals("")){
                        enviaconsulta=conetda.prepareStatement(query2);
                        enviaconsulta.setString(1,filtroString);
                        resulconsult=enviaconsulta.executeQuery();
                        while(resulconsult.next()){
                            directores Director = new directores(resulconsult.getInt(1),resulconsult.getString(2),
                                    resulconsult.getString(3),resulconsult.getString(4));
                            misDirectores.add(Director);
                        }
                        if(misDirectores.isEmpty()){
                            alertframe alertframe = new alertframe();
                            alertframe.setVisible(true);
                        }
                        resulconsult.close();
                    }else {
                        alertframe alertframe = new alertframe();
                        alertframe.opcion(1);
                        alertframe.setVisible(true);
                    }
                }
                case ("Apellido") -> {
                    if (!filtroString.equals("")){
                        enviaconsulta=conetda.prepareStatement(query3);
                        enviaconsulta.setString(1,filtroString);
                        resulconsult=enviaconsulta.executeQuery();
                        while(resulconsult.next()){
                            directores Director = new directores(resulconsult.getInt(1),resulconsult.getString(2),
                                resulconsult.getString(3),resulconsult.getString(4));
                            misDirectores.add(Director);
                        }
                        if(misDirectores.isEmpty()){
                            alertframe alertframe = new alertframe();
                            alertframe.setVisible(true);
                        }
                        resulconsult.close();
                    } else {
                        alertframe alertframe = new alertframe();
                        alertframe.opcion(1);
                        alertframe.setVisible(true);
                    }
                }
                case ("Nacionalidad") -> {
                    if (!filtroString.equals("")){
                        enviaconsulta=conetda.prepareStatement(query4);
                        enviaconsulta.setString(1,filtroString);
                        resulconsult=enviaconsulta.executeQuery();
                        while(resulconsult.next()){
                            directores Director = new directores(resulconsult.getInt(1),resulconsult.getString(2),
                                resulconsult.getString(3),resulconsult.getString(4));
                            misDirectores.add(Director);
                        }
                        if(misDirectores.isEmpty()){
                            alertframe alertframe = new alertframe();
                            alertframe.setVisible(true);
                        }
                        resulconsult.close();
                    } else {
                        alertframe alertframe = new alertframe();
                        alertframe.opcion(1);
                        alertframe.setVisible(true);
                    }
                }
            }
        }catch(SQLException lo){
            System.out.println("fallo faltal");
        }
        return misDirectores;	
    }
    /**
     * 
     * @param marco
     * @param Nombre
     * @param Apellido
     * @param Nacionalidad 
     */
    @Override
    public void Registrar(frameRegistrar marco, String Nombre, String Apellido, String Nacionalidad) {
        try {
            Connection conetda=conett.give_me_connection();
            enviaconsulta = conetda.prepareStatement(queryRegistrar);
            enviaconsulta.setString(1,Nombre);
            enviaconsulta.setString(2, Apellido);
            enviaconsulta.setString(3, Nacionalidad);
            int rowsUpdated = enviaconsulta.executeUpdate();
            if (rowsUpdated > 0){
                alertframe alertframe = new alertframe();
                alertframe.opcion(3);
                alertframe.setVisible(true);
                marco.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(cortoDocumentalesDAOJD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	

}																																																						
