import java.util.Scanner;
public class Ex005 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Informe uma string para inverter: ");
	        String inputString = scanner.nextLine();

	        String reversedString = inverterString(inputString);

	        System.out.println("String invertida: " + reversedString);
	    }

	    public static String inverterString(String str) {
	        char[] caracteres = str.toCharArray();
	        int inicio = 0;
	        int fim = str.length() - 1;

	        while (inicio < fim) {
	            // Troca os caracteres do início e do fim
	            char temp = caracteres[inicio];
	            caracteres[inicio] = caracteres[fim];
	            caracteres[fim] = temp;

	            // Move os índices para o próximo par de caracteres
	            inicio++;
	            fim--;
	        }

	        // Cria uma nova string com os caracteres invertidos
	        return new String(caracteres);
	    }
}
	