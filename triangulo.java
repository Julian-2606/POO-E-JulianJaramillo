public class triangulo {
    // atributos
    public int id;
    public int numLados;
    public int numVertices;
    public String color;
    public double area;
    public double perimetro;
    public String tipo;
    public double lado1;
    public double lado2;
    public double lado3;

    // metodos
    public void calcularArea(){
        // codigo para calcular el area del triangulo
        double s = (lado1 + lado2 + lado3) / 2;
        area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
    public void calcularPerimetro(){
        // codigo para calcular el area del triangulo
        perimetro = lado1 + lado2 + lado3;
    }
    public double calcularAngulos(){
        // codigo para calcular los angulos del triangulo
        double angulo1 = Math.acos((Math.pow(lado2, 2) + Math.pow(lado3, 2) - Math.pow(lado1, 2)) / (2 * lado2 * lado3));
        double angulo2 = Math.acos((Math.pow(lado1, 2) + Math.pow(lado3, 2) - Math.pow(lado2, 2)) / (2 * lado1 * lado3));
        double angulo3 = Math.acos((Math.pow(lado1, 2) + Math.pow(lado2, 2) - Math.pow(lado3, 2)) / (2 * lado1 * lado2));
        return angulo1 + angulo2 + angulo3;
    }
}
