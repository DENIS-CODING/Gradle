import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Person
        Person person = new Person();
        person.setFirstName("Иван");
        person.setLastName("Иванов");
        person.setAge(30);

        // Преобразуем объект Person в JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);

        // Извлекаем объект Person из JSON
        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println(deserializedPerson);
    }
}
