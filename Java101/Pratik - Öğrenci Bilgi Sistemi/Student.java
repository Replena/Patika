
public class Student {

    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int matExam, int fizikExam, int kimyaExam, int matOral, int fizikOral, int kimyaOral) {
        if (matExam >= 0 && matExam <= 100) {
            this.mat.note = matExam;
        }
        if (fizikExam >= 0 && fizikExam <= 100) {
            this.fizik.note = fizikExam;
        }
        if (kimyaExam >= 0 && kimyaExam <= 100) {
            this.kimya.note = kimyaExam;
        }

        this.mat.oralNote = matOral;
        this.fizik.oralNote = fizikOral;
        this.kimya.oralNote = kimyaOral;
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double matAverage = this.mat.calcCourseAverage();
        double fizikAverage = this.fizik.calcCourseAverage();
        double kimyaAverage = this.kimya.calcCourseAverage();

        this.avarage = (matAverage + fizikAverage + kimyaAverage) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " | Sözlü : " + this.mat.oralNote);
        System.out.println("Fizik Notu : " + this.fizik.note + " | Sözlü : " + this.fizik.oralNote);
        System.out.println("Kimya Notu : " + this.kimya.note + " | Sözlü : " + this.kimya.oralNote);
    }
}
