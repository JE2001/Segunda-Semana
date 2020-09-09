public class Carros { // classe

    public void setcorCarro (String corCarro){ //método
        this.CorCarro = corCarro;//atributo
    }
    public void setmarcaCarro (String marcaCarro){ //método
        this.MarcaCarro = marcaCarro;//atributo
    }
    public String getcorCarro() {//atributo
        return this.CorCarro;//método
    }
    public String getmarcaCarro() {//atributo
        return this.MarcaCarro;//método
    }
    public void descreverCarro() { //método
     System.out.printf("\nA cor do carro é %s", CorCarro);//atributo
     System.out.printf("\nA marca do carro é %s", MarcaCarro);//atributo
    }
    private String CorCarro;//atributo
    private String MarcaCarro;//atributo
  
    public Carros(String CorCarro, String MarcaCarro){//atributo
        setcorCarro(CorCarro);//método
        setmarcaCarro(MarcaCarro);//método
    } 
}