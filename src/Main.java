import java.util.Scanner;
import java.util.Random;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int menu=0;
		int i=0;
		
		int num2=0;
		Scanner sc=new Scanner(System.in);
		
		do
		{
			
			do
			{
				
				
				System.out.println("1-Tarea 1");
				System.out.println("2-Tarea 2");
				System.out.println("3-Tarea 3");
				System.out.println("4-Tarea 4");
				menu=sc.nextInt();
				
				if(menu==1)
				{
					
					
					for (i = 0; i < 10; ++i) {
						System.out.println("Dani");
					}
					System.out.println("");
					System.out.println("");

					break;
				
				
							
				}
				if(menu==2)
				{
					while(num2>-1)
					{
						System.out.println("Escribe un numero");
						num2=sc.nextInt();
						
					};
					System.out.println("Has escrito un numero negativo");
					System.out.println("");
					System.out.println("");

					break;
					
				}
				if (menu==3) 
				{
					Coche[] coche=new Coche[3];
					coche[1]=new Coche("FERRARI", "rojo");
					coche[2]=new Coche("CLIO", "azul");
					Alumno[] alumno=new Alumno[3];
					alumno[1]=new Alumno("Juan", 6.75);
					alumno[2]=new Alumno("Matias", 5.1);
					
					if(alumno[1].getNota()>alumno[2].getNota())
					{
						System.out.println("El alumno "+alumno[1].getNombre()+" ha ganado el "+coche[1].getMarca()+" de color "+coche[1].getColor()+" con un "+alumno[1].getNota()+" en java");
						
						System.out.println("El alumno "+alumno[2].getNombre()+" ha ganado el "+coche[2].getMarca()+" de color "+coche[2].getColor()+" con un "+alumno[2].getNota()+" en java");
					}
					else
					{
						System.out.println("El alumno "+alumno[2].getNombre()+" ha ganado el "+coche[1].getMarca()+" de color "+coche[1].getColor()+" con un "+alumno[1].getNota()+" en java");
						
						System.out.println("El alumno "+alumno[1].getNombre()+" ha ganado el "+coche[2].getMarca()+" de color "+coche[2].getColor()+" con un "+alumno[2].getNota()+" en java");
					}
					System.out.println("");
					System.out.println("");

					break;
					
				}
				if(menu==4)
				{
					System.out.println(fechasalt());
				}
				System.out.println("");
				System.out.println("");

				break;

				
				
			}while(3>2);
			
		}while(3>2);
					
		
	}
	
	
	public static ArrayList<LocalDate> fechasalt()
	{
		
		ArrayList<LocalDate> fechas = new ArrayList<LocalDate>();
		for(int a=0;a<10;a++)
		{
			int numero = (int)(Math.random()*10+1);
			int numero2 = (int)(Math.random()*20+1);
			LocalDate fechaActual1 = LocalDate.now();	
			LocalDate fechanueva=fechaActual1.plusMonths(numero).minusDays(numero2);
			fechanueva.toString();
		
			fechas.add(fechanueva); 
		}
		Collections.sort(fechas);
		return fechas;
	}

}
