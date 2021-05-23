import java.util.ArrayList;

public class Aula
{
    //Atributos
    Estudiante estudiante;
    private ArrayList<String> estu;
    private ArrayList<Integer>nota;
    //constructor
    public Aula(Estudiante estudiante ){
        nota = new ArrayList<Integer> (); 
        estu = new ArrayList<String> ();
        estudiante = new Estudiante();
    }
    //Metodo para añadir 
    public  void añadirNota(int notaEs){
        nota.add(notaEs);
    }
    //Metodo para agregar estudiante
    public void agregarEstudiante(String est){
        estu.add(est);
    }
    //Metodo para obtener informacion del tamaño de las notas
    public int getNumerodeNota(){
        return nota.size();
    }
    //Metodo para obtener informacion del tamaño de las estudiantes
    public int getNumeroEstudi(){
        return estu.size();
    }
    //Metodo para imprimir las notas
    public void listaNotas(int index){
        if(index >= 0 && index < nota.size()){
            int notaEs = nota.get(index);
            System.out.println(nota);
        }
    }
    //Metodo para imprimir la lista de los estudiantes
    public void listaEstudi(int index){
        if(index >= 0 && index < estu.size()){
            String est = estu.get(index);
            System.out.println(estu);
        }
    }
    //Metodo para borrar la nota 
    public void borrarNota(int index){
        if(index >= 0 && index < nota.size()){
            nota.remove(index);
        }
    }
    //Metodo para borrar estudiante
    public void borrarEstudi(int index){
        if(index >= 0 && index < estu.size()){
            estu.remove(index);
        }
    }
    //Metodo para mostrar el promedio de las notas de los estudiantes
    public String promedioNotas(){
        return " las notas son: "+ "\n" + estu +"\n"+ nota;
    }
    //Metodo para saber si los estudiantes estan aprobados
    public String promedioNotasAprobadas(int index){
        String aux;
        aux = "Si la nota es mayor o igual a 51 esta aprodado "+"\n" +nota;
        return  aux;
    }   
    //Metodo para saber la cantidad de estudiantes reprobados
    public  String cantidadReprobados(int index){
        String aux1 ;
        aux1 = "Si la nota es mernor que 51 esta reprovado "+"\n"+estu+"\n" + nota;
        return aux1;
    }
    //Metodo para saber la cantidad de estudiantes aprobados
    public  String cantidadAprobados(int index){
        String aux2;
        aux2 = "Si la nota es mayor o igual que 51 esta aprovado" +"\n"+estu+"\n" + nota;
        return aux2;
    }
    //Metodo para saber la la nota mas Alta de los estudiantes
    public  String notaAlta(int index){
        String aux3;
        aux3 = "la nota mas alta es mayor que 80: "+"\n"+estu+"\n" + nota;;
        return aux3;
    }
}

