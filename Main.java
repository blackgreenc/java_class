class Student{
    String name;
    int ban, no, kor, eng, math;
    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public void getTotal(){
        int total;
        total = kor+eng+math;
        System.out.println("총점 : " + total);
    }
    public void getAverage(){
        float average;
        average = (math+kor+eng)/3f;
        System.out.println("평균 : " + average);
    }
    public void info() {
        System.out.println(name + ban + no + kor + eng + math);
    }
}
public class Main{
    public static void main(String args[]){
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
        s.info();
        System.out.println("이름" + s.name);
        s.getTotal();
        s.getAverage();
    }
}
