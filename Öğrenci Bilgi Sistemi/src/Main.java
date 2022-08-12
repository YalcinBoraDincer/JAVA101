public class Main {

    public static void main(String[] args) {
        Teacher t1=new Teacher("Ali Hoca","3333","TRH");
        Teacher t2=new Teacher("Mahmut Hoca","888","FZK");
        Teacher t3=new Teacher("Selin Hoca","222","BIO");

        Course tarih=new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik=new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo=new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

        Student s1=new Student("Bora","122","3",tarih,fizik,biyo);

        s1.addBulkExamNote(100,100,30);
        s1.isPass();

        Student s2=new Student("Ali","223","3",tarih,fizik,biyo);
        s2.addBulkExamNote(70,70,80);
        s2.isPass();




    }
}
