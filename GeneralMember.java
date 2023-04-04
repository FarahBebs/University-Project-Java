public class GeneralMember extends Member {
  public GeneralMember(String name, String surname, String email) {
      super(name, surname, email);
  }

  public void sendMail(String subject, String body) {
      System.out.println("Sending email to general member\n " + getName() + " " + getSurname() + " (" + getEmail() + ")");
      System.out.println("Subject:\n " + subject);
      System.out.println("Body:\n " + body);
  }
}
