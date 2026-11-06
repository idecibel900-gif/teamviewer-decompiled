package o;

/* JADX INFO: loaded from: classes.dex */
public enum j38 {
    Device(0),
    IpAddress(1),
    /* JADX INFO: Fake field, exist only in values array */
    First(Device),
    /* JADX INFO: Fake field, exist only in values array */
    Last(IpAddress);

    public final boolean m;

    j38(j38 j38Var) {
        this.m = j38Var.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    j38(int i) {
        this.m = i;
    }
}
