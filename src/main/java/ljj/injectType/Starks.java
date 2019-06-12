package ljj.injectType;

import javax.inject.Inject;

public class Starks {
    /**
     * Explaining different usage
     * of Inject annotations of dagger
     **/

    //Feild injection
//          成员变量注入
    @Inject
    Allies allies;

    //Constructor injection
//  构造函数注入
    @Inject
    public Starks() {
        //do something..
    }

    //Method injection
//  方法注入
    @Inject
    private void prepareForWar() {
        //do something..
    }
}