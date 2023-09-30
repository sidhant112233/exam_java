package capsulator;
public class exam_4{
    public static void main(String args[]){
      student st = new student();
        st.display("96","siddhu", "12", "99662136");
    }
}
class student{
    String id;
    String name;
    String std;
    String contact;

    void display( String id,String name,String std,String contact){
        this.id = id;
        this.name=name;
        this.std=std;
        this.contact=contact;

        System.out.println("student_id = "+id);
        System.out.println("student_name = "+name);
        System.out.println("student_std = "+std);
        System.out.println("student_contact = "+contact);
        
    }

    public void display(int i, String name2, int j, int k) {
    }
}

