package util;


import org.json.JSONObject;

public class Util {

	public static String retornaResultadoConsulta(JSONObject json) {
//		 Extrai apenas o array do bloco mensagem do JSon 		
		String dados = json.getString("Message");
		return dados;
	}

}
