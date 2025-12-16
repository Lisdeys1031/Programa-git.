public class Main {
// Objetos De Otras Clases Declaracion 
    private static  SucursalClinica objSucursalClinica;


    public static void main(String[] args) {
        
        manejarObjSucursalClinica();
        manejarObjAcompanante();
        manejarObjAgendamientos();
        manejarObjAgendarCitasMedicas();
        manejarObjCitasFuncionarios();
        manejarObjCitasMedicas();
        manejarObjCitasMedicos();
        manejarObjCitasUsuarios();
        manejarObjColaboradores();
        manejarObjTiposAcompanante();
        manejarObjTiposColaboradores();
        manejarObjTiposDocumentos();
        manejarObjTiposUsuarios();
        manejarObjUsuarios();

    }

    // Metodo encargado de manejar el objeto de tipo SucursalClinica.java
    private static void manejarObjSucursalClinica(){

         // Inicializacion de objeto de otras clases
        objSucursalClinica = new SucursalClinica(); // Llamado al constructor sin parametros  
       

        //Hacer los llamados a los setters
        objSucursalClinica.setIdSucursal(100);
        objSucursalClinica.setNombreClinica("Iberoamericas");
        objSucursalClinica.setDireccionClinica("Bogota calle 22");
        objSucursalClinica.setTelefonoSucursal("3105972658");
        objSucursalClinica.setNombreAdministradorSucursal("Carolina");


        // Hacer los  llamados a los getters
        System.out.println("1. idSucursal Objeto Sucursal Clinica: "+ objSucursalClinica.getIdSucursal());
        System.out.println("1.nombreClinica Objeto Sucursal Clinica:"+ objSucursalClinica.getNombreClinica());
        System.out.println("1. Direccion Objeto Sucursal Clinica:"+ objSucursalClinica.getDireccionClinica());
        System.out.println("1. telefonoSucursal Objeto Sucursal Clinica:"+ objSucursalClinica.getTelefonoSucursal());
        System.out.println("1. nombreAdministradorSucursal Objeto Sucursal Clinica:"+ objSucursalClinica.getNombreAdministradorSucursal());
        /**
         * Llamado al constructor con parametros usando el polimorfismo
         * Polimorfismo: Las distintas formas que puede tomar un objeto
         */
        objSucursalClinica = new SucursalClinica(111, "iberoamericas", "Barranquilla calle 22", "3042201513", "Lisdeys");
         System.out.println("2. idSucursal Objeto Sucursal Clinica: "+ objSucursalClinica.getIdSucursal());
         System.out.println("2. nombreClinica Objeto Sucursal Clinica:"+ objSucursalClinica.getNombreClinica());
         System.out.println("2. Direccion Objeto Sucursal Clinica: "+ objSucursalClinica.getDireccionClinica());
         System.out.println("2. telefonoSucursal Objeto Sucursal Clinica:"+ objSucursalClinica.getTelefonoSucursal());
         System.out.println("2. nombreAdministradorSucursal Objeto Sucursal Clinica:"+ objSucursalClinica.getNombreAdministradorSucursal());
         // Hacer los otros llamados 
    }


    private static Acompanante objAcompanante;

    //Metodo Encargado De Manejar  El Objeto De Tipo Acompanante.java
    private static void manejarObjAcompanante(){

            // Inicializacion De Objeto De Otras Clases
        objAcompanante = new Acompanante(); // LLamado al contructor sin parametros


        // Hacer llamado a los setters
        objAcompanante.setidDocumento(1111);
        objAcompanante.setidTipoDocumento("54");
        objAcompanante.setidTipoAcompanante("4646");
        objAcompanante.setNombreAcompanante("carolina");
        objAcompanante.setnumeroContactoAcompanante("3105372658");
        objAcompanante.setemail("kkkf@gmail.com");
        
        
        // Hacer llamado de los getters
        System.out.println("1. idDocumento Acompanante: " + objAcompanante.getidDocumento());
        System.out.println("1. idTipoDocumento Objeto Acompanante: " + objAcompanante.getidTipoDocumento());
        System.out.println("1. idTipoAcompanante Objeto Acompanante: " + objAcompanante.getidTipoAcompanate());
        System.out.println("1. nombreAcompanante Objeto Acompanante:  " + objAcompanante.getNombreAcompanante());
        System.out.println("1. numeroContactoAcompanante Objeto Acompanante " + objAcompanante.getnumeroContactoAcompanante()) ;
        System.out.println("1. email Objeto Acompanante" + objAcompanante.getemail());

    

        /**
         * Llamado al constructor con parametros usando el polimorfismo
         * Polimorfismo: Las distintas formas que puede tomar un objeto
         */
            objAcompanante = new Acompanante(111, "2222", "33333", "44444", "55555", "66666");

            System.out.println("2. idDocumento Objeto Acompanante" + objAcompanante.getidDocumento() );
            System.out.println("2. idTipoDocumento Objeto Acompanante: " + objAcompanante.getidTipoDocumento());
            System.out.println("2. idTipoAcompanante Objeto Acompanante: " + objAcompanante.getidTipoAcompanate());
            System.out.println("2. nombreAcompanante Objeto Acompanante:  " + objAcompanante.getNombreAcompanante());
            System.out.println("2. numeroContactoAcompanante Objeto Acompanante " + objAcompanante.getnumeroContactoAcompanante()) ;
            System.out.println("2. email Objeto Acompanante" + objAcompanante.getemail());
    }
     


    private static Agendamientos objAgendamientos;


    //Metodo Encargado De Manejar  El Objeto De Tipo Agendamientos.java
    private static void manejarObjAgendamientos(){

        // Inicializacion de objeto de otras clases
          objAgendamientos = new Agendamientos();  // LLamado al constructor sin parametros


        // Hacer llamado a los setters
        objAgendamientos.setIdDocumento(4656656);
        objAgendamientos.setIdColaborador(555555);
        objAgendamientos.setIdAgendamiento(566623256);
        objAgendamientos.setFechaHoraRegistro("sep 12 3:02");


        // Hacer llamado a los getters
        System.out.println("1. idDocumento Objeto Agendamientos : "+ objAgendamientos.getIdDocumento());
        System.out.println("1. idColaborador Objeto Agendamientos : " + objAgendamientos.getIdColaborador());
        System.out.println("1. idAgendamientos Objeto Agendamientos : " + objAgendamientos.getIdAgendamiento());
        System.out.println("1. fechaHoraRegistro Objeto Agendamientos : " + objAgendamientos.getFechaHoraRegistro());

        /**
         * Llamado al constructor con parametros usando el polimorfismo
         * Polimorfismo: Las distintas formas que puede tomar un objeto
         */
        objAgendamientos = new Agendamientos(123456789, 987654321, 123987456, "12/12/2025 6:00AM");

        System.out.println("2. idDocumento Objeto Agendamientos : " + objAgendamientos.getIdDocumento());
        System.out.println("2. idColaborador Objeto Agendamientos : " + objAgendamientos.getIdColaborador());
        System.out.println("2. idAgendamiento Objeto Agendamientos : " + objAgendamientos.getIdAgendamiento());
        System.out.println("2. fechaHoraRegistro Objeto Agendamientos : " + objAgendamientos.getFechaHoraRegistro());

}

        private static AgendarCitasMedicas ObjAgendarCitasMedicas;

        //Metodo Encargado De Manejar  El Objeto De Tipo AgendarCitasMedicas.java
        private static void manejarObjAgendarCitasMedicas(){

        // Inicializacion de objeto de otras clases
        ObjAgendarCitasMedicas = new AgendarCitasMedicas(); //Contructor Sin Parametros

        // Llamado a los Setters
        ObjAgendarCitasMedicas.setIdAgendamiento(88888);
        ObjAgendarCitasMedicas.setIdDocumento(777777);
        ObjAgendarCitasMedicas.setIdCitas(55555555);
        ObjAgendarCitasMedicas.setFechaHoraCita("diciembre 15 14:00");
        ObjAgendarCitasMedicas.setCantidadUsuario(50);
        ObjAgendarCitasMedicas.setCantidadCita(50);

        //Llamado a los Getters
        System.out.println("1. idAgendamiento Objeto AgendarCitasMedicas : " + ObjAgendarCitasMedicas.getIdAgendamiento());
        System.out.println("1. idDocumento Objeto AgendarCitasMedicas : " + ObjAgendarCitasMedicas.getIdDocumento());
        System.out.println("1. idCitas Objeto AgendarCitasMedicas : " + ObjAgendarCitasMedicas.getIdCitas());
        System.out.println("1. fechaHoraCitas Objeto AgendarCitasMedicas : " + ObjAgendarCitasMedicas.getFechaHoraCita());
        System.out.println("1. cantidadUsuario Objeto AgendarCitasMedicas :" + ObjAgendarCitasMedicas.getCantidadUsuario());
        System.out.println("1 cantidadCita Obejto AgendarCitasMedicas :  " + ObjAgendarCitasMedicas.getCantidadCita());

        /**
         * Llamado al constructor con parametros usando el polimorfismo
         * Polimorfismo: Las distintas formas que puede tomar un objeto
         */
            ObjAgendarCitasMedicas = new AgendarCitasMedicas(1111, 2222, 3333,"12/12/2025 12:00", 40, 100);

        System.out.println("2. idAgendamiento Objeto AgendarCitasMedicas : " + ObjAgendarCitasMedicas.getIdAgendamiento());
        System.out.println("2. idDocumento Objeto AgendarCitasMedicas : " + ObjAgendarCitasMedicas.getIdDocumento());
        System.out.println("2. idCitas Objeto AgendarCitasMedicas : " + ObjAgendarCitasMedicas.getIdCitas());
        System.out.println("2. fechaHoraCitas Objeto AgendarCitasMedicas : " + ObjAgendarCitasMedicas.getFechaHoraCita());
        System.out.println("2. cantidadUsuario Objeto AgendarCitasMedicas :" + ObjAgendarCitasMedicas.getCantidadUsuario());
        System.out.println("2. cantidadCita Obejto AgendarCitasMedicas :  " + ObjAgendarCitasMedicas.getCantidadCita());
}

        private static CitasFuncionarios objCitasFuncionarios;


        private static void manejarObjCitasFuncionarios(){

            objCitasFuncionarios = new CitasFuncionarios();


            objCitasFuncionarios.setIdCitas(0);
            objCitasFuncionarios.setIdAreaSalud(0);
            objCitasFuncionarios.setNombreAreaSalud(null);


            System.out.println("1. idCitas Objeto CitaFuncionarios :"+ objCitasFuncionarios.getIdCitas());
            System.out.println("1. idAreaSalud Objeto citasFuncionarios: " + objCitasFuncionarios.getNombreAreaSalud());
            System.out.println("1. nombreAreaSalud Objeto citasFuncionarios: " + objCitasFuncionarios.getNombreAreaSalud());



            objCitasFuncionarios = new CitasFuncionarios(0, 0, null);

            System.out.println("2.idCitas Objeto CitaFuncionarios :"+ objCitasFuncionarios.getIdCitas());
            System.out.println("2. idAreaSalud Objeto citasFuncionarios: " + objCitasFuncionarios.getNombreAreaSalud());
            System.out.println("2. nombreAreaSalud Objeto citasFuncionarios: " + objCitasFuncionarios.getNombreAreaSalud());
        }



    private static CitasMedicas objCitasMedicas;

    private static void manejarObjCitasMedicas (){


            objCitasMedicas = new CitasMedicas();


            objCitasMedicas.setIdMedico(0);
            objCitasMedicas.setIdCita(0);
            objCitasMedicas.setIdConsultorio(0);
            objCitasMedicas.setNombreCita(null);
            objCitasMedicas.setFechaCita(null);
            objCitasMedicas.setHoraEntrada(null);
            objCitasMedicas.setHoraSalida(null);
            objCitasMedicas.setTotalCita(0);


            System.out.println("1. idMedico Objeto citasMedicas :" + objCitasMedicas.getIdMedico());
            System.out.println("1. idCita Objeto citasMedicas: " + objCitasMedicas.getIdCita());
            System.out.println("1. idConsultorio Objeto citasMedicas: " + objCitasMedicas.getIdConsultorio());
            System.out.println("1. NombreCita Objeto citasMedicas: " + objCitasMedicas.getNombreCita());
            System.out.println("1. FechaCita Objeto citasMedicas: " + objCitasMedicas.getFechaCita());
            System.out.println("1. HoraEntrada Objeto citasMedicas: " + objCitasMedicas.getHoraEntrada());
            System.out.println("1. HoraSalida Objeto citasMedicas: " + objCitasMedicas.getHoraSalida());
            System.out.println("1. TotalCita Objeto citasMedicas: " + objCitasMedicas.getTotalCita());



            objCitasMedicas = new CitasMedicas(0, 0, 0, null, null, null, null, 0);

            System.out.println("2. idMedico Objeto citasMedicas: " + objCitasMedicas.getIdMedico());
            System.out.println("2. idCita Objeto citasMedicas: " + objCitasMedicas.getIdCita());
            System.out.println("2. idConsultorio Objeto citasMedicas: " + objCitasMedicas.getIdConsultorio());
            System.out.println("2. NombreCita Objeto citasMedicas: " + objCitasMedicas.getNombreCita());
            System.out.println("2. FechaCita Objeto citasMedicas: " + objCitasMedicas.getFechaCita());
            System.out.println("2. HoraEntrada Objeto citasMedicas: " + objCitasMedicas.getHoraEntrada());
            System.out.println("2. HoraSalida Objeto citasMedicas: " + objCitasMedicas.getHoraSalida());
            System.out.println("2. TotalCita Objeto citasMedicas: " + objCitasMedicas.getTotalCita()); 
  }

    private static CitasMedicos objCitasMedicos;

    private static void manejarObjCitasMedicos (){


           objCitasMedicos = new CitasMedicos();
            
            objCitasMedicos.setIdCitas(0);
            objCitasMedicos.setIdEspecialidad(0);
            objCitasMedicos.setNombreEspecialidadMedica(null);


            System.out.println("1. idCita Objeto citasMedicos :" + objCitasMedicos.getIdCitas());
            System.out.println("1. idEspecialidad Objeto citasMedicos :" + objCitasMedicos.getIdEspecialidad());
            System.out.println("1. nombreEspecialidadMedica Objeto citasMedicos :" + objCitasMedicos.getNombreEspecialidadMedica());

          
        
            objCitasMedicas = new CitasMedicas(0, 0, 0, null, null, null, null, 0);
            
            System.out.println("2. idCita Objeto citasMedicos :" + objCitasMedicos.getIdCitas());
            System.out.println("2. idEspecialidad Objeto citasMedicos :" + objCitasMedicos.getIdEspecialidad());
            System.out.println("2. nombreEspecialidadMedica Objeto citasMedicos :" + objCitasMedicos.getNombreEspecialidadMedica());

   }

















}