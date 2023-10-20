package com.example.mascotas;

public class Gato {

    String nombre;
    double peso;
    String genero;
    String raza;
    int edad;
    double altura;
    String pelaje;



        public Gato(String nombre, double peso, double altura, String pelaje, String genero, String raza, int edad) {
            this.nombre = nombre;
            this.peso = peso;
            this.altura = altura;
            this.pelaje = pelaje;
            this.genero = genero;
            this.raza = raza;
            this.edad = edad;

        }
        public String getNombre() {
            return nombre;
        }

        public double getPeso() {
            return peso;
        }

        public double getAltura() {
            return altura;
        }

        public String getPelaje() {
            return pelaje;
        }

        public String getGenero() {
            return genero;
        }

        public String getRaza() {
            return raza;
        }

        public int getEdad() {
            return edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
}
