public class Main {
    public static void main(String[] args) {
        final double PI = 3.1416; // constante de tipo double
        final int EDAD_MAXIMA = 100; // constante de tipo entero

        System.out.println("El valor de PI es: " + PI);
        System.out.println("La edad máxima permitida es: " + EDAD_MAXIMA);
        System.out.println("--------------");

        //1️⃣ Crea una constante llamada GRAVEDAD con el valor 9.81 y muestra su valor por pantalla.
        final double GRAVEDAD = 9.81;
        System.out.println("La gravedad es: " + GRAVEDAD);
        System.out.println("--------------");

        //2️⃣ Declara dos variables a = 25 y b = 7. Realiza todas las operaciones aritméticas entre ellas e imprime los resultados.
        float a = 25;
        float b = 7;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Módulo: " + (a % b));
        System.out.println("--------------");

        //3️⃣ Declara una variable edad e imprime si la persona es mayor de edad (>= 18) o menor de edad (< 18).
        int edad = 18;
        System.out.println("Es mayor de edad? " + (edad >= 18));
        System.out.println("--------------");

        //4️⃣ Crea un programa que reciba dos números y rdetermine cuál es mayo, menor o si son iguales.
        int numero1 = 10;
        int numero2 = 4;
        System.out.println("¿x es igual a y? " + (numero1 == numero2));
        System.out.println("¿x es diferente de y? " + (numero1 != numero2));
        System.out.println("¿x es mayor que y? " + (numero1 > numero2));
        System.out.println("¿x es menor que y? " + (numero1 < numero2));

        //5️⃣ Escribe un programa que evalúe la siguiente expresión lógica: (5 > 3) && (10 < 20). ¿Cuál es el resultado?

        System.out.println("--------------");
        //6️⃣ Modifica el programa anterior y evalúa también (5 > 3) || (10 > 20). Explica los resultados obtenidos.

        System.out.println("--------------");
        //7️⃣ Declara tres variables x = 10, y = 20, z = 30. Compara x + y con z utilizando operadores relacionales.

        System.out.println("--------------");
        //8️⃣ Crea un programa que pida al usuario dos números y evalúe si son múltiplos (num1 % num2 == 0).

        System.out.println("--------------");
        //9️⃣ Escribe un código que reciba un número e indique si es par o impar usando el operador módulo (%).

        System.out.println("--------------");
        //🔟 Define una constante TASA_CAMBIO con el valor 1.12 (dólar a euro). Convierte una cantidad de dólares ingresada por el usuario a euros.

        System.out.println("--------------");

    }
}