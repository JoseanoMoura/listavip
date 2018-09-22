package bean;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class InicioBean {
    
   private String teste;
   private String outPut;
   
   
    
   
   
   
   public String retorneiumValorproinpt(){
       String novovalor = this.teste = "Novo Valor";
       return novovalor;   
             
   }
   
   public void mudeiUmValorproinput(){
       
       this.outPut = this.teste;
       
   }
   
   
   
   
   

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    public String getOutPut() {
        return outPut;
    }

    public void setOutPut(String outPut) {
        this.outPut = outPut;
    }
       
    
    
   
   
   
   
}
