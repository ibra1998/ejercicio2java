
public class fase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom = "Brahim";
		String cognom1 = "El";
		String cognom2 = "Habzi";
		int dia = 8;
		int mes = 4;
		int myYear = 1998;
		boolean bool = (myYear %400 ==0) || (myYear %4 == 0 && myYear%100 != 0);
		String textBisiesto;
		// Dependiendo de si myYear es o no bisiesto, imprimimos la cadena correspondiente
		if (bool) {
			textBisiesto = "El meu any de naixement �s de trasp�s";
		}else {
			textBisiesto = "El meu any de naixement no �s de trasp�s";
		}
		String nomComplet =  nom +  " " + cognom1 + " " + cognom2;
		String dataCompleta = dia + "/" + mes + "/" + myYear;
		System.out.println("El meu nom �s "+ nomComplet);
		System.out.println("Vaig n�ixer el dia " + dataCompleta);
		System.out.println(textBisiesto);
		

	}

}
