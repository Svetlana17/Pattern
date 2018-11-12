package FactoryMethod;

import java.util.Arrays;

public class Student  implements  Pupil{
    private final String secondName;
    private int[] marks;
    private String[] subjects;

    public Student(String secondName, int initialCountOfSubjects) {
        this.secondName = secondName;
        this.marks = new int[initialCountOfSubjects];
        this.subjects = new String[initialCountOfSubjects];
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String getSubjectAt(int index) {
        return null;
    }

    @Override
    public String setSubjectAt(int index, String subject) {

        return subject;
    }

    @Override
    public int getMarkAt(int index) {
        return 0;
    }

    @Override
    public void setMarkAt(int index, int mark) {

    }

    public int getMarks(int index) {
        return marks[index];
    }

    public void setMarks(int index, int marks) {
        this.marks[index] = marks;
    }

    public String getSubjects(int index) {
        return subjects[index];
    }

    public void setSubjects(int index, String subjects) {
        subjects=subjects;
    }
  // @Override
    public void addSubjectAndMark(String subjectName, int subjectMark) {
        subjects = Arrays.copyOf(subjects, subjects.length + 1);
        subjects[subjects.length - 1] = subjectName;
        marks = Arrays.copyOf(marks, marks.length + 1);
        marks[marks.length - 1] = subjectMark;
    }

    @Override
    public int getSubjectsCount() {
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return null;
    }

}
