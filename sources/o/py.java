package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class py {
    public static final py m;
    public static final py n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final py f1786o;
    public static final py p;
    public static final /* synthetic */ py[] q;

    static {
        py pyVar = new py("UNKNOWN", 0);
        m = pyVar;
        py pyVar2 = new py("INITIALIZED", 1);
        n = pyVar2;
        py pyVar3 = new py("SHUTDOWN", 2);
        f1786o = pyVar3;
        py pyVar4 = new py("ERROR", 3);
        p = pyVar4;
        q = new py[]{pyVar, pyVar2, pyVar3, pyVar4};
    }

    public static py valueOf(String str) {
        return (py) Enum.valueOf(py.class, str);
    }

    public static py[] values() {
        return (py[]) q.clone();
    }
}
