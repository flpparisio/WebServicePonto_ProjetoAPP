package br.com.integra.sistema.ponto;

import java.sql.Date;

public class Usuario {
	/* empresa, tipo colaborador, cadastro, c�digo filial, c�digo cidade, c�digo bairro
    *  c�digo escala, c�digo estado c�vil, c�digo grau instru��o, c�digo nacionalidade, n�mero carteira trabalho  */
    int numEmp, tipCol, numCad, codFil, codCid, codBai,
        codEsc, estCiv, graIns, codNac, numCtp, porIip;

    /* n�mero cpf, n�mero pis, c�digo cnpj */
    long numCpf, numPis, numCgc;

    /* nome empresa, descri��o tipo colaborador, nome colaborador, nome filial, c�digo estado, endere�o filial, c�digo cargo, descri��o cargo, c�digo local organograma,
     * endere�o filial, descri��o estado, descri��o sexo, descri��o grau instru��o, descri��o nacionalidade, estado carteira trabalho, seri� carteira trabalho/d�gito verificador 
     * nome da escala, nome do local do organograma */
    String nomEmp, lstTip, nomFun, nomFil, codEst, endNum, codCar, desCar, codLoc,
           endFil, lstCiv, tipSex, lstIns, lstNac, estCtp, serCtp, digCar, numIip,
           nomEsc, nomLoc;

    byte[] fotEmp;
    
    /* data de nascimento, data de admiss�o e data emiss�o carteira trabalho */
    Date datNas, datAdm, dexCtp;
    
    public Usuario() {}
    public Usuario(int numEmp, int tipCol, int numCad) {
    	this.numEmp = numEmp;
    	this.tipCol = tipCol;
    	this.numCad = numCad;
    }
    
    public Usuario(int numEmp, int tipCol, int numCad, int codFil, int codCid, int codBai, int codEsc, int estCiv,
			int graIns, int codNac, int numCtp, int porIip, long numCpf, long numPis, long numCgc, String nomEmp,
			String lstTip, String nomFun, String nomFil, String codEst, String endNum, String codCar, String desCar,
			String codLoc, String endFil, String lstCiv, String tipSex, String lstIns, String lstNac, String estCtp,
			String serCtp, String digCar, String numIip, byte[] fotEmp, Date datNas, Date datAdm, Date dexCtp, 
			String nomEsc, String nomLoc) {
		super();
		this.numEmp = numEmp;
		this.tipCol = tipCol;
		this.numCad = numCad;
		this.codFil = codFil;
		this.codCid = codCid;
		this.codBai = codBai;
		this.codEsc = codEsc;
		this.estCiv = estCiv;
		this.graIns = graIns;
		this.codNac = codNac;
		this.numCtp = numCtp;
		this.porIip = porIip;
		this.numCpf = numCpf;
		this.numPis = numPis;
		this.numCgc = numCgc;
		this.nomEmp = nomEmp;
		this.lstTip = lstTip;
		this.nomFun = nomFun;
		this.nomFil = nomFil;
		this.codEst = codEst;
		this.endNum = endNum;
		this.codCar = codCar;
		this.desCar = desCar;
		this.codLoc = codLoc;
		this.endFil = endFil;
		this.lstCiv = lstCiv;
		this.tipSex = tipSex;
		this.lstIns = lstIns;
		this.lstNac = lstNac;
		this.estCtp = estCtp;
		this.serCtp = serCtp;
		this.digCar = digCar;
		this.numIip = numIip;
		this.fotEmp = fotEmp;
		this.datNas = datNas;
		this.datAdm = datAdm;
		this.dexCtp = dexCtp;
		this.nomEsc = nomEsc;
		this.nomLoc = nomLoc;
	}
    
	public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }
    public void setTipCol(int tipCol) {
        this.tipCol = tipCol;
    }
    public void setNumCad(int numCad) {
        this.numCad = numCad;
    }
    public void setCodFil(int codFil) {
        this.codFil = codFil;
    }
    public void setCodCid(int codCid) {
        this.codCid = codCid;
    }
    public void setCodBai(int codBai) {
        this.codBai = codBai;
    }
    public void setCodEsc(int codEsc) {
        this.codEsc = codEsc;
    }
    public void setEstCiv(int estCiv) {
        this.estCiv = estCiv;
    }
    public void setGraIns(int graIns) {
        this.graIns = graIns;
    }
    public void setCodNac(int codNac) {
        this.codNac = codNac;
    }
    public void setNumCtp(int numCtp) {
        this.numCtp = numCtp;
    }
    public void setPorIip(int porIip) {
        this.porIip = porIip;
    }

    public void setNumCpf(long numCpf) {
        this.numCpf = numCpf;
    }
    public void setNumPis(long numPis) {
        this.numPis = numPis;
    }
    public void setNumCgc(long numCgc) {
        this.numCgc = numCgc;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }
    public void setLstTip(String lstTip) {
        this.lstTip = lstTip;
    }
    public void setNomFun(String nomFun) {
        this.nomFun = nomFun;
    }
    public void setNomFil(String nomFil) {
        this.nomFil = nomFil;
    }
    public void setCodEst(String codEst) {
        this.codEst = codEst;
    }
    public void setEndNum(String endNum) {
        this.endNum = endNum;
    }
    public void setCodCar(String codCar) {
        this.codCar = codCar;
    }
    public void setDesCar(String desCar) {
        this.desCar = desCar;
    }
    public void setCodLoc(String codLoc) {
        this.codLoc = codLoc;
    }
    public void setLstCiv(String lstCiv) {
        this.lstCiv = lstCiv;
    }
    public void setTipSex(String tipSex) {
        this.tipSex = tipSex;
    }
    public void setLstIns(String lstIns) {
        this.lstIns = lstIns;
    }
    public void setLstNac(String lstNac) {
        this.lstNac = lstNac;
    }
    public void setEstCtp(String estCtp) {
        this.estCtp = estCtp;
    }
    public void setSerCtp(String serCtp) {
        this.serCtp = serCtp;
    }
    public void setDigCar(String digCar) {
        this.digCar = digCar;
    }
    public void setNumIip(String numIip) {
        this.numIip = numIip;
    }
    public void setEndFil(String endFil) {
        this.endFil = endFil;
    }
    public void setNomEsc(String nomEsc) {
        this.nomEsc = nomEsc;
    }
    public void setNomLoc(String nomLoc) {
        this.nomLoc = nomLoc;
    }

    public void setDatNas(Date datNas) {
        this.datNas = datNas;
    }
    public void setDatAdm(Date datAdm) {
        this.datAdm = datAdm;
    }
    public void setDexCtp(Date dexCtp) {
        this.dexCtp = dexCtp;
    }
    public void setFotEmp(byte[] fotEmp) {
    	this.fotEmp = fotEmp;
    }

    public int getNumEmp() {
        return numEmp;
    }
    public int getTipCol() {
        return tipCol;
    }
    public int getNumCad() {
        return numCad;
    }
    public int getCodFil() {
        return codFil;
    }
    public int getCodCid() {
        return codCid;
    }
    public int getCodBai() {
        return codBai;
    }
    public int getCodEsc() {
        return codEsc;
    }
    public int getEstCiv() {
        return estCiv;
    }
    public int getGraIns() {
        return graIns;
    }
    public int getCodNac() {
        return codNac;
    }
    public int getNumCtp() {
        return numCtp;
    }
    public int getPorIip() {
        return porIip;
    }

    public long getNumCpf() {
        return numCpf;
    }
    public long getNumPis() {
        return numPis;
    }
    public long getNumCgc() {
        return numCgc;
    }

    public String getNomEmp() {
        return nomEmp;
    }
    public String getLstTip() {
        return lstTip;
    }
    public String getNomFun() {
        return nomFun;
    }
    public String getNomFil() {
        return nomFil;
    }
    public String getCodEst() {
        return codEst;
    }
    public String getEndNum() {
        return endNum;
    }
    public String getCodCar() {
        return codCar;
    }
    public String getDesCar() {
        return desCar;
    }
    public String getCodLoc() {
        return codLoc;
    }
    public String getLstCiv() {
        return lstCiv;
    }
    public String getTipSex() {
        return tipSex;
    }
    public String getLstIns() {
        return lstIns;
    }
    public String getLstNac() {
        return lstNac;
    }
    public String getEstCtp() {
        return estCtp;
    }
    public String getSerCtp() {
        return serCtp;
    }
    public String getDigCar() {
        return digCar;
    }
    public String getNumIip() {
        return numIip;
    }
    public String getEndFil() {
        return endFil;
    }
    public String getNomEsc() {
        return nomEsc;
    }
    public String getNomLoc() {
        return nomLoc;
    }

    public Date getDatNas() {
        return datNas;
    }
    public Date getDatAdm() {
        return datAdm;
    }
    public Date getDexCtp() {
        return dexCtp;
    }
    public byte[] getFotEmp() {
    	return fotEmp;
    }
}
