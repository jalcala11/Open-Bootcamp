public class Main {

        public static void main(String[] args) {
            
/**Usando un if, crear una condición que compare 
 * si la variable numeroIf es positivo, negativo, o 0. */        
            int numeroIf = -4;
            
            if (numeroIf > 0) {
                System.out.println("El numero es positivo :" + numeroIf);
            }else if (numeroIf < 0) {
                System.out.println("El numero es negativo :" + numeroIf);
            }else {
                System.out.println("El numero es cero :" + numeroIf);
            }
        

/**Crea un bucle While, este bucle tendrá que tener 
 * como condición que la variable numeroWhile sea inferior a 3, 
 * el bloque de código que tendrá el bucle deberá:
 * Incrementar el valor de la variable en uno cada vez que se ejecute.
 * Mostrarlo por pantalla cada vez que se ejecute. */
        int numeroWhile = 1;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El valor actual de numeroWhile es: " + numeroWhile);
        }

/**Para el bucle Do While, 
* deberás crear la misma estructura que en el While, 
* pero solo se debe ejecutar una vez. */
        int numeroDoWhile = 3;
        do {
            numeroDoWhile++;
            System.out.println("El valor actual de numeroDoWhile es: " + numeroDoWhile);
         } while (numeroDoWhile < 3);
        
/**Para el bucle For, crea una variable numeroFor, 
 * esta variable tendrá como valor 0 y su condición 
 * será que la variable sea igual o menor que 3, 
 * se irá incrementando en 1 su valor cada vez que 
 * se ejecute y deberá mostrarse por pantalla. */
         for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("El valor de numeroFor es: " + numeroFor);
         }

/**Por último, para el Switch, 
 * deberás crear la variable estacion, 
 * y distintos case para las cuatro estaciones del año. 
 * Dependiendo del valor de la variable estacion se deberá 
 * mandar un mensaje por consola informando de la estación 
 * en la que está. También habrá que poner un default para 
 * cuando el valor de la variable no sea una estación. */

         var estacion = "Invierno";

            switch(estacion){
                case "Otoño":
                    System.out.println("La estacion actual es: " + estacion);
                    break;
                case "Verano":
                    System.out.println("La estacion actual es: " + estacion);
                    break;
                case "Invierno":
                    System.out.println("La estacion actual es: " + estacion);
                    break;
                case "Primavera":
                    System.out.println("La estacion actual es: " + estacion);
                    break;
                default:
                System.out.println("El valor '" + estacion+ "' no es una estacion real");

            }


}
 
}