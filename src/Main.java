import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws Exception {

        Equipo equipo1= new Equipo();
        Equipo equipo2 = new Equipo();

        Partido partido1 = new Partido();
        Partido partido2 = new Partido();

        String Archivo = "C:\\Users\\carlos.martinez\\Documents\\GitHub\\PracticoIntegrador\\resultados.csv";

        List<String> partidos = new ArrayList<>();   //Creo un objeto de tipo lista linea
        try {

        partidos = Files.readAllLines(Paths.get(Archivo));   // Leo la ruta del archivo y la almaceno en la lista linea.
                System.out.println(partidos);   
            
        } catch (Exception e) {
           e.printStackTrace();
        }
        
        for(int i=1; i<partidos.size();i++){
            
            String[] partido= partidos.get(i).split(";");

            equipo1.setNombre(partido[0]);
            equipo2.setNombre(partido[3]);

            partido1.setGolesEquipo(Integer.parseInt(partido[1]));
            partido2.setGolesEquipo(Integer.parseInt(partido[2]));

            System.out.println(equipo1.getNombre());
            System.out.println(partido1.getGolesEquipo());
            System.out.println(equipo2.getNombre());
            System.out.println(partido2.getGolesEquipo());




        }
        
    } 

}
