package it.unibs.fp.ContiCorrenti;

public class Utility
{
	public final static int MINIMO = 0;
	public final static double CHIUSURA = 10;
	public final static int INIZIO = 0;
	public final static int FINE = 5;
	public final static int NUMERO_ELEMENTI = 100;
	public final static int PASSWORD_SISTEMA = 12345;
	public final static int SOGLIA_MASSIMA = -100;
	public final static char ELEMENTOCORNICE = '-';
	public final static String SALUTO = "BENVENUTO NEL PROGRAMMA DI GESTIONE DEI CONTI CORRENTI";
	public final static String[] SCELTE = { "APERTURA NUOVO CONTO", "PRELIEVO SU CONTO", "VERSAMENTO SU CONTO",
	        "CHIUSURA CONTO", "ELENCO CONTI CORRENTI", "INIZIALIZZAZIONE" };
	public final static String INSERIMENTO_NOME = "INSERIRE NOME E COGNOME DEL INTESTARIO DEL CONTO";
	public final static String INSERIMENTO_SALDO = "VUOLE IMMETERE UN SALDO INIZIALE NEL CONTO";
	public final static String INSERIRE_SALDO = "INSERISCA L'AMMONTARE DEL SALDO INIZIALE CHE DESIDERA SUL SUO CONTO";
	public final static String INSERIRE_PASSWORD = "INSERISCA LA PASSWORD CHE DESIDERA AVERE PER IL CONTO";
	public final static String INSERIRE_IDENTIFICATIVO_PRELIEVO = "INSERISCA L'IDENTIFICATIVO DEL SUO CONTO PER PRELEVARE ";
	public final static String IDENTIFICATIVO_NON_ESISTE = "L'IDENTIFICATIVO DEL CONTO A CUI VUOLE ACCEDERE NON è PRESENTE ";
	public final static String INSERIRE_PASSWORD_PRELIEVO = "INSERISCA LA PASSWORD DEL CONTO DA CUI VUOLE PRELEVARE O QUELLA DI SISTEMA";
	public final static String PASSWORD_ERRATA = "LA PASSWORD  è ERRATA VUOLE REINSERIRLA \n";
	public final static String AMMONTARE_PRELIEVO = "INSERISCA L'AMMONTARE CHE DESIDERA PRELEVARE";
	public final static String PRELIEVO_ALTO = "LE VERRA EROGATO IL SUO SALDO %.3f  PIU LA SOGLIA ";
	public final static String PRELIEVO_GIUSTO = "L'OPERAZIONE è STATA EFFETUATA CON SUCESSO  ";
	public final static String INSERIRE_IDENTIFICATIVO_VERSAMENTO = "INSERISCA L'IDENTIFICATIVO DEL SUO CONTO PER VERSARE I SOLDI ";
	public final static String INSERIRE_PASSWORD_VERSAMENTO = "INSERISCA LA PASSWORD DEL CONTO DA CUI VUOLE FARE IL VERSAMENTO O QUELLA DI SISTEMA";
	public final static String AMMONTARE_VERSAMENTO = "INSERISCA L'AMMONTARE CHE DESIDERA VERSARE NEL SUO CONTO";
	public final static String VERSAMENTO_GIUSTO = "L'OPERAZIONE è STATA EFFETUATA CON SUCESSO  ";
	public final static String SCELTA_INESISTENTE = "LA SCELTA DA LEI SELEZIONATA NON è PRESENTE NEL MENU";
	public final static String RINGRAZIAMENTI = "GRAZIE PER AVER USATO IL NOSTRO PROGRAMMA";
	public final static String INSERIRE_IDENTIFICATIVO_CHIUSURA = "INSERISCA L'IDENTIFICATIVO DEL CONTO CHE VUOLE CHIUDERE ";
	public final static String INSERIRE_PASSWORD_CHIUSURA = "INSERISCA LA PASSWORD DEL CONTO CHE VUOLE CHIUDERE O QUELLA DI SISTEMA";
	public final static String CHIUSURA_NON_EFFETUATA = "NON è POSSIBILE CHIUDERE IL SUO CONTO VISTO CHE IL SUO SALDO NON è SUFFICENTE PER PAGARE LA COMMISIONE DI CHIUSURA  ";
	public final static String CHIUSURA_GIUSTO = "L'OPERAZIONE è STATA EFFETUATA CON SUCESSO  E IL SALDO CORRENETE LE VIENE EROGATO MENO IL COSTO PER LA CHIUSURA";
	public final static String SALDO_TOTALE = "IL SALDO TOTALE è %f\n";
	public final static String DESCRIZIONE_CONTO = "l'identificativo %10d,il nome è %6s,il saldo è %.2f euro \n";
	public final static String INSERIRE_PASSWORD_SISTEMA = "INSERISCA LA PASSWORD DA AMMINISTRATORE PER POTER CREARE UN NUOVO CONTO";
	public final static String PRELIEVO_NON_POSSIBILE = "NON è POSSIBILE PRELEVARE A CAUSA DEL SUO SALDO";
	public final static String INIZIALIZZAZIONE = "INIZIALIZZAZIONE AVVENUTA CON SUCESSO";
	public final static String POSSIBILE_PRELEVARE = "è POSSIBILE PRELEVARE MA IL CONTO VA IN ROSSO, EROGATO IL PRELIEVO";

	public static ElencoConti inizializza()
		{
			ElencoConti elenco = new ElencoConti();
			int password1 = 123;
			int password2 = 123;
			int password3 = 123;
			String nome1 = "marcello ferrari";
			String nome2 = "marco ferrari";
			String nome3 = "Stefano ferrari";
			double saldo1 = 3242;
			double saldo2 = 73894;
			double saldo3 = 88934;
			elenco.aggiungiConto(nome1, saldo1, password1);
			String nonServe = elenco.identificativoConto();
			elenco.aggiungiConto(nome2, saldo2, password2);
			nonServe = elenco.identificativoConto();
			elenco.aggiungiConto(nome3, saldo3, password3);
			nonServe = elenco.identificativoConto();
			return elenco;

		}

}
