package MDStateMachine.Player;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class MoviePlaying extends AMDSate  {

    public MoviePlaying(Context context) {
        super(context);
    }

    @Override
    public void entry() {
        super.entry();
        //TODO implement (do not delete call to super)
        throw new NotImplementedException();
    }
}
