package curriculum1_27;

import java.util.Map;

public class ScientificName {
	private static final ScientificName instance = new ScientificName();
	private final Map<String,String> scientificNames = Map.of(
		"ライオン","パンテラ　レオ","ゾウ","ロキソドンタ・サイクロティス","パンダ","アイルロボダ・メラノレウカ","チンパンジー","パン・トゥログロディテス","シマウマ","チャップマンシマウマ");
	
	private ScientificName() {
		
	}
	
	public static final String getScientificName(String name) {
		return instance.scientificNames.containsKey(name) ? instance.scientificNames.get(name):"不明";
	}
}
