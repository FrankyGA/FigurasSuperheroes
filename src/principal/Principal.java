package principal;

import figuras.*;

public class Principal {

    
    public static void main(String[] args) {
        
        Superheroe sup1 = new Superheroe("Spiderman");
        sup1.setNombre("Hombre Ara�a");
        sup1.setDescripcion("Lanza tela de ara�a y viste de rojo.");
        
        System.out.println(sup1.getNombre());
        System.out.println(sup1.getDescripcion());
        
        System.out.println(sup1.toString());
        
        Superheroe sup2 = new Superheroe("Batman");
        sup2.setDescripcion("Tiene los poderes de un murci�lago.");
        sup2.setCapa(true);
        
        System.out.println(sup2.toString());
        
        Dimension dimPeq = new Dimension();  // alto = 0, ancho = 0, prof = 0
        Dimension dimGra = new Dimension(70,20,20); 
        
        dimPeq.setAlto(20);
        dimPeq.setAncho(5);
        dimPeq.setProfundidad(6);  
        //ahora dimPeq es:   alto = 20, ancho = 5, prof = 6
        
        System.out.println(dimPeq);
        System.out.println(dimGra);
        System.out.println("Volumen de la dimension peque�a: "+dimPeq.getVolumen());
        
        Figura figSpi = new Figura("spid-01",30,sup1,dimPeq);
        
        System.out.println(figSpi.toString());
        figSpi.subirPrecio(10);
        System.out.println(figSpi.toString());
        
        Coleccion col = new Coleccion("Super");
        
        col.a�adirFigura(figSpi);
        
        Figura figBat = new Figura("bat-02",50,sup2,dimPeq);
        col.a�adirFigura(figBat);
        
        Superheroe sup3 = new Superheroe("Ironman");
        sup3.setDescripcion("Superh�roe con traje de metal capaz de volar");
        Figura figIron = new Figura("iron-03",20,sup3,new Dimension(6,3,4));
        col.a�adirFigura(figIron);
        
        System.out.println(col);
        
        System.out.println(col.conCapa());
     
        Figura fMasValiosa = col.masValioso();
        System.out.println("Figura de m�s valor: "+fMasValiosa);
        
        System.out.println("Valor de la coleccion: "+col.getValorColeccion());
        
        System.out.println("Volumen de la coleccion: "+col.getVolumenColeccion());
    }
    
}