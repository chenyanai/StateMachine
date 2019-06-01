package MDStateMachine.Downloads;

import MDStateMachine.AMDSate;
import MDStateMachine.Context;
import MDStateMachine.IMDState;

public class DownloadingFile extends AMDSate {

    public DownloadingFile(Context context) {
        super(context);
    }

    @Override
    public void downloadFinished() {
        super.downloadFinished();
        context.userPoints++;
        context.setDownloadsRegion_currentState(context.downloads_waitingForDownloads);

    }

    @Override
    public void downloadAborted() {
        super.downloadAborted();
        context.deleteRequestFromQueue();
        if(context.userPoints>0) {
            context.userPoints--;
        }
        context.downloadFailed();
        context.setDownloadsRegion_currentState(context.downloads_waitingForDownloads);
    }

    @Override
    public void startDownloading() {
        super.startDownloading();
        context.dequeue();
    }

    @Override
    public void downloadError() {
        super.downloadError();
        context.setDownloadsRegion_currentState(context.downloads_fixingError);
    }

    @Override
    public void internetOff() {
        super.internetOff();
        context.setDownloadsRegion_currentState(context.downloads_waitingForInternetConnection);

    }

    //TODO: when(!isEmpty(queue))
}
