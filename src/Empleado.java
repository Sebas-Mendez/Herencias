public class Empleado {

    protected String nombre;
    protected int edad;
    protected double SalarioBase;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        SalarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        SalarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", SalarioBase=" + SalarioBase +
                '}';
    }


    public void mostrarinfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("Salario base: " + SalarioBase);
    }
}
