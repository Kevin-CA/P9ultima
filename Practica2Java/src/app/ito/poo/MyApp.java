package app.ito.poo;


import java.awt.HeadlessException;
import java.io.FileNotFoundException;

import Clases.ito.poo.CuentasdeBanco;
import Escritor.eArchivo;
import Escritor.lArchvo;
import excepcion.ito.poo.CuentaExistente;
import excepcion.ito.poo.BorrarCuenta;
import excepcion.ito.poo.Deposito;
import excepcion.ito.poo.NumeCuenta;
import excepcion.ito.poo.Retiro;
import excepcion.ito.poo.Saldo;

public class MyApp {
	
	static CuentasdeBanco c=new CuentasdeBanco();
	static eArchivo archivo;
	static lArchvo archivo2;
	
	static void run() throws HeadlessException, NumeCuenta, Saldo, Retiro, Deposito, CuentaExistente, BorrarCuenta, FileNotFoundException {
		
		Aplicacion.menu();
		   
		
    }

		static void crearArchivo() throws FileNotFoundException {
			archivo = new eArchivo("guardacuentas");
		}
		public static void main(String[] args) throws HeadlessException, NumeCuenta, Saldo, Retiro, Deposito, CuentaExistente, BorrarCuenta, FileNotFoundException {
			run();
		}
}
	