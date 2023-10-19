import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
import ui.MainTab;

public class TestUI  implements BurpExtension {
    public MontoyaApi api;

    @Override
    public void initialize(MontoyaApi montoyaApi) {
        this.api = montoyaApi;
        MainTab mainTab = new MainTab(api);
        montoyaApi.extension().setName("TestUI");
        montoyaApi.userInterface().registerSuiteTab("TestUI", mainTab.getMainPanel());
    }
}
