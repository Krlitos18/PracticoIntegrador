public class ResultadoEnum {

    public String ganador;

    public String perdedor;

    public Boolean empate;

    public ResultadoEnum(){
        
    }

    //-------------------------------------------Seter y Geter Perdedor

    public String getPerdedor() {
        return perdedor;
    }
    public void setPerdedor(String perdedor) {
        this.perdedor = perdedor;
    }

    //--------------------------------------------Seter y Geter Ganador

    public String getGanador() {
        return ganador;
    }
    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    //------------------------------------------- Seter y Geter Empate

    public Boolean getEmpate() {
        return empate;
    }
    public void setEmpate(Boolean empate) {
        this.empate = empate;
    }

    

}
