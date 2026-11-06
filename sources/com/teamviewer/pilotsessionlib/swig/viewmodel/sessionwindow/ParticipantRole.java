package com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow;

/* JADX INFO: loaded from: classes.dex */
public enum ParticipantRole {
    /* JADX INFO: Fake field, exist only in values array */
    Undefined(0),
    /* JADX INFO: Fake field, exist only in values array */
    Presenter(1),
    /* JADX INFO: Fake field, exist only in values array */
    Expert(2),
    /* JADX INFO: Fake field, exist only in values array */
    Viewer(3),
    /* JADX INFO: Fake field, exist only in values array */
    GuestSupporter(4);

    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    ParticipantRole(int i) {
        this.m = i;
    }
}
