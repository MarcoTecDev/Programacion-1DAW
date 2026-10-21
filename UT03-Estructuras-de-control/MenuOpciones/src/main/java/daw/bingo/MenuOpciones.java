package daw.bingo;

import javax.swing.JOptionPane;

public class MenuOpciones {

    public static void main(String[] args) {

        String texto;
        char opcion;
        int numero, i;
        int vocales, consonantes, espacios;
        boolean valido;
        char letra;

        do {
            texto = JOptionPane.showInputDialog(null,
                    "1. Comprobar hora (HH:MM:SS)\n"
                  + "2. Día de la semana\n"
                  + "3. Número primo\n"
                  + "4. Caracteres de un nombre\n"
                  + "5. Vocales, consonantes y espacios\n"
                  + "6. Salir\n\n"
                  + "Elige una opción:");

            // Si cancela o no escribe un solo carácter, la opción no es válida
            if (texto == null || texto.length() != 1) {
                opcion = '0';
            } else {
                opcion = texto.charAt(0);
            }

            switch (opcion) {

                case '1':
                    texto = JOptionPane.showInputDialog(null, "Introduce una hora (HH:MM:SS):");

                    // Compruebo el formato y luego cada cifra
                    valido = texto != null && texto.length() == 8
                            && texto.charAt(2) == ':' && texto.charAt(5) == ':';

                    if (valido) {
                        if (texto.charAt(0) < '0' || texto.charAt(0) > '2') valido = false;
                        if (texto.charAt(1) < '0' || texto.charAt(1) > '9') valido = false;
                        if (texto.charAt(0) == '2' && texto.charAt(1) > '3') valido = false;
                        if (texto.charAt(3) < '0' || texto.charAt(3) > '5') valido = false;
                        if (texto.charAt(4) < '0' || texto.charAt(4) > '9') valido = false;
                        if (texto.charAt(6) < '0' || texto.charAt(6) > '5') valido = false;
                        if (texto.charAt(7) < '0' || texto.charAt(7) > '9') valido = false;
                    }

                    if (valido) {
                        JOptionPane.showMessageDialog(null, "La hora " + texto + " es válida");
                    } else {
                        JOptionPane.showMessageDialog(null, "La hora no es válida");
                    }
                    break;

                case '2':
                    texto = JOptionPane.showInputDialog(null, "Introduce un número del 1 al 7:");

                    if (texto == null || texto.length() != 1) {
                        texto = "0";
                    }

                    switch (texto.charAt(0)) {
                        case '1': JOptionPane.showMessageDialog(null, "Lunes"); break;
                        case '2': JOptionPane.showMessageDialog(null, "Martes"); break;
                        case '3': JOptionPane.showMessageDialog(null, "Miércoles"); break;
                        case '4': JOptionPane.showMessageDialog(null, "Jueves"); break;
                        case '5': JOptionPane.showMessageDialog(null, "Viernes"); break;
                        case '6': JOptionPane.showMessageDialog(null, "Sábado"); break;
                        case '7': JOptionPane.showMessageDialog(null, "Domingo"); break;
                        default: JOptionPane.showMessageDialog(null, "Número no válido"); break;
                    }
                    break;

                case '3':
                    texto = JOptionPane.showInputDialog(null, "Introduce un número entero positivo:");

                    // Compruebo que solo hay cifras antes de usar parseInt
                    valido = texto != null && texto.length() > 0 && texto.length() <= 9;
                    if (valido) {
                        for (i = 0; i < texto.length(); i++) {
                            if (texto.charAt(i) < '0' || texto.charAt(i) > '9') {
                                valido = false;
                            }
                        }
                    }

                    if (!valido) {
                        JOptionPane.showMessageDialog(null, "No es un número válido");
                    } else {
                        numero = Integer.parseInt(texto);
                        valido = numero > 1;

                        // Si alguna división da resto 0, no es primo
                        for (i = 2; i < numero; i++) {
                            if (numero % i == 0) {
                                valido = false;
                                break;
                            }
                        }

                        if (valido) {
                            JOptionPane.showMessageDialog(null, numero + " es primo");
                        } else {
                            JOptionPane.showMessageDialog(null, numero + " no es primo");
                        }
                    }
                    break;

                case '4':
                    texto = JOptionPane.showInputDialog(null, "Introduce un nombre:");

                    if (texto == null || texto.length() == 0) {
                        JOptionPane.showMessageDialog(null, "No has escrito nada");
                    } else {
                        JOptionPane.showMessageDialog(null, texto + " tiene " + texto.length() + " caracteres");
                    }
                    break;

                case '5':
                    texto = JOptionPane.showInputDialog(null, "Introduce una frase:");

                    if (texto == null || texto.length() == 0) {
                        JOptionPane.showMessageDialog(null, "No has escrito nada");
                    } else {
                        vocales = 0;
                        consonantes = 0;
                        espacios = 0;

                        // Recorro la frase letra a letra
                        i = 0;
                        do {
                            letra = texto.charAt(i);

                            switch (letra) {
                                case 'a': case 'e': case 'i': case 'o': case 'u':
                                case 'A': case 'E': case 'I': case 'O': case 'U':
                                case 'á': case 'é': case 'í': case 'ó': case 'ú':
                                    vocales++;
                                    break;
                                case ' ':
                                    espacios++;
                                    break;
                                default:
                                    // Solo cuento las letras, no los números ni los signos
                                    if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')
                                            || letra == 'ñ' || letra == 'Ñ') {
                                        consonantes++;
                                    }
                                    break;
                            }
                            i++;
                        } while (i < texto.length());

                        JOptionPane.showMessageDialog(null, "Vocales: " + vocales
                                + "\nConsonantes: " + consonantes
                                + "\nEspacios: " + espacios);
                    }
                    break;

                case '6':
                    texto = JOptionPane.showInputDialog(null, "¿Seguro que quieres salir? (s/n)");

                    // Si no contesta que sí, cambio la opción para que vuelva el menú
                    if (texto == null || texto.length() == 0
                            || (texto.charAt(0) != 's' && texto.charAt(0) != 'S')) {
                        opcion = '0';
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }

        } while (opcion != '6');
    }
}
