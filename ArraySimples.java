import java.until.Arrays;

public class ArraySimples {
	public static void main (String[] args) {
		String[] paises = {"BRASIL", "RÚSSIA", "ÍNDIA", "CHINA"};
		
		System.out.println(paises[0]);
		System.out.println(Arrays.toString paises));

		int posicao = Arrays.binarySearch(paises, "BRASIL");
		System.out.println(posicaco);

		Arrays.sort(paises, 0, paises.length); //ordena o nosso array iniciando em zero
		System.out.println(Arrays.ToString(paises)); //imprime o resultado em tela
	}
}