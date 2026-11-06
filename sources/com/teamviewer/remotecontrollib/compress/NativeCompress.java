package com.teamviewer.remotecontrollib.compress;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\t\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0087 ¢\u0006\u0004\b\u000b\u0010\u0006J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0087 ¢\u0006\u0004\b\r\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u000eH\u0087 ¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0087 ¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0016\u0010\bJ0\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0087 ¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/teamviewer/remotecontrollib/compress/NativeCompress;", "", "", "displayParamsCommandPtr", "Lo/f88;", "Init", "(J)V", "Release", "()V", "UpdateComplete", "updateCommandAddress", "ReceivedUpdate", "dataCacheCommandAddress", "ReceivedDataCache", "", "OpenGLSurfaceCreated", "()Z", "", "width", "height", "OpenGLSurfaceChanged", "(II)Z", "SurfaceDestroyed", "", "zoomX", "zoomY", "offsetX", "offsetY", "OpenGLStep", "(FFII)Z", "RemoteControlLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class NativeCompress {
    public static final native void Init(long displayParamsCommandPtr);

    public static final native boolean OpenGLStep(float zoomX, float zoomY, int offsetX, int offsetY);

    public static final native boolean OpenGLSurfaceChanged(int width, int height);

    public static final native boolean OpenGLSurfaceCreated();

    public static final native void ReceivedDataCache(long dataCacheCommandAddress);

    public static final native void ReceivedUpdate(long updateCommandAddress);

    public static final native void Release();

    public static final native void SurfaceDestroyed();

    public static final native void UpdateComplete();
}
