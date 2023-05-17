package pacote;

import java.util.Scanner;
import java.util.Random;
public class Veiculo {
	Scanner ler = new Scanner(System.in);
	Random generator = new Random();
	
	private String marcaV;
	private String modeloV;
	private int anoV; 
	private int pneusE;
	private int oleoE;
	private int motorE;
	private int bateriaE;
	private boolean fixedV;
	private int idV;
	
	//GETTERS
	
	public String getMarcaV() {
		return marcaV;
	}
	public String getModeloV() {
		return modeloV;
	}
	public int getAnoV() {
		return anoV;
	}
	public int getPneusE() {
		return pneusE;
	}
	public int getOleoE() {
		return oleoE;
	}
	public int getMotorE() {
		return motorE;
	}
	public int getBateriaE() {
		return bateriaE;
	}
	public boolean getFixedV() {
		return fixedV;
	}
	public int getIdV() {
		return idV;
	}
	//SETTERS
	
	public void setPneusE(int pneusE) {
		this.pneusE = pneusE;
	}
	public void setOleoE(int oleoE) {
		this.oleoE = oleoE;
	}
	public void setMotorE(int motorE) {
		this.motorE = motorE;
	}
	public void setBateriaE(int bateriaE) {
		this.bateriaE = bateriaE;
	}
	public void setFixedV(boolean fixedV) {
		this.fixedV = fixedV;
	}
	
	//METHODS
	
	public Veiculo(){
		
		System.out.printl("Marca do carro:");
		String marcV = ler.next();
		System.out.println("Modelo do carro:");
		String modelV = ler.next();
		System.out.println("Ano do carro:");
		int anoVV = ler.nextInt();
		System.out.println("Estado dos pneus (de 1 a 10):");
		int estadoP = ler.nextInt();
		System.out.println("Tempo sem trocar óleo (em anos):");
		int tempoO = ler.nextInt();
		System.out.println("Estado do motor(de 1 a 10):");
		int estadoM = ler.nextInt();
		System.out.println("Carga da bateria(de 1 a 100):");
		int cargaV = ler.nextInt();
		
		this.marcaV=marcV;
		this.modeloV=modelV;
		this.anoV=anoVV;
		this.pneusE=estadoP;
		this.oleoE=tempoO;
		this.motorE=estadoM;
		this.bateriaE=cargaV;
		this.fixedV=false;
		this.idV=generator.nextInt(9000)+1000;
	}
	
	public void obterDados() {
		System.out.println("      ");
		System.out.println("ID: "+this.getIdV());
		System.out.println("Marca: "+this.getMarcaV());
		System.out.println("Modelo: "+this.getModeloV());
		System.out.println("Ano: "+this.getAnoV());
		System.out.println("Estado dos pneus: "+this.getPneusE()+"/10");
		System.out.println("Tempo do óleo: "+this.getOleoE()+" anos");
		System.out.println("Estado do motor: "+this.getMotorE()+"/10");
		System.out.println("Carga da bateria: "+this.getBateriaE()+"%");
		if(fixedV==false) {
			System.out.println("Não foi reparado ainda.");
		}else { System.out.println("Veículo reparado."); }
		System.out.println("      ");
}
	public void reparar() {
		int menuFix;
		int reparos = 0;
		do {
			
			if(reparos == 4)
				System.out.println("Veículo completamente reparado com sucesso! \n");
			
			System.out.println(" 1- Trocar pneus \n 2- Trocar óleo \n 3- Reparar motor \n 4- Trocar bateria \n 5- Sair \n Qual opção deseja executar? \n");
			menuFix = ler.nextInt();
			switch(menuFix) {
			case 1:
				if(this.getPneusE()==10) {
					System.out.println("Os pneus não precisam ser trocados.\n");
				}else {
					this.setPneusE(10);
				System.out.println("Os pneus foram trocados. \n");
				reparos++;
				}
				break;
			case 2:
				if(this.getOleoE()==0) {
					System.out.println("O óleo não precisa ser trocado.\n");
				}else {
					this.setOleoE(0);
				System.out.println("O óleo foi trocado. \n");
				reparos++;
				}
				break;
			case 3:
				if(this.getMotorE()==10) {
					System.out.println("O motor não precisa ser reparado.\n");
				}else {
					this.setMotorE(10);
				System.out.println("O motor foi reparado. \n");
				reparos++;
				}
				break;
			case 4:
				if(this.getBateriaE()==100) {
					System.out.println("A bateria não precisa ser trocada.\n");
				}else {
					this.setBateriaE(100);
				System.out.println("A bateria foi trocada. \n");
				reparos++;
				}
				break;
		
			}
		}while(menuFix>0 && menuFix<5);
		
		
	}
	
}