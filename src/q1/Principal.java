/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author USUARIO
 */
public class Principal {

    public static void main(String[] agrs) {
        FigurasGeometricas listaF[] = new FigurasGeometricas[4];
        for (int i = 0; i < 4; i++) {
            if (i<2){
                System.out.println("digite o raio do circulo"+(i+1));
                Circulo c = new Circulo();
                c.setRaio(scan.nextDouble());
                listaF[i]=c;
            }else{
                System.out.println("digite a base do retangulo"+(i-1));
                Retangulo raio = new Retangulo();
                raio.setBase(scan.nextDouble());
                
                System.out.println("\nDigite a altura do retenagulo"+(1-1));
                raio.setAltura(scan.nextDouble());
                listaF[i] = r; 
            }
        }
        for (int i = 0; i<)
    }

}
