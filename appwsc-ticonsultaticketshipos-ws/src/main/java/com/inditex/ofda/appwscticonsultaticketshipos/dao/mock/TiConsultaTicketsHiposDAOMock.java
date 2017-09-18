package com.inditex.ofda.appwscticonsultaticketshipos.dao.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.inditex.ofda.appwscticonsultaticketshipos.dao.TiConsultaTicketsHiposDAO;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposBatchRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.ConsultaTicketsHiposOnlineRequest;
import com.inditex.ofda.appwscticonsultaticketshipos.model.dto.TicketHipos;

/**
 * The Class TiConsultaTicketsHiposDAOMock.
 */
public class TiConsultaTicketsHiposDAOMock implements TiConsultaTicketsHiposDAO {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(TiConsultaTicketsHiposDAOMock.class);

	/**
	 * Instantiates a new ti consulta tickets hipos dao mock.
	 */
	public TiConsultaTicketsHiposDAOMock() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
    public void tiConsultaTicketsHiposBatch(final ConsultaTicketsHiposBatchRequest request)
			throws Exception{
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public TicketHipos tiConsultaTicketsHiposOnline(final ConsultaTicketsHiposOnlineRequest request)
			throws Exception{
		String contenidoTicketHipos = fillContentTicket();
		TicketHipos ticketHipos = new TicketHipos(contenidoTicketHipos);
		
		return ticketHipos;
	}
	
	/**
	 * Fill content ticket.
	 *
	 * @return the string
	 */
	private String fillContentTicket(){
		String contentTicket = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?><Transaction xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><Metadata><PosSystem>HiPOS</PosSystem><Date>2017-07-19T11:20:19.001+02:00</Date><Version>1</Version><VersionSW>dnk.1.12</VersionSW><Store>3366</Store><IdWorkstation>1</IdWorkstation><PosName>P41NGBG6</PosName><CodCountry>208</CodCountry><TransactionCode>10</TransactionCode></Metadata><Data><Document><SessionDate>2017-07-19</SessionDate><IdDocument>336601000000026</IdDocument><Uid>62217f3bbbd5447881e3b6e1040d9411</Uid><IdStore>3366</IdStore><IdWorkstation>1</IdWorkstation><CreationDate>2017-07-19T11:18:38.336+02:00</CreationDate><Date>2017-07-19T11:20:18.954+02:00</Date><OperationNumber>473714</OperationNumber><IdDocumentType>208001</IdDocumentType><IdOperator>2266</IdOperator><IdShiftSession>336601000000002</IdShiftSession><FromMediaCorrection>0</FromMediaCorrection><ListDocumentCounter><DocumentCounter><IdCounter>208001</IdCounter><Value>117091</Value><Serial>S</Serial></DocumentCounter></ListDocumentCounter><ListDocumentLine><DocumentLine><LineNumber>1</LineNumber><Date>2017-07-19T11:18:38.351+02:00</Date><Quantity>1</Quantity><UnitGross>169.00</UnitGross><TotalGross>169.00</TotalGross><IdLineType>1</IdLineType><UnitInputPrice>169.00</UnitInputPrice><UnitOriginalPrice>169.00</UnitOriginalPrice><UnitMasterPrice>169.00</UnitMasterPrice><IsUnknownCode>0</IsUnknownCode><TypedCode>0857466080904</TypedCode><Code>0857466080904</Code><MasterCode>0857466000000</MasterCode><Device>4</Device><IdProductType>0</IdProductType><Model>8574</Model><Quality>660</Quality><Color>809</Color><Size>4</Size><IdCampaign>2</IdCampaign><CampaignYear>2016</CampaignYear><FamilyCode>1</FamilyCode><FamilyCenter>D</FamilyCenter><SubFamilyCode>803</SubFamilyCode><SubFamilyCenter>D</SubFamilyCenter><IdPeriod>1</IdPeriod><IdDepartment>3</IdDepartment><IdDistributionMode>2</IdDistributionMode><SortingNumber>0</SortingNumber><ControlCode>10001852</ControlCode><GreenPoint>0.00</GreenPoint><ListLineUnitData><LineUnitData><RfidTag>0130857466080904000000477250320083863d27b07445c1c7243107ea20400</RfidTag></LineUnitData></ListLineUnitData><ListLineTax><LineTax><TaxRate>25.00</TaxRate><UnitNet>135.20</UnitNet><TotalNet>135.20</TotalNet><UnitTax>33.80</UnitTax><TotalTax>33.80</TotalTax><UnitNoTaxableAmount>0.00</UnitNoTaxableAmount><TotalNoTaxableAmount>0.00</TotalNoTaxableAmount><IncludedTax>1</IncludedTax><IdTaxAuthority>208001</IdTaxAuthority><IdTaxGroup>208001</IdTaxGroup><IdTaxRule>1</IdTaxRule></LineTax></ListLineTax><Sign>1</Sign><SignVoid>1</SignVoid></DocumentLine><DocumentLine><LineNumber>2</LineNumber><Date>2017-07-19T11:18:51.174+02:00</Date><Quantity>1</Quantity><UnitGross>119.00</UnitGross><TotalGross>119.00</TotalGross><IdLineType>1</IdLineType><UnitInputPrice>119.00</UnitInputPrice><UnitOriginalPrice>119.00</UnitOriginalPrice><UnitMasterPrice>119.00</UnitMasterPrice><IsUnknownCode>0</IsUnknownCode><TypedCode>0505260060006</TypedCode><Code>0505260060006</Code><MasterCode>0505260000000</MasterCode><Device>4</Device><IdProductType>0</IdProductType><Model>5052</Model><Quality>600</Quality><Color>600</Color><Size>6</Size><IdCampaign>2</IdCampaign><CampaignYear>2016</CampaignYear><FamilyCode>52</FamilyCode><FamilyCenter>D</FamilyCenter><SubFamilyCode>720</SubFamilyCode><SubFamilyCenter>D</SubFamilyCenter><IdPeriod>1</IdPeriod><IdDepartment>3</IdDepartment><IdDistributionMode>1</IdDistributionMode><SortingNumber>0</SortingNumber><ControlCode>10002882</ControlCode><GreenPoint>0.00</GreenPoint><ListLineUnitData><LineUnitData><RfidTag>013050526006000600000077226580708383ad1ec56b34f2e07d74f8b600400</RfidTag></LineUnitData></ListLineUnitData><ListLineTax><LineTax><TaxRate>25.00</TaxRate><UnitNet>95.20</UnitNet><TotalNet>95.20</TotalNet><UnitTax>23.80</UnitTax><TotalTax>23.80</TotalTax><UnitNoTaxableAmount>0.00</UnitNoTaxableAmount><TotalNoTaxableAmount>0.00</TotalNoTaxableAmount><IncludedTax>1</IncludedTax><IdTaxAuthority>208001</IdTaxAuthority><IdTaxGroup>208001</IdTaxGroup><IdTaxRule>1</IdTaxRule></LineTax></ListLineTax><Sign>1</Sign><SignVoid>1</SignVoid></DocumentLine><DocumentLine><LineNumber>3</LineNumber><Date>2017-07-19T11:19:04.824+02:00</Date><Quantity>1</Quantity><UnitGross>79.00</UnitGross><TotalGross>79.00</TotalGross><IdLineType>1</IdLineType><UnitInputPrice>79.00</UnitInputPrice><UnitOriginalPrice>79.00</UnitOriginalPrice><UnitMasterPrice>79.00</UnitMasterPrice><IsUnknownCode>0</IsUnknownCode><TypedCode>0558006080004</TypedCode><Code>0558006080004</Code><MasterCode>0558006000000</MasterCode><Device>4</Device><IdProductType>0</IdProductType><Model>5580</Model><Quality>60</Quality><Color>800</Color><Size>4</Size><IdCampaign>2</IdCampaign><CampaignYear>2016</CampaignYear><FamilyCode>2</FamilyCode><FamilyCenter>D</FamilyCenter><SubFamilyCode>549</SubFamilyCode><SubFamilyCenter>D</SubFamilyCenter><IdPeriod>1</IdPeriod><IdDepartment>1</IdDepartment><IdDistributionMode>2</IdDistributionMode><SortingNumber>0</SortingNumber><ControlCode>10003845</ControlCode><GreenPoint>0.00</GreenPoint><ListLineUnitData><LineUnitData><RfidTag>0110558006080004000000276848897082840f5e089027e1080610159018400</RfidTag></LineUnitData></ListLineUnitData><ListLineTax><LineTax><TaxRate>25.00</TaxRate><UnitNet>63.20</UnitNet><TotalNet>63.20</TotalNet><UnitTax>15.80</UnitTax><TotalTax>15.80</TotalTax><UnitNoTaxableAmount>0.00</UnitNoTaxableAmount><TotalNoTaxableAmount>0.00</TotalNoTaxableAmount><IncludedTax>1</IncludedTax><IdTaxAuthority>208001</IdTaxAuthority><IdTaxGroup>208001</IdTaxGroup><IdTaxRule>1</IdTaxRule></LineTax></ListLineTax><Sign>1</Sign><SignVoid>1</SignVoid></DocumentLine></ListDocumentLine><ListDocumentPayment><DocumentPayment><LineNumber>1</LineNumber><Date>2017-07-19T11:19:38.566+02:00</Date><Quantity>1</Quantity><UnitAmount>119.00</UnitAmount><Sign>1</Sign><Change>0</Change><IdMedia>208006</IdMedia></DocumentPayment><DocumentPayment><LineNumber>2</LineNumber><Date>2017-07-19T11:20:18.767+02:00</Date><Quantity>1</Quantity><UnitAmount>248.00</UnitAmount><Sign>1</Sign><Change>0</Change><IdMedia>208006</IdMedia></DocumentPayment></ListDocumentPayment><ListDocumentTax><DocumentTax><TotalNet>293.60</TotalNet><TotalTax>73.40</TotalTax><TotalNoTaxableAmount>0.00</TotalNoTaxableAmount><TotalGross>367.00</TotalGross><IncludedTax>1</IncludedTax><IdTaxAuthority>208001</IdTaxAuthority><IdTaxGroup>208001</IdTaxGroup><IdTaxRule>1</IdTaxRule><TaxRate>25.00</TaxRate></DocumentTax></ListDocumentTax><ListDocumentPrintBuffer><DocumentPrintBuffer><IdPrintBuffer>1</IdPrintBuffer><RReport>document</RReport><Extras>0</Extras><Copies>1</Copies><Station>0</Station><Data>PGluZm8gd2lkdGg9IjM4IiBzbWFsbD0iNTciIC8+PGxvZ28+bG9nbzAxPC9sb2dvPg0KDQogICAgICAgICAgIFpBUkEtIEMuQyBGSUVMRFMNCiAgICAgICAgICAgUEhPTkU6IDMyNCA4NDUgMDANCg0KMjQtMDUtMjAxNiAxMToyMCAgICAgICAgICAgICAgICAgIDIyNjYNCjMzNjYgMTE3MDkxIDAxICAgICAgICAgICBUcmFuczogNDczNzE0DQpTREMgIFZBVCAgUVRZICAgIFBSSUNFICAgICBBTU9VTlQgICAgVA0KLS0tIC0tLS0tIC0tLSAtLS0tLS0tLS0tIC0tLS0tLS0tLS0tIC0NClNDQyAyNSwwMCAgIDEgICAgIDE2OSwwMCAgICAgIDE2OSwwMCBQDQoxMDAwMTg1MiAgMDg1NzQ2NjA4MDkwNCAgVFJPVVNFUlMNClNDQyAyNSwwMCAgIDEgICAgIDExOSwwMCAgICAgIDExOSwwMCBQDQoxMDAwMjg4MiAgMDUwNTI2MDA2MDAwNiAgVE9QUyBBTkQgT1RIRQ0KU1dDIDI1LDAwICAgMSAgICAgIDc5LDAwICAgICAgIDc5LDAwIFANCjEwMDAzODQ1ICAwNTU4MDA2MDgwMDA0ICBEUkVTUw0KIFRvdGFsIE5ldCAgICAgICAgICAgICAgICAgICAgMjkzLDYwDQogVkFUIDI1LDAwJSAgICAgICAgICAgICAgICAgICAgNzMsNDANCiAgICAgICAgICAgICAgICAgICAgICAgICAgLS0tLS0tLS0tLQ0KPHNwYW4gYXR0cj0iYiI+VE9UQUw8L3NwYW4+ICAgICAgICA8c3BhbiBhdHRyPSJiIj4zPC9zcGFuPiAgICAgICAgICAgICAgICA8c3BhbiBhdHRyPSJiIj4zNjcsMDA8L3NwYW4+DQoNCiBEQU5LT1JUICAgICAgICAgICAgICAgICAgIDExOSwwMCBrcg0KIERBTktPUlQgICAgICAgICAgICAgICAgICAgMjQ4LDAwIGtyDQogVmVkIMOlYm5lIGvDuGIgdGlsbGJhZ2ViZXRhbGVzIHRpbCBkZXQNCiAgIHNhbW1lIGtvcnQgc29tIG9wcmluZGVsaWd0IGJydWd0DQogdmVkIGvDuGJldC4gU29tIGV0IGFsdGVybmF0aXYgdGlsYnlkZXMNCiAgICAgIHRpbGJhZ2ViZXRhbGluZ25lbiBpc3RlZGV0DQogICAgICAgICBzb20gZXQgdGlsZ29kZWJldmlzLg0KDQo8YmFyY29kZSB0eXBlPSJRUkNPREUiPjY3MDAzMzY2MDExMTcwOTE0NzM3MTQ7MjA4MDAxOzIwMTYtMDUtMjRUMTE6MjA6MTguOTU0KzAyOjAwOzYyMjE3ZjNiYmJkNTQ0Nzg4MWUzYjZlMTA0MGQ5NDExOzs8L2JhcmNvZGU+DQo=</Data></DocumentPrintBuffer></ListDocumentPrintBuffer></Document></Data></Transaction>";
		return contentTicket;
	}
	
}
