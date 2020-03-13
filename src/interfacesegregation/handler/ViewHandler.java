package interfacesegregation.handler;

import interfacesegregation.Viewer;
import interfacesegregation.source.DataSource;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ViewHandler {

    private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
    private Long initialDelayInSeconds;
    private Long periodInSeconds;
    // viewer集合
    private List<Viewer> viewers = new ArrayList<>();

    public ViewHandler(long initialDelayInSeconds, long periodInSeconds) {
        this.initialDelayInSeconds = initialDelayInSeconds;
        this.periodInSeconds = periodInSeconds;
    }

    public void run() {
        // 核心代码只需要实时获取配置，然后基于接口编程去热替换就好了，不关心viewer的实现类是哪个
        executor.scheduleAtFixedRate(new Runnable() {
                                         @Override
                                         public void run() {
                                             // 获取dataSource，这段如果是真实开发的话，相当于getDataSourceByZookeeper()
                                             DataSource dataSource = new DataSource(String.valueOf(Math.random()),
                                                     String.valueOf(Math.random()),
                                                     String.valueOf(Math.random()),
                                                     String.valueOf(Math.random()));
                                             for (Viewer viewer : viewers) {
                                                 viewer.updateSource(dataSource);
                                                 System.out.println("实时更新配置信息output到页面：" + viewer.toString());
                                             }
                                         }
                                     },
                this.initialDelayInSeconds,
                this.periodInSeconds, TimeUnit.SECONDS);
    }

    public void addViewer(Viewer viewer) {
        this.viewers.add(viewer);
    }
}
