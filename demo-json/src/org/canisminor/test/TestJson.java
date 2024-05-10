package org.canisminor.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.canisminor.pojo.Person;
import org.canisminor.pojo.PetDog;
import org.testng.annotations.Test;

import java.util.*;

public class TestJson {
    @Test
    public void testWriteJson() throws JsonProcessingException {
        // 实例化Person对象
        PetDog petDog = new PetDog("Chop");
        Person person1 = new Person("Franklin", 25);
//        Person person2 = new Person("Lamar", 25);
//        Person person3 = new Person("Michael", 48);
//        Person person4 = new Person("Trevor", 48);

        person1.setPetDog(petDog);
        // 将Person对象转换为JSON字符串
        ObjectMapper objectMapper = new ObjectMapper();
        String personStr = objectMapper.writeValueAsString(person1);
        System.out.println(personStr);
    }

    @Test
    public void testReadJson() throws JsonProcessingException {
        String personStr = "{\"name\":\"Franklin\",\"age\":25,\"petDog\":{\"name\":\"Chop\"}}";
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.readValue(personStr, Person.class);
        System.out.println(person);
    }

    @Test
    public void testMapToJson() throws JsonProcessingException {
        Map data = new HashMap();
        data.put("k1", "v1");
        data.put("k2", "v2");

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(data);
        System.out.println(json);
    }

    @Test
    public void testListToJson() throws JsonProcessingException {
        List<String> data = new ArrayList<>();
        data.add("1");
        data.add("2");
        data.add("3");

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(data);
        System.out.println(json);
    }

    @Test
    public void testArrayToJson() throws JsonProcessingException {
        String[] data = {"1", "2", "3"};

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(data);
        System.out.println(json);
    }
}
