import java.lang.reflect.Array;

public class Partido extends Equipo {


    private Equipo equipo1= new Equipo();
    private Equipo equipo2 = new Equipo();

    private int golesEquipo1;
    private int golesEquipo2;

    //------------------------------------------

    public Equipo getEquipo1() {
        return equipo1;
    }
    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    //-------------------------------------------

    public int getGolesEquipo1() {
        return golesEquipo1;
    }
    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    //----------------------------------------------

    public int getGolesEquipo2() {
        return golesEquipo2;
    }
    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    //-------------------------------------------

    int resultado(){

        return ResultadoEnum();
    }

}
