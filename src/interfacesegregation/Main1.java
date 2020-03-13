package interfacesegregation;

import interfacesegregation.config.ElasticSearchConfig;
import interfacesegregation.config.MysqlConfig;
import interfacesegregation.handler.UpdateHandler;

public class Main1 {

    public static void main(String[] args) {
        // 这段代码只是示例，如果在boot项目里，我的建议是这段代码封装成一个configuration，
        // 让spring自动去加载它，然后自动去开启一个scheduleTask实时update这些updaters，一个简易版的配置热替换完成了
        UpdateHandler updateHandler = new UpdateHandler(1, 1);
        updateHandler.addUpdater(new MysqlConfig());
        updateHandler.addUpdater(new ElasticSearchConfig());
        updateHandler.run();
    }
}
