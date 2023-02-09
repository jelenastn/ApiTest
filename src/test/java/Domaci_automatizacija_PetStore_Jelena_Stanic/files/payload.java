package Domaci_automatizacija_PetStore_Jelena_Stanic.files;

public class payload {
    public static String AddPet(){
        return "{\n" +
                "  \"id\": 111,\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"dog\"\n" +
                "  },\n" +
                "  \"name\": \"Milka\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";


    }
    public static String AddPet2(){
        return "{\n" +
                "  \"id\": 222,\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"dog\"\n" +
                "  },\n" +
                "  \"name\": \"Bella\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";


    }
    public static String OrderPet() {
        return "{\n" +
                "  \"id\":  6,\n" +
                " \"petId\":333,\n" +
                " \"quantity\":1,\n" +
                "   \"shipDate\": \"2023-01-28T21:44:10.676Z\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": \"true\",\n" +
                " }";
    }
}
