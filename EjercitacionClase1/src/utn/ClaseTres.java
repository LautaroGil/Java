package utn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ClaseTres {
	public static void main(String[] args) throws IOException{
		String ruta="C:\\Lautaro\\Clases Java\\Archivos de texto\\ClaseCuatroEjDos.txt";
	//	Main.sumatoria(ruta, true);
	}



	
	
		/*int NumeroInicial=5;
		
			for(int NumeroFinal=14;NumeroInicial<=NumeroFinal;NumeroFinal--) {
				if(NumeroFinal%2==0)
				System.out.println(NumeroFinal);
			 	} */
					
			//EJERCICIO 1c
	/*	public static void ejercicioUnoC() {
		int numeros[]= {1,5,6,8};
		int resultado=sumatoria(numeros, 2);
		
			System.out.println(resultado);
			}
		//
		private static int sumatoria(int[] numeros,int numero) {
			int resultado=0;
			for(int i=0;i<numeros.length;i++) {
				if(numero<numeros[i]) {
				resultado+= numeros[i];
				}
			}
			return resultado;
		
		}
	*/	
		
		//EJERCICIO 1A
/*	public static void contadorDeLetras() {
		int cantidad = contadorDeLetrasEnPalabra("palabras son palabras porque pueden serlo oh si oh si",'p');
			 
			System.out.println(cantidad);
	}
	private static int contadorDeLetrasEnPalabra(String frase, char letra) {
		int cantCarac=frase.length();
		int contador=0;
			for (int i=0;i<cantCarac;i++) {
				char letraEnPosicion=frase.charAt(i);
				if(letraEnPosicion==letra) {
					contador++;
				}
			}
		return contador;
	}
*/
		//EJERCICIO 1B
/*		public static void ordenar() {
		int numeros[]= {15,18,6,14,20};
		int aux;
		int j;
		int nuevaPosicion;
		for(int i=1; i<(numeros.length); i++) {
			j=i-1;
			while(numeros[i]<numeros[j] && j>=0) {
				j=j-1;
				if(j==-1) {
					break;
				}
			}
			nuevaPosicion=j+1;
			if (nuevaPosicion<i) {
				aux= numeros[i];
				for(int k=i; k>nuevaPosicion; k--) {
					numeros[k]=numeros[k-1];
				}
				numeros[nuevaPosicion]=aux;
			}	
		}
		for(int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
*/
	 

	//EJERCICIO 2
	
	/*getChars​(int srcBegin, int srcEnd, char[] dst, int dstBegin)	
	Copies characters from this string into the destination character array. 
		indexOf​(int ch)	
Returns the index within this string of the first occurrence of the specified character.
	replace​(char oldChar, char newChar)	
Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
	replace​(CharSequence target, CharSequence replacement)	
Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.
char[]	toCharArray()	
Converts this string to a new character array.*/

	public static void codificar(){
		String mensaje="hola que tal";
		char arrayMsj[]= mensaje.toCharArray();
		String abecedario="abcdefghijklmnñopqrstuvwxyz";
		char arrayAbc[]= abecedario.toCharArray();
	
				for(int i=0;i<arrayMsj.length;i++) {
					switch(arrayMsj[i]) {
					case 'a':
						arrayMsj[i]=arrayAbc[1];
						break;
						
					case 'b':
						arrayMsj[i]=arrayAbc[2];
						break;
					case 'c':
						arrayMsj[i]=arrayAbc[3];
						break;
					case 'd':
						arrayMsj[i]=arrayAbc[4];
						break;
					case 'e':
						arrayMsj[i]=arrayAbc[5];
						break;
					case 'f':
						arrayMsj[i]=arrayAbc[6];
						break;
					case 'g':
						arrayMsj[i]=arrayAbc[7];
						break;
					case 'h':
						arrayMsj[i]=arrayAbc[8];
						break;
					case 'i':
						arrayMsj[i]=arrayAbc[9];
						break;
					case 'j':
						arrayMsj[i]=arrayAbc[10];
						break;
					case 'k':
						arrayMsj[i]=arrayAbc[11];
						break;
					case 'l':
						arrayMsj[i]=arrayAbc[12];
						break;
					case 'm':
						arrayMsj[i]=arrayAbc[13];
						break;
					case 'n':
						arrayMsj[i]=arrayAbc[14];
						break;
					case'ñ':
						arrayMsj[i]=arrayAbc[15];
						break;
					case 'o':
						arrayMsj[i]=arrayAbc[16];
						break;
					case 'p':
						arrayMsj[i]=arrayAbc[17];
						break;
					case 'q':
						arrayMsj[i]=arrayAbc[18];
						break;
					case 'r':
						arrayMsj[i]=arrayAbc[19];
						break;
					case 's':
						arrayMsj[i]=arrayAbc[20];
						break;
					case 't':
						arrayMsj[i]=arrayAbc[21];
						break;
					case 'u':
						arrayMsj[i]=arrayAbc[22];
						break;
					case 'v':
						arrayMsj[i]=arrayAbc[23];
						break;
					case 'w':
						arrayMsj[i]=arrayAbc[24];
						break;
					case 'x':
						arrayMsj[i]=arrayAbc[25];
						break;
					case 'y':
						arrayMsj[i]=arrayAbc[26];
						break;
					case 'z':
						arrayMsj[i]=arrayAbc[0];
						break;
					default:
						arrayMsj[i]=arrayAbc[0];
					}
				}
				System.out.println(arrayMsj);
	}
	public static void decodificar(){
		String mensaje="ipmbarvfaubm";
		char arrayMsj[]= mensaje.toCharArray();
		String abecedario="abcdefghijklmnñopqrstuvwxyz";
		char arrayAbc[]= abecedario.toCharArray();
		String espaci0=" ";
		char arrayEspacio[]=espaci0.toCharArray();
				for(int i=0;i<arrayMsj.length;i++) {
					boolean espacio= true;
					switch(arrayMsj[i]) {
					case 'a':
						if(espacio) {
						arrayMsj[i]=arrayEspacio[0];
						}
						else {
						arrayMsj[i]=arrayAbc[26];
						}
						break;
					case 'b':
						arrayMsj[i]=arrayAbc[0];
						break;
					case 'c':
						arrayMsj[i]=arrayAbc[1];
						break;
					case 'd':
						arrayMsj[i]=arrayAbc[2];
						break;
					case 'e':
						arrayMsj[i]=arrayAbc[3];
						break;
					case 'f':
						arrayMsj[i]=arrayAbc[4];
						break;
					case 'g':
						arrayMsj[i]=arrayAbc[5];
						break;
					case 'h':
						arrayMsj[i]=arrayAbc[6];
						break;
					case 'i':
						arrayMsj[i]=arrayAbc[7];
						break;
					case 'j':
						arrayMsj[i]=arrayAbc[8];
						break;
					case 'k':
						arrayMsj[i]=arrayAbc[9];
						break;
					case 'l':
						arrayMsj[i]=arrayAbc[10];
						break;
					case 'm':
						arrayMsj[i]=arrayAbc[11];
						break;
					case 'n':
						arrayMsj[i]=arrayAbc[12];
						break;
					case'ñ':
						arrayMsj[i]=arrayAbc[13];
						break;
					case 'o':
						arrayMsj[i]=arrayAbc[14];
						break;
					case 'p':
						arrayMsj[i]=arrayAbc[15];
						break;
					case 'q':
						arrayMsj[i]=arrayAbc[16];
						break;
					case 'r':
						arrayMsj[i]=arrayAbc[17];
						break;
					case 's':
						arrayMsj[i]=arrayAbc[18];
						break;
					case 't':
						arrayMsj[i]=arrayAbc[19];
						break;
					case 'u':
						arrayMsj[i]=arrayAbc[20];
						break;
					case 'v':
						arrayMsj[i]=arrayAbc[21];
						break;
					case 'w':
						arrayMsj[i]=arrayAbc[22];
						break;
					case 'x':
						arrayMsj[i]=arrayAbc[23];
						break;
					case 'y':
						arrayMsj[i]=arrayAbc[24];
						break;
					case 'z':
						arrayMsj[i]=arrayAbc[25];
						break;
					default:
						arrayMsj[i]=arrayAbc[0];
					}
				}
				System.out.println(arrayMsj);
	//}
				
				 for(int j=0;j<arrayAbc.length;j++) {
						int k=j+1;
							if (k==27){
								k=0;
							}
					//	if (arrayMsj[i]==arrayAbc[j]) {
						//	arrayMsj[i]= arrayAbc[k];
					//	}
					//	else {
							continue;
						}
					}
			//	}
				 
	private static int sumatoria(String archivo,boolean sumar) throws IOException   {
		Files.readAllLines(Paths.get(archivo));
		int resultado=0;
		String[]archivos=archivo.split(",");
		
		int numeros[]=new int[archivos.length];
			for(int i=0;i<numeros.length;i++){
				numeros[i] = Integer.parseInt(archivos[i]);
			}
		if(sumar=true) {
		for(int i=0;i<numeros.length;i++) {
				resultado+= numeros[i];
			}
		}
		else {
			for(int i=0;i<numeros.length;i++) {
				resultado*= numeros[i];
			}
		}
		return resultado;
	
	}
}
