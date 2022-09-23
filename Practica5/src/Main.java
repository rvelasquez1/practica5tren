public class Main {
    public static void main(String[] args) {
        //locomotoras
      Locomotor loc509 = new Locomotor (509);
      Locomotor loc566 = new Locomotor (566);

      Locomotor loc666 = new Locomotor();
      loc666.codigo=666;
      //vagones
        Vagon vagon1= new Vagon(80);
        Vagon vagon2= new Vagon(40);
        Vagon vagon3= new Vagon(80);
        //tren509
        Tren tren509=new Tren(509);
        loc509.tren = tren509;
        vagon1.tren = tren509;
        vagon2.tren = tren509;
        //tren666
      Tren tren666 =new Tren(666);
              loc666.tren= (tren666);
              vagon3.tren = (tren666);

      System.out.println(tren509);
      System.out.println(tren666);
    }
}
