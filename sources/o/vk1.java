package o;

/* JADX INFO: loaded from: classes.dex */
public final class vk1 implements dk6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vk1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // o.dk6
    public final float a(float f) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wk1 wk1Var = (wk1) obj;
                if (Float.isNaN(f)) {
                    return 0.0f;
                }
                float fFloatValue = ((Number) wk1Var.a.invoke(Float.valueOf(f))).floatValue();
                wk1Var.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
                wk1Var.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
                return fFloatValue;
            default:
                he5 he5Var = (he5) obj;
                int iA = he5Var.a();
                he5 he5Var2 = (he5) ((he5) obj).k.m;
                float fFloatValue2 = ((Number) he5Var2.a.invoke(Float.valueOf(f))).floatValue();
                int i = he5Var2.f;
                if (i != -1) {
                    he5Var2.e((int) (i + fFloatValue2));
                }
                return he5Var.a() - iA;
        }
    }
}
