package br.com.integra.sistema.ponto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
	public Usuario buscarUsuario(long numCpf) {
		Usuario usuario = new Usuario();
		try {
			Connection conexao = Conexao.obtemConexao();
			
			String enviarApp = 
					"SELECT												"	+
					"	fun.NumEmp As NumEmp,							"	+
					"	emp.NomEmp AS NomEmp,							"	+
					"	fun.TipCol AS TipCol,							"	+
					"	CASE fun.TipCol									"	+
					"		WHEN 1 THEN 'Empregado'						"	+
					"		WHEN 2 THEN 'Terceiro'						"	+
					"		WHEN 3 THEN 'Parceiro'						"	+
					"	END AS LstTip,									"	+
					"	fun.NumCad AS NumCad,							"	+
					"	fun.NomFun AS NomFun,							"	+
					"	fil.CodFil AS CodFil,							"	+
					"	fil.NomFil AS NomFil,							"	+
					"	fil.NumCgc AS NumCgc,							"	+
					"	fil.EndFil AS EndFil,							"	+
					"	fil.CodEst AS CodEst,							"	+
					"	fil.CodCid AS CodCid,							"	+
					"	fil.CodBai AS CodBai,							"	+
					"	fil.EndNum AS EndNum,							"	+
					"	fun.DatNas AS DatNas,							"	+
					"	fun.DatAdm AS DatAdm,							"	+
					"	fun.CodCar AS CodCar,							"	+
					"	car.TitRed AS DesCar,							"	+
					"	esc.CodEsc AS CodEsc,							"	+
					"	esc.NomEsc AS NomEsc,							"	+
					"	hie.codloc AS CodLoc,							"	+
					"	orn.NomLoc AS NomLoc,							"	+
					"	fun.EstCiv AS EstCiv,							"	+
					"	CASE fun.EstCiv									"	+
					"		WHEN 1 THEN 'Solteiro'						"	+
					"		WHEN 2 THEN 'Casado'						"	+
					"		WHEN 3 THEN 'Divorciado'					"	+
					"		WHEN 4 THEN 'Viúvo'							"	+
					"		WHEN 5 THEN 'Concubinato'					"	+
					"		WHEN 6 THEN 'Seperado'						"	+
					"		WHEN 7 THEN 'União Estável'					"	+
					"		WHEN 9 THEN 'Outros'						"	+
					"	END AS LstCiv,									"	+
					"	fun.TipSex AS TipSex,							"	+
					"	fun.GraIns AS GraIns,							"	+
					"	CASE fun.GraIns									"	+
					"		WHEN 1 THEN 'Analfabeto'					"	+
					"		WHEN 2 THEN '4ª Série Incompleta'			"	+
					"		WHEN 3 THEN '4ª Séria Completa'				"	+
					"		WHEN 4 THEN '5ª a 8ª Série Incompleta'		"	+
					"		WHEN 5 THEN '1º Grau Completo'				"	+
					"		WHEN 6 THEN '2° Grau Incompleto'			"	+
					"		WHEN 7 THEN '2° Grau Completo'				"	+
					"		WHEN 8 THEN 'Superior Incompleto'			"	+
					"		WHEN 9 THEN 'Superior Completo'				"	+
					"		WHEN 10 THEN 'Pós-Graduação'				"	+
					"		WHEN 11 THEN 'Mestrado Completo'			"	+
					"		WHEN 12 THEN 'Doutorado Completo'			"	+
					"		WHEN 13 THEN 'Ph.D.'						"	+
					"		WHEN 14 THEN '2° GrauTec. Incompleto'		"	+
					"		WHEN 15 THEN '2° GrauTec. Completo'			"	+
					"		WHEN 16 THEN 'Mestrado Incompleto'			"	+
					"		WHEN 17 THEN 'Doutorado Incompleto'			"	+
					"		WHEN 18 THEN 'Pós-Graduação Incompleto'		"	+
					"	END AS LstIns,									"	+
					"	fun.CodNac AS CodNac,							"	+
					"	CASE fun.CodNac									"	+
					"		WHEN 10 THEN 'Brasileiro'					"	+
					"		WHEN 20 THEN 'Brasileiro Naturalizado'		"	+
					"		WHEN 21 THEN 'Argentino'					"	+
					"		WHEN 22 THEN 'Boliviano'					"	+
					"		WHEN 23 THEN 'Chileno'						"	+
					"		WHEN 24 THEN 'Paraguaio'					"	+
					"		WHEN 25 THEN 'Uruguaio'						"	+
					"		WHEN 30 THEN 'Alemão'						"	+
					"		WHEN 31 THEN 'Belga'						"	+
					"		WHEN 32 THEN 'Britânico'					"	+
					"		WHEN 34 THEN 'Canadense'					"	+
					"		WHEN 35 THEN 'Espanhol'						"	+
					"		WHEN 36 THEN 'Norte-Americano'				"	+
					"		WHEN 37 THEN 'Francês'						"	+
					"		WHEN 38 THEN 'Suíço'						"	+
					"		WHEN 39 THEN 'Italiano'						"	+
					"		WHEN 41 THEN 'Japonês'						"	+
					"		WHEN 42 THEN 'Chinês'						"	+
					"		WHEN 43 THEN 'Coreano'						"	+
					"		WHEN 45 THEN 'Portguês'						"	+
					"		WHEN 48 THEN 'OutrosLatino-Americanos'		"	+
					"		WHEN 49 THEN 'Outros Asiáticos'				"	+
					"		WHEN 50 THEN 'Outros'						"	+
					"	END AS LstNac, 									"	+
					"	fun.NumCtp AS NumCtp,							"	+
					"	fun.SerCtp AS SerCtp,							"	+
					"	fun.DigCar AS DigCar,							"	+
					"	fun.DexCtp AS DexCtp,							"	+
					"	fun.EstCtp AS EstCtp,							"	+
					"	CASE fun.EstCtp									"	+
					"		WHEN 'MS' THEN 'Mato Grosso do Sul'			"	+
					"		WHEN 'PB' THEN 'Paraíba'					"	+
					"		WHEN 'PE' THEN 'Pernambuco'					"	+
					"		WHEN 'AL' THEN 'Alagoas'					"	+
					"		WHEN 'MA' THEN 'Maranhão'					"	+
					"		WHEN 'CE' THEN 'Ceará'						"	+
					"		WHEN 'DF' THEN 'Distrito Federal'			"	+
					"		WHEN 'RN' THEN 'RioGrande do Norte'			"	+
					"		WHEN 'RR' THEN 'Roraima'					"	+
					"		WHEN 'RJ' THEN 'Rio de Janeiro'				"	+
					"		WHEN 'PI' THEN 'Piauí'						"	+
					"		WHEN 'PA' THEN 'Pará'						"	+
					"		WHEN 'AP' THEN 'Amapá'						"	+
					"		WHEN 'SC' THEN 'Santa Catarina'				"	+
					"		WHEN 'ES' THEN 'Espírito Santo'				"	+
					"		WHEN 'SE' THEN 'Sergipe'					"	+
					"		WHEN 'TO' THEN 'Tocantins'					"	+
					"		WHEN 'PR' THEN 'Paraná'						"	+
					"		WHEN 'RO' THEN 'Rondônia'					"	+
					"		WHEN 'AC' THEN 'Acre'						"	+
					"		WHEN 'AM' THEN 'Amazonas'					"	+
					"		WHEN 'GO' THEN 'Goiás'						"	+
					"		WHEN 'MG' THEN 'Minas Gerais'				"	+
					"		WHEN 'RS' THEN 'Rio Grande do Sul'			"	+
					"		WHEN 'BA' THEN 'Bahia'						"	+
					"		WHEN 'MT' THEN 'Mato Grosso'				"	+
					"		WHEN 'SP' THEN 'São Paulo'					"	+
					"	END AS LstCtp, 									"	+
					"	fun.NumCpf AS NumCpf,							"	+
					"	fun.NumPis AS NumPis,							"	+
					"	fot.FotEmp AS FotEmp							"	+
					"FROM												"	+
					"	R034FUN fun,									"	+
					"	R034FOT fot,									"	+
					"	R030EMP emp,									"	+
					"	R024CAR car,									"	+
					"	R006ESC esc,									"	+
					"	R016HIE hie,									"	+
					"	R016ORN orn,									"	+
					"	R030FIL fil										"	+
					"WHERE												"	+
					"	fun.NumCpf = ? AND								"	+
					"	fun.NumEmp = emp.NumEmp AND						"	+
					"	fun.EstCar = car.EstCar AND						"	+
					"	fun.CodCar = car.CodCar AND						"	+
					"	fun.CodEsc = esc.CodEsc AND						"	+
					"	fun.TabOrg = hie.TabOrg AND						"	+
					"	fun.NumLoc = hie.NumLoc AND						"	+
					"	fun.TabOrg = orn.TabOrg AND						"	+
					"	fun.NumLoc = orn.NumLoc AND						"	+
					"	fun.NumEmp = fil.NumEmp AND						"	+
					"	fun.CodFil = fil.CodFil	AND						"	+
					"	fun.NumEmp = fot.NumEmp AND						"	+
					"	fun.TipCol = fot.TipCol AND						"	+
					"	fun.NumCad = fot.NumCad							";
			
			PreparedStatement preparedStatement = conexao.prepareStatement(enviarApp);
			preparedStatement.setLong(1, numCpf);
			ResultSet resultSet = preparedStatement.executeQuery();

			if ((resultSet.next()) && (numCpf != 0)) {
				usuario.setNumEmp(resultSet.getInt("NumEmp"));
				usuario.setNomEmp(resultSet.getString("NomEmp"));
				usuario.setTipCol(resultSet.getInt("TipCol"));
				usuario.setLstTip(resultSet.getString("LstTip"));
				usuario.setNumCad(resultSet.getInt("NumCad"));
				usuario.setNomFun(resultSet.getString("NomFun"));
				usuario.setCodFil(resultSet.getInt("CodFil"));
				usuario.setNomFil(resultSet.getString("NomFil"));
				usuario.setNumCgc(resultSet.getLong("NumCgc"));
				usuario.setEndFil(resultSet.getString("EndFil"));
				usuario.setCodEst(resultSet.getString("CodEst"));
				usuario.setCodCid(resultSet.getInt("CodCid"));
				usuario.setCodBai(resultSet.getInt("CodBai"));
				usuario.setEndNum(resultSet.getString("EndNum"));
				usuario.setDatNas(resultSet.getDate("DatNas"));
				usuario.setDatAdm(resultSet.getDate("DatAdm"));
				usuario.setCodCar(resultSet.getString("CodCar"));
				usuario.setDesCar(resultSet.getString("DesCar"));
				usuario.setCodEsc(resultSet.getInt("CodEsc"));
				usuario.setNomEsc(resultSet.getString("NomEsc"));
				usuario.setCodLoc(resultSet.getString("CodLoc"));
				usuario.setNomLoc(resultSet.getString("NomLoc"));
				usuario.setEstCiv(resultSet.getInt("EstCiv"));
				usuario.setLstCiv(resultSet.getString("LstCiv"));
				usuario.setTipSex(resultSet.getString("TipSex"));
				usuario.setGraIns(resultSet.getInt("GraIns"));
				usuario.setLstIns(resultSet.getString("LstIns"));
				usuario.setCodNac(resultSet.getInt("CodNac"));
				usuario.setLstNac(resultSet.getString("LstNac"));
				usuario.setNumCtp(resultSet.getInt("NumCtp"));
				usuario.setSerCtp(resultSet.getString("SerCtp"));
				usuario.setDigCar(resultSet.getString("DigCar"));
				usuario.setDexCtp(resultSet.getDate("DexCtp"));
				usuario.setEstCtp(resultSet.getString("EstCtp"));
				usuario.setNumCpf(resultSet.getLong("NumCpf"));
				usuario.setNumPis(resultSet.getLong("NumPis"));	
				usuario.setFotEmp(resultSet.getBytes("FotEmp"));
			} else {
				return null;
			}
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}
	
	public Ponto marcarPonto(long numCpf) {
		Ponto ponto = new Ponto();
		try {
			Connection conexao = Conexao.obtemConexao();
			
			String enviarApp = 
				"INSERT INTO																								" +
				"	R070ACC (NumCra, DatAcc, HorAcc, SeqAcc, TipAcc, CodPlt, 												" +
				"	CodRlg, CodFnc, DirAcc, OriAcc, UsoMar, ExcPon)															" +
				"SELECT																										" +
				"	cra.NumCra,																								" +
				"	CAST(SYSDATETIME() AS DATE),																			" +
				"	CAST(DATEPART(\"hour\", SYSDATETIME()) * 60 as int) + CAST(DATEPART(\"minute\", SYSDATETIME()) as int),	" +
				"	CAST(DATEPART(\"second\", SYSDATETIME()) as int),														" +
				"	1, 0, 0, 0, 'E', 'E', 2, 'N'																			" +
				"FROM																										" +
				"	R034FUN fun,																							" +
				"	R038HCH cra																								" +
				"WHERE																										" +
				"	fun.NumCpf = ? AND																						" +
				"	fun.NumEmp = cra.NumEmp AND																				" +
				"	fun.TipCol = cra.TipCol AND 																			" +
				"	fun.NumCad = cra.NumCad AND																				" +
				"	cra.DatIni <= SYSDATETIME() AND (cra.DatFim >= SYSDATETIME() OR cra.DatFim = '31/12/1900')				";															
			
			PreparedStatement preparedStatement = conexao.prepareStatement(enviarApp);
			preparedStatement.setLong(1, numCpf);
			preparedStatement.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Connection conexao = Conexao.obtemConexao();
			String enviarApp = 
				"SELECT																													" +
				"	CAST(SYSDATETIME() AS DATE) AS DatMar,																				" +
				"	CAST(DATEPART(\"hour\", SYSDATETIME()) * 60 as int) + CAST(DATEPART(\"minute\", SYSDATETIME()) as int) AS HorMar, 	" +
				"	CAST(DATEPART(\"second\", SYSDATETIME()) as int) AS SeqMar, 														" +
				"   1 AS TipAcc, 0 AS CodPlt, 0 AS CodRlg, 0 AS CodFnc, 'E' AS DirAcc, 'E' AS OriAcc, 2 AS UsoMar, 'N' AS ExcPon";
			PreparedStatement preparedStatement = conexao.prepareStatement(enviarApp);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				ponto.setDatAcc(resultSet.getDate("DatMar"));	 
				ponto.setHorAcc(resultSet.getInt("HorMar"));
				ponto.setSeqAcc(resultSet.getInt("SeqMar"));
				ponto.setTipAcc(resultSet.getInt("TipAcc"));
				ponto.setCodPlt(resultSet.getInt("CodPlt"));
				ponto.setCodRlg(resultSet.getInt("CodRlg"));
				ponto.setCodFnc(resultSet.getInt("CodFnc"));
				ponto.setDirAcc(resultSet.getString("DirAcc"));
				ponto.setOriAcc(resultSet.getString("OriAcc"));
				ponto.setUsoMar(resultSet.getInt("UsoMar"));
				ponto.setExcPon(resultSet.getString("ExcPon"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ponto;
	}
	
	public boolean testarConexao(long numCpf) {
		try {
			Connection conexao = Conexao.obtemConexao();
			
			String enviarApp = 
				"SELECT																								" +
				"	fun.NumEmp AS NumEmp	" +
				"FROM						" +
				"	R034FUN fun				" +
				"WHERE						" +
				"	fun.NumCpf = ? 			";															
			
			PreparedStatement preparedStatement = conexao.prepareStatement(enviarApp);
			preparedStatement.setLong(1, numCpf);
			ResultSet resultSet = preparedStatement.executeQuery();

			if ((resultSet.next()) && (numCpf != 0)) {
				return true;
			}
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/*
	public int inserirUsuario(Usuario usuario) {
		try {
			Connection conn = Conexao.obtemConexao();
			String sqlSelect = "INSERT INTO usuario VALUES (null, ?, ?,?)";
			PreparedStatement stmt = null;

			stmt = conn.prepareStatement(sqlSelect,	Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, usuario.getNome());
			stmt.setInt(2, usuario.getIdade());
			stmt.setBytes(3, usuario.getFoto());

			int affectedRows = stmt.executeUpdate();
			
			if (affectedRows == 0) {
				return -1;
			}

			try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
				if (generatedKeys.next()) {
					return (int) generatedKeys.getLong(1);
				} else {
					return -1;
				}
			} catch (Exception e) {
				e.printStackTrace();
				return -1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}

	}

	public Usuario buscaUsuarioPorId(int id) {

		Usuario usuario = new Usuario();
		try {
			Connection conn = Conexao.obtemConexao();
			String sqlSelect = "SELECT * FROM usuario WHERE id = ?";
			PreparedStatement stmt = conn.prepareStatement(sqlSelect);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				usuario.setId(rs.getInt(1));
				usuario.setNome(rs.getString(2));
				usuario.setIdade(rs.getInt(3));
				usuario.setFoto(rs.getBytes(4));
			} else {
				return null;
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return usuario;
	}
	
	
	public ArrayList<Usuario> buscarTodosUsuarios(){
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		try {
			Connection conn = Conexao.obtemConexao();
			String queryInserir = "SELECT * FROM usuario";
			
			PreparedStatement ppStm = conn.prepareStatement(queryInserir);

			ResultSet rSet = ppStm.executeQuery();
			
			while(rSet.next()){
				Usuario usr = new Usuario();
				
				usr.setId(rSet.getInt(1));
				usr.setNome(rSet.getString(2));
				usr.setIdade(rSet.getInt(3));
				usr.setFoto(rSet.getBytes(4));
				lista.add(usr);
				
			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}
	
	public boolean excluirUsuario(int id){
		try {
			Connection conn = Conexao.obtemConexao();
			String queryInserir = "DELETE FROM usuario WHERE id = ?";
			
			PreparedStatement ppStm = conn.prepareStatement(queryInserir);
			ppStm.setInt(1, id);
			
			ppStm.executeUpdate();
		
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	*/
}
