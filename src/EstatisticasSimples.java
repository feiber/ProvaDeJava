public class EstatisticasSimples {

	public static double calculaValorMinimo(double[] valoresDeEntrada) {



		if(valoresDeEntrada[0]>valoresDeEntrada[1] ){

		}


		return valoresDeEntrada[1];

	}

	public static double calculaValorMaximo(double[] valoresDeEntrada) {



		if(valoresDeEntrada[0]>valoresDeEntrada[1] ){

		}


		return valoresDeEntrada[0];
	}

	public static int calculaQuantidade(double[] valoresDeEntrada) {



		int i = valoresDeEntrada.length;



		return i;
	}

	public static double calculaMedia(double[] valoresDeEntrada) {



		int num = 0;
		for (int i = 0; i < valoresDeEntrada.length; i++) {
			num += valoresDeEntrada[i];
		}
		double media = num/valoresDeEntrada.length;

		return media;


	}

	public static double[] calcula(double[] valoresDeEntrada) {
		double valores[] = new double[4];	
		valores[0]=calculaValorMinimo(valoresDeEntrada);
		valores[1]=calculaValorMaximo(valoresDeEntrada);
		valores[2]=calculaQuantidade(valoresDeEntrada);
		valores[3]=calculaMedia(valoresDeEntrada);

	return valores;
	}

}
