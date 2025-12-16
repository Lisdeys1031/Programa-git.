public class Agendamientos {

    // Definir Atributos
    private int idDocumento;
    private int idColaborador;
    private int idAgendamiento;
    private String fechaHoraRegistro;

    // Constructor sin parámetros
    public Agendamientos() {
    }

    // Constructor con parámetros
    public Agendamientos ( int idDocumento, int idColaborador, int idAgendamiento, String fechaHoraRegistro) {
        this.idDocumento = idDocumento;
        this.idColaborador = idColaborador;
        this.idAgendamiento = idAgendamiento;
        this.fechaHoraRegistro = fechaHoraRegistro;
    }


       // get leer información
    public int getIdDocumento() {
        return idDocumento;
    }

    // set establecer información
    public void setIdDocumento(int idDocumento){ 
         this.idDocumento= idDocumento;
    }

    // get leer información
    public int getIdColaborador() {
        return idColaborador;
    }

    // set establecer información
    public void setIdColaborador(int datosRecibido){ 
         idColaborador = datosRecibido;
    }

    // get leer información
    public int getIdAgendamiento() {
        return idAgendamiento;
    }

    // set establecer información
    public void setIdAgendamiento(int datosRecibido){  
         idAgendamiento = datosRecibido;
    }

    // get leer información
    public String getFechaHoraRegistro() {
       return fechaHoraRegistro;
    }

    // set establecer información
    public void setFechaHoraRegistro(String datosRecibido){
         fechaHoraRegistro= datosRecibido;
    }
}
