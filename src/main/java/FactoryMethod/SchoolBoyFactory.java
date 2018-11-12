package FactoryMethod;



public class SchoolBoyFactory implements PupilFactory {
    @Override
    public Pupil createInstance(String secondName, int subjectsCount) {
        return new SchoolBoy(secondName, subjectsCount);
    }
}
