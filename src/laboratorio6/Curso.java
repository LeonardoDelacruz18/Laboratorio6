/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio6;

import java.util.ArrayList;

/**
 *
 * @author USER
 * @param 
 */
public class Curso {
    private ArrayList<Profesor> listaProfesores = new ArrayList<>();
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    
    private String nombre;
    private int creditos;
    public Curso (){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }   
    
    public void AgregarProfesor(Profesor profe){
         listaProfesores.add(profe);
    }
    public void AgregarEstudiante(Estudiante est){
         listaEstudiantes.add(est);
    }   
    
    public ArrayList<Profesor> ListaProfesores(){
        return listaProfesores;
    }
    
    public ArrayList<Estudiante> ListaEstudiantes(){
        return listaEstudiantes;
    }
    
    public void EliminarProfesor(int indiceEliminar){
        listaProfesores.remove(indiceEliminar);
    }
    public void EliminarEstudiante(int indiceEliminar){
        listaEstudiantes.remove(indiceEliminar);
    }
}
                                        