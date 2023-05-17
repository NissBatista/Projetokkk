package pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal{

	public static void main(String[] args) {
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>(); 
		Scanner ler = new Scanner(System.in);
		int index=1;
		// MENU GERAL
		int menuADM = 0;
		do {
			System.out.println(
					" 1- Registrar revisão  \n 2- Listar veículo (Conseguir Id) \n 3- Reparar veículo \n 4- Remover veículo \n 5- Sair \n Qual opção deseja executar?");

			menuADM = ler.nextInt();
			switch (menuADM) {
			case 1:
				Veiculo novoVeiculo = new Veiculo();
				veiculos.add(novoVeiculo);
				break;
			case 2:

				for(Veiculo veiculoArray : veiculos) {
					
					System.out.println("Veículo "+index);
					veiculoArray.obterDados();
					index++;
				}
				index=1;
				break;
			case 3:

				System.out.println("Digite o Id do veículo: ");
				int lerID = ler.nextInt();
				for(Veiculo veiculoArray : veiculos) {
					if(veiculoArray.getIdV()==lerID) {
						
						veiculoArray.reparar();
						
					}
				}
				break;
			case 4:

				System.out.println("Digite o Id do veículo: ");
				lerID = ler.nextInt();
				int indexremove=0;
				int n = veiculos.size();
				for(int i=0;i<=n-1;i++) {
					
					if(veiculos.get(i).getIdV()==lerID) {
						indexremove = i;
					}
				} 
				veiculos.remove(indexremove);
				System.out.println("Veículo removido. \n ");
				break;
			}
		} while (menuADM > 0 && menuADM < 5);
	}

}





