package practice;

public class Student {

    private String name;
    private int id;
    private int inLine;
    private static int studentCounter = 0;

    public Student() {
        studentCounter++;
        this.name = "Unknown";
        this.id = 0;
        this.inLine = studentCounter;
    }

    public Student(String name, int id) {
        studentCounter++;
        setName(name);
        setId(id);
        this.inLine = studentCounter;
    }

    public void setName(String name) {
        this.name = ((name != null) && (name.length() >= 3) ? name : "Unknown");
    }

    public void setId(int id) {
        this.id = (id > 0) ? id : 0;
    }

    public String getName() { return this.name; }
    public int getId() { return this.id; }
    public int getLine() { return this.inLine; }
    public static int getCounter() { return studentCounter; }

    // Add this method
    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + ", inLine=" + inLine + "}";
    }
}
