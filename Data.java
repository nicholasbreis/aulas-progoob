class Data {
	//declaração dos atributos da classe
	int dia;
	int mes;
	int ano;
	
	public String escreverPorExtenso(){
		String meses [] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
		
		return dia + " de " + meses[mes-1] + " de " + ano;
		
	}
	
	public void ajustarData(int dia, int mes, int ano){
		int diasMes [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//validaçaõ do mês
		if (mes >= 1 && mes <= 12){
		this.mes = mes;
		} else {
			System.out.printf ("Mês é invalido\n");
			this.mes = 1;
		}
		
		if (dia >=1 && dia <= diasMes[mes-1]){
			this.dia = dia;
		} else {
			System.out.printf ("Dia inválido");
			this.dia = 1;
		}
		
		if (ano > 1900){
			this.ano = ano;
		} else {
			System.out.printf("Ano inválido\n");
			this.ano = 2000;
		}
		
	}
	
	public static void main (String args[]) {
		//criando uma instancia da classe
		Data hoje = new Data();
		
		hoje.dia = 19;
		hoje.mes = 3;
		hoje.ano = 2024;
		
		System.out.printf ("Hoje é %s", hoje.escreverPorExtenso() );
	}
}
