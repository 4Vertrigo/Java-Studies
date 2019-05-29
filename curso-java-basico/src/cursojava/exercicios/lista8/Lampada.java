package cursojava.exercicios.lista8;

public class Lampada {
	
	private String tensaoEletrica;
	private String tipoSoquete;
	private String material;
	private String corLuz;
	private String formato;
	private String marca;
	private double altura; //em centimetros
	private double largura; //em centimetros
	private double vidaUtil; //em horas
	private int angulo;
	private int indiceProtecao;
	private int potencia; //em Watts
	private int temperaturaCor; //em Kelvin
	private int garantia; //em meses
	private boolean estado;

	public Lampada() {
		// TODO Auto-generated constructor stub
	}
	
	public Lampada(String tensaoEletrica, String tipoSoquete, String material, String corLuz, String formato,
			String marca, double altura, double largura, double vidaUtil, int angulo, int indiceProtecao, int potencia,
			int temperaturaCor, int garantia, boolean estado) {
		this.tensaoEletrica = tensaoEletrica;
		this.tipoSoquete = tipoSoquete;
		this.material = material;
		this.corLuz = corLuz;
		this.formato = formato;
		this.marca = marca;
		this.altura = altura;
		this.largura = largura;
		this.vidaUtil = vidaUtil;
		this.angulo = angulo;
		this.indiceProtecao = indiceProtecao;
		this.potencia = potencia;
		this.temperaturaCor = temperaturaCor;
		this.garantia = garantia;
		this.estado = estado;
	}
	
	
	public String getTensaoEletrica() {
		return tensaoEletrica;
	}
	public void setTensaoEletrica(String tensaoEletrica) {
		this.tensaoEletrica = tensaoEletrica;
	}
	public String getTipoSoquete() {
		return tipoSoquete;
	}
	public void setTipoSoquete(String tipoSoquete) {
		this.tipoSoquete = tipoSoquete;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getCorLuz() {
		return corLuz;
	}
	public void setCorLuz(String corLuz) {
		this.corLuz = corLuz;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getVidaUtil() {
		return vidaUtil;
	}
	public void setVidaUtil(double vidaUtil) {
		this.vidaUtil = vidaUtil;
	}
	public int getAngulo() {
		return angulo;
	}
	public void setAngulo(int angulo) {
		this.angulo = angulo;
	}
	public int getIndiceProtecao() {
		return indiceProtecao;
	}
	public void setIndiceProtecao(int indiceProtecao) {
		this.indiceProtecao = indiceProtecao;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getTemperaturaCor() {
		return temperaturaCor;
	}
	public void setTemperaturaCor(int temperaturaCor) {
		this.temperaturaCor = temperaturaCor;
	}
	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(byte garantia) {
		this.garantia = garantia;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void ligaLampada() {
		setEstado(true);
	}
	
	public void desligaLampada() {
		setEstado(false);
	}
	
	public void mostraEstado() {
		if(isEstado())
			System.out.println("A lampada esta ligada");
		else
			System.out.println("A lampada esta desligada");
	}
	
	public void mudaEstado() {
		if(isEstado())
			desligaLampada();
		else
			ligaLampada();
	}
}
