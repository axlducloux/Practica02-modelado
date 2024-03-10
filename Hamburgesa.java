import java.io.*;

public class Hamburgesa extends Platillo{

    public  void agregarQueso(){
        System.out.println("\nAgregando rico queso!");
    }

    public void prepararProteina(){
        System.out.println("Asando carne...\n");

        System.out.println("Preparando rica soya!...\n");
    }
    
    public boolean conQueso(){
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;
        System.out.print("Quieres queso en tu hamburguesa (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        } catch (IOException ioe){
            System.err.println("Prueba de nuevo");
        } if (answer == null) {
            return "no";
        }
        return answer;
    }
}