package notasestudiantes;
public class NotasEstudiantes {
    public static void main(String[] args) {
        String[] nombres = {"Daniel", "Monica"};
        int[] notas = {65, 89};

        for (int i = 0; i < nombres.length; i++) {
            String resultado = (notas[i] >= 70) ? "Aprobado" : "Reprobado";
            System.out.println(nombres[i] + " - " + notas[i] + " - " + resultado);
        }
    }
}
