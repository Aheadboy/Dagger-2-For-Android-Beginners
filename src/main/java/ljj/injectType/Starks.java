package ljj.injectType;

import javax.inject.Inject;

public class Starks{
  /**
  * Explaining different usage 
  * of Inject annotations of dagger
  **/
  
  //Feild injection
  @Inject
  Allies allies;
  
  //Constructor injection
  @Inject
  public Starks(){
    //do something..
  }
  
  //Method injection
  @Inject
  private void prepareForWar(){
    //do something..
  }
}