package algorithms.Homework5;

import java.util.Arrays;

public class PersonSorterTest {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30),
                new Person("David", 35),
                new Person("Eve", 28)
        };

        sortAndMerge(people);
        System.out.println(Arrays.toString(people));

    }

    public static void sortAndMerge(Person[] people) {
        int size = people.length;
        if (size == 1) {
            return;
        }

        int midMarker = size / 2;
        Person[] leftPeople = new Person[midMarker];
        Person[] rightPeople = new Person[size - midMarker];

        for (int i = 0; i < midMarker; i++) {
            leftPeople[i] = people[i];
        }
        for (int i = 0; i < rightPeople.length; i++) {
            rightPeople[i] = people[midMarker + i];
        }

        sortAndMerge(leftPeople);
        sortAndMerge(rightPeople);
        mergePeople(people, leftPeople, rightPeople);
    }

    public static void mergePeople(Person[] people, Person[] leftPeople, Person[] rightPeople) {
        int peopleIdx = 0;
        int leftIdx = 0;
        int rightIdx = 0;

        int leftPeopleSize = leftPeople.length;
        int rightPeopleSize = rightPeople.length;

        while (leftIdx < leftPeopleSize && rightIdx < rightPeopleSize) {
            if (leftPeople[leftIdx].getAge() < rightPeople[rightIdx].getAge()) {
                people[peopleIdx] = rightPeople[rightIdx];
                peopleIdx++;
                rightIdx++;
            } else {
                people[peopleIdx] = leftPeople[leftIdx];
                peopleIdx++;
                leftIdx++;
            }
        }
        while (leftIdx < leftPeopleSize) {
            people[peopleIdx] = leftPeople[leftIdx];
            peopleIdx++;
            leftIdx++;
        }
        while (rightIdx < rightPeopleSize) {
            people[peopleIdx] = rightPeople[rightIdx];
            peopleIdx++;
            rightIdx++;
        }
    }
}
