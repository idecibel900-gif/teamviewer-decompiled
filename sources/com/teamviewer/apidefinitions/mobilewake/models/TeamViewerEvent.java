package com.teamviewer.apidefinitions.mobilewake.models;

import kotlin.Metadata;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/teamviewer/apidefinitions/mobilewake/models/TeamViewerEvent;", "", "eventType", "", "getEventType$annotations", "()V", "getEventType", "()Ljava/lang/String;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TeamViewerEvent {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @sp3(name = "eventType")
        public static /* synthetic */ void getEventType$annotations() {
        }
    }

    String getEventType();
}
