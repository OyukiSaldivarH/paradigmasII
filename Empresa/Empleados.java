package Empresa;

public class Empleados {
    private String primerNombre;
    private String apellidoPaterno;
    private double salario;
    private String departamento;

    public Empleados(String primerNombre, String apellidoPaterno, double salario, String departamento) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return  String.format("%-12s %-12s %12.2f %12s", primerNombre, apellidoPaterno,
                salario,departamento);
    }

    //Devuelve primer nombre y apellido combinados del Empleado
    public String obtenerNombreCompleto(){
        return  String.format("%s %s", primerNombre, apellidoPaterno);
    }

    boolean formatoArchivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

