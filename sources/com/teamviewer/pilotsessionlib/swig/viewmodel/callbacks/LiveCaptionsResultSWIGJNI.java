package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

/* JADX INFO: loaded from: classes.dex */
public class LiveCaptionsResultSWIGJNI {
    public static final native String LiveCaptionsResult_displayName_get(long j, LiveCaptionsResult liveCaptionsResult);

    public static final native boolean LiveCaptionsResult_isFinalResult_get(long j, LiveCaptionsResult liveCaptionsResult);

    public static final native boolean LiveCaptionsResult_isTranslated_get(long j, LiveCaptionsResult liveCaptionsResult);

    public static final native long LiveCaptionsResult_participantId_get(long j, LiveCaptionsResult liveCaptionsResult);

    public static final native String LiveCaptionsResult_transcriptionText_get(long j, LiveCaptionsResult liveCaptionsResult);

    public static final native void delete_LiveCaptionsResult(long j);

    public static final native long new_LiveCaptionsResult();
}
