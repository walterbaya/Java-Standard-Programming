package programa;

public class Programa {
    private static int args1=0;
    private static int args2=0;
    public static void main(String[] args) throws CantidadDeArgumentosException{
        
        if(args.length!=2){
            throw new CantidadDeArgumentosException("1","1","Error la cantidad de argumentos no es 2");
        }
        try {
            args1 = Integer.parseInt(args[0]);
            args2 = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Los dos valores deben ser numericos");
        }
        
    }
    public float devolver() {
        float res = 0;
        try {
            res = args1/args2;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0.");
        } 
        return res;
    }



}
