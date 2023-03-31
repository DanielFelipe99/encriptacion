/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Seguridad.Cifrado;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author Daniel
 */
public class Datos {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Scanner consola = new Scanner(System.in);
        Cifrado encriptar = new Cifrado();
        Cifrado desencriptar = new Cifrado();
        int opcion;
   
        System.out.println("Ingresa el mensaje a encriptar: ");
        String encriptado = encriptar.encriptar(consola.nextLine());
        System.out.println("Mensaje encriptado: " + encriptado );
        System.out.println("Para desencriptar el mensaje presiona 1");
        opcion = consola.nextInt();
        
        if(opcion==1)
        System.out.println("Mensaje desencriptado: " + desencriptar.desencriptar(encriptado));
        else
            System.out.println("Opcion incorrecta, saliendo del sistema...");
       
        
    }
}
