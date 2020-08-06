package br.com.integra.sistema.ponto;

import java.sql.Date;

public class Ponto {
	/* empresa, tipo colaborador, cadastro, hora marca��o, sequencia marca��o,
	   tipo de acesso, c�digo planta, c�digo do rel�gio, fun��o rel�gio, uso marca��o  */
	int numEmp, tipCol, numCad, horAcc, seqAcc, tipAcc, codPlt, codRlg,
		codFnc, usoMar;
	   
	/* n�mero cpf */
	long numCpf;
	
	/* data marca��o */
	Date datAcc;
	
	/* dire��o marca��o, origem marca��o, excluido do ponto? */
	String dirAcc, oriAcc, excPon;

	public Ponto() {}
	
	public Ponto(int numEmp, int tipCol, int numCad, int horAcc, int seqAcc, int tipAcc, int codPlt, int codRlg,
			int usoMar, int codFnc, long numCpf, Date datAcc, String dirAcc, String oriAcc, String excPon) {
		super();
		this.numEmp = numEmp;
		this.tipCol = tipCol;
		this.numCad = numCad;
		this.horAcc = horAcc;
		this.seqAcc = seqAcc;
		this.tipAcc = tipAcc;
		this.codPlt = codPlt;
		this.codRlg = codRlg;
		this.usoMar = usoMar;
		this.codFnc = codFnc;
		this.numCpf = numCpf;
		this.datAcc = datAcc;
		this.dirAcc = dirAcc;
		this.oriAcc = oriAcc;
		this.excPon = excPon;
	}

	public int getNumEmp() {
		return numEmp;
	}

	public void setNumEmp(int numEmp) {
		this.numEmp = numEmp;
	}

	public int getTipCol() {
		return tipCol;
	}

	public void setTipCol(int tipCol) {
		this.tipCol = tipCol;
	}

	public int getNumCad() {
		return numCad;
	}

	public void setNumCad(int numCad) {
		this.numCad = numCad;
	}

	public int getHorAcc() {
		return horAcc;
	}

	public void setHorAcc(int horAcc) {
		this.horAcc = horAcc;
	}

	public int getSeqAcc() {
		return seqAcc;
	}

	public void setSeqAcc(int seqAcc) {
		this.seqAcc = seqAcc;
	}

	public int getTipAcc() {
		return tipAcc;
	}

	public void setTipAcc(int tipAcc) {
		this.tipAcc = tipAcc;
	}

	public int getCodPlt() {
		return codPlt;
	}

	public void setCodPlt(int codPlt) {
		this.codPlt = codPlt;
	}

	public int getCodRlg() {
		return codRlg;
	}

	public void setCodRlg(int codRlg) {
		this.codRlg = codRlg;
	}

	public int getUsoMar() {
		return usoMar;
	}

	public void setUsoMar(int usoMar) {
		this.usoMar = usoMar;
	}

	public long getNumCpf() {
		return numCpf;
	}

	public void setNumCpf(long numCpf) {
		this.numCpf = numCpf;
	}

	public Date getDatAcc() {
		return datAcc;
	}

	public void setDatAcc(Date datAcc) {
		this.datAcc = datAcc;
	}

	public String getDirAcc() {
		return dirAcc;
	}

	public void setDirAcc(String dirAcc) {
		this.dirAcc = dirAcc;
	}

	public String getOriAcc() {
		return oriAcc;
	}

	public void setOriAcc(String oriAcc) {
		this.oriAcc = oriAcc;
	}
	
	public int getCodFnc() {
		return codFnc;
	}
	public void setCodFnc(int codFnc) {
		this.codFnc = codFnc;
	}
	

	public String getExcPon() {
		return excPon;
	}

	public void setExcPon(String excPon) {
		this.excPon = excPon;
	}
	
	
}
