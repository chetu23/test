package test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.MainClass;
import generic.GetJsonValue;

public class ValidateWicketKeeper extends MainClass {
	@Test
	public void validateWicketKeeperTest() throws FileNotFoundException, IOException, ParseException {
		int wicketKeeperCount = 0;
		jsonArr = GetJsonValue.getJsonObjectArray(jsonobj, "player");
		JSONArray jsonArr = (JSONArray) jsonobj.get("player");
		for (int i = 0; i < jsonArr.size(); i++) {
			JSONObject player = (JSONObject) jsonArr.get(i);
			String role = GetJsonValue.getJsonObjectValue(player, "role");
			if (role.equalsIgnoreCase("Wicket-keeper"))
				wicketKeeperCount++;
		}
		

		if (wicketKeeperCount >= 1) {
			Reporter.log("Team has " + wicketKeeperCount + " wicket Keeper", true);
		} else {
			Reporter.log("Team is not have wicket Keeper", true);
			Assert.fail();
		}

	}

}
