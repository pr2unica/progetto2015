package it.unica.pr2.progetto2015.g98765;

public class Complessa implements it.unica.pr2.progetto2015.interfacce.SheetFunction {

	
    /** 
    Argomenti in input ed output possono essere solo: String, Integer, Long, Double, Character, Boolean e array di questi tipi.
    Ad esempio a runtime si puo' avere, come elementi di args, un Integer ed un Long[], e restituire un Double[];
    */
    public Object execute(Object... args) {
		/*Integer[][] matrice = new Integer[args.length]((Integer[])[args[0]).length];
		for(int i=0; i< matrice.length; i++ ) {
			for(int j=0; j< matrice[i].length; j++ ) {
				matrice[i][j] = ((Integer[])args[i])[j]+1;
			}
		}*/
		Integer[][] x = (Integer[][])args;

		for(int i=0; i< x.length; i++ ) {
			for(int j=0; j< x[i].length; j++ ) {
				x[i][j] = x[i][j]+1;
			}
		}

		return x;
		//return matrice;
	}


    /** 
    Restituisce la categoria LibreOffice;
    Vedere: https://help.libreoffice.org/Calc/Functions_by_Category/it
    ad esempio, si puo' restituire "Data&Orario" oppure "Foglio elettronico"
    */
    public final String getCategory() {
		return "Matrice";
	}

    /** Informazioni di aiuto */
    public final String getHelp() {
		return "Aggiunge uno a tutti i valori della matrice";
	} 

    /** 
    Nome della funzione.
    vedere: https://help.libreoffice.org/Calc/Functions_by_Category/it
    ad es. "VAL.DISPARI" 
    */         
    public final String getName() {
		return "MATRPLUS1";
	}

}
