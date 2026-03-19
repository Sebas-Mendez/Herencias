public class EmpleadoVentas extends Empleado{ //herencia de la clase empleado

    private double totalVentas;
    private double comision;

    public EmpleadoVentas() {
    }

    public EmpleadoVentas(String nombre, int edad, double salarioBase, double totalVentas, double comision) {
        super(nombre, edad, salarioBase);
        this.totalVentas = totalVentas;
        this.comision = comision;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoVentas{" +
                "totalVentas=" + totalVentas +
                ", comision=" + comision +
                '}';
    }

    public void mostrarinfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("Salario base: " + SalarioBase);
        System.out.println("comision: " + comision);
        System.out.println("Total de ventas: " + totalVentas);
    }

    public double salarioV (){
        return 0;
    }
}
