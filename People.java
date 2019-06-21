public class People{

  private String familyName;
  private String givenName;
  private int birthYear;
  private int birthMonth;
  private int birthDay;
  private String fullName;

  public People(String familyName, String givenName, int birthYear, int birthMonth, int birthDay){
    this.familyName = familyName;
    this.givenName = givenName;
    this.birthYear = birthYear;
    this.birthMonth = birthMonth;
    this.birthDay = birthDay;
    this.fullName = familyName + givenName;
  }


  public void setFamilyName(String newName){
    familyName = newName;
  }

  public void setGivenName(String newName){
    givenName = newName;

  }

  public void setBirthYear(int newYear){
    birthYear = newYear;
  }

  public void setBirthMonth(int newMonth){
    birthMonth = newMonth;

  }

  public void setBirthDay(int newDay){
    birthDay = newDay;
  }

  public String getFamilyName(){
    return familyName;
  }

  public String getGivenName(){
    return givenName;
  }

  public String getfullName(){
    return fullName;
  }
  public int getBirthYear(){
    return birthYear;
  }

  public int getBirthMonth(){
    return birthMonth;
  }

  public int getBirthDay(){
    return birthDay;
  }

  public int getAge(){
    return 2017 - birthYear;
  }

  public String toString(){
    return givenName + " " + familyName + " " + getAge();
  }

}
