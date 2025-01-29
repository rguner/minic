package com.guner.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;
import java.util.Iterator;

public class JsonStringToDynamicObject {

    public static void main(String[] args) {
        String jsonString = """
                {
                   "formId": "RNP000000242",
                   "efbFlightID": "string",
                   "formRevNo": "string",
                   "departureIATA": "string",
                   "submitBy": "string",
                   "departureICAO": "string",
                   "submitDate": "2024-12-20T06:22:46.611",
                   "version": 1,
                   "rnpFormContent": {
                     "deviationInfo": {
                       "ldevLimitExeedance": null,
                       "ldevLimitExeedanceValue": null,
                       "acPosition": "string",
                       "vdevLimitExeedanceValue": null,
                       "limitExeedance": true,
                       "vdevLimitExeedance": null
                     },
                     "otherInfo": {
                       "crewComments": "string",
                       "autopilotDisconnection": true,
                       "navigationDbErrors": "string",
                       "tawsAlert": true,
                       "tawsAlertType": [
                         {
                           "name": "string",
                           "value": "string"
                         }
                       ],
                       "pilotReport": "string"
                     },
                     "messageInfo": {
                       "messageType": [
                         {
                           "name": "string",
                           "value": "string"
                         },
                         {
                           "name1": "string1",
                           "value1": "string1"
                         }
                       ],
                       "message": "string",
                       "messageTriggered": true
                     },
                     "procedureInfo": {
                       "date": "2024-12-20T06:22:46.611",
                       "procedureType": "string",
                       "procedureFlown": "string",
                       "satisfactoryResult": "string",
                       "cm2ID": "string",
                       "cm1ID": "string"
                     }
                   },
                   "aircraftType": "string",
                   "flightNo": "string",
                   "scheduledDepartureDate": "2024-12-20T09:43:36.611",
                   "carrierCode": "string",
                   "destinationIATA": "string",
                   "id": "000aa4ce-258b-4348-bcf1-dd483ec02d31",
                   "destinationICAO": "string",
                   "efbFlightRevID": "string",
                   "acRegistration": "string",
                    "roles": ["admin", "user"]
                }
                """;

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Parse JSON string to JsonNode
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            /*
            // Access fields dynamically
            int id = jsonNode.get("id").asInt();
            String name = jsonNode.get("name").asText();
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);

            // Access array
            JsonNode roles = jsonNode.get("roles");
            for (JsonNode role : roles) {
                System.out.println("Role: " + role.asText());
            }

             */

            System.out.println("----------------------------  iterator Recursively -------------------------");

            // Iterate recursively
            //iterateJsonNodeRecursively(jsonNode);


            System.out.println("----------------------------  iterator -------------------------");
            // Iterate
            iterateJsonNode(jsonNode);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void iterateJsonNodeRecursively(JsonNode node) {
        if (node.isObject()) {
            // Iterate over object fields
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> field = fields.next();
                System.out.println("Key: " + field.getKey() + " Value:" + field.getValue());
                iterateJsonNodeRecursively(field.getValue());
            }
        } else if (node.isArray()) {
            // Iterate over array elements
            for (JsonNode element : node) {
                iterateJsonNodeRecursively(element);
            }
        } else {
            // Handle primitive values
            System.out.println("Value: " + node.asText());
        }
    }


    private static void iterateJsonNode(JsonNode rootNode) {
        try {

            // Check if it's an object
            if (rootNode.isObject()) {
                rootNode.fields().forEachRemaining(field -> {
                            JsonNode fieldJsonNode = field.getValue();
                            if (fieldJsonNode.isObject()) {
                                System.out.println("Object Key: " + field.getKey() + ", Value: " + field.getValue());
                                iterateJsonNode(fieldJsonNode);
                            } else if (fieldJsonNode.isArray()) {
                                System.out.println("Array Key : " + field.getKey() + ", Value: " + field.getValue());
                                iterateJsonNode(fieldJsonNode);
                            } else {
                                System.out.println("Key: " + field.getKey() + ", Value: " + field.getValue());
                            }

                        }
                );
            }

            // Check if it's an array
            else if (rootNode.isArray()) {
                //System.out.println("Element: " + element);
                rootNode.elements().forEachRemaining(JsonStringToDynamicObject::iterateJsonNode);
            } else if (rootNode.isTextual()) {
                System.out.println("Text : " + rootNode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
