package o;

/* JADX INFO: loaded from: classes2.dex */
public final class gw7 extends fw7 {
    public boolean m;

    @Override // o.fw7
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ fw7 f() {
        f();
        return this;
    }

    @Override // o.fw7, o.sj5
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void f() {
        super.f();
        this.m = true;
    }

    public final String toString() {
        boolean z = this.m;
        String str = z ? "<!" : "<?";
        String str2 = z ? ">" : "?>";
        ly lyVar = this.g;
        if (lyVar == null || lyVar.size() <= 0) {
            return str + o() + str2;
        }
        return str + o() + " " + this.g.toString() + str2;
    }
}
