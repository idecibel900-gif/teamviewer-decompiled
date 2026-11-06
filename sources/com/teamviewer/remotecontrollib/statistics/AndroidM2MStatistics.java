package com.teamviewer.remotecontrollib.statistics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001JP\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/teamviewer/remotecontrollib/statistics/AndroidM2MStatistics;", "", "", "sessionId", "", "isButtonVisible", "localWidth", "localHeight", "localDpiScale", "remoteWidth", "remoteHeight", "remoteDpiScale", "Lo/f88;", "jniZoomStatistics", "(IZIIIIII)V", "RemoteControlLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AndroidM2MStatistics {
    public static final AndroidM2MStatistics a = new AndroidM2MStatistics();

    private final native void jniZoomStatistics(int sessionId, boolean isButtonVisible, int localWidth, int localHeight, int localDpiScale, int remoteWidth, int remoteHeight, int remoteDpiScale);

    public final void a(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7) {
        jniZoomStatistics(i, z, i2, i3, i4, i5, i6, i7);
    }
}
