package Antonio_Villalba_EntornosDeDesarrollo;

// Instanciamos un cuadrado y un circulo
Circulo circulo1=new Circulo(3,"verde");Cuadrado cuadrado1=new Cuadrado(3,3,"rojo");

// Calcula area cuadrado LadoA * LadoB
double ladoA=cuadrado1.getLadoA();double ladoB=cuadrado1.getLadoB();double areal=ladoA*ladoB;System.out.println("Area cuadrado: "+area1);

// Calcula area circulo pi*R2
double radio1 circulo1.getRadio();double area2=radio1*3.14;System.out.println("Area circulo: "+area2);

// Diferencia entre areas de cuadrado y circulo
double diferencia=areal-area2;System.out.println("Diferencia áreas: "+diferencia);
// Imprimir datos
System.out.println("Cuadrado: "+cuadrado1);System.out.println("Circulo: "+circulo1);System.out.println("Diferencia: "+diferencia);
