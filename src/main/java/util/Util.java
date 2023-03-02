package util;


import org.json.JSONObject;

public class Util {

	public static String retornaResultadoConsulta(JSONObject json) {
		String dados = "";
		if(json.isNull("Message")) {
			JSONObject erro = json.getJSONObject("Error");
			dados= erro.getString("Message");
//			System.out.println(dados);
		}else if(! json.isNull("Message")){
			dados = json.getString("Message");
//			System.out.println(dados);
		}else 
			dados = "not found";
		return dados;
	}
	
}
