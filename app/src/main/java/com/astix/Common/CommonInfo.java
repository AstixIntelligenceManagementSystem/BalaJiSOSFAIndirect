package com.astix.Common;

import android.net.Uri;

import java.io.File;

public class CommonInfo
{

	// Its for Live Path on 194 Server



    public static int flgAllRoutesData=1;
	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;

	public static String imei="";
	public static String SalesQuoteId="BLANK";
	public static String quatationFlag="";
	public static String fileContent="";
	public static String prcID="NULL";

	public static String newQuottionID="NULL";
	public static String globalValueOfPaymentStage="0"+"_"+"0"+"_"+"0";

    public static String WebDSRAttendanceUrl="http://103.20.212.194/rspl/Reports/frmDSRAttendanceReport.aspx";
    public static String WebManageDSRUrl="http://103.20.212.194/RSPL/pda/frmIMEImanagement.aspx";
    public static String WebPurchaseOrderUrl="http://103.20.212.194/RSPL/frmPO.aspx";
    public static String WebPageUrlDataReport="http://103.20.212.194/RSPL/Mobile/fnSalesmanWiseSummaryRpt.aspx";
	public static String WebPageUrl="http://103.20.212.194/RSPL/Mobile/frmRouteTracking.aspx";

//http://103.20.212.194/RSPL/Mobile/frmDailySecondaryUpdate.aspx?IMEI=866924027228398
	public static String WebAttendanceReport="http://103.20.212.194/RSPL/Mobile/frmTodayAttendence.aspx";
//http://103.20.212.194/RSPL/Mobile/frmDailySecondaryUpdate.aspx?IMEI=866924027228398
	public static String WebScndryUpdate="http://103.20.212.194/RSPL/Mobile/frmDailySecondaryUpdate.aspx";

	public static String WebServicePath="http://103.20.212.194/WebServiceAndroidRSPLLive/Service.asmx";
	public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="BalajiSoSOSFA.apk";

	public static String DATABASE_NAME = "DbBalajiSoSFAApp";
	public static int AnyVisit = 0;

	public static int DATABASE_VERSIONID = 49;     // put this field value based on value in table on the server
	public static String AppVersionID = "1.10";     // put this field value based on value in table on the server

	public static int Application_TypeID = 4;      //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct

	public static String OrderSyncPath="http://103.20.212.194/ReadXML_RSPLLive/DefaultSOSFA.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_RSPLImagesLive/Default.aspx";
	public static String OrderSyncPathDistributorMap="http://103.20.212.194/ReadXML_RSPLLive/DefaultSODistributorMapping.aspx";

	//public static String OrderSyncPathDistributorTarget="http://103.20.212.194/ReadXML_RSPLLive/DefaultSODistributorTarget.aspx";

	public static String OrderSyncPathDistributorTarget="http://103.20.212.194/ReadXML_RSPLLive/DefaultSODistributorTarget.aspx";
	public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForRSPLSFALive/default.aspx";
	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_RSPLInvoiceLive/Default.aspx";
	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_RSPLSFADistributionLive/Default.aspx";
	public static String NewStoreSyncPath="http://103.20.212.194/ReadXML_RSPLLive/DefaultSO.aspx";
	public static String OrderXMLFolder="BalajiSoSFAXml";
	public static String ImagesFolder="BalajiSoSFAImages";
	public static String TextFileFolder="BalajiSoTextFile";
	public static String InvoiceXMLFolder="BalajiSoInvoiceXml";
	public static String FinalLatLngJsonFile="BalajiSoSFAFinalLatLngJson";
	public static final String DistributorMapXMLFolder="BalajiSoDistributorMapXML";
	public static final String DistributorStockXMLFolder="BalajiSoDistributorStockXML";
	public static final String DistributorCheckInXMLFolder="BalajiSoDistributorCheckInXML";
	public static String AppLatLngJsonFile="BalajiSoSFALatLngJson";

	public static int DistanceRange=3000;

	public static String SalesPersonTodaysTargetMsg="";
	public static final String Preference="BalajiSoPrefrence";
	public static final String AttandancePreference="BalajiSoAttandancePreference";
	public static final String DistributorXMLFolder="BalajiSoDistributorXMLFolder";
	public static int PersonNodeID=0;
	public static int PersonNodeType=0;
	public static int CoverageAreaNodeID=0;
	public static int CoverageAreaNodeType=0;
	public static int SalesmanNodeId=0;
	public static int SalesmanNodeType=0;
	public static int flgDataScope=0;
	public static int FlgDSRSO=0;
	public static int DayStartClick=0;

	public static int flgLTFoodsSOOnlineOffLine=0;
	public static int flgNewStoreORStoreValidation=0;
	public static String URLImageLinkToViewStoreOverWebProtal="http://103.20.212.194/RSPL/Reports/frmPDAImgsdev.aspx";
	public static String WebPageUrlDSMWiseReport="http://103.20.212.194/RSPL/Mobile/frmDSMWiseReportCard.aspx?imei=";
	public static String ImagesFolderServer="RMMSFAImagesServer";





	// Its for Test Path on 194 Server

	/*
    public static int flgAllRoutesData=1;
	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;

	public static String imei="";
	public static String SalesQuoteId="BLANK";
	public static String quatationFlag="";
	public static String fileContent="";
	public static String prcID="NULL";

	public static String newQuottionID="NULL";
	public static String globalValueOfPaymentStage="0"+"_"+"0"+"_"+"0";

	public static String WebManageDSRUrl="http://103.20.212.194/RSPL_test/pda/frmIMEImanagement.aspx";
	public static String WebPurchaseOrderUrl="http://103.20.212.194/Rspl_Testrelease/frmPO.aspx";
    public static String WebPageUrlDataReport="http://103.20.212.194/RSPL_TestRelease/Mobile/fnSalesmanWiseSummaryRpt.aspx";
	public static String WebPageUrl="http://103.20.212.194/RSPL_TestRelease/Mobile/frmRouteTracking.aspx";

	public static String WebServicePath="http://103.20.212.194/WebServiceAndroidRSPLTest/Service.asmx";
	public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="BalajiSoTSOSFATest.apk";

	public static String DATABASE_NAME = "DbBalajiSoSFAApp";
	public static int AnyVisit = 0;

	public static int DATABASE_VERSIONID = 54;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.9";   // put this field value based on value in table on the server

*/
/*
	public static int DATABASE_VERSIONID = 33;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.4";   // put this field value based on value in table on the server
*//*


	public static int Application_TypeID = 4; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct

	public static String OrderSyncPath="http://103.20.212.194/ReadXML_RSPLTest/DefaultSOSFA.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_BalajiSoImagesTest/Default.aspx";

	public static String OrderSyncPathDistributorMap="http://103.20.212.194/ReadXML_RSPLTest/DefaultSODistributorMapping.aspx";

	public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForRSPLSFATest/default.aspx";

	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_RSPLInvoiceTest/Default.aspx";

	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_RSPLSFADistributionTest/Default.aspx";

	public static String OrderSyncPathDistributorTarget="http://103.20.212.194/ReadXML_RSPLTest/DefaultSODistributorTarget.aspx";

	public static String NewStoreSyncPath="http://103.20.212.194/ReadXML_RSPLTest/DefaultSO.aspx";

	public static String OrderXMLFolder="BalajiSoSFAXml";
	public static String ImagesFolder="BalajiSoSFAImages";
	public static String TextFileFolder="BalajiSoTextFile";
	public static String InvoiceXMLFolder="BalajiSoInvoiceXml";
	public static String FinalLatLngJsonFile="BalajiSoSFAFinalLatLngJson";

	public static final String DistributorMapXMLFolder="BalajiSoDistributorMapXML";
	public static final String DistributorStockXMLFolder="BalajiSoDistributorStockXML";
	public static final String DistributorCheckInXMLFolder="BalajiSoDistributorCheckInXML";

	public static String AppLatLngJsonFile="BalajiSoSFALatLngJson";

	public static int DistanceRange=3000;
	public static String SalesPersonTodaysTargetMsg="";
	public static final String Preference="BalajiSoPrefrence";
	public static final String AttandancePreference="BalajiSoAttandancePreference";
	public static final String DistributorXMLFolder="BalajiSoDistributorXMLFolder";

	public static int PersonNodeID=0;
	public static int PersonNodeType=0;

	public static int CoverageAreaNodeID=0;
	public static int CoverageAreaNodeType=0;
	public static int SalesmanNodeId=0;
	public static int SalesmanNodeType=0;
	public static int flgDataScope=0;
	public static int FlgDSRSO=0;
	public static int DayStartClick=0;


	public static int flgLTFoodsSOOnlineOffLine=0;
	public static int flgNewStoreORStoreValidation=0;
	public static String URLImageLinkToViewStoreOverWebProtal="http://103.20.212.194/RSPL_dev/Reports/frmPDAImgsdev.aspx";
  public static String ImagesFolderServer="RMMSFAImagesServer";

*/






	// Its for Dev Path on 194 Server


/*




	 public static int flgAllRoutesData=1;
	    public static File imageF_savedInstance=null;
	    public static String imageName_savedInstance=null;
	    public static String clickedTagPhoto_savedInstance=null;
	    public static Uri uriSavedImage_savedInstance=null;

	    public static String imei="";
	    public static String SalesQuoteId="BLANK";
	    public static String quatationFlag="";
	    public static String fileContent="";
	    public static String prcID="NULL";

	    public static String newQuottionID="NULL";
	    public static String globalValueOfPaymentStage="0"+"_"+"0"+"_"+"0";

	   public static String WebDSRAttendanceUrl="http://103.20.212.194/rspl_dev/Reports/frmDSRAttendanceReport.aspx";
       public static String WebManageDSRUrl="http://103.20.212.194/RSPL_dev/pda/frmIMEImanagement.aspx";
	    public static String WebPageUrlDataReport="http://103.20.212.194/RSPL_dev/Mobile/fnSalesmanWiseSummaryRpt.aspx";
	    public static String WebPageUrl="http://103.20.212.194/RSPL_dev/Mobile/frmRouteTracking.aspx";

	    public static String WebServicePath="http://103.20.212.194/WebServiceAndroidRSPLDevelopment/Service.asmx";



	    public static String VersionDownloadPath="http://103.20.212.194/downloads/";
		public static String VersionDownloadAPKName="BalajiSoTSODev.apk";

		public static String DATABASE_NAME = "DbBalajiSoSFAApp";

		public static int AnyVisit = 0;

		public static int DATABASE_VERSIONID = 20;      // put this field value based on value in table on the server
		public static String AppVersionID = "1.1";   // put this field value based on value in table on the server
		public static int Application_TypeID = 4; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct

	    public static String OrderSyncPath="http://103.20.212.194/ReadXML_RSPLDevelopment/DefaultSOSFA.aspx";
	    public static String ImageSyncPath="http://103.20.212.194/ReadXML_RSPLImagesDevelopment/Default.aspx";

	    public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForRSPLSFADevelopment/default.aspx";

	    public static String OrderSyncPathDistributorMap="http://103.20.212.194/ReadXML_RSPLDevelopment/DefaultSODistributorMapping.aspx";

        public static String NewStoreSyncPath="http://103.20.212.194/ReadXML_RSPLDevelopment/DefaultSO.aspx";

    	public static String OrderSyncPathDistributorTarget="http://103.20.212.194/ReadXML_RSPLDevelopment/DefaultSODistributorTarget.aspx";

	    public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_RSPLInvoiceDevelopment/Default.aspx";

	    public static String DistributorSyncPath="http://103.20.212.194/ReadXML_RSPLSFADistributionDevelopment/Default.aspx";

		public static String WebPurchaseOrderUrl="http://103.20.212.194/Rspl_Development/frmPO.aspx";

	public static String WebAttendanceReport="http://103.20.212.194/RSPL_dev/Mobile/frmTodayAttendence.aspx";

	public static String WebScndryUpdate="http://103.20.212.194/RSPL_dev/Mobile/frmDailySecondaryUpdate.aspx";

		public static String OrderXMLFolder="BalajiSoSFAXml";
		public static String ImagesFolder="BalajiSoSFAImages";
	    public static String TextFileFolder="BalajiSoTextFile";
	    public static String InvoiceXMLFolder="BalajiSoInvoiceXml";
		public static String FinalLatLngJsonFile="BalajiSoSFAFinalLatLngJson";

	    public static final String DistributorMapXMLFolder="BalajiSoDistributorMapXML";
	    public static final String DistributorStockXMLFolder="BalajiSoDistributorStockXML";
	    public static final String DistributorCheckInXMLFolder="BalajiSoDistributorCheckInXML";

		public static String AppLatLngJsonFile="BalajiSoSFALatLngJson";

		public static int DistanceRange=3000;
	    public static String SalesPersonTodaysTargetMsg="";
	    public static final String Preference="BalajiSoPrefrence";
	    public static final String AttandancePreference="BalajiSoAttandancePreference";

	   public static int PersonNodeID=0;
	   public static int PersonNodeType=0;

	  public static int CoverageAreaNodeID=0;
	  public static int CoverageAreaNodeType=0;
	  public static int SalesmanNodeId=0;
	  public static int SalesmanNodeType=0;
	  public static int flgDataScope=0;
	  public static int FlgDSRSO=0;
	  public static int DayStartClick=0;

	  public static int flgLTFoodsSOOnlineOffLine=0;
	  public static int flgNewStoreORStoreValidation=0;
	  public static String URLImageLinkToViewStoreOverWebProtal="http://103.20.212.194/RSPL_dev/Reports/frmPDAImgsdev.aspx";
	  public static String WebPageUrlDSMWiseReport="http://103.20.212.194/RSPL_dev/Mobile/frmDSMWiseReportCard.aspx?imei=";
        public static String ImagesFolderServer="RMMSFAImagesServer";


*/









	// Its for Test Release Path on 194 Server



/*




	public static int flgAllRoutesData=1;
	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;

	public static String imei="";
	public static String SalesQuoteId="BLANK";
	public static String quatationFlag="";
	public static String fileContent="";
	public static String prcID="NULL";

	public static String newQuottionID="NULL";
	public static String globalValueOfPaymentStage="0"+"_"+"0"+"_"+"0";

    public static String WebDSRAttendanceUrl="http://103.20.212.194/rspl_testrelease/Reports/frmDSRAttendanceReport.aspx";
	public static String WebManageDSRUrl="http://103.20.212.194/RSPL_testrelease/pda/frmIMEImanagement.aspx";
	public static String WebPageUrlDataReport="http://103.20.212.194/RSPL_testrelease/Mobile/fnSalesmanWiseSummaryRpt.aspx";
	public static String WebPageUrl="http://103.20.212.194/RSPL_testrelease/Mobile/frmRouteTracking.aspx";

	public static String WebServicePath="http://103.20.212.194/WebServiceAndroidRSPLTestRelease/Service.asmx";



	public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="BalajiSoSfaTestRelease.apk";

	public static String DATABASE_NAME = "DbBalajiSoSFAApp";

	public static int AnyVisit = 0;

	public static int DATABASE_VERSIONID = 69;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.27";   // put this field value based on value in table on the server
	public static int Application_TypeID = 4; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct

	public static String OrderSyncPath="http://103.20.212.194/ReadXML_RSPLTestRelease/DefaultSOSFA.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_RSPLImagesTestRelease/Default.aspx";

	public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForRSPLSFATestRelease/default.aspx";

	public static String OrderSyncPathDistributorMap="http://103.20.212.194/ReadXML_RSPLTestRelease/DefaultSODistributorMapping.aspx";

	public static String NewStoreSyncPath="http://103.20.212.194/ReadXML_RSPLTestRelease/DefaultSO.aspx";

	public static String OrderSyncPathDistributorTarget="http://103.20.212.194/ReadXML_RSPLTestRelease/DefaultSODistributorTarget.aspx";

	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_RSPLInvoiceTestRelease/Default.aspx";

	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_RSPLSFADistributionTestRelease/Default.aspx";

	public static String WebPurchaseOrderUrl="http://103.20.212.194/Rspl_TestRelease/frmPO.aspx";

	public static String OrderXMLFolder="BalajiSoSFAXml";
	public static String ImagesFolder="BalajiSoSFAImages";
	public static String TextFileFolder="BalajiSoTextFile";
	public static String InvoiceXMLFolder="BalajiSoInvoiceXml";
	public static String FinalLatLngJsonFile="BalajiSoSFAFinalLatLngJson";

	public static final String DistributorMapXMLFolder="BalajiSoDistributorMapXML";
	public static final String DistributorStockXMLFolder="BalajiSoDistributorStockXML";
	public static final String DistributorCheckInXMLFolder="BalajiSoDistributorCheckInXML";

	public static String AppLatLngJsonFile="BalajiSoSFALatLngJson";

	public static int DistanceRange=3000;
	public static String SalesPersonTodaysTargetMsg="";
	public static final String Preference="BalajiSoPrefrence";
	public static final String AttandancePreference="BalajiSoAttandancePreference";

	public static int PersonNodeID=0;
	public static int PersonNodeType=0;

	public static int CoverageAreaNodeID=0;
	public static int CoverageAreaNodeType=0;
	public static int SalesmanNodeId=0;
	public static int SalesmanNodeType=0;
	public static int flgDataScope=0;
	public static int FlgDSRSO=0;
	public static int DayStartClick=0;

	public static int flgLTFoodsSOOnlineOffLine=0;
	public static int flgNewStoreORStoreValidation=0;
	public static String URLImageLinkToViewStoreOverWebProtal="http://103.20.212.194/RSPL_Testrelease/Reports/frmPDAImgsdev.aspx";

    public static String WebPageUrlDSMWiseReport="http://103.20.212.194/RSPL_testrelease/Mobile/frmDSMWiseReportCard.aspx?imei=";
      public static String ImagesFolderServer="RMMSFAImagesServer";

	public static String WebAttendanceReport="http://103.20.212.194/RSPL_testrelease/Mobile/frmTodayAttendence.aspx";

	public static String WebScndryUpdate="http://103.20.212.194/RSPL_testrelease/Mobile/frmDailySecondaryUpdate.aspx";


*/




// Its for Training Path on 194 Server



/*

	public static int flgAllRoutesData=1;
	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;

	public static String imei="";
	public static String SalesQuoteId="BLANK";
	public static String quatationFlag="";
	public static String fileContent="";
	public static String prcID="NULL";

	public static String newQuottionID="NULL";
	public static String globalValueOfPaymentStage="0"+"_"+"0"+"_"+"0";

	public static String WebManageDSRUrl="http://103.20.212.194/RSPL_Training/pda/frmIMEImanagement.aspx";
	public static String WebPurchaseOrderUrl="http://103.20.212.194/RSPL_Training/frmPO.aspx";
	public static String WebPageUrlDataReport="http://103.20.212.194/RSPL_Training/Mobile/fnSalesmanWiseSummaryRpt.aspx";
	public static String WebPageUrl="http://103.20.212.194/RSPL_Training/Mobile/frmRouteTracking.aspx";

	public static String WebServicePath="http://103.20.212.194/WebServiceAndroidRSPLTraining/Service.asmx";
	public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="BalajiSoTSOSFATraining.apk";

	public static String DATABASE_NAME = "DbBalajiSoSFAApp";

	public static int AnyVisit = 0;

	*/
/*public static int DATABASE_VERSIONID = 24;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.2";   // put this field value based on value in table on the server*//*


	public static int DATABASE_VERSIONID = 27;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.3";   // put this field value based on value in table on the server

	public static int Application_TypeID = 4; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct

	public static String OrderSyncPath="http://103.20.212.194/ReadXML_RSPLTraining/DefaultSOSFA.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_RSPLImagesTraining/Default.aspx";

	public static String OrderSyncPathDistributorMap="http://103.20.212.194/ReadXML_RSPLTraining/DefaultSODistributorMapping.aspx";

	public static String OrderSyncPathDistributorTarget="http://103.20.212.194/ReadXML_RSPLTraining/DefaultSODistributorTarget.aspx";

	public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForRSPLSFATraining/default.aspx";

	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_RSPLInvoiceTraining/Default.aspx";

	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_RSPLSFADistributionTraining/Default.aspx";

	public static String NewStoreSyncPath="http://103.20.212.194/ReadXML_RSPLTraining/DefaultSO.aspx";

	public static String OrderXMLFolder="BalajiSoSFAXml";
	public static String ImagesFolder="BalajiSoSFAImages";
	public static String TextFileFolder="BalajiSoTextFile";
	public static String InvoiceXMLFolder="BalajiSoInvoiceXml";
	public static String FinalLatLngJsonFile="BalajiSoSFAFinalLatLngJson";

	public static final String DistributorMapXMLFolder="BalajiSoDistributorMapXML";
	public static final String DistributorStockXMLFolder="BalajiSoDistributorStockXML";
	public static final String DistributorCheckInXMLFolder="BalajiSoDistributorCheckInXML";

	public static String AppLatLngJsonFile="BalajiSoSFALatLngJson";

	public static int DistanceRange=3000;
	public static String SalesPersonTodaysTargetMsg="";
	public static final String Preference="BalajiSoPrefrence";
	public static final String AttandancePreference="BalajiSoAttandancePreference";
	public static final String DistributorXMLFolder="BalajiSoDistributorXMLFolder";

	public static int PersonNodeID=0;
	public static int PersonNodeType=0;

	public static int CoverageAreaNodeID=0;
	public static int CoverageAreaNodeType=0;
	public static int SalesmanNodeId=0;
	public static int SalesmanNodeType=0;
	public static int flgDataScope=0;
	public static int FlgDSRSO=0;
	public static int DayStartClick=0;


	public static int flgLTFoodsSOOnlineOffLine=0;
	public static int flgNewStoreORStoreValidation=0;
	//public static String URLImageLinkToViewStoreOverWebProtal="http://103.20.212.194/RSPL/Reports/frmPDAImgsdev.aspx?";
	public static String URLImageLinkToViewStoreOverWebProtal="http://103.20.212.194/RSPL_Training/Reports/frmPDAImgsLive.aspx";
      public static String ImagesFolderServer="RMMSFAImagesServer";
*/

}
