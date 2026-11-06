package o;

/* JADX INFO: loaded from: classes.dex */
public final class et extends dt2 {
    public final /* synthetic */ lt v;
    public final /* synthetic */ ot w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(ot otVar, ot otVar2, lt ltVar) {
        super(otVar2);
        this.w = otVar;
        this.v = ltVar;
    }

    @Override // o.dt2
    public final kz6 e() {
        return this.v;
    }

    @Override // o.dt2
    public final boolean f() {
        ot otVar = this.w;
        if (otVar.getInternalPopup().a()) {
            return true;
        }
        otVar.r.m(otVar.getTextDirection(), otVar.getTextAlignment());
        return true;
    }
}
