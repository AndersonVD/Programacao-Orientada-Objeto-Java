
public class Folha {
    private int horas;
    private double salario;

    public int getHoras() {
        return horas;
    }

    public double getSalario() {
        return salario;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioBruto() {
        return getSalario() * getHoras();
    }

    public double getDescIr() {
        return getSalarioBruto() * 0.11;
    }

    public double getDescInss() {
        return getSalarioBruto() * 0.08;
    }

    public double getDescSindicato() {
        return getSalarioBruto() * 0.05;
    }

    public double getSalarioLiquido() {
        return getSalarioBruto() - getDescIr() - getDescInss() - getDescSindicato();
    }
}