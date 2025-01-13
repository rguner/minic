package com.guner.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;
import java.util.Iterator;

public class JsonStringToDynamicObject {

    public static void main(String[] args) {
        String jsonString = """
                {
                                    "id": 1,
                                    "name": "John Doe",
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
