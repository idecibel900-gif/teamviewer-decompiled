package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cv {
    public static final cv m;
    public static final cv n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final cv f559o;
    public static final cv p;
    public static final cv q;
    public static final cv r;
    public static final cv s;
    public static final cv t;
    public static final cv u;
    public static final /* synthetic */ cv[] v;

    static {
        cv cvVar = new cv("RecommendedUpdateShown", 0);
        m = cvVar;
        cv cvVar2 = new cv("RequiredUpdateShown", 1);
        n = cvVar2;
        cv cvVar3 = new cv("UserAcceptedUpdateRequest", 2);
        f559o = cvVar3;
        cv cvVar4 = new cv("UserCancelledUpdateRequest", 3);
        p = cvVar4;
        cv cvVar5 = new cv("ApkDownloaded", 4);
        q = cvVar5;
        cv cvVar6 = new cv("SuccessMessageShown", 5);
        r = cvVar6;
        cv cvVar7 = new cv("ErrorMessageShown", 6);
        s = cvVar7;
        cv cvVar8 = new cv("UserAcknowledgedUpdateRequest", 7);
        t = cvVar8;
        cv cvVar9 = new cv("UserExitedApp", 8);
        u = cvVar9;
        v = new cv[]{cvVar, cvVar2, cvVar3, cvVar4, cvVar5, cvVar6, cvVar7, cvVar8, cvVar9};
    }

    public static cv valueOf(String str) {
        return (cv) Enum.valueOf(cv.class, str);
    }

    public static cv[] values() {
        return (cv[]) v.clone();
    }
}
