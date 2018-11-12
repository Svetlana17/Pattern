package FactoryMethod;

import java.util.Arrays;

public class SchoolBoy implements  Pupil{
    private final String secondName;
    private  Register[] registers;

    public SchoolBoy(String secondName, int initialCountSubjects) {
        this.secondName = secondName;
        this.registers=new Register[initialCountSubjects];
        for(int i=0; i<registers.length; i++){
            registers[i]=new Register();
        }
    }


    public String getSecondName() {
        return secondName;
    }
    @Override
    public int getMarkAt(int index) {
        return registers[index].mark;
    }
    @Override
    public void setMarkAt(int index, int mark) {
    registers[index].mark=mark;
    }
    @Override
    public String getSubjectAt(int index) {
        return  registers[index].subjectName;
    }

    @Override
    public String setSubjectAt(int index, String subject) {
    registers[index].subjectName=subject;
        return subject;
    }
    @Override
    public void addSubjectAndMark(String subjectName, int subjectMark) {
    registers= Arrays.copyOf(registers, registers.length+1);
    registers[registers.length-1]=new Register(subjectName,subjectMark);
    }

    @Override
    public int getSubjectsCount() {
        return registers.length;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return null;
    }



    static  class Register{
        private String subjectName;
        private int mark;

        Register() {
        }
        Register(String subjectName, int mark) {
            this.subjectName = subjectName;
            this.mark = mark;
        }
        @Override
        public String toString() {
            return subjectName + ": " + mark;
        }
    }
}
