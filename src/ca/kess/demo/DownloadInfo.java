package ca.kess.demo;

import android.util.Log;
import android.widget.ProgressBar;

public class DownloadInfo {
  private final static String TAG = DownloadInfo.class.getSimpleName();
  public enum DownloadState {
    NOT_STARTED,
    ENQUEUED,
    DOWNLOADING,
    COMPELETED
  }
  private volatile DownloadState mDownloadState = DownloadState.NOT_STARTED;
  private final String mFilename;
  private volatile Integer mProgress;
  private final Integer mFileSize;
  private volatile ProgressBar mProgressBar;
  
  public DownloadInfo(String filename, Integer size) {
    mFilename = filename;
    mProgress = 0;
    mFileSize = size;
    mProgressBar = null;
  }
  
  public void setDownloadState(DownloadState state) {
    mDownloadState = state;
  }
  public DownloadState getDownloadState() {
    return mDownloadState;
  }

  public void setProgressBar(ProgressBar bar) {
    Log.d(TAG, "Setting bar on " + mFilename + " to " + bar);
    mProgressBar = bar;
  }
  public ProgressBar getProgressBar() {
    return mProgressBar;
  }
  
  public Integer getProgress() {
    return mProgress;
  }

  public void setProgress(Integer progress) {
    this.mProgress = progress;
  }

  public Integer getFileSize() {
    return mFileSize;
  }

  public String getFilename() {
    return mFilename;
  }
}
