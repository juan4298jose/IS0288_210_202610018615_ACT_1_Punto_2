public class EstacionClimatica {
    public static void main(String[] arg){

double [] temperaturas =new double[24];
for ( int i=0; i<temperaturas.length;i++){
    
    temperaturas[i]= Math.random()*40;



}
System.out.println("temperatura del medio dia___" +temperaturas[12]);
try {
    temperaturas[24] = 35;
    
} catch ( ArrayIndexOutOfBoundsException e) {
    System.out.println("erro:es de tamaño fijo tiene que ser de 0 a 23");
    // TODO: handle exception
} {

}

    

}




    
}
