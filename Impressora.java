public class Impressora {
 public void Exibir (Float a) {
    System.out.println(a);
 }
 public void Exibir1 (Float a, Float b) {
    System.out.println(a); 
    System.out.println(b);
 }
 public void Exibir2 (Float a, String b) {
    System.out.println(a); 
    float n = Float.parseFloat(b);
    System.out.println(n);
 }
 public void Exibir3 (String a, Float b) {
   float n = Float.parseFloat(a);
    System.out.println(n);
    System.out.println(b); 
 }
 public void Exibir4 (String a, String b, String c) {
   float n1 = Float.parseFloat(a);
    System.out.println(n1);
    float n2 = Float.parseFloat(b);
    System.out.println(n2);
    float n3 = Float.parseFloat(c);
    System.out.println(n3);
 }
 public void Exibir5 (int a, int b, String c) {
    System.out.println(a);
    System.out.println(b);
    float n2 = Float.parseFloat(c);
    System.out.println(n2);
 }
}
