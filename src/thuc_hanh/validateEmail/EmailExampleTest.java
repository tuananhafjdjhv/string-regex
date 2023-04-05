package thuc_hanh.validateEmail;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] {
            "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"
    };
    public static final String[] invalidEmail = new String[]{
            "@gmail.com", "ab@gmail.", "@#abc@gmail.com"
    };

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String emeil : validEmail) {
            boolean isvalid = emailExample.validate(emeil);
            System.out.println("Email " + emeil +" valid "+isvalid);
        }
        for (String emeil : invalidEmail) {
            boolean isvalid = emailExample.validate(emeil);
            System.out.println("Email " + emeil +" valid "+isvalid);
        }
    }
}
