package FactoryMethod;

public class StudentFactory implements PupilFactory {
    @Override
    public Pupil createInstance(String secondName, int subjectsCount) {
        return new Student(secondName, subjectsCount);
    }
}
