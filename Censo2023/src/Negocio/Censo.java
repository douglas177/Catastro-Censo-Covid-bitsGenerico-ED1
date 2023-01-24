/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Douglas
 */
public class Censo {

    String Nombre[];
    VectorNbits V;
    int dim;

    /*
        edad = 7
        sexo = 1
        uv = 8
        dis = 3 
        departamento = 4
        luz = 1
        agua = 1
        pavimento = 1
        desague = 1
        26
     */
    public Censo(int numero) {
        V = new VectorNbits(numero, 27);
        Nombre = new String[numero+1];
        this.dim = 0;
    }

    public int Dim() {
        return dim;
    }

    public void Insertar(String name, int edad, int sexo, int uv, int distrito, int departamento, int luz,
            int agua, int pavimento, int desague) {
        dim++;
        int mask = edad;
        // System.out.println(Integer.toBinaryString(mask));
        mask = mask << 1;
        mask = mask | desague;
        // System.out.println(Integer.toBinaryString(mask));
        mask = mask << 1;
        mask = mask | pavimento;
        //System.out.println(Integer.toBinaryString(mask));
        mask = mask << 1;
        mask = mask | agua;
        //System.out.println(Integer.toBinaryString(mask));
        mask = mask << 1;
        mask = mask | luz;
        //System.out.println(Integer.toBinaryString(mask));
        mask = mask << 4;
        mask = mask | departamento;
        //System.out.println(Integer.toBinaryString(mask));
        mask = mask << 3;
        mask = mask | distrito;
        //System.out.println(Integer.toBinaryString(mask));
        mask = mask << 8;
        mask = mask | uv;
        //System.out.println(Integer.toBinaryString(mask));
        mask = mask << 1;
        mask = mask | sexo;

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

    private String Sexo(int elemento) {
        if (elemento == 0) {
            return "Masculino";
        } else {
            return "Femenino";
        }
    }

    private String Departamento(int elemento) {
        if (elemento != 0) {
            if (elemento == 1) {
                return "La Paz";
            }
            if (elemento == 2) {
                return "Cochabamba";
            }
            if (elemento == 3) {
                return "Tarija";
            }
            if (elemento == 4) {
                return "Chuquisaca";
            }
            if (elemento == 5) {
                return "Pando";
            }
            if (elemento == 6) {
                return "Beni";
            }
            if (elemento == 7) {
                return "Oruro";
            } else {
                return "Potosí";
            }
        } else {
            return "Santa Cruz";
        }
    }

    public String Mostrar(int pos) {
        String S = "";
        int x = V.sacar(pos);
        int c = x;
        // x = x>>19;
        System.out.println(Integer.toBinaryString(x));
        if (pos <= dim && pos != 0) {
            S = " Nro: " + pos + "\n";
            S = S + " Nombre: " + Nombre[pos] + "\n";
            int mask = x;
            mask = mask >> 20;
            S = S + " Edad: " + mask + "\n";

            mask = x;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Sexo: " + Sexo(mask & 1) + "\n";

            mask = x;
            //System.out.println(Integer.toBinaryString(mask));
            mask = mask >> 1;
            c = mask;
            mask = mask & 255;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Urbanización: " + mask + "\n";

            //System.out.println(Integer.toBinaryString(mask));
            mask = c;
            mask = mask >> 8;
            c = mask;
            mask = mask & 7;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Distrito: " + mask + "\n";

            mask = c;
            mask = mask >> 3;
            c = mask;
            mask = mask & 15;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Departamento: " + Departamento(mask) + "\n";

            mask = c;
            mask = mask >> 4;
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
            S = S + " Pavimento: " + SiNo(mask) + "\n";

            mask = c;
            mask = mask >> 1;
            c = mask;
            mask = mask & 1;
            //System.out.println(Integer.toBinaryString(mask));
            S = S + " Desague: " + SiNo(mask) + "\n";

        }
        return S;
        /*edad = 7
        sexo = 1
        uv = 8
        dis = 3 
        departamento = 3
        luz = 1
        agua = 1
        pavimento = 1
        desague = 1*/
    }

    public static void main(String[] args) {
        Censo A = new Censo(4);
        A.Insertar("Douglas", 127, 1, 255, 7, 2, 0, 0, 1, 0);
        A.Insertar("Eliana", 17, 0, 55, 2, 5, 0, 1, 1, 0);
        A.Insertar("Familia", 27, 1, 25, 1, 0, 0, 0, 0, 0);

        System.out.println(A.Mostrar(2));
    }

}
