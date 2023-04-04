public abstract class Member {
  private String name;
  private String surname;
  private String email;

  public Member(String name, String surname, String email) {
      this.name = name;
      this.surname = surname;
      this.email = email;
  }

  public String getName() {
      return name;
  }

  public String getSurname() {
      return surname;
  }

  public String getEmail() {
      return email;
  }

  public abstract void sendMail(String subject, String body);
}
