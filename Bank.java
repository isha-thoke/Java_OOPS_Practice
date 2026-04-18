package bank;

class Account {
  public String name;
  protected String email;
  public String password;

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String pass) {
    this.password = pass;
  }
}

public class Bank {
  public static void main(String args[]) {
    Account account1 = new Account();
    account1.name = "KKKblank";
    account1.email = "Isha@gmail.com1234";
    account1.setPassword("achhgj");
    System.out.println(account1.getPassword());
  }
}
