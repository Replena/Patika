
public class Course {

    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralNote;
    double examWeight;
    double oralWeight;

    public Course(String name, String code, String prefix, double examWeight, double oralWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralNote = 0;
        this.examWeight = examWeight;
        this.oralWeight = oralWeight;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    public double calcCourseAverage() {
        return (this.note * this.examWeight) + (this.oralNote * this.oralWeight);
    }
}
