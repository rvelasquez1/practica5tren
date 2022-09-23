public class Locomotor {
    int codigo;
    Tren tren;

    @Override
    public String toString() {
        return "Locomotor{" +
                "codigo=" + codigo +
                ", tren=" + tren +
                '}';
    }

    public  Locomotor (){


    }
    public Locomotor(int codigo, Tren tren) {
        this.codigo = codigo;
        this.tren = tren;
    }

    public Locomotor(int codigo){
        this.codigo=codigo;
    }
}
