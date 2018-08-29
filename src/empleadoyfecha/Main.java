package empleadoyfecha;


public class Main {
    public static void main (String[] args){
        
        Fecha fNacimiento=new Fecha (10, 10, 1980);
        Fecha fIngreso=new Fecha (29, 8, 2018);
        Empleado empleado=new Empleado("V", "G", fNacimiento);
        empleado.setfIngreso(fIngreso);
        System.out.println(empleado.getNombre());
    }
}

