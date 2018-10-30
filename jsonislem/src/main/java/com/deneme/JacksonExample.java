package com.deneme;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JacksonExample {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		// For testing
		User user = createDummyUser();

		try {
			// Convert object to JSON string and save into file directly
			mapper.writeValue(new File("./user.json"), user);

			// Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(user);
			System.out.println(jsonInString);

			// Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
			System.out.println(jsonInString);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		LogModel logModel = new LogModel();
		logModel.setMsisdn("53221002");
		logModel.setLogProcess(LogProcess.ACCOUNT);
		logModel.setLogProcessType(LogProcessType.ACCOUNT_SETTINGS);
		try {
			// Convert object to JSON string and save into file directly
			mapper.writeValue(new File("./logmodel.json"), logModel);

			// Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(logModel);
			System.out.println(jsonInString);

			// Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(logModel);
			System.out.println(jsonInString);

			// Convert JSON string from file to Object
			LogModel logModel2 = mapper.readValue(new File("./logmodel.json"), LogModel.class);
			System.out.println("LogModel2 " + logModel2);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static User createDummyUser() {

		User user = new User();

		user.setName("mkyong");
		user.setAge(33);

		List<String> msg = new ArrayList<>();
		msg.add("hello jackson 1");
		msg.add("hello jackson 2");
		msg.add("hello jackson 3");

		user.setMessages(msg);

		return user;

	}
}
