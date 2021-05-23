import java.util.ArrayList;
public class Estudiante
{
    private ArrayList<String> estudiante;
    public Estudiante(){
        estudiante = new ArrayList<>();
    }
    //Metodon para añadir nombre del estudiante
    public  void añadirNombre(String nom){
        estudiante.add(nom);

    }
    //Metodo accesador para obtener informacion de los estudiantes 
    public int getEstudiante(){
        return estudiante.size();
    }
    //Metodo para imprimir la lista de los estudiantes
    public void listaNomEst(int index){
        if(index >= 0 && index < estudiante.size()){
            String nom = estudiante.get(index);
            System.out.println(estudiante);
        }
    }
    //Metodo para borrar estudiante
    public void borrarEstudiante(int index){
        if(index >= 0 && index < estudiante.size()){
            estudiante.remove(index);
        }
    }

}
