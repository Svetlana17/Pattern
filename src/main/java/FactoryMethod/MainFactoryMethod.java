package FactoryMethod;

import java.util.Random;

public class MainFactoryMethod {
    private static Random random = new Random();

    public static void main(String[] args) {


        System.out.println("SchoolBoyFactory");
        Pupils.setPupilFactory(new SchoolBoyFactory());
        createAndPrintPupil();

        System.out.println("StudentFactory");
        Pupils.setPupilFactory(new StudentFactory());
        createAndPrintPupil();
    }

    private static void createAndPrintPupil() {
        Pupil pupil = Pupils.createInstance(Pupils.randomStudentName(), 5);
        Pupils.fillPupilMarks(pupil);
        System.out.println("Pupil: " + pupil);
        Pupils.log(pupil);
        System.out.printf("Average mark = %.2f\n\n", Pupils.calculateAverageMark(pupil));
    }
}

