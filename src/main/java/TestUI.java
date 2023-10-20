import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
import ui.MainTab;

public class TestUI implements BurpExtension {
    @Override
    public void initialize(MontoyaApi montoyaApi) {
        MainTab mainTab = MainTab.getInstance();
        montoyaApi.extension().setName("TestUI");
        montoyaApi.userInterface().registerSuiteTab("TestUI", mainTab.getMainPanel());
    }
}
