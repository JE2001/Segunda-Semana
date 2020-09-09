public class CalculadoraCientifica {
    public double raiz1 (int a){
        return Math.sqrt(a);    
      }
    public double raiz2 (double b){

        return Math.sqrt(b);
    
      }
    public double raiz3 (String c){

        double n = Double.parseDouble(c);
        return Math.sqrt(n);
    
      }

    public double pot1 (byte a, byte b){
        return Math.pow(a, b);    
      }
    public double pot2 (String s1, String s2){
        double n1 = Double.parseDouble(s1);
        double n2 = Double.parseDouble(s2);
        return Math.pow(n1, n2);
    
      }
    public double pot3 (int a, double b){
        return Math.pow(a, b);
    
      }
}
