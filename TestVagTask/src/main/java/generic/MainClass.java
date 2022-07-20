package generic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;

public class MainClass {
	public JSONParser jsonparser;
	public JSONObject jsonobj;
	public JSONArray jsonArr;

	@BeforeClass
	public void loadFile() throws FileNotFoundException, IOException, ParseException {
		jsonparser = new JSONParser();
		jsonobj = (JSONObject) jsonparser.parse(new FileReader(Constant.jsonFilePath));
	}

}
