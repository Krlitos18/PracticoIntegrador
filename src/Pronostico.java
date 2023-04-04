 public class Pronostico {
    
int puntos;
private Partido partido = new Partido();

private Equipo equipo = new Equipo();

private ResultadoEnum resultado = new ResultadoEnum();

//---------------------------------------------CONTRUCTOR

public Pronostico(){

}

//------------------------------------------- Seter y Geter Partido

public Partido getPartido() {
  return partido;
}
public void setPartido(Partido partido) {
  this.partido = partido;
}

//--------------------------------------------- Seter y Geter Equipo

public Equipo getEquipo() {
  return equipo;
}
public void setEquipo(Equipo equipo) {
  this.equipo = equipo;
}

//----------------------------------------------- Seter y Geter ResultadoEnum

public ResultadoEnum getResultado() {
  return resultado;
}
public void setResultado(ResultadoEnum resultado) {
  this.resultado = resultado;
}

  public int puntos(){

    return puntos;

  }


 }

    

