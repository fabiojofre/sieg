package util;
import servico.EnviaXML;

public class testaClasse {
 
 	public static void main(String[] args){
// 		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeProc xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"4.00\"><NFe xmlns=\"http://www.portalfiscal.inf.br/nfe\"><infNFe Id=\"NFe43200611325621000161550010000751661178496880\" versao=\"4.00\"><ide><cUF>43</cUF><cNF>17849688</cNF><natOp>VENDA DE PRODUCAO COM REGIME DE ST</natOp><mod>55</mod><serie>1</serie><nNF>75166</nNF><dhEmi>2020-06-01T07:24:47-03:00</dhEmi><dhSaiEnt>2020-06-01T07:24:47-03:00</dhSaiEnt><tpNF>1</tpNF><idDest>1</idDest><cMunFG>4314902</cMunFG><tpImp>1</tpImp><tpEmis>1</tpEmis><cDV>0</cDV><tpAmb>1</tpAmb><finNFe>1</finNFe><indFinal>0</indFinal><indPres>0</indPres><procEmi>0</procEmi><verProc>WMC Software - NFE</verProc></ide><emit><CNPJ>11325621000161</CNPJ><xNome>MAJU INDUSTRIA DE PANIFICACAO LTDA</xNome><xFant>MAJU INDUSTRIA DE PANIFICACAO LTDA</xFant><enderEmit><xLgr>AV. FERNANDO FERRARI</xLgr><nro>1001</nro><xBairro>ANCHIETA</xBairro><cMun>4314902</cMun><xMun>Porto Alegre</xMun><UF>RS</UF><CEP>90200041</CEP><cPais>1058</cPais><xPais>BRASIL</xPais><fone>5131083848</fone></enderEmit><IE>0963589873</IE><CRT>3</CRT></emit><dest><CNPJ>08865810000112</CNPJ><xNome>VERA M DA SILVA REINHEIMER &amp; CIA LTDA</xNome><enderDest><xLgr>RUA EUGENIO BERGER</xLgr><nro>470</nro><xBairro>SCHARLAU</xBairro><cMun>4318705</cMun><xMun>Sao Leopoldo</xMun><UF>RS</UF><CEP>93125480</CEP><cPais>1058</cPais><xPais>BRASIL</xPais></enderDest><indIEDest>1</indIEDest><IE>1240244859</IE><email>mercadoreinheimer@gmail.com</email></dest><det nItem=\"1\"><prod><cProd>00001</cProd><cEAN/><xProd>PAO DE FORMA 450g</xProd><NCM>19059010</NCM><CFOP>5401</CFOP><uCom>PCT</uCom><qCom>60.0000</qCom><vUnCom>2.8700000000</vUnCom><vProd>172.20</vProd><cEANTrib/><uTrib>PCT</uTrib><qTrib>60.0000</qTrib><vUnTrib>2.8700000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>27.90</vTotTrib><ICMS><ICMS70><orig>0</orig><CST>70</CST><modBC>3</modBC><pRedBC>41.6700</pRedBC><vBC>100.45</vBC><pICMS>12.0000</pICMS><vICMS>12.05</vICMS><modBCST>4</modBCST><pMVAST>35.8600</pMVAST><pRedBCST>41.6700</pRedBCST><vBCST>136.46</vBCST><pICMSST>12.0000</pICMSST><vICMSST>4.32</vICMSST></ICMS70></ICMS><IPI><cEnq>999</cEnq><IPINT><CST>51</CST></IPINT></IPI><PIS><PISAliq><CST>01</CST><vBC>172.20</vBC><pPIS>1.6500</pPIS><vPIS>2.84</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>172.20</vBC><pCOFINS>7.6000</pCOFINS><vCOFINS>13.09</vCOFINS></COFINSAliq></COFINS></imposto></det><det nItem=\"2\"><prod><cProd>00006</cProd><cEAN/><xProd>PAO SOVADO 700g</xProd><NCM>19059090</NCM><CEST>1706200</CEST><CFOP>5401</CFOP><uCom>PCT</uCom><qCom>4.0000</qCom><vUnCom>3.5800000000</vUnCom><vProd>14.32</vProd><cEANTrib/><uTrib>PCT</uTrib><qTrib>4.0000</qTrib><vUnTrib>3.5800000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>2.32</vTotTrib><ICMS><ICMS70><orig>0</orig><CST>70</CST><modBC>3</modBC><pRedBC>41.6700</pRedBC><vBC>8.35</vBC><pICMS>12.0000</pICMS><vICMS>1.00</vICMS><modBCST>4</modBCST><pMVAST>40.7900</pMVAST><pRedBCST>41.6700</pRedBCST><vBCST>11.76</vBCST><pICMSST>12.0000</pICMSST><vICMSST>0.41</vICMSST></ICMS70></ICMS><IPI><cEnq>999</cEnq><IPINT><CST>51</CST></IPINT></IPI><PIS><PISAliq><CST>01</CST><vBC>14.32</vBC><pPIS>1.6500</pPIS><vPIS>0.24</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>14.32</vBC><pCOFINS>7.6000</pCOFINS><vCOFINS>1.09</vCOFINS></COFINSAliq></COFINS></imposto></det><det nItem=\"3\"><prod><cProd>00007</cProd><cEAN/><xProd>PAO DE CENTEIO 400g</xProd><NCM>19059010</NCM><CFOP>5401</CFOP><uCom>PCT</uCom><qCom>3.0000</qCom><vUnCom>3.7500000000</vUnCom><vProd>11.25</vProd><cEANTrib/><uTrib>PCT</uTrib><qTrib>3.0000</qTrib><vUnTrib>3.7500000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>1.82</vTotTrib><ICMS><ICMS70><orig>0</orig><CST>70</CST><modBC>3</modBC><pRedBC>41.6700</pRedBC><vBC>6.56</vBC><pICMS>12.0000</pICMS><vICMS>0.79</vICMS><modBCST>4</modBCST><pMVAST>35.8600</pMVAST><pRedBCST>41.6700</pRedBCST><vBCST>8.92</vBCST><pICMSST>12.0000</pICMSST><vICMSST>0.28</vICMSST></ICMS70></ICMS><IPI><cEnq>999</cEnq><IPINT><CST>51</CST></IPINT></IPI><PIS><PISAliq><CST>01</CST><vBC>11.25</vBC><pPIS>1.6500</pPIS><vPIS>0.19</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>11.25</vBC><pCOFINS>7.6000</pCOFINS><vCOFINS>0.85</vCOFINS></COFINSAliq></COFINS></imposto></det><det nItem=\"4\"><prod><cProd>00009</cProd><cEAN/><xProd>PAO PRETO 400g</xProd><NCM>19059010</NCM><CFOP>5401</CFOP><uCom>PCT</uCom><qCom>3.0000</qCom><vUnCom>3.7500000000</vUnCom><vProd>11.25</vProd><cEANTrib/><uTrib>PCT</uTrib><qTrib>3.0000</qTrib><vUnTrib>3.7500000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>1.82</vTotTrib><ICMS><ICMS70><orig>0</orig><CST>70</CST><modBC>3</modBC><pRedBC>41.6700</pRedBC><vBC>6.56</vBC><pICMS>12.0000</pICMS><vICMS>0.79</vICMS><modBCST>4</modBCST><pMVAST>35.8600</pMVAST><pRedBCST>41.6700</pRedBCST><vBCST>8.92</vBCST><pICMSST>12.0000</pICMSST><vICMSST>0.28</vICMSST></ICMS70></ICMS><IPI><cEnq>999</cEnq><IPINT><CST>51</CST></IPINT></IPI><PIS><PISAliq><CST>01</CST><vBC>11.25</vBC><pPIS>1.6500</pPIS><vPIS>0.19</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>11.25</vBC><pCOFINS>7.6000</pCOFINS><vCOFINS>0.85</vCOFINS></COFINSAliq></COFINS></imposto></det><det nItem=\"5\"><prod><cProd>00010</cProd><cEAN/><xProd>MULTI GRAOS 400g</xProd><NCM>19059010</NCM><CFOP>5401</CFOP><uCom>PCT</uCom><qCom>3.0000</qCom><vUnCom>3.7500000000</vUnCom><vProd>11.25</vProd><cEANTrib/><uTrib>PCT</uTrib><qTrib>3.0000</qTrib><vUnTrib>3.7500000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>1.82</vTotTrib><ICMS><ICMS70><orig>0</orig><CST>70</CST><modBC>3</modBC><pRedBC>41.6700</pRedBC><vBC>6.56</vBC><pICMS>12.0000</pICMS><vICMS>0.79</vICMS><modBCST>4</modBCST><pMVAST>35.8600</pMVAST><pRedBCST>41.6700</pRedBCST><vBCST>8.92</vBCST><pICMSST>12.0000</pICMSST><vICMSST>0.28</vICMSST></ICMS70></ICMS><IPI><cEnq>999</cEnq><IPINT><CST>51</CST></IPINT></IPI><PIS><PISAliq><CST>01</CST><vBC>11.25</vBC><pPIS>1.6500</pPIS><vPIS>0.19</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>11.25</vBC><pCOFINS>7.6000</pCOFINS><vCOFINS>0.85</vCOFINS></COFINSAliq></COFINS></imposto></det><det nItem=\"6\"><prod><cProd>00023</cProd><cEAN/><xProd>PAO CHIA 400g</xProd><NCM>19059010</NCM><CFOP>5401</CFOP><uCom>PCT</uCom><qCom>2.0000</qCom><vUnCom>3.7500000000</vUnCom><vProd>7.50</vProd><cEANTrib/><uTrib>PCT</uTrib><qTrib>2.0000</qTrib><vUnTrib>3.7500000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>1.22</vTotTrib><ICMS><ICMS70><orig>0</orig><CST>70</CST><modBC>3</modBC><pRedBC>41.6700</pRedBC><vBC>4.38</vBC><pICMS>12.0000</pICMS><vICMS>0.53</vICMS><modBCST>4</modBCST><pMVAST>35.8600</pMVAST><pRedBCST>41.6700</pRedBCST><vBCST>5.94</vBCST><pICMSST>12.0000</pICMSST><vICMSST>0.19</vICMSST></ICMS70></ICMS><IPI><cEnq>999</cEnq><IPINT><CST>51</CST></IPINT></IPI><PIS><PISAliq><CST>01</CST><vBC>7.50</vBC><pPIS>1.6500</pPIS><vPIS>0.12</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>7.50</vBC><pCOFINS>7.6000</pCOFINS><vCOFINS>0.57</vCOFINS></COFINSAliq></COFINS></imposto></det><det nItem=\"7\"><prod><cProd>00011</cProd><cEAN/><xProd>PAO DE UVA PASSAS 400g</xProd><NCM>19059010</NCM><CFOP>5401</CFOP><uCom>PCT</uCom><qCom>2.0000</qCom><vUnCom>3.7500000000</vUnCom><vProd>7.50</vProd><cEANTrib/><uTrib>PCT</uTrib><qTrib>2.0000</qTrib><vUnTrib>3.7500000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>1.22</vTotTrib><ICMS><ICMS70><orig>0</orig><CST>70</CST><modBC>3</modBC><pRedBC>41.6700</pRedBC><vBC>4.38</vBC><pICMS>12.0000</pICMS><vICMS>0.53</vICMS><modBCST>4</modBCST><pMVAST>35.8600</pMVAST><pRedBCST>41.6700</pRedBCST><vBCST>5.94</vBCST><pICMSST>12.0000</pICMSST><vICMSST>0.19</vICMSST></ICMS70></ICMS><IPI><cEnq>999</cEnq><IPINT><CST>51</CST></IPINT></IPI><PIS><PISAliq><CST>01</CST><vBC>7.50</vBC><pPIS>1.6500</pPIS><vPIS>0.12</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>7.50</vBC><pCOFINS>7.6000</pCOFINS><vCOFINS>0.57</vCOFINS></COFINSAliq></COFINS></imposto></det><det nItem=\"8\"><prod><cProd>26</cProd><cEAN/><xProd>PAO DE FORMA INTEGRAL 450g</xProd><NCM>19059010</NCM><CFOP>5401</CFOP><uCom>PCT</uCom><qCom>24.0000</qCom><vUnCom>3.9200000000</vUnCom><vProd>94.08</vProd><cEANTrib/><uTrib>PCT</uTrib><qTrib>24.0000</qTrib><vUnTrib>3.9200000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>15.24</vTotTrib><ICMS><ICMS70><orig>0</orig><CST>70</CST><modBC>3</modBC><pRedBC>41.6700</pRedBC><vBC>54.88</vBC><pICMS>12.0000</pICMS><vICMS>6.59</vICMS><modBCST>4</modBCST><pMVAST>35.8600</pMVAST><pRedBCST>41.6700</pRedBCST><vBCST>74.56</vBCST><pICMSST>12.0000</pICMSST><vICMSST>2.36</vICMSST></ICMS70></ICMS><IPI><cEnq>999</cEnq><IPINT><CST>51</CST></IPINT></IPI><PIS><PISAliq><CST>01</CST><vBC>94.08</vBC><pPIS>1.6500</pPIS><vPIS>1.55</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>94.08</vBC><pCOFINS>7.6000</pCOFINS><vCOFINS>7.15</vCOFINS></COFINSAliq></COFINS></imposto></det><det nItem=\"9\"><prod><cProd>00022</cProd><cEAN/><xProd>DOGUINHO 500g</xProd><NCM>19059090</NCM><CEST>1706200</CEST><CFOP>5401</CFOP><uCom>PCT</uCom><qCom>6.0000</qCom><vUnCom>2.8000000000</vUnCom><vProd>16.80</vProd><cEANTrib/><uTrib>PCT</uTrib><qTrib>6.0000</qTrib><vUnTrib>2.8000000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>2.72</vTotTrib><ICMS><ICMS70><orig>0</orig><CST>70</CST><modBC>3</modBC><pRedBC>41.6700</pRedBC><vBC>9.80</vBC><pICMS>12.0000</pICMS><vICMS>1.18</vICMS><modBCST>4</modBCST><pMVAST>40.7900</pMVAST><pRedBCST>41.6700</pRedBCST><vBCST>13.80</vBCST><pICMSST>12.0000</pICMSST><vICMSST>0.48</vICMSST></ICMS70></ICMS><IPI><cEnq>999</cEnq><IPINT><CST>51</CST></IPINT></IPI><PIS><PISAliq><CST>01</CST><vBC>16.80</vBC><pPIS>1.6500</pPIS><vPIS>0.28</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>16.80</vBC><pCOFINS>7.6000</pCOFINS><vCOFINS>1.28</vCOFINS></COFINSAliq></COFINS></imposto></det><det nItem=\"10\"><prod><cProd>00005</cProd><cEAN/><xProd>PAO DE HAMBURGUER 300g</xProd><NCM>19059090</NCM><CEST>1706200</CEST><CFOP>5405</CFOP><uCom>PCT</uCom><qCom>6.0000</qCom><vUnCom>2.9500000000</vUnCom><vProd>17.70</vProd><cEANTrib/><uTrib>PCT</uTrib><qTrib>6.0000</qTrib><vUnTrib>2.9500000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>2.87</vTotTrib><ICMS><ICMS60><orig>0</orig><CST>60</CST><vBCSTRet>9.71</vBCSTRet><pST>12.0000</pST><vICMSSubstituto>0.83</vICMSSubstituto><vICMSSTRet>0.34</vICMSSTRet></ICMS60></ICMS><IPI><cEnq>999</cEnq><IPINT><CST>51</CST></IPINT></IPI><PIS><PISAliq><CST>01</CST><vBC>17.70</vBC><pPIS>1.6500</pPIS><vPIS>0.29</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>17.70</vBC><pCOFINS>7.6000</pCOFINS><vCOFINS>1.35</vCOFINS></COFINSAliq></COFINS></imposto><infAdProd>BC ICMS-ST Retido:9,71 Valor ICMS-ST Retido:0,34 Valor ICMS Substituto:0,83</infAdProd></det><det nItem=\"11\"><prod><cProd>12</cProd><cEAN/><xProd>BOLO DE LARANJA CECILIA REDONDO 280g</xProd><NCM>19059090</NCM><CEST>1706200</CEST><CFOP>5405</CFOP><uCom>PCT</uCom><qCom>2.0000</qCom><vUnCom>4.0000000000</vUnCom><vProd>8.00</vProd><cEANTrib/><uTrib>PCT</uTrib><qTrib>2.0000</qTrib><vUnTrib>4.0000000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>1.30</vTotTrib><ICMS><ICMS60><orig>0</orig><CST>60</CST><vBCSTRet>6.31</vBCSTRet><pST>12.0000</pST><vICMSSubstituto>0.54</vICMSSubstituto><vICMSSTRet>0.22</vICMSSTRet></ICMS60></ICMS><IPI><cEnq>999</cEnq><IPINT><CST>51</CST></IPINT></IPI><PIS><PISAliq><CST>01</CST><vBC>8.00</vBC><pPIS>1.6500</pPIS><vPIS>0.13</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>8.00</vBC><pCOFINS>7.6000</pCOFINS><vCOFINS>0.61</vCOFINS></COFINSAliq></COFINS></imposto><infAdProd>BC ICMS-ST Retido:6,31 Valor ICMS-ST Retido:0,22 Valor ICMS Substituto:0,54</infAdProd></det><det nItem=\"12\"><prod><cProd>13</cProd><cEAN/><xProd>BOLO DE LARANJA CECILIA C/4 280g</xProd><NCM>19059090</NCM><CEST>1706200</CEST><CFOP>5405</CFOP><uCom>PCT</uCom><qCom>2.0000</qCom><vUnCom>4.0000000000</vUnCom><vProd>8.00</vProd><cEANTrib/><uTrib>PCT</uTrib><qTrib>2.0000</qTrib><vUnTrib>4.0000000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>1.30</vTotTrib><ICMS><ICMS60><orig>0</orig><CST>60</CST><vBCSTRet>6.31</vBCSTRet><pST>12.0000</pST><vICMSSubstituto>0.54</vICMSSubstituto><vICMSSTRet>0.22</vICMSSTRet></ICMS60></ICMS><IPI><cEnq>999</cEnq><IPINT><CST>51</CST></IPINT></IPI><PIS><PISAliq><CST>01</CST><vBC>8.00</vBC><pPIS>1.6500</pPIS><vPIS>0.13</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>8.00</vBC><pCOFINS>7.6000</pCOFINS><vCOFINS>0.61</vCOFINS></COFINSAliq></COFINS></imposto><infAdProd>BC ICMS-ST Retido:6,31 Valor ICMS-ST Retido:0,22 Valor ICMS Substituto:0,54</infAdProd></det><det nItem=\"13\"><prod><cProd>17</cProd><cEAN/><xProd>PAO DE XIS COM 500g</xProd><NCM>19059090</NCM><CEST>1706200</CEST><CFOP>5405</CFOP><uCom>PCT</uCom><qCom>10.0000</qCom><vUnCom>3.2000000000</vUnCom><vProd>32.00</vProd><cEANTrib/><uTrib>PCT</uTrib><qTrib>10.0000</qTrib><vUnTrib>3.2000000000</vUnTrib><indTot>1</indTot></prod><imposto><vTotTrib>5.18</vTotTrib><ICMS><ICMS60><orig>0</orig><CST>60</CST><vBCSTRet>16.84</vBCSTRet><pST>12.0000</pST><vICMSSubstituto>1.44</vICMSSubstituto><vICMSSTRet>0.58</vICMSSTRet></ICMS60></ICMS><IPI><cEnq>999</cEnq><IPINT><CST>51</CST></IPINT></IPI><PIS><PISAliq><CST>01</CST><vBC>32.00</vBC><pPIS>1.6500</pPIS><vPIS>0.53</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>32.00</vBC><pCOFINS>7.6000</pCOFINS><vCOFINS>2.43</vCOFINS></COFINSAliq></COFINS></imposto><infAdProd>BC ICMS-ST Retido:16,84 Valor ICMS-ST Retido:0,58 Valor ICMS Substituto:1,44</infAdProd></det><total><ICMSTot><vBC>201.92</vBC><vICMS>24.25</vICMS><vICMSDeson>0.00</vICMSDeson><vFCP>0.00</vFCP><vBCST>275.22</vBCST><vST>8.79</vST><vFCPST>0.00</vFCPST><vFCPSTRet>0.00</vFCPSTRet><vProd>411.85</vProd><vFrete>0.00</vFrete><vSeg>0.00</vSeg><vDesc>0.00</vDesc><vII>0.00</vII><vIPI>0.00</vIPI><vIPIDevol>0.00</vIPIDevol><vPIS>6.80</vPIS><vCOFINS>31.30</vCOFINS><vOutro>0.00</vOutro><vNF>420.64</vNF><vTotTrib>66.73</vTotTrib></ICMSTot></total><transp><modFrete>0</modFrete><transporta><CNPJ>28627807000178</CNPJ><xNome>TATIANE MATOS SANTOS EIRELI</xNome><IE>1770223646</IE><xEnder>RUA ITAPETININGA, 154 CASA: 01;, CENTRO</xEnder><xMun>Cachoeirinha</xMun><UF>RS</UF></transporta><veicTransp><placa>IQL0F13</placa><UF>RS</UF><RNTC>05704255</RNTC></veicTransp><vol><qVol>127</qVol><nVol>0</nVol><pesoL>1920.000</pesoL><pesoB>46.560</pesoB></vol></transp><cobr><fat><nFat>075166</nFat><vOrig>420.64</vOrig><vDesc>0.00</vDesc><vLiq>420.64</vLiq></fat><dup><nDup>001</nDup><dVenc>2020-06-22</dVenc><vDup>420.64</vDup></dup></cobr><pag><detPag><tPag>15</tPag><vPag>420.64</vPag></detPag></pag><infAdic><infAdFisco>BASE DE CALCULO DE ICMS REDUZIDA CONFORME LIVRO I, ART. XXIII, INCISO II ALINEA B DO R. ICMS/RSCliente Fantasia: 401 - Trib aprox R$: 17,30 Federal e 49,42 Estadual Fonte: IBPT</infAdFisco><infCpl>Nro Pedido: 111916</infCpl></infAdic></infNFe><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"#NFe43200611325621000161550010000751661178496880\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>zBpsekWlr/0SWVWoU5/TNA7A7lI=</DigestValue></Reference></SignedInfo><SignatureValue>U/ryb8Jp51NvRPjf2f0cxDQ6Bi8JDKJV/rnDkHFnZ+1EiFEQPYoZr9LibuRdgUfiWx5HjiM/ZPdWu6xYYAhapeE9vYbkKpSHNegR62TrV7pp2bCdh9YwpinWPyW8f9IH8n6UvAe1/w+SQD+C/Ha89xKkyhTrL9sAabHScjkS3LmzWXR6dzfgtFC8BUad+RYrrWANGRnzfLnNGClnT3zN9i1j1qyu8RGr20frvRn+6HWSoBvwq2Wp2EvoqKMxvMSEHDbo0MxhUfgD46LP8xIN3QlQJxFhy+KArZFo0ZS8eC2qlw8cWtCCL9fKrMEOeTFhCwAV+IWUp+qyhs9PWbbYrw==</SignatureValue><KeyInfo><X509Data><X509Certificate>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</X509Certificate></X509Data></KeyInfo></Signature></NFe><protNFe versao=\"4.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><infProt><tpAmb>1</tpAmb><verAplic>RS202005210727</verAplic><chNFe>43200611325621000161550010000751661178496880</chNFe><dhRecbto>2020-06-01T07:24:59-03:00</dhRecbto><nProt>143200093473617</nProt><digVal>zBpsekWlr/0SWVWoU5/TNA7A7lI=</digVal><cStat>100</cStat><xMotivo>Autorizado o uso da NF-e</xMotivo></infProt></protNFe></nfeProc>";
// 		Servico s = new Servico();
//		System.out.println(s.enviaXML("29CTJBq3LTzI0FISrcy7yw%3d%3d", "fabio.jorge@vrrecife.com.br", xml));
		
		EnviaXML en = new EnviaXML();
//		en.enviaNotaSaida();
		en.enviaNotaEntrada();
//		en.enviaCupom();
		
		
	}
	
	
}