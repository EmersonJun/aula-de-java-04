public class triangulo {
    float base, altura, area;
    public triangulo(float altura, float area, float base) {
        this.altura = altura;
        this.area = area;
        this.base = base;
    }
    public float area(){
        area = base * altura;
        return area;
    }
}
