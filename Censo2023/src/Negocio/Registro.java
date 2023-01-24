/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Usuario
 */
public class Registro {
    
    /*
    Codigo Alumno   1 - 100      7
    Nombre   
    sexo M o F     1
    edad  1 - 90    7
    asignatura     1 - 10    4 
    nota   1 - 100  7 
    fecha dia/mes /año    año = 2000 - 2023  5  4  5 
    */
    String Nombre[];
    VectorNbits V;
    VectorNbits Fecha;
    int dim;

    public Registro(int numero) {
        V = new VectorNbits(numero, 19);
        Nombre = new String[numero+1];
        Fecha = new  VectorNbits(numero, 14);
        this.dim = 0;
    }
    public void Insertar(String Name, int sexo, int edad, int asignatura, int nota, int dia, int mes, int año){
        dim++;
        int mask = sexo;
        
        mask = mask << 1;
        mask = mask | sexo;
        
        // System.out.println(Integer.toBinaryString(mask));
        mask = mask << 7;
        mask = mask | nota;
        // System.out.println(Integer.toBinaryString(mask));
        mask = mask << 4;
        mask = mask | asignatura;
        // System.out.println(Integer.toBinaryString(mask));
        mask = mask << 7;
        mask = mask | edad;
        
        
        
        V.insertar(mask, dim);
        Nombre[dim] = Name;
        
        int dato = dia;
        dato = dato << 4;
        dato = dato | mes;
        System.out.println(Integer.toBinaryString(dato));
        año = año - 2000;
        dato = dato << 5;
        dato = dato | año;

        Fecha.insertar(dato, dim);
    }
    private String Convertir(int x){
        if (x == 1)
            return "Masculino";
        else
            return "Femenino";
                    
    }
    public String Mostrar(int pos) {
        String S = "";
        int Valor = V.sacar(pos);
        int Fecha = this.Fecha.sacar(pos);
        int ValorAux = Valor;
        int FechaAux = Fecha;
        // x = x>>19;
        //System.out.println(Integer.toBinaryString(x));
        if (pos <= dim && pos != 0) {
            S = " Codigo Alumno: " + pos + "\n";
            S = S + " Nombre: " + Nombre[pos] + "\n";
            int mask = ValorAux;
            mask = mask >> 18;
            S = S + " Sexo: " + Convertir(mask) + "\n";

            mask = Valor;
            mask = mask &127;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Edad: " + mask  + "\n";

            mask = Valor;
            mask = mask >>7;
            ValorAux = mask;
            mask = mask &15;
            S = S + " Asignatura: " + mask + "\n";
            //System.out.println(Integer.toBinaryString(mask));
            mask = ValorAux;
            mask =  mask >>4;
            ValorAux = mask;
            mask = mask & 127;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Nota: " + mask + "\n";

            int fecha = FechaAux;
            fecha = fecha>>9;
            System.out.println(Integer.toBinaryString(fecha));
            S = S + " Fecha: " + fecha+" / ";
            
            fecha = FechaAux;
            fecha = fecha>>5;
            fecha = fecha &15;
            //System.out.println(Integer.toBinaryString(mask));
            S = S  + fecha+" / ";
            
            fecha = FechaAux;
            fecha = fecha &31;
            fecha = fecha + 2000;
            //System.out.println(Integer.toBinaryString(mask));
            S = S  + fecha;
        }
        return S;

    }
    public static void main(String[] args) {
        Registro A = new Registro(2);
        //(String Name, int sexo, int edad, int asignatura, int nota, int dia, int mes, int año){
        A.Insertar("Douglas", 0, 127, 15, 127,30, 10, 2023);
        System.out.println(A.Mostrar(1));
    }

    public int getDim() {
        return dim;
    }
}
