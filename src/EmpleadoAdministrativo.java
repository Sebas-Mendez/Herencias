public class EmpleadoAdministrativo extends Empleado { //hereda de la clase empleado

    private double bonifiacion;

    public EmpleadoAdministrativo() {
    }

    public EmpleadoAdministrativo(String nombre, int edad, double salarioBase, double bonifiacion) {
        super(nombre, edad, salarioBase); //invoca constructor de la clase padre
        this.bonifiacion = bonifiacion;
    }

    public double getBonifiacion() {
        return bonifiacion;
    }

    public void setBonifiacion(double bonifiacion) {
        this.bonifiacion = bonifiacion;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoAdministrativo{" +
                "bonifiacion=" + bonifiacion +
                '}';
    }

    public void mostrarinfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("Salario base: " + SalarioBase);
        System.out.println("Bonificacion: " + bonifiacion);
    }

    public double salarioA (){
        double bono = getBonifiacion();
        return bono + getSalarioBase();
    }



}
