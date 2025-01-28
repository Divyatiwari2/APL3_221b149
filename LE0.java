/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class juet{
    String name;
    int age;
    void setname(String x){
    this.name=x;
    }
    void setage(int y){
        this.age=y;
    }
    String getname(){
        return name;
    }
    int getage(){
        return age;
    }
}
class LE0{
public static void main(String args[])  { 
  juet ob1=new juet();
  juet ob2=new juet();
  ob1.setname("divya");
  ob2.setage(21);
  System.out.println("Name : "+ ob1.getname());
  System.out.print("Age : "+ob2.getage());
  
} 
}