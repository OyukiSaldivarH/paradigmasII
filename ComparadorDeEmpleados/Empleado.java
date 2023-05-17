package ComparadorDeEmpleados;

public class Empleado {
    private String nombre;
    private int idNumero;
    private String departamento;
    private String puesto;
    private double salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdNumero() {
        return idNumero;
    }

    public void setIdNumero(int idNumero) {
        this.idNumero = idNumero;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", idNumero=" + idNumero +
                ", departamento='" + departamento + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }

    public Empleado(String nombre, int idNumero, String departamento, String puesto, double salario){
        this.nombre = nombre;
        this.idNumero = idNumero;
        this.departamento =departamento;
        this.puesto = puesto;
        this.salario = salario;

    }
}
