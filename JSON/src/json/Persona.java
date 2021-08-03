package json;

import java.util.Arrays;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private char sexo;
    private String[] ocupaciones;

    public Persona(String nombre, String apellido, Integer edad, char sexo, String[] ocupaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.ocupaciones = ocupaciones;
    }

    public Persona() {
        this.nombre = "Desconocido";
        this.apellido = "N/A";
        this.edad = 0;
        this.sexo = '-';
        this.ocupaciones = new String[]{"Nada","n/a"};
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        for (String x: this.ocupaciones) {

        }

        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sexo=" + sexo + ", ocupaciones=" + Arrays.toString(ocupaciones) + '}';
    }



}
