package ACT3;
public class Teacher extends Person {
        private String subject;
    
    public Teacher (String name, int id, String subject){
        super(name, id);
        this.subject = subject;
    }
    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Subject: " + this.subject);
    }
}     