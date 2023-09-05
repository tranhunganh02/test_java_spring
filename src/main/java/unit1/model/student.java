package unit1.model;

public class student {
     private int id;
     private String name;
     private String pass;

     public int getId() {
          return this.id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getName() {
          return this.name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getPass() {
          return this.pass;
     }

     public void setPass(String pass) {
          this.pass = pass;
     }

     public student(int id, String name, String pass) {
          this.id = id;
          this.name = name;
          this.pass = pass;
     }

     public student(String name) {
          this.name = name;
     }



     @Override
     public String toString() {
          return "{" +
               " id='" + getId() + "'" +
               ", name='" + getName() + "'" +
               ", pass='" + getPass() + "'" +
               "}";
     }

}
