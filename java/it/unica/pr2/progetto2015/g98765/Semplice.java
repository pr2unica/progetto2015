package it.unica.pr2.progetto2015.g98765;

public class Semplice implements it.unica.pr2.progetto2015.interfacce.SheetFunction {

	
    /** 
    Argomenti in input ed output possono essere solo: String, Integer, Long, Double, Character, Boolean e array di questi tipi.
    Ad esempio a runtime si puo' avere, come elementi di args, un Integer ed un Long[], e restituire un Double[];
    */
    public Object execute(Object... args) {
		if ((Boolean) args[0]) {
			return args[1];
		} else {
			return args[2];
		}
	}


    /** 
    Restituisce la categoria LibreOffice;
    Vedere: https://help.libreoffice.org/Calc/Functions_by_Category/it
    ad esempio, si puo' restituire "Data&Orario" oppure "Foglio elettronico"
    */
    public final String getCategory() {
		return "Logica";
	}

    /** Informazioni di aiuto */
    public final String getHelp() {
		return "Specifica un test logico da eseguire.";
	} 

    /** 
    Nome della funzione.
    vedere: https://help.libreoffice.org/Calc/Functions_by_Category/it
    ad es. "VAL.DISPARI" 
    */         
    public final String getName() {
		return "IF";
	}

}
