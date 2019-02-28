package model.dto;

/**
 * @author https://java365.co - Curso práctico Java Swing MySQL
 */
public class VehiculoDTO {

    private String placa;
    private String marca;
    private String color;

    public VehiculoDTO(String placa, String marca, String color) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "VehiculoDTO{" + "placa=" + placa + ", marca=" + marca + ", color=" + color + '}';
    }

}
