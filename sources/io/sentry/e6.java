package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public enum e6 implements t2 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    e6(String str) {
        this.itemType = str;
    }

    public static e6 resolve(Object obj) {
        if (obj instanceof v5) {
            return ((io.sentry.protocol.k) ((v5) obj).n.y(io.sentry.protocol.k.class, "feedback")) == null ? Event : Feedback;
        }
        if (obj instanceof io.sentry.protocol.f0) {
            return Transaction;
        }
        if (obj instanceof u7) {
            return Session;
        }
        return obj instanceof io.sentry.clientreport.b ? ClientReport : Attachment;
    }

    public static e6 valueOfLabel(String str) {
        for (e6 e6Var : values()) {
            if (e6Var.itemType.equals(str)) {
                return e6Var;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.t2
    public void serialize(x3 x3Var, g1 g1Var) {
        ((io.sentry.internal.debugmeta.c) x3Var).A(this.itemType);
    }
}
