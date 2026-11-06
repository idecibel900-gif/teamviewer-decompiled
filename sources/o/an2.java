package o;

/* JADX INFO: loaded from: classes2.dex */
public final class an2 {
    public final float a;
    public final float b;

    public an2(float f, in1 in1Var) {
        this.a = f;
        float density = in1Var.getDensity();
        float f2 = bn2.a;
        this.b = density * 386.0878f * 160.0f * 0.84f;
    }

    public final zm2 a(float f) {
        double dB = b(f);
        double d = bn2.a;
        double d2 = d - 1.0d;
        return new zm2(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.b))), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = ri.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.b)));
    }
}
