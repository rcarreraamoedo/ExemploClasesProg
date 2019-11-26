
package triangulo;

public class Metodos {
    private float base;
    private float altura;

    public Metodos() {
    }

    public Metodos(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "base=" + base + ", altura=" + altura;
    }
   public void amosar(){
       System.out.println(toString());
   } 

}
