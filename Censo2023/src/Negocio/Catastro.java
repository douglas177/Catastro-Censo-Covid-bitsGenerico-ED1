/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Estudiante
 */
public class Catastro {

    String Nombre[];
    VectorNbits V;
    int dim;

    /*
    Uv = 1 - 20       = 5
    manzana = 1 - 25  = 5
    lote = 1 - 30     = 5
    area = 100 - 150  = 6
    luz = 1
    agua = 1
    gas = 1
    tele = 1
    alcantarillado = 1
    pavimento = 1 
    12 + 15  = 27
     */
    public Catastro(int numero) {
        V = new VectorNbits(numero, 27);
        Nombre = new String[numero + 1];
        this.dim = 0;
    }

    public int Dim() {
        return dim;
    }

    public void Insertar(String name, int uv, int manzana, int lote, int area, int luz, int agua, int gas,
             int telefono, int alcantarillado, int pavimento) {
        dim++;
        int mask = pavimento;
        //System.out.println(Integer.toBinaryString(mask));
        mask = mask << 1;
        mask = mask | alcantarillado;
        //System.out.println(Integer.toBinaryString(mask));
        mask = mask << 1;
        mask = mask | telefono;
        //System.out.println(Integer.toBinaryString(mask));
        mask = mask << 1;
        mask = mask | gas;
        //System.out.println(Integer.toBinaryString(mask));
        mask = mask << 1;
        mask = mask | agua;
        //System.out.println(Integer.toBinaryString(mask));
        mask = mask << 1;
        mask = mask | luz;
        //System.out.println(Integer.toBinaryString(mask));
        //System.out.println(Integer.toBinaryString(mask));
        //A.Insertar("Douglas", 20, 25, 11, 120, 1, 0, 1, 0, 1, 0);
        mask = mask << 6;
        area = area - 100;
        mask = mask | area;
        //System.out.println(Integer.toBinaryString(mask));
        mask = mask << 5;
        mask = mask | lote;
        //System.out.println(Integer.toBinaryString(mask));
        mask = mask << 5;
        mask = mask | manzana;
        //System.out.println(Integer.toBinaryString(mask));
        mask = mask << 5;
        mask = mask | uv;

        //System.out.println(Integer.toBinaryString(mask));
        // System.out.println(Integer.toBinaryString(mask));
        V.insertar(mask, dim);
        Nombre[dim] = name;

        //System.out.println(Integer.toBinaryString(mask));
    }

    private String SiNo(int elemento) {
        if (elemento == 0) {
            return "No";
        } else {
            return "Si";
        }
    }

    public String Mostrar(int pos) {
        String S = "";
        int x = V.sacar(pos);
        int c = x;
        // x = x>>19;
        //System.out.println(Integer.toBinaryString(x));
        if (pos <= dim && pos != 0) {
            S = " Nro: " + pos + "\n";
            S = S + " Nombre: " + Nombre[pos] + "\n";
            int mask = x;
            mask = mask & 31;
            S = S + " UV: " + mask + "\n";

            mask = x;
            mask = mask >> 5;
            mask = mask & 31;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Manzana: " + mask + "\n";

            mask = x;
            //System.out.println(Integer.toBinaryString(mask));
            mask = mask >> 10;
            c = mask;
            mask = mask & 31;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Lote: " + mask + "\n";

            //System.out.println(Integer.toBinaryString(mask));
            mask = c;
            mask = mask >> 5;
            c = mask;
            mask = mask & 63;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Area: " + (mask+100) + "\n";

            mask = c;
            mask = mask >> 6;
            c = mask;
            mask = mask & 1;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Luz: " + SiNo(mask) + "\n";

            mask = c;
            mask = mask >> 1;
            c = mask;
            mask = mask & 1;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Agua: " + SiNo(mask) + "\n";

            mask = c;
            mask = mask >> 1;
            c = mask;
            mask = mask & 1;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Gas: " + SiNo(mask) + "\n";

            mask = c;
            mask = mask >> 1;
            c = mask;
            mask = mask & 1;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Telèfono: " + SiNo(mask) + "\n";

            mask = c;
            mask = mask >> 1;
            c = mask;
            mask = mask & 1;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Alcantarillado: " + SiNo(mask) + "\n";
            
            mask = c;
            mask = mask >> 1;
            c = mask;
            mask = mask & 1;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Pavimento: " + SiNo(mask) + "\n";

        }
        return S;
    }
    public static void main(String[] args) {
        Catastro A = new Catastro(3);
       //A.Insertar("Douglas", 127, 0, 12, 5, 2, 0, 1, 0, 1);
       //A.Insertar("Eliana", 25, 0, 12, 5, 2, 0, 1, 0, 1);
       //A.Insertar("Eliana", 25, 0, 12, 5, 2, 0, 1, 0, 1);
       A.Insertar("Douglas", 20, 25, 11, 120, 1, 1, 1, 1, 1, 1);
       //A.Insertar("Eliana", 31, 31, 31, 163, 1, 0, 1, 0, 1, 0);
       System.out.println(A.Mostrar(1));
    }
}
