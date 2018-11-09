package espocrm.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import espocrm.pages.AccountCreatePage;
import espocrm.pages.AccountPage;
import espocrm.pages.AccountViewPage;
import espocrm.pages.CallCreatePage;
import espocrm.pages.CallPage;
import espocrm.pages.CallViewPage;
import espocrm.pages.CampaignCreatePage;
import espocrm.pages.CampaignPage;
import espocrm.pages.CampaignViewPage;
import espocrm.pages.CaseCreatePage;
import espocrm.pages.CasePage;
import espocrm.pages.CaseViewPage;
import espocrm.pages.ContactCreatePage;
import espocrm.pages.ContactPage;
import espocrm.pages.ContactViewPage;
import espocrm.pages.DocumentPage;
import espocrm.pages.LeadCreatePage;
import espocrm.pages.LeadPage;
import espocrm.pages.LeadViewPage;
import espocrm.pages.LoginPage;
import espocrm.pages.MasterDashboardPage;
import espocrm.pages.MeetingCreatePage;
import espocrm.pages.MeetingPage;
import espocrm.pages.MeetingViewPage;
import espocrm.pages.OpportunitiesCreatePage;
import espocrm.pages.OpportunitiesPage;
import espocrm.pages.OpportunitiesViewPage;
import espocrm.pages.TaskCreatePage;
import espocrm.pages.TaskPage;
import espocrm.pages.TaskViewPage;

public class Tests extends ParentTests {
	
	LoginPage loginPage;
	MasterDashboardPage masterDashboardPage;
	
	@BeforeMethod
	public void beforeEachTestLocal() {
		loginPage = new LoginPage(driver);
		masterDashboardPage = new MasterDashboardPage(driver);		
		loginPage.login(readConfigFile.getEspoCrmUsername(), readConfigFile.getEspoCrmPassword());
	}
	
	@Test(enabled=true)
	public void createAccount() {
		AccountPage accountPage = new AccountPage(driver);
		AccountCreatePage accountCreatePage = new AccountCreatePage(driver);
		AccountViewPage accountViewPage = new AccountViewPage(driver);
				
		masterDashboardPage.clickAccounts();
		accountPage.clickCreateAccount();
		accountCreatePage.fillName("Preety");
		accountCreatePage.fillEmail("abcd@gmail.com");
		accountCreatePage.selectPhoneType("Mobile");
		accountCreatePage.fillPhone("0225716869");
		accountCreatePage.fillWebsite("www.abcd.com");
		accountCreatePage.clickSave();
		accountViewPage.isAccountsPreetyDaisplayed();
	}
	
	@Test(enabled=true)
	public void createContact() {
		ContactPage contactPage = new ContactPage(driver);
		ContactCreatePage contactCreatePage = new ContactCreatePage(driver);
		ContactViewPage contactViewPage = new ContactViewPage(driver);
		
		masterDashboardPage.clickContacts();
		contactPage.clickCreateContact();
		contactCreatePage.selectTitleName("Mrs.");
		contactCreatePage.fillFistName("Priya");
		contactCreatePage.fillLastName("Aeron");
		contactCreatePage.fillEmail("tvc@hotmail.com");
		contactCreatePage.selectPhoneType("Mobile");
		contactCreatePage.fillPhone("0215789000");
		contactCreatePage.fillDescription("This is for testing");
		contactCreatePage.clickSave();
		contactViewPage.isContactsPriyaDisplayed();
	}

	@Test(enabled=true)
	public void createLead() {
		LeadPage leadPage = new LeadPage(driver);
		LeadCreatePage leadCreatePage = new LeadCreatePage(driver);
		LeadViewPage leadViewPage = new LeadViewPage(driver);
		
		masterDashboardPage.clickLeads();
		leadPage.clickCreateLead();
		leadCreatePage.selectTitleName("Mr.");
		leadCreatePage.fillFirstName("Abhay");
		leadCreatePage.fillLastName("Sharma");
		leadCreatePage.fillAccountName("Abhi123");
		leadCreatePage.fillEmail("abcde@yahoo.com");
		leadCreatePage.selectPhoneType("Mobile");
		leadCreatePage.fillPhone("021754242");
		leadCreatePage.fillTitle("This is a lead");
		leadCreatePage.fillWebsite("www.abcde.com");
		leadCreatePage.clickSave();
		leadViewPage.isLeadsAbhaySharmaDisplayed();
	}
	
	@Test(enabled=true)
	public void createOpportunity() {
		OpportunitiesPage opportunitiesPage = new OpportunitiesPage(driver);
		OpportunitiesCreatePage opportunitiesCreatePage = new OpportunitiesCreatePage(driver);
		OpportunitiesViewPage opportunitiesViewPage = new OpportunitiesViewPage(driver);
		
		masterDashboardPage.clickOpportunities();
		opportunitiesPage.clickCreateOpportunity();
		opportunitiesCreatePage.fillName("Riya");
		opportunitiesCreatePage.selectStage("Negotiation");
		opportunitiesCreatePage.fillAmount("150");
		opportunitiesCreatePage.fillProbability("20");
		opportunitiesCreatePage.fillCloseDate("08/09/2018");
		opportunitiesCreatePage.fillDescription("This is an opportunity");
		opportunitiesCreatePage.clickSave();	
		opportunitiesViewPage.isOpportunitiesRiyaDisplayed();
	}
	
	@Test(enabled=true)
	public void createCase() {
		CasePage casePage = new CasePage(driver);
		CaseCreatePage caseCreatePage = new CaseCreatePage(driver);
		CaseViewPage caseViewPage = new CaseViewPage(driver);
		
		masterDashboardPage.clickCases();
		casePage.clickCreateCase();
		caseCreatePage.fillName("Steve");
		caseCreatePage.selectStatus("New");
		caseCreatePage.fillAccount("ab123");
		caseCreatePage.selectPriority("Low");
		caseCreatePage.selectType("Question");
		caseCreatePage.fillDescription("This is description for case");
		caseCreatePage.clickSave();
		caseViewPage.isCasesSteveDisplayed();
	}
	
	@Test(enabled=true)
	public void createMeeting() {
		MeetingPage meetingPage = new MeetingPage(driver);
		MeetingCreatePage meetingCreatePage = new MeetingCreatePage(driver);
		MeetingViewPage meetingViewPage = new MeetingViewPage(driver);
		
		masterDashboardPage.clickMeetings();
	    meetingPage.clickCreateMeeting();
		meetingCreatePage.fillName("Planning");
		//meetingCreatePage.fillDateStart("09/14/2018");		
		//meetingCreatePage.fillDateEnd("09/22/2018");
		meetingCreatePage.clickSave();
		meetingViewPage.isMeetingsPlanningDisplayed();
	}
	
	@Test(enabled=true)
	public void createCall() {
		CallPage callPage = new CallPage(driver);
		CallCreatePage callCreatePage = new CallCreatePage(driver);
		CallViewPage callViewPage = new CallViewPage(driver);
		
		masterDashboardPage.clickCalls();
		callPage.clickCreateCall();
		callCreatePage.fillName("Client");
		//callCreatePage.fillDateStart("09/14/2018");		
		callCreatePage.fillDescription("This is call description");
		callCreatePage.clickSave();
		callViewPage.isCallsClientDisplayed();
	}
	
	@Test(enabled=true)
	public void createTask() {
		TaskPage taskPage = new TaskPage(driver);
		TaskCreatePage taskCreatePage = new TaskCreatePage(driver);
		TaskViewPage taskViewPage = new TaskViewPage(driver);
		
		masterDashboardPage.clickTasks();
		taskPage.clickCreateTask();
		taskCreatePage.fillName("To be done");
		taskCreatePage.selectStatus("Started");		
		taskCreatePage.fillDescription("This is status description");
		taskCreatePage.clickSave();
		taskViewPage.isTasksToBeDoneDisplayed();
	}
	
	@Test(enabled=true)
	public void createDocument() throws InterruptedException {
		DocumentPage documentPage = new DocumentPage(driver);
		
		masterDashboardPage.gotoDocuments();
		documentPage.clickCreateDocument();
		documentPage.uploadFile(System.getProperty("user.dir") + "/test-data-files/document.txt");
		Thread.sleep(500);
		documentPage.fillName("Assignment");
		documentPage.fillDescription("This is document description");
		documentPage.clickSave();
		documentPage.isCreatedNotificationDisplayed();
	}
	
	@Test(enabled=true)
	public void createCampaign() {
		CampaignPage campaignPage = new CampaignPage(driver);
		CampaignCreatePage campaignCreatePage = new CampaignCreatePage(driver);
		CampaignViewPage campaignViewPage = new CampaignViewPage(driver);
		
		masterDashboardPage.gotoCampaigns();
		campaignPage.clickCreateCampaign();
		campaignCreatePage.fillName("Second");
		campaignCreatePage.selectType("Web");		
		campaignCreatePage.fillDescription("This is campaign description");
		campaignCreatePage.clickSave();
		campaignViewPage.isCampaignsSecondDisplayed();
	}
	
}















