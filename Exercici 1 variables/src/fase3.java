
public class fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STARTYEAR = 1948; //Empezamos a contar desde 1948
		int startYear;
		int myYear = 1998; //Mi a�o de nacimiento
		//Imprimimos todos los a�os bisiestos desde STARTYEAR hasta myYear, este no incluido
		for (startYear = STARTYEAR; startYear <= myYear ; startYear += 4 ) {
			System.out.println(startYear);
		}
		//Mi a�o de nacimiento es bisiesto?
		boolean bool = (myYear %400 ==0) || (myYear %4 == 0 && myYear%100 != 0); 
		String bisiestoSi = "Mi a�o de nacimiento es bisiesto";
		String bisiestoNo = "Mi a�o de nacimiento no es bisiesto";
		// Dependiendo de si myYear es o no bisiesto, imprimimos la cadena correspondiente
		if (bool) {
			System.out.println(bisiestoSi);
		}else {
			System.out.println(bisiestoNo);
		}
		

	}

}
