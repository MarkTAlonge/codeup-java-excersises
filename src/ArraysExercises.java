import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {


        Person[] persons = new Person[3];
        persons[0] = new Person("Person1");
        persons[1] = new Person("Person2");
        persons[2] = new Person("Person3");
        persons = addPerson(persons, new Person("Person4"));
        for (Person person : persons) {
            System.out.println(person.getName());
        }

        }
        public static Person[] addPerson (Person[]personArr, Person newPerson) {
        Person[] newArray =  Arrays.copyOf(personArr, personArr.length + 1);
        newArray[newArray.length - 1] = newPerson;
        return newArray;
        }
        }


